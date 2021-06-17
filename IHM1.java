import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class IHM1 extends JFrame {
	String data[][] =new String[40][3];
	  public IHM1(){
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("حساب الميراث");
	    this.setSize(500, 300);
	  }
	  public void SetTableau()
	  {
		    int i=0;
		    while(data[i][0]!=null)
		    {
		    	i++;
		    }
		    String data1[][] =new String[i][3];
		    for(int k=0;k<i;k++)
		    {
		    	data1[k][0]=data[k][0];
		    	data1[k][1]=data[k][1];
		    	data1[k][2]=data[k][2];
		    }
		    String  title[] = {"عددالأسهم","نصيبه", "الوارث"};
		    JTable tableau = new JTable(data1, title);
		    centrerTable(tableau);
		    this.getContentPane().add(new JScrollPane(tableau));
	  }
	  public void AddLigne(String a,Double b,int c,int i)
	  {
		String s = b.toString(); 
		String k = Integer.toString(c); 
		data[i][0]=k+"    ";
		data[i][1]=s+"    ";
		data[i][2]=a;
	  }
	  private void centrerTable(JTable table)
	  {     
			DefaultTableCellRenderer custom = new DefaultTableCellRenderer();
		  custom.setHorizontalAlignment(JLabel.RIGHT);
		  for (int i=0 ; i<table.getColumnCount() ; i++)
		  table.getColumnModel().getColumn(i).setCellRenderer(custom);
	  }
}

