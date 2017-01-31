//A famous scene in the movie Apollo 13 features a team of engineers tasked with fitting a square peg into a round hole. This, metaphorically, is the role of an adapter.
// In software terms, this pattern lets two incompatible classes work together by converting the interface of a class into another interface the client expects.

//Consider the business logic of your app; it might be a Product, or a User, or a Tribble. It’s the square peg. Meanwhile, a RecyclerView is the same basic object across all Android apps. It’s the round hole.

//In this situation, you can use a subclass of RecyclerView.Adapter and implement the required methods to make everything work:

public class TribbleAdapter extends RecyclerView.Adapter {

    private List mTribbles;

    public TribbleAdapter(List tribbles) {
        this.mTribbles = tribbles;
    }

    @Override
    public TribbleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.row_tribble, viewGroup, false);
        return new TribbleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TribbleViewHolder viewHolder, int i) {
        viewHolder.configure(mTribbles.get(i));
    }

    @Override
    public int getItemCount() {
        return mTribbles.size();
    }
}

//RecyclerView doesn’t know what a Tribble is, as it’s never seen a single episode of Star Trek – not even the new movies. :] Instead, it’s the adapter’s job to handle the data and send the configuration command to the correct ViewHolder.
