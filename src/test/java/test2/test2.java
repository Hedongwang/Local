package test2;
import static org.junit.Assert.*;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import static org.easymock.EasyMock.*;
public class test2 {

	@Rule
	
	public final SystemOutRule sr=new SystemOutRule().enableLog();
	private IData iData =null;
	
	@Test
	public void test() {
		iData =createMock("iData",IData.class);
		for(int i=0;i<10;i++) {
			for(int j=0;j<12;j++) {
				EasyMock.expect(iData.getStation((i+1)*100+j+1)).andReturn("EMPTY");
			}
		}
		
		replay(iData);
		
		ListHome lh=new ListHome(iData);
		lh.search();
		
		String ls=System.getProperty("\t");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<10;i++) {
			for(int j=0;j<12;j++) {
				if(j+1<10) {
					sb.append(i+1+"0"+(j+1)+"\t");
				}
				else {
					sb.append(i+1+""+(j+1)+"\t");
				}
			}
			
			//sb.append(ls);
			for(int j=0;j<12;j++) {
				sb.append("EMPTY"+"\t");
			}
			
		}
		assertEquals(sb.toString(),sr.getLog());
		verify(iData);
	}

}
