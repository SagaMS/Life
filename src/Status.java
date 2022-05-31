public enum Status {
    NONE,
    BORN,
    LIVE,
    DIED;

    public Status step1(int around) {
        switch (this) {
            case NONE:
                return (around == 3) ? BORN : NONE;
            case LIVE:
                return (around >= 4 || around < 2) ? DIED : LIVE;
            default:
                return this;

        }
    }

    public Status step2() {
        switch (this) {
            case DIED:
                return NONE;
            case BORN:
                return LIVE;
            default: return this;
        }

    }

}


