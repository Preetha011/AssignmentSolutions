package Tours_Package;

import jxl.write.Label;

public class Copy_codes {

	public static void main(String[] args) {
		

		for(int k=0; k<my_list.size(); k++) {
			
			Label mobile_phones = new Label(0,k,my_list);
			
			sheet.addCell(mobile_phones);
			
		}

	}

}



//To write data into excel file

Label value3 = new Label(0,1,"Huawei mobile phones");
Label value4 = new Label(1,1,"25000");

sheet.addCell(value3);
sheet.addCell(value4);


////======================================================

for(int l=0; l<my_list.size(); l++) {
	
	String myString3 = my_list.get(l).getText();
	
		for(int k=0; k<my_list.size(); k++) {
		
			Label hi = new Label(0,k,myString3);
			sheet.addCell(hi);
	}
	
	
}
