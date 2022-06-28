package com.cg.collections;

import java.util.HashSet;
//Hashset won't naturally allow any duplicate values in the set
public class Problem2 {
  public static void main(String[] args) {
      product x1=new product("Royal");
      product x2=new product("Stag");
      product x3=new product("Pekky");
      product x4=new product("Blinders");
      HashSet<product> no_duplicate=new HashSet<product>();
      no_duplicate.add(x1);
      no_duplicate.add(x2);
      no_duplicate.add(x3);
      no_duplicate.add(x4);
      //the duplicate object addition
      no_duplicate.add(x2);
      System.out.println(no_duplicate);

  }
}
class product{
  private String p_name;
  public product(String p_name){
      this.p_name=p_name;
  }
  @Override
  public String toString(){
      return "Product name: "+p_name;
  }
}