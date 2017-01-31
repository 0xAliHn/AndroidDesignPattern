//At a sandwich spot down my block, I use a small pencil to check off the bread, ingredients, and condiments I’d like on my sandwich from a checklist on a slip of paper.
// Even though the checklist’s title instructs me to “build my own” sandwich, I really only fill out the form and hand it over the counter.
// I’m not actually doing the sandwich-building, just the customizing…and the consuming. :]

//Similarly, the Builder pattern separates the construction of a complex object (the slicing of bread, the stacking of pickles) from its representation (a yummy sandwich); in this way, the same construction process can create different representations.
//In Android, the Builder pattern appears when using objects like AlertDialog.Builder:

public class Builder {
    new AlertDialog.Builder(this)
            .setTitle("Metaphorical Sandwich Dialog")
    .setMessage("Metaphorical message to please use the spicy mustard.")
    .setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
        @Override public void onClick(DialogInterface dialogInterface, int i) {
            // "No thanks" button was clicked
        }
    })
            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override public void onClick(DialogInterface dialogInterface, int i) {
            // "OK" button was clicked
        }
    })
    .show();

}

//This builder proceeds step-by-step and lets you specify only the parts of your AlertDialog that matter to you.
// Take a look at the AlertDialog.Builder documentation; you’ll see there are quite a few commands to choose from when building your alert.
