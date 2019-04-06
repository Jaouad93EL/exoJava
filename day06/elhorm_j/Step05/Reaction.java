public interface Reaction {
    public ReactionType getTypeReaction();
    public String getTextOfReaction();
    public void action(Player player);
}
