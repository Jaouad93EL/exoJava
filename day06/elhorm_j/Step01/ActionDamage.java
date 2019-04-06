public class ActionDamage implements Reaction {
    @Override
    public String getTextOfReaction() {
	return "Player takes damage";
    }
    @Override
    public ReactionType getTypeReaction() {
      	return ReactionType.Damage;
    }
}
