public class ActionDamage implements Reaction {
    private int damage;

    public ActionDamage(int damage) {
	if (damage > 0)
	    this.damage = damage;
    }
    
    @Override
    public String getTextOfReaction() {
	return "Player takes damage";
    }
    @Override
    public ReactionType getTypeReaction() {
      	return ReactionType.Damage;
    }

    @Override
    public void action(Player player) {
	player.takeDamage(this.damage);
    }
}
