import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JamesBondTest {

	private JamesBond jb;

	@BeforeEach
	void setUp() throws Exception {
		jb = new JamesBond();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testCase0() {
		assertFalse(jb.bondRegex("(("));
	}

	@Test
	public void testCase1() {
		assertFalse(jb.bondRegex("()"));
	}

	@Test
	public void testCase2() {
		assertTrue(jb.bondRegex("(007)"));
	}

	@Test
	public void testCase3() {
		assertFalse(jb.bondRegex("(07)"));
	}

	@Test
	public void testCase4() {
		assertFalse(jb.bondRegex("(7)"));
	}

	@Test
	public void testCase5() {
		assertFalse(jb.bondRegex("((("));
	}

	@Test
	public void testCase6() {
		assertFalse(jb.bondRegex("(()"));
	}

	@Test
	public void testCase7() {
		assertTrue(jb.bondRegex("((007)"));
	}

	@Test
	public void testCase8() {
		assertFalse(jb.bondRegex("((07)"));
	}

	@Test
	public void testCase9() {
		assertFalse(jb.bondRegex("((7)"));
	}

	@Test
	public void testCase10() {
		assertFalse(jb.bondRegex("()("));
	}

	@Test
	public void testCase11() {
		assertFalse(jb.bondRegex("())"));
	}

	@Test
	public void testCase12() {
		assertTrue(jb.bondRegex("()007)"));
	}

	@Test
	public void testCase13() {
		assertFalse(jb.bondRegex("()07)"));
	}

	@Test
	public void testCase14() {
		assertFalse(jb.bondRegex("()7)"));
	}

	@Test
	public void testCase15() {
		assertFalse(jb.bondRegex("(0("));
	}

	@Test
	public void testCase16() {
		assertFalse(jb.bondRegex("(0)"));
	}

	@Test
	public void testCase17() {
		assertTrue(jb.bondRegex("(0007)"));
	}

	@Test
	public void testCase18() {
		assertFalse(jb.bondRegex("(0(("));
	}

	@Test
	public void testCase19() {
		assertFalse(jb.bondRegex("(0()"));
	}

	@Test
	public void testCase20() {
		assertTrue(jb.bondRegex("(0(007)"));
	}

	@Test
	public void testCase21() {
		assertFalse(jb.bondRegex("(0(07)"));
	}

	@Test
	public void testCase22() {
		assertFalse(jb.bondRegex("(0(7)"));
	}

	@Test
	public void testCase23() {
		assertFalse(jb.bondRegex("(0)("));
	}

	@Test
	public void testCase24() {
		assertFalse(jb.bondRegex("(0))"));
	}

	@Test
	public void testCase25() {
		assertTrue(jb.bondRegex("(0)007)"));
	}

	@Test
	public void testCase26() {
		assertFalse(jb.bondRegex("(0)07)"));
	}

	@Test
	public void testCase27() {
		assertFalse(jb.bondRegex("(0)7)"));
	}

	@Test
	public void testCase28() {
		assertFalse(jb.bondRegex("(00("));
	}

	@Test
	public void testCase29() {
		assertFalse(jb.bondRegex("(00)"));
	}

	@Test
	public void testCase30() {
		assertTrue(jb.bondRegex("(00007)"));
	}

	@Test
	public void testCase31() {
		assertFalse(jb.bondRegex("(00(("));
	}

	@Test
	public void testCase32() {
		assertFalse(jb.bondRegex("(00()"));
	}

	@Test
	public void testCase33() {
		assertTrue(jb.bondRegex("(00(007)"));
	}

	@Test
	public void testCase34() {
		assertFalse(jb.bondRegex("(00(07)"));
	}

	@Test
	public void testCase35() {
		assertFalse(jb.bondRegex("(00(7)"));
	}

	@Test
	public void testCase36() {
		assertFalse(jb.bondRegex("(00)("));
	}

	@Test
	public void testCase37() {
		assertFalse(jb.bondRegex("(00))"));
	}

	@Test
	public void testCase38() {
		assertTrue(jb.bondRegex("(00)007)"));
	}

	@Test
	public void testCase39() {
		assertFalse(jb.bondRegex("(00)07)"));
	}

	@Test
	public void testCase40() {
		assertFalse(jb.bondRegex("(00)7)"));
	}

	@Test
	public void testCase41() {
		assertFalse(jb.bondRegex("(000("));
	}

	@Test
	public void testCase42() {
		assertFalse(jb.bondRegex("(000)"));
	}

	@Test
	public void testCase43() {
		assertTrue(jb.bondRegex("(000007)"));
	}

	@Test
	public void testCase44() {
		assertFalse(jb.bondRegex("(001("));
	}

	@Test
	public void testCase45() {
		assertFalse(jb.bondRegex("(001)"));
	}

	@Test
	public void testCase46() {
		assertTrue(jb.bondRegex("(001007)"));
	}

	@Test
	public void testCase47() {
		assertFalse(jb.bondRegex("(00107)"));
	}

	@Test
	public void testCase48() {
		assertFalse(jb.bondRegex("(0017)"));
	}

	@Test
	public void testCase49() {
		assertFalse(jb.bondRegex("(002("));
	}

	@Test
	public void testCase50() {
		assertFalse(jb.bondRegex("(002)"));
	}

	@Test
	public void testCase51() {
		assertTrue(jb.bondRegex("(002007)"));
	}

	@Test
	public void testCase52() {
		assertFalse(jb.bondRegex("(00207)"));
	}

	@Test
	public void testCase53() {
		assertFalse(jb.bondRegex("(0027)"));
	}

	@Test
	public void testCase54() {
		assertFalse(jb.bondRegex("(003("));
	}

	@Test
	public void testCase55() {
		assertFalse(jb.bondRegex("(003)"));
	}

	@Test
	public void testCase56() {
		assertTrue(jb.bondRegex("(003007)"));
	}

	@Test
	public void testCase57() {
		assertFalse(jb.bondRegex("(00307)"));
	}

	@Test
	public void testCase58() {
		assertFalse(jb.bondRegex("(0037)"));
	}

	@Test
	public void testCase59() {
		assertFalse(jb.bondRegex("(004("));
	}

	@Test
	public void testCase60() {
		assertFalse(jb.bondRegex("(004)"));
	}

	@Test
	public void testCase61() {
		assertTrue(jb.bondRegex("(004007)"));
	}

	@Test
	public void testCase62() {
		assertFalse(jb.bondRegex("(00407)"));
	}

	@Test
	public void testCase63() {
		assertFalse(jb.bondRegex("(0047)"));
	}

	@Test
	public void testCase64() {
		assertFalse(jb.bondRegex("(005("));
	}

	@Test
	public void testCase65() {
		assertFalse(jb.bondRegex("(005)"));
	}

	@Test
	public void testCase66() {
		assertTrue(jb.bondRegex("(005007)"));
	}

	@Test
	public void testCase67() {
		assertFalse(jb.bondRegex("(00507)"));
	}

	@Test
	public void testCase68() {
		assertFalse(jb.bondRegex("(0057)"));
	}

	@Test
	public void testCase69() {
		assertFalse(jb.bondRegex("(006("));
	}

	@Test
	public void testCase70() {
		assertFalse(jb.bondRegex("(006)"));
	}

	@Test
	public void testCase71() {
		assertTrue(jb.bondRegex("(006007)"));
	}

	@Test
	public void testCase72() {
		assertFalse(jb.bondRegex("(00607)"));
	}

	@Test
	public void testCase73() {
		assertFalse(jb.bondRegex("(0067)"));
	}

	@Test
	public void testCase74() {
		assertFalse(jb.bondRegex("(007("));
	}

	@Test
	public void testCase75() {
		assertTrue(jb.bondRegex("(007007)"));
	}

	@Test
	public void testCase76() {
		assertTrue(jb.bondRegex("(00707)"));
	}

	@Test
	public void testCase77() {
		assertTrue(jb.bondRegex("(0077)"));
	}

	@Test
	public void testCase78() {
		assertFalse(jb.bondRegex("(007(("));
	}

	@Test
	public void testCase79() {
		assertTrue(jb.bondRegex("(007()"));
	}

	@Test
	public void testCase80() {
		assertTrue(jb.bondRegex("(007(007)"));
	}

	@Test
	public void testCase81() {
		assertTrue(jb.bondRegex("(007(07)"));
	}

	@Test
	public void testCase82() {
		assertTrue(jb.bondRegex("(007(7)"));
	}

	@Test
	public void testCase83() {
		assertTrue(jb.bondRegex("(007)("));
	}

	@Test
	public void testCase84() {
		assertTrue(jb.bondRegex("(007))"));
	}

	@Test
	public void testCase85() {
		assertTrue(jb.bondRegex("(007)007)"));
	}

	@Test
	public void testCase86() {
		assertTrue(jb.bondRegex("(007)07)"));
	}

	@Test
	public void testCase87() {
		assertTrue(jb.bondRegex("(007)7)"));
	}

	@Test
	public void testCase88() {
		assertTrue(jb.bondRegex("(007)(("));
	}

	@Test
	public void testCase89() {
		assertTrue(jb.bondRegex("(007)()"));
	}

	@Test
	public void testCase90() {
		assertTrue(jb.bondRegex("(007)(007)"));
	}

	@Test
	public void testCase91() {
		assertTrue(jb.bondRegex("(007)(07)"));
	}

	@Test
	public void testCase92() {
		assertTrue(jb.bondRegex("(007)(7)"));
	}

	@Test
	public void testCase93() {
		assertTrue(jb.bondRegex("(007))("));
	}

	@Test
	public void testCase94() {
		assertTrue(jb.bondRegex("(007)))"));
	}

	@Test
	public void testCase95() {
		assertTrue(jb.bondRegex("(007))007)"));
	}

	@Test
	public void testCase96() {
		assertTrue(jb.bondRegex("(007))07)"));
	}

	@Test
	public void testCase97() {
		assertTrue(jb.bondRegex("(007))7)"));
	}

	@Test
	public void testCase98() {
		assertTrue(jb.bondRegex("(007)0("));
	}

	@Test
	public void testCase99() {
		assertTrue(jb.bondRegex("(007)0)"));
	}

	@Test
	public void testCase100() {
		assertTrue(jb.bondRegex("(007)0007)"));
	}

	@Test
	public void testCase101() {
		assertTrue(jb.bondRegex("(007)1("));
	}

	@Test
	public void testCase102() {
		assertTrue(jb.bondRegex("(007)1)"));
	}

	@Test
	public void testCase103() {
		assertTrue(jb.bondRegex("(007)1007)"));
	}

	@Test
	public void testCase104() {
		assertTrue(jb.bondRegex("(007)107)"));
	}

	@Test
	public void testCase105() {
		assertTrue(jb.bondRegex("(007)17)"));
	}

	@Test
	public void testCase106() {
		assertTrue(jb.bondRegex("(007)2("));
	}

	@Test
	public void testCase107() {
		assertTrue(jb.bondRegex("(007)2)"));
	}

	@Test
	public void testCase108() {
		assertTrue(jb.bondRegex("(007)2007)"));
	}

	@Test
	public void testCase109() {
		assertTrue(jb.bondRegex("(007)207)"));
	}

	@Test
	public void testCase110() {
		assertTrue(jb.bondRegex("(007)27)"));
	}

	@Test
	public void testCase111() {
		assertTrue(jb.bondRegex("(007)3("));
	}

	@Test
	public void testCase112() {
		assertTrue(jb.bondRegex("(007)3)"));
	}

	@Test
	public void testCase113() {
		assertTrue(jb.bondRegex("(007)3007)"));
	}

	@Test
	public void testCase114() {
		assertTrue(jb.bondRegex("(007)307)"));
	}

	@Test
	public void testCase115() {
		assertTrue(jb.bondRegex("(007)37)"));
	}

	@Test
	public void testCase116() {
		assertTrue(jb.bondRegex("(007)4("));
	}

	@Test
	public void testCase117() {
		assertTrue(jb.bondRegex("(007)4)"));
	}

	@Test
	public void testCase118() {
		assertTrue(jb.bondRegex("(007)4007)"));
	}

	@Test
	public void testCase119() {
		assertTrue(jb.bondRegex("(007)407)"));
	}

	@Test
	public void testCase120() {
		assertTrue(jb.bondRegex("(007)47)"));
	}

	@Test
	public void testCase121() {
		assertTrue(jb.bondRegex("(007)5("));
	}

	@Test
	public void testCase122() {
		assertTrue(jb.bondRegex("(007)5)"));
	}

	@Test
	public void testCase123() {
		assertTrue(jb.bondRegex("(007)5007)"));
	}

	@Test
	public void testCase124() {
		assertTrue(jb.bondRegex("(007)507)"));
	}

	@Test
	public void testCase125() {
		assertTrue(jb.bondRegex("(007)57)"));
	}

	@Test
	public void testCase126() {
		assertTrue(jb.bondRegex("(007)6("));
	}

	@Test
	public void testCase127() {
		assertTrue(jb.bondRegex("(007)6)"));
	}

	@Test
	public void testCase128() {
		assertTrue(jb.bondRegex("(007)6007)"));
	}

	@Test
	public void testCase129() {
		assertTrue(jb.bondRegex("(007)607)"));
	}

	@Test
	public void testCase130() {
		assertTrue(jb.bondRegex("(007)67)"));
	}

	@Test
	public void testCase131() {
		assertTrue(jb.bondRegex("(007)7("));
	}

	@Test
	public void testCase132() {
		assertTrue(jb.bondRegex("(007)7007)"));
	}

	@Test
	public void testCase133() {
		assertTrue(jb.bondRegex("(007)707)"));
	}

	@Test
	public void testCase134() {
		assertTrue(jb.bondRegex("(007)77)"));
	}

	@Test
	public void testCase135() {
		assertTrue(jb.bondRegex("(007)8("));
	}

	@Test
	public void testCase136() {
		assertTrue(jb.bondRegex("(007)8)"));
	}

	@Test
	public void testCase137() {
		assertTrue(jb.bondRegex("(007)8007)"));
	}

	@Test
	public void testCase138() {
		assertTrue(jb.bondRegex("(007)807)"));
	}

	@Test
	public void testCase139() {
		assertTrue(jb.bondRegex("(007)87)"));
	}

	@Test
	public void testCase140() {
		assertTrue(jb.bondRegex("(007)9("));
	}

	@Test
	public void testCase141() {
		assertTrue(jb.bondRegex("(007)9)"));
	}

	@Test
	public void testCase142() {
		assertTrue(jb.bondRegex("(007)9007)"));
	}

	@Test
	public void testCase143() {
		assertTrue(jb.bondRegex("(007)907)"));
	}

	@Test
	public void testCase144() {
		assertTrue(jb.bondRegex("(007)97)"));
	}

	@Test
	public void testCase145() {
		assertFalse(jb.bondRegex("(0070("));
	}

	@Test
	public void testCase146() {
		assertTrue(jb.bondRegex("(0070)"));
	}

	@Test
	public void testCase147() {
		assertTrue(jb.bondRegex("(0070007)"));
	}

	@Test
	public void testCase148() {
		assertFalse(jb.bondRegex("(0071("));
	}

	@Test
	public void testCase149() {
		assertTrue(jb.bondRegex("(0071)"));
	}

	@Test
	public void testCase150() {
		assertTrue(jb.bondRegex("(0071007)"));
	}

	@Test
	public void testCase151() {
		assertTrue(jb.bondRegex("(007107)"));
	}

	@Test
	public void testCase152() {
		assertTrue(jb.bondRegex("(00717)"));
	}

	@Test
	public void testCase153() {
		assertFalse(jb.bondRegex("(0072("));
	}

	@Test
	public void testCase154() {
		assertTrue(jb.bondRegex("(0072)"));
	}

	@Test
	public void testCase155() {
		assertTrue(jb.bondRegex("(0072007)"));
	}

	@Test
	public void testCase156() {
		assertTrue(jb.bondRegex("(007207)"));
	}

	@Test
	public void testCase157() {
		assertTrue(jb.bondRegex("(00727)"));
	}

	@Test
	public void testCase158() {
		assertFalse(jb.bondRegex("(0073("));
	}

	@Test
	public void testCase159() {
		assertTrue(jb.bondRegex("(0073)"));
	}

	@Test
	public void testCase160() {
		assertTrue(jb.bondRegex("(0073007)"));
	}

	@Test
	public void testCase161() {
		assertTrue(jb.bondRegex("(007307)"));
	}

	@Test
	public void testCase162() {
		assertTrue(jb.bondRegex("(00737)"));
	}

	@Test
	public void testCase163() {
		assertFalse(jb.bondRegex("(0074("));
	}

	@Test
	public void testCase164() {
		assertTrue(jb.bondRegex("(0074)"));
	}

	@Test
	public void testCase165() {
		assertTrue(jb.bondRegex("(0074007)"));
	}

	@Test
	public void testCase166() {
		assertTrue(jb.bondRegex("(007407)"));
	}

	@Test
	public void testCase167() {
		assertTrue(jb.bondRegex("(00747)"));
	}

	@Test
	public void testCase168() {
		assertFalse(jb.bondRegex("(0075("));
	}

	@Test
	public void testCase169() {
		assertTrue(jb.bondRegex("(0075)"));
	}

	@Test
	public void testCase170() {
		assertTrue(jb.bondRegex("(0075007)"));
	}

	@Test
	public void testCase171() {
		assertTrue(jb.bondRegex("(007507)"));
	}

	@Test
	public void testCase172() {
		assertTrue(jb.bondRegex("(00757)"));
	}

	@Test
	public void testCase173() {
		assertFalse(jb.bondRegex("(0076("));
	}

	@Test
	public void testCase174() {
		assertTrue(jb.bondRegex("(0076)"));
	}

	@Test
	public void testCase175() {
		assertTrue(jb.bondRegex("(0076007)"));
	}

	@Test
	public void testCase176() {
		assertTrue(jb.bondRegex("(007607)"));
	}

	@Test
	public void testCase177() {
		assertTrue(jb.bondRegex("(00767)"));
	}

	@Test
	public void testCase178() {
		assertFalse(jb.bondRegex("(0077("));
	}

	@Test
	public void testCase179() {
		assertTrue(jb.bondRegex("(0077007)"));
	}

	@Test
	public void testCase180() {
		assertTrue(jb.bondRegex("(007707)"));
	}

	@Test
	public void testCase181() {
		assertTrue(jb.bondRegex("(00777)"));
	}

	@Test
	public void testCase182() {
		assertFalse(jb.bondRegex("(0078("));
	}

	@Test
	public void testCase183() {
		assertTrue(jb.bondRegex("(0078)"));
	}

	@Test
	public void testCase184() {
		assertTrue(jb.bondRegex("(0078007)"));
	}

	@Test
	public void testCase185() {
		assertTrue(jb.bondRegex("(007807)"));
	}

	@Test
	public void testCase186() {
		assertTrue(jb.bondRegex("(00787)"));
	}

	@Test
	public void testCase187() {
		assertFalse(jb.bondRegex("(0079("));
	}

	@Test
	public void testCase188() {
		assertTrue(jb.bondRegex("(0079)"));
	}

	@Test
	public void testCase189() {
		assertTrue(jb.bondRegex("(0079007)"));
	}

	@Test
	public void testCase190() {
		assertTrue(jb.bondRegex("(007907)"));
	}

	@Test
	public void testCase191() {
		assertTrue(jb.bondRegex("(00797)"));
	}

	@Test
	public void testCase192() {
		assertFalse(jb.bondRegex("(008("));
	}

	@Test
	public void testCase193() {
		assertFalse(jb.bondRegex("(008)"));
	}

	@Test
	public void testCase194() {
		assertTrue(jb.bondRegex("(008007)"));
	}

	@Test
	public void testCase195() {
		assertFalse(jb.bondRegex("(00807)"));
	}

	@Test
	public void testCase196() {
		assertFalse(jb.bondRegex("(0087)"));
	}

	@Test
	public void testCase197() {
		assertFalse(jb.bondRegex("(009("));
	}

	@Test
	public void testCase198() {
		assertFalse(jb.bondRegex("(009)"));
	}

	@Test
	public void testCase199() {
		assertTrue(jb.bondRegex("(009007)"));
	}

	@Test
	public void testCase200() {
		assertFalse(jb.bondRegex("(00907)"));
	}

	@Test
	public void testCase201() {
		assertFalse(jb.bondRegex("(0097)"));
	}

	@Test
	public void testCase202() {
		assertFalse(jb.bondRegex("(01("));
	}

	@Test
	public void testCase203() {
		assertFalse(jb.bondRegex("(01)"));
	}

	@Test
	public void testCase204() {
		assertTrue(jb.bondRegex("(01007)"));
	}

	@Test
	public void testCase205() {
		assertFalse(jb.bondRegex("(0107)"));
	}

	@Test
	public void testCase206() {
		assertFalse(jb.bondRegex("(017)"));
	}

	@Test
	public void testCase207() {
		assertFalse(jb.bondRegex("(02("));
	}

	@Test
	public void testCase208() {
		assertFalse(jb.bondRegex("(02)"));
	}

	@Test
	public void testCase209() {
		assertTrue(jb.bondRegex("(02007)"));
	}

	@Test
	public void testCase210() {
		assertFalse(jb.bondRegex("(0207)"));
	}

	@Test
	public void testCase211() {
		assertFalse(jb.bondRegex("(027)"));
	}

	@Test
	public void testCase212() {
		assertFalse(jb.bondRegex("(03("));
	}

	@Test
	public void testCase213() {
		assertFalse(jb.bondRegex("(03)"));
	}

	@Test
	public void testCase214() {
		assertTrue(jb.bondRegex("(03007)"));
	}

	@Test
	public void testCase215() {
		assertFalse(jb.bondRegex("(0307)"));
	}

	@Test
	public void testCase216() {
		assertFalse(jb.bondRegex("(037)"));
	}

	@Test
	public void testCase217() {
		assertFalse(jb.bondRegex("(04("));
	}

	@Test
	public void testCase218() {
		assertFalse(jb.bondRegex("(04)"));
	}

	@Test
	public void testCase219() {
		assertTrue(jb.bondRegex("(04007)"));
	}

	@Test
	public void testCase220() {
		assertFalse(jb.bondRegex("(0407)"));
	}

	@Test
	public void testCase221() {
		assertFalse(jb.bondRegex("(047)"));
	}

	@Test
	public void testCase222() {
		assertFalse(jb.bondRegex("(05("));
	}

	@Test
	public void testCase223() {
		assertFalse(jb.bondRegex("(05)"));
	}

	@Test
	public void testCase224() {
		assertTrue(jb.bondRegex("(05007)"));
	}

	@Test
	public void testCase225() {
		assertFalse(jb.bondRegex("(0507)"));
	}

	@Test
	public void testCase226() {
		assertFalse(jb.bondRegex("(057)"));
	}

	@Test
	public void testCase227() {
		assertFalse(jb.bondRegex("(06("));
	}

	@Test
	public void testCase228() {
		assertFalse(jb.bondRegex("(06)"));
	}

	@Test
	public void testCase229() {
		assertTrue(jb.bondRegex("(06007)"));
	}

	@Test
	public void testCase230() {
		assertFalse(jb.bondRegex("(0607)"));
	}

	@Test
	public void testCase231() {
		assertFalse(jb.bondRegex("(067)"));
	}

	@Test
	public void testCase232() {
		assertFalse(jb.bondRegex("(07("));
	}

	@Test
	public void testCase233() {
		assertTrue(jb.bondRegex("(07007)"));
	}

	@Test
	public void testCase234() {
		assertFalse(jb.bondRegex("(0707)"));
	}

	@Test
	public void testCase235() {
		assertFalse(jb.bondRegex("(077)"));
	}

	@Test
	public void testCase236() {
		assertFalse(jb.bondRegex("(08("));
	}

	@Test
	public void testCase237() {
		assertFalse(jb.bondRegex("(08)"));
	}

	@Test
	public void testCase238() {
		assertTrue(jb.bondRegex("(08007)"));
	}

	@Test
	public void testCase239() {
		assertFalse(jb.bondRegex("(0807)"));
	}

	@Test
	public void testCase240() {
		assertFalse(jb.bondRegex("(087)"));
	}

	@Test
	public void testCase241() {
		assertFalse(jb.bondRegex("(09("));
	}

	@Test
	public void testCase242() {
		assertFalse(jb.bondRegex("(09)"));
	}

	@Test
	public void testCase243() {
		assertTrue(jb.bondRegex("(09007)"));
	}

	@Test
	public void testCase244() {
		assertFalse(jb.bondRegex("(0907)"));
	}

	@Test
	public void testCase245() {
		assertFalse(jb.bondRegex("(097)"));
	}

	@Test
	public void testCase246() {
		assertFalse(jb.bondRegex("(1("));
	}

	@Test
	public void testCase247() {
		assertFalse(jb.bondRegex("(1)"));
	}

	@Test
	public void testCase248() {
		assertTrue(jb.bondRegex("(1007)"));
	}

	@Test
	public void testCase249() {
		assertFalse(jb.bondRegex("(107)"));
	}

	@Test
	public void testCase250() {
		assertFalse(jb.bondRegex("(17)"));
	}

	@Test
	public void testCase251() {
		assertFalse(jb.bondRegex("(2("));
	}

	@Test
	public void testCase252() {
		assertFalse(jb.bondRegex("(2)"));
	}

	@Test
	public void testCase253() {
		assertTrue(jb.bondRegex("(2007)"));
	}

	@Test
	public void testCase254() {
		assertFalse(jb.bondRegex("(207)"));
	}

	@Test
	public void testCase255() {
		assertFalse(jb.bondRegex("(27)"));
	}

	@Test
	public void testCase256() {
		assertFalse(jb.bondRegex("(3("));
	}

	@Test
	public void testCase257() {
		assertFalse(jb.bondRegex("(3)"));
	}

	@Test
	public void testCase258() {
		assertTrue(jb.bondRegex("(3007)"));
	}

	@Test
	public void testCase259() {
		assertFalse(jb.bondRegex("(307)"));
	}

	@Test
	public void testCase260() {
		assertFalse(jb.bondRegex("(37)"));
	}

	@Test
	public void testCase261() {
		assertFalse(jb.bondRegex("(4("));
	}

	@Test
	public void testCase262() {
		assertFalse(jb.bondRegex("(4)"));
	}

	@Test
	public void testCase263() {
		assertTrue(jb.bondRegex("(4007)"));
	}

	@Test
	public void testCase264() {
		assertFalse(jb.bondRegex("(407)"));
	}

	@Test
	public void testCase265() {
		assertFalse(jb.bondRegex("(47)"));
	}

	@Test
	public void testCase266() {
		assertFalse(jb.bondRegex("(5("));
	}

	@Test
	public void testCase267() {
		assertFalse(jb.bondRegex("(5)"));
	}

	@Test
	public void testCase268() {
		assertTrue(jb.bondRegex("(5007)"));
	}

	@Test
	public void testCase269() {
		assertFalse(jb.bondRegex("(507)"));
	}

	@Test
	public void testCase270() {
		assertFalse(jb.bondRegex("(57)"));
	}

	@Test
	public void testCase271() {
		assertFalse(jb.bondRegex("(6("));
	}

	@Test
	public void testCase272() {
		assertFalse(jb.bondRegex("(6)"));
	}

	@Test
	public void testCase273() {
		assertTrue(jb.bondRegex("(6007)"));
	}

	@Test
	public void testCase274() {
		assertFalse(jb.bondRegex("(607)"));
	}

	@Test
	public void testCase275() {
		assertFalse(jb.bondRegex("(67)"));
	}

	@Test
	public void testCase276() {
		assertFalse(jb.bondRegex("(7("));
	}

	@Test
	public void testCase277() {
		assertTrue(jb.bondRegex("(7007)"));
	}

	@Test
	public void testCase278() {
		assertFalse(jb.bondRegex("(707)"));
	}

	@Test
	public void testCase279() {
		assertFalse(jb.bondRegex("(77)"));
	}

	@Test
	public void testCase280() {
		assertFalse(jb.bondRegex("(8("));
	}

	@Test
	public void testCase281() {
		assertFalse(jb.bondRegex("(8)"));
	}

	@Test
	public void testCase282() {
		assertTrue(jb.bondRegex("(8007)"));
	}

	@Test
	public void testCase283() {
		assertFalse(jb.bondRegex("(807)"));
	}

	@Test
	public void testCase284() {
		assertFalse(jb.bondRegex("(87)"));
	}

	@Test
	public void testCase285() {
		assertFalse(jb.bondRegex("(9("));
	}

	@Test
	public void testCase286() {
		assertFalse(jb.bondRegex("(9)"));
	}

	@Test
	public void testCase287() {
		assertTrue(jb.bondRegex("(9007)"));
	}

	@Test
	public void testCase288() {
		assertFalse(jb.bondRegex("(907)"));
	}

	@Test
	public void testCase289() {
		assertFalse(jb.bondRegex("(97)"));
	}

	@Test
	public void testCase290() {
		assertFalse(jb.bondRegex(")("));
	}

	@Test
	public void testCase291() {
		assertFalse(jb.bondRegex("))"));
	}

	@Test
	public void testCase292() {
		assertFalse(jb.bondRegex(")007)"));
	}

	@Test
	public void testCase293() {
		assertFalse(jb.bondRegex(")07)"));
	}

	@Test
	public void testCase294() {
		assertFalse(jb.bondRegex(")7)"));
	}

	@Test
	public void testCase295() {
		assertFalse(jb.bondRegex("0("));
	}

	@Test
	public void testCase296() {
		assertFalse(jb.bondRegex("0)"));
	}

	@Test
	public void testCase297() {
		assertFalse(jb.bondRegex("0007)"));
	}

	@Test
	public void testCase298() {
		assertFalse(jb.bondRegex("007)"));
	}

	@Test
	public void testCase299() {
		assertFalse(jb.bondRegex("07)"));
	}

	@Test
	public void testCase300() {
		assertFalse(jb.bondRegex("1("));
	}

	@Test
	public void testCase301() {
		assertFalse(jb.bondRegex("1)"));
	}

	@Test
	public void testCase302() {
		assertFalse(jb.bondRegex("1007)"));
	}

	@Test
	public void testCase303() {
		assertFalse(jb.bondRegex("107)"));
	}

	@Test
	public void testCase304() {
		assertFalse(jb.bondRegex("17)"));
	}

	@Test
	public void testCase305() {
		assertFalse(jb.bondRegex("2("));
	}

	@Test
	public void testCase306() {
		assertFalse(jb.bondRegex("2)"));
	}

	@Test
	public void testCase307() {
		assertFalse(jb.bondRegex("2007)"));
	}

	@Test
	public void testCase308() {
		assertFalse(jb.bondRegex("207)"));
	}

	@Test
	public void testCase309() {
		assertFalse(jb.bondRegex("27)"));
	}

	@Test
	public void testCase310() {
		assertFalse(jb.bondRegex("3("));
	}

	@Test
	public void testCase311() {
		assertFalse(jb.bondRegex("3)"));
	}

	@Test
	public void testCase312() {
		assertFalse(jb.bondRegex("3007)"));
	}

	@Test
	public void testCase313() {
		assertFalse(jb.bondRegex("307)"));
	}

	@Test
	public void testCase314() {
		assertFalse(jb.bondRegex("37)"));
	}

	@Test
	public void testCase315() {
		assertFalse(jb.bondRegex("4("));
	}

	@Test
	public void testCase316() {
		assertFalse(jb.bondRegex("4)"));
	}

	@Test
	public void testCase317() {
		assertFalse(jb.bondRegex("4007)"));
	}

	@Test
	public void testCase318() {
		assertFalse(jb.bondRegex("407)"));
	}

	@Test
	public void testCase319() {
		assertFalse(jb.bondRegex("47)"));
	}

	@Test
	public void testCase320() {
		assertFalse(jb.bondRegex("5("));
	}

	@Test
	public void testCase321() {
		assertFalse(jb.bondRegex("5)"));
	}

	@Test
	public void testCase322() {
		assertFalse(jb.bondRegex("5007)"));
	}

	@Test
	public void testCase323() {
		assertFalse(jb.bondRegex("507)"));
	}

	@Test
	public void testCase324() {
		assertFalse(jb.bondRegex("57)"));
	}

	@Test
	public void testCase325() {
		assertFalse(jb.bondRegex("6("));
	}

	@Test
	public void testCase326() {
		assertFalse(jb.bondRegex("6)"));
	}

	@Test
	public void testCase327() {
		assertFalse(jb.bondRegex("6007)"));
	}

	@Test
	public void testCase328() {
		assertFalse(jb.bondRegex("607)"));
	}

	@Test
	public void testCase329() {
		assertFalse(jb.bondRegex("67)"));
	}

	@Test
	public void testCase330() {
		assertFalse(jb.bondRegex("7("));
	}

	@Test
	public void testCase331() {
		assertFalse(jb.bondRegex("7)"));
	}

	@Test
	public void testCase332() {
		assertFalse(jb.bondRegex("7007)"));
	}

	@Test
	public void testCase333() {
		assertFalse(jb.bondRegex("707)"));
	}

	@Test
	public void testCase334() {
		assertFalse(jb.bondRegex("77)"));
	}

	@Test
	public void testCase335() {
		assertFalse(jb.bondRegex("8("));
	}

	@Test
	public void testCase336() {
		assertFalse(jb.bondRegex("8)"));
	}

	@Test
	public void testCase337() {
		assertFalse(jb.bondRegex("8007)"));
	}

	@Test
	public void testCase338() {
		assertFalse(jb.bondRegex("807)"));
	}

	@Test
	public void testCase339() {
		assertFalse(jb.bondRegex("87)"));
	}

	@Test
	public void testCase340() {
		assertFalse(jb.bondRegex("9("));
	}

	@Test
	public void testCase341() {
		assertFalse(jb.bondRegex("9)"));
	}

	@Test
	public void testCase342() {
		assertFalse(jb.bondRegex("9007)"));
	}

	@Test
	public void testCase343() {
		assertFalse(jb.bondRegex("907)"));
	}

	@Test
	public void testCase344() {
		assertFalse(jb.bondRegex("97)"));
	}

	@Test
	public void testCase345() {
		assertFalse(jb.bondRegex("("));
	}

	@Test
	public void testCase346() {
		assertFalse(jb.bondRegex(")"));
	}
}