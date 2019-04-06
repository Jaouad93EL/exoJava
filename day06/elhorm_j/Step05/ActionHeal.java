public class ActionHeal implements Reaction {

    private int heal;

    public ActionHeal(int heal) {
	if (heal > 0)
	    this.heal = heal;
    }
    
    @Override
    public String getTextOfReaction() {
	return "Player gets health";
    }
    @Override
    public ReactionType getTypeReaction() {
	return ReactionType.Heal;
    }
    @Override
    public void action(Player player) {
	player.heal(this.heal);
    }
}
