public class Car {
    // add attributes
    private String name;
    private int  model;
    private  String color;
    
    
    
    // add behaviour  getters and setters (methods)
        //getters
        public String getName () {
           return name; 
        }
    
        public int getModel () {
           return model; 
        }
        public String getColor () {
           return color; 
        }
       // setters
       public void setName (String n) {
           this.name = n; 
        }
       public void setModel (int m) {
          this.model = m; 
        } 
    public void setColor (String c) {
            this.color = c;
        } 
    }
