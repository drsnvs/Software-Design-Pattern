import java.io.*;


public class Admin implements ManageFiles{
	public Admin(){
		try{
			File file = new File("darshan.txt");
			if(file.createNewFile()){
				System.out.println("File created : "+file.getName());
			}else{
				System.out.println("File already created : "+file.getName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void copy(){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("darshan.txt");
			fos = new FileOutputStream("copy.txt");
			File file = new File("copy.txt");
			int c;
			while((c = fis.read()) != -1){
				fos.write(c);
			}
			System.out.println("File Copied Successfully : "+file.getName());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}