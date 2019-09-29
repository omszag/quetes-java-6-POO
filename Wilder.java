class Wilder {

    
    private String firstname;
    private boolean aware;

    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = true;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.aware) {
            return "My name is " + this.getFirstName() + " and I'm aware";
        } else {
            return "My name is " + this.getFirstName() + " and I'm not aware";
        }
    }
}
