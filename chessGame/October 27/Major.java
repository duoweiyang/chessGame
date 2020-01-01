public class Major implements Comparable<Major> {
  private String name;
  private boolean mustached;

   public Major(String name, boolean isBusiness) {
       this.name = name;
       this.business = isBusiness;
   }

   public String getName() { return name; }
   public boolean isBusiness() { return business; }

   public String toString() {
       return getName() + (isBusiness() ? " (>3<)" : " (TwT)");
   }

   public boolean equals(Object other) {
       if (null == other) return false;
       if (this == other) return true;
       if (!(other instanceof Major)) return false;
       Major that = (Major) other;
       return this.name.equals(that.name)
           && this.business == that.business;
   }

   public int compareTo(Trooper other) {
       return this.name.compareTo(other.name);
   }
 }
