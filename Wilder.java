public class wilder {
  
  private String firstName;
  private boolean aware;
  
  
      public Wilder(String firstName) {
        this.firstName = firstName;
        this.aware = true;
    }

      public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }
  
      public String getfirstName() {
          return this.firstName;
    }
      
      public boolean isaware() {
          return this.aware;
    }
    
      public void String setName(String firstName) {
          this.firstName = firstName;
    }
      
      public void boolean setAware(boolean aware) {
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
