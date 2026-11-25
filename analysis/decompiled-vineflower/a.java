import java.io.ByteArrayInputStream;
import java.util.Random;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class a extends f {
   private static int af;
   private static int ag;
   static int a;
   static int[] a;
   private static byte[] b;
   private static int ah;
   private static int ai;
   public static boolean a = false;
   private static int[] e = new int[]{
      35, 38, 37, 30, 1, 31, 140, 32, 0, 8, 36, 23, 39, 141, 34, 42, 125, 126, 45, 6, 140, 0, 40, 41, 7, 140, 0, 44, 46, 47, 48, 43, 141
   };
   private static int[] f = new int[]{23, 46, 49, 6, 140, 0, 47, 6, 140, 0, 43, 141};
   private static int[] g = new int[]{50, 46, 49, 6, 140, 0, 47, 6, 140, 0, 43, 141};
   private static int[] h;
   private static int aj;
   private static int ak;
   private static int al;
   private static boolean p;
   private static boolean q;
   private static boolean r;
   private static int am;
   private static int an;
   private static boolean s;
   private static int ao;
   private static byte[] c;
   private static byte[][] a;
   private static short[][] a;
   private static short[][] b;
   private static d[][] a;
   private static int[] i;
   private static int ap;
   static short[][][] a;
   private static short[][][] b;
   private static String[][] a;
   static d[] a;
   private static j[] a;
   private static byte[] d;
   private static i[] a;
   private static i a;
   private static i[] b;
   private static i[] c;
   private static i b;
   private static i[] d;
   private static int[][] b;
   private static int[][] c;
   private static boolean t = false;
   private static boolean u = false;
   private static boolean v = false;
   private static boolean w = false;
   private static boolean x = false;
   private static boolean y = false;
   private static boolean z = false;
   private static boolean A = true;
   private static int aq = 1;
   private static boolean B = false;
   private static boolean C = false;
   private static boolean D = false;
   private static int ar = 0;
   private static int as = 0;
   private static int at = 0;
   private static boolean E = false;
   private static boolean F = false;
   private static boolean G = false;
   private static boolean H = false;
   private static boolean I = false;
   private static boolean J = false;
   private static boolean K = false;
   private static boolean L = false;
   private static boolean M = false;
   private static boolean N = true;
   private static boolean O = false;
   private static int au = -2000;
   private static int[] j = new int[]{
      0,
      1,
      3,
      6,
      9,
      10,
      11,
      12,
      13,
      14,
      16,
      17,
      18,
      19,
      20,
      21,
      22,
      23,
      24,
      25,
      26,
      28,
      31,
      32,
      37,
      38,
      39,
      46,
      47,
      48,
      49,
      50,
      53,
      54,
      55,
      56,
      57,
      58,
      59,
      60,
      61,
      64,
      71,
      72,
      73,
      74,
      78,
      79,
      159,
      160,
      161,
      162,
      164,
      168,
      169,
      170,
      171,
      172,
      173,
      176,
      175,
      177,
      179,
      181,
      182,
      186,
      187,
      190,
      194,
      195,
      197,
      196,
      211,
      155,
      217,
      220,
      29,
      236,
      238
   };
   private static int[] k = new int[]{
      1,
      1,
      1,
      0,
      1,
      2,
      1,
      1,
      1,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      2,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      1,
      1,
      0,
      0,
      0,
      1,
      0,
      0,
      0,
      0,
      1,
      0,
      0,
      0,
      1,
      2,
      2,
      1,
      0,
      2,
      2,
      2,
      2,
      0,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      0,
      0,
      0,
      2,
      1,
      0,
      0,
      0,
      0,
      0,
      0
   };
   private static int[] l = new int[]{
      1,
      2,
      0,
      0,
      0,
      3,
      0,
      0,
      6,
      8,
      0,
      0,
      0,
      0,
      5,
      0,
      0,
      3,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      4,
      4,
      0,
      0,
      0,
      0,
      0,
      0,
      9,
      0,
      6,
      0,
      0,
      0,
      0,
      7,
      7,
      10,
      0,
      3,
      3,
      3,
      0,
      0,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      0,
      0,
      0,
      3,
      10,
      0,
      0,
      0,
      0,
      0,
      0
   };
   private static int[] m = new int[]{
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      4,
      0,
      0,
      0,
      0,
      5,
      0,
      3,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      3,
      0,
      4,
      4,
      0,
      0,
      0,
      0,
      2,
      2,
      2,
      1,
      0,
      0,
      0,
      3,
      0,
      0,
      0,
      0,
      3,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0
   };
   private static int[] n = new int[100];
   private static int[] o = new int[100];
   private static short a = 32767;
   private static short b = 32767;
   private static boolean P = false;
   private static boolean Q = false;
   private static int[] p;
   private static boolean R = false;
   private static boolean S = true;
   static boolean b = false;
   private static boolean T = true;
   private static Player a;
   private static int av = 67;
   private static String[] a = new String[67];
   private static ByteArrayInputStream[] a;
   private static boolean U = false;
   private static boolean V = true;
   private static boolean W = false;
   private static boolean X = false;
   private static int aw = 0;
   private static boolean Y = false;
   private static boolean Z = false;
   static int b = 0;
   static int c = 1000;
   private static int[] q = new int[5];
   private static int ax = 2;
   private static int ay = 0;
   private static long b = -1L;
   private static long c = -1L;
   private static long d = 0L;
   private static long e = 0L;
   private static int[] r;
   private static int az = 0;
   private static int aA = 8;
   private static int aB = -1;
   private static long f = 0L;
   private static int[] s = new int[]{
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      5,
      5,
      5,
      5,
      5,
      5,
      5,
      3,
      4,
      10,
      10,
      10,
      10,
      10,
      10,
      10,
      2,
      3,
      3,
      10,
      4,
      4,
      3,
      4,
      3,
      3,
      4,
      3,
      3,
      4,
      3,
      3,
      3,
      3,
      3,
      4,
      4,
      5,
      10,
      10,
      1,
      5,
      3,
      4,
      3,
      4,
      4,
      4,
      1,
      4,
      5,
      5,
      5
   };
   static int d = -1;
   static e a = null;
   private static e e = null;
   private static e f = null;
   private static boolean aa = false;
   private static int aC;
   private static int aD;
   static int e = -1;
   private static int aE = -1;
   static int f = 0;
   static int g = 1;
   static int h;
   static int i;
   static int j;
   static int k;
   static int l;
   static int m;
   static int n;
   static int o;
   private static i c = null;
   private static int aF;
   private static int[] t = null;
   private static int[] u = null;
   private static int aG = 0;
   private static boolean ab;
   private static int aH = 0;
   private static int[] v = null;
   private static int[] w = null;
   private static int[] x = null;
   private static int[] y = null;
   private static int aI = 0;
   private static int aJ = 0;
   private static boolean ac = false;
   private static String e = "";
   private static long g = 0L;
   private static short c = 55;
   private static short d = 61;
   private static boolean ad = false;
   private static char a = 0;
   private static boolean ae = false;
   private static int aK = 0;
   static boolean c = false;
   private static int aL = 0;
   private static int aM = 0;
   private static boolean af = false;
   private static boolean ag = false;
   static boolean d = false;
   private static boolean ah = false;
   private static boolean ai = false;
   private static boolean aj = false;
   private static boolean ak = false;
   private static boolean al = false;
   private static boolean am = false;
   private static int aN = 0;
   static int p = 0;
   private static i d = null;
   private static boolean an = false;
   private static int aO = 0;
   private static boolean ao = false;
   private static boolean ap = false;
   static boolean e;
   static boolean f;
   static e b = null;
   private static int aP = -1;
   private static int aQ = 0;
   private static int aR = 0;
   static int q = 0;
   private static boolean aq = false;
   private static int aS = 0;
   static int r = 0;
   static boolean[] a;
   private static int aT;
   private static i e;
   private static int aU = 0;
   private static int aV = 0;
   private static int aW = 0;
   private static int aX = 0;
   private static long h;
   private static long i;
   private static int aY;
   private static int aZ;
   private static int ba;
   private static int bb;
   private static int bc;
   private static int bd;
   private static boolean ar = false;
   private static int be = 0;
   private static int bf = 0;
   private static e[] b;
   private static boolean[] b;
   private static boolean[] c;
   private static boolean as = false;
   private static boolean at = false;
   private static long j = 0L;
   private static int[][] d;
   private static int[][] e;
   private static long[][] a;
   private static int[] z;
   private static int[][] f;
   private static int[][] g;
   private static int[] A;
   private static boolean au = false;
   private static int[] B;
   private static String[] b;
   private static String[] c;
   private static int[] C;
   private static int[] D;
   private static int[] E;
   private static int[] F;
   private static int[] G;
   private static int[] H;
   private static boolean[] d;
   private static int[] I;
   private static int[] J;
   private static int[] K;
   private static int[] L;
   private static int[] M;
   private static byte[] e;
   private static int bg = 20;
   private static boolean[] e;
   private static int[] N;
   private static short[] g;
   private static int bh;
   private static int bi = 0;
   private static int[] O;
   private static int[] P;
   private static int bj = -1;
   private static int bk = -1;
   private static int bl = -1;
   private static int bm = -1;
   private static int bn;
   private static int bo = 0;
   private static int bp = 0;
   private static int bq = 0;
   private static int br = 0;
   private static byte[] f;
   private static int[][] h;
   static int s = 0;
   static boolean g = false;
   private static int bs = l(1);
   private static int bt = l(0);
   private static long k = b(0L);
   private static int bu = 99999999;
   private static int bv = l(0);
   private static int bw = 3000000;
   private static int[] Q;
   private static int bx = 0;
   private static int by = 0;
   private static int bz = 360;
   private static int bA = 0;
   private static int bB;
   private static int bC;
   private static int bD = 0;
   private static int bE;
   private static int bF;
   private static int bG = 0;
   private static int bH = 99;
   private static int[] R;
   private static int[] S;
   private static short[] h;
   private static int bI = 0;
   private static int bJ = 0;
   private static int bK = 0;
   private static int bL = 0;
   private static int bM = 0;
   static int[] b;
   private static int[] T;
   static e[] a;
   static int t;
   static int u;
   static int v;
   static int w;
   private static short e = 0;
   private static short f = 0;
   private static short g;
   private static short[] i;
   private static short[][] c;
   private static int[][] i;
   private static int bN = 0;
   private static int bO = 0;
   private static int bP;
   private static int bQ;
   private static long l;
   private static int bR;
   private static int[] U;
   private static int bS;
   private static int bT;
   private static int bU;
   private static long m;
   private static int[][] j;
   private static int bV = 9;
   private static int bW = -1413816336;
   private static boolean av;
   private static String f = "";
   private static boolean aw = true;
   private static boolean ax = false;
   private static char b;
   private static int[] V;
   private static int[] W;
   private static int[] X;
   private static int[] Y;
   private static int[] Z;
   private static int[] aa;
   private static int[] ab;
   private static int[] ac;
   private static int[] ad;
   private static int[] ae;
   private static int[] af;
   private static int[] ag;
   private static boolean[] f;
   private static int bX;
   private static int bY;
   private static int bZ;
   private static int ca;
   private static int cb;
   private static int[] ah;
   private static int[] ai;
   private static int[] aj;
   private static int[] ak;
   private static short[] j;
   private static short[] k;
   private static short[] l;
   private static short[] m;
   private static short[] n;
   private static byte[] g;
   private static long n;
   static int x;
   static int y;
   private static int cc;
   private static int cd;
   private static int[] al;
   private static int[] am;
   private static int[] an;
   private static int[] ao;
   private static int[] ap;
   private static int[] aq;
   private static boolean ay;
   private static int[] ar = null;
   private static int[] as = null;
   private static char c = 0;
   private static char d = 0;
   private static int[][] k = null;
   private static int[][] l = null;
   private static int[][] m = null;
   private static int[][] n = null;
   private static int[][] o = null;
   private static int[][] p = null;
   private static int[][] q = null;
   private static int ce = 0;
   private static int[][] r = null;
   private static boolean az = false;
   private static int cf = 0;
   private static int cg;
   private static int ch;
   private static int ci;
   private static int cj;
   private static int ck;
   private static String g;
   private static int cl;
   private static int cm;
   private static int cn;
   private static boolean aA = false;
   private static int co;
   private static int cp;
   private static int cq;
   private static int cr;
   private static int cs;
   private static int ct;
   private static int cu;
   private static int cv;
   private static int cw;
   private static int cx;
   private static int cy;
   private static int cz;
   private static boolean aB = false;
   private static boolean aC = false;
   private static int cA = 0;
   private static int cB = 0;
   private static boolean aD = false;
   private static int cC = 0;
   private static char e = 0;
   private static int cD = 0;
   private static int cE;
   private static char f;
   private static int cF = 3;
   private static int cG = 10;
   private static int cH = 0;
   private static int[] at = null;
   private static int[] au = null;
   private static int[] av = null;
   private static long[] b = null;
   private static int[] aw = null;
   private static int[] ax = null;
   private static byte[] h = null;
   private static boolean[] g = null;
   private static int[] ay = null;
   private static String[] d = null;
   private static boolean aE = false;
   private static boolean aF = false;
   private static int cI = 0;
   static int z = 0;
   private static int cJ = 0;
   static int A = 3;
   private static int cK = 0;
   private static int cL = 0;
   private static int[] az = null;
   private static int[] aA = null;
   static int[] c = null;
   static long[] a = null;
   private static int[] aB = null;
   private static int[] aC = null;
   private static int[] aD = null;
   private static byte[] i = null;
   private static int[] aE = null;
   private static String[] e = null;
   private static boolean aG = false;
   private static int cM = 0;
   private static int cN = 0;
   private static int[] aF = null;
   private static int[] aG = null;
   private static int[] aH = null;
   private static int[] aI = null;
   private static int[] aJ = null;
   private static int[] aK = null;
   private static int[] aL = null;
   private static byte[] j = null;
   private static boolean aH = false;
   private static int cO = 0;
   private static int cP;
   private static int cQ;
   private static int cR;
   private static int cS;
   private static int cT;
   private static String h;
   private static int cU;
   private static int cV;
   private static int cW;
   private static int cX;
   private static int cY;
   private static int cZ;
   private static int da;
   private static int db;
   private static int dc;
   private static int dd;
   private static int de;
   private static int df;
   private static int dg;
   private static int dh;
   private static int di;
   private static boolean aI = false;
   private static int dj = 0;
   private static char g = 0;
   private static int dk;
   private static int dl;
   private static int dm;
   private static int dn;
   private static int do;
   private static int dp = -1;
   private static short[] o;
   private static int[] aM;
   private static int[] aN;
   private static int[] aO;
   private static int[] aP;
   private static short[] p;
   private static short[] q;
   private static short[] r;
   private static short[] s;
   private static short[] t;
   private static byte[] k;
   private static int dq = 0;
   private static boolean aJ;
   private static int[] aQ;
   private static int dr;
   private static long[] c;
   private static e[] c;
   private static boolean aK = false;
   private static boolean[] h;
   private static boolean[] i;
   private static boolean aL = false;
   private static boolean aM = false;
   private static boolean aN = false;
   private static long o = 0L;
   private static long p = 0L;
   private static String[] f = new String[]{
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      "",
      ""
   };
   private static int[] aR = new int[]{
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1
   };
   private static int ds;
   private static boolean aO;
   private static int dt = 0;
   private static int du = 0;
   private static short h;
   private static long q = 0L;
   private static String i = "";
   private static int dv = 0;
   private static boolean aP = false;
   private static int dw = 0;
   private static int dx = 0;
   private static int dy = 0;
   private static String j = "";
   private static String k = "";
   private static boolean aQ = false;
   private static String l = "";
   private static boolean aR = false;
   private static boolean aS = false;
   private static boolean aT = false;
   private static int dz;
   private static int[] aS;
   private static int[] aT;
   private static int[] aU;
   private static short[] u;
   private static short[] v;
   private static short[] w;
   private static short[] x;
   private static short[] y;
   private static byte[] l;
   private static boolean aU;
   private static int dA;
   private static int dB;
   private static int[] aV;
   private static int[] aW;
   private static int[] aX;
   private static short[] z;
   private static short[] A;
   private static short[] B;
   private static short[] C;
   private static int dC;
   private static boolean aV;
   private static e g;
   private static int dD = 0;
   private static int dE = 0;
   private static int[] aY;
   private static int[] aZ;
   private static int[] ba;
   private static int dF;
   private static int dG = 0;
   private static boolean aW = true;
   private static boolean aX = false;
   private static boolean aY = false;
   private static int dH = 0;
   private static String m = "";
   private static int dI;
   private static boolean aZ = true;
   private static boolean ba = false;
   private static int dJ = 0;
   private static int dK = 0;
   private static int dL = 0;
   private static int dM = 1;
   private static int dN = 113;
   private static int dO = 0;
   private static String n = "";
   private static int dP;
   private static int dQ;
   private static boolean[] j = new boolean[3];
   private static int dR = 0;
   private static boolean bb = false;
   private static boolean bc = false;
   private static int dS = 0;
   private static boolean bd = false;
   private static int dT = 0;
   private static int dU = 0;
   private static int dV = 0;
   private static int dW = 0;
   private static int dX = 0;
   private static int dY = 0;
   private static int dZ = 0;
   private static int ea = 0;
   private static int eb = 0;
   private static int ec = 0;
   private static int ed = 0;
   private static int ee = 0;
   private static int ef = 0;
   private static int eg = 0;
   private static int eh = 0;
   private static int ei = -1;
   private static boolean be = false;
   private static int[] bb = new int[10];
   private static int[] bc = new int[]{64, 65, 68, 839};
   private static int[] bd = new int[]{80, 78, 79};
   private static int ej = 0;
   private static int[] be;
   private static short[] D;
   static byte[] a;
   private static int[] bf;
   private static int[] bg;
   private static byte[] m;
   private static int[] bh;
   private static int ek;
   static int B = 0;
   static int C = 0;
   private static short i;
   private static long r = 0L;
   private static int[] bi;
   private static int el = 0;
   private static byte a = 0;
   private static int em = 0;
   private static boolean bf = false;
   private static int en;
   private static boolean bg = true;
   private static int[] bj;
   static int D = -1;
   static String a;
   private static boolean bh = true;
   private static String o = "";
   private static String p = "";
   private static boolean bi = false;
   private static int eo = 0;
   private static int ep = -1;
   private static e h;
   private static String q = "";
   private static int eq;
   private static int er = 0;
   private static e i = null;
   private static int[] bk;
   private static int[] bl;
   private static int[] bm;
   private static int[] bn;
   private static int[] bo;
   private static int[] bp;
   private static int es;
   private static boolean bj;
   private static int et;
   private static int eu;
   private static int ev = 1;
   private static String r = "";
   private static String s = "";
   private static int ew;
   private static int ex;
   private static int ey;
   private static int ez;
   private static int eA;
   private static int eB;
   private static int eC;
   private static int eD;
   private static int eE;
   private static int eF;
   private static boolean bk;
   private static int[][] s = new int[][]{{0, 40}, {1, 6}, {2, 30}, {3, 0}};
   private static int[][] t = new int[][]{
      {Integer.parseInt("/5".substring(1)), 66, 1},
      {Integer.parseInt("/5".substring(1)), 67, 1},
      {Integer.parseInt("/5".substring(1)), 68, 1},
      {Integer.parseInt("/5".substring(1)), 69, 1},
      {Integer.parseInt("/5".substring(1)), 70, 1},
      {Integer.parseInt("/5".substring(1)), 71, 1},
      {Integer.parseInt("/5".substring(1)), 72, 1},
      {Integer.parseInt("/5".substring(1)), 73, 1},
      {Integer.parseInt("/5".substring(1)), 74, 1},
      {Integer.parseInt("/5".substring(1)), 75, 1},
      {Integer.parseInt("/5".substring(1)), 76, 1},
      {Integer.parseInt("/7".substring(1)), 32, 2}
   };
   private static int[] bq = new int[]{1, 4, 5};
   private static int[] br = new int[]{1, 2, 4, 5, 22};
   private static int[] bs = new int[]{1, 2, 4, 5, 10, 22};
   private static int[] bt = new int[]{1, 2, 3, 4, 5, 22};
   private static int[] bu = new int[]{1, 2, 4, 5, 6, 22};
   private static int[] bv = new int[]{1, 2, 4, 5, 7, 13, 14, 16, 18, 19, 22, 25};
   private static int[] bw = new int[]{1, 2, 4, 5, 9, 10, 17, 22};
   private static int[] bx = new int[]{1, 2, 4, 5, 20, 22, 24};
   private static int[] by = new int[]{1, 2, 4, 5, 6, 22, 23};
   private static int eG = 0;
   private static String t = "";
   private static int eH = 0;
   private static boolean bl = false;
   public static boolean h = false;
   private static boolean bm = false;
   private static String[] g = new String[6];
   private static String[] h = new String[6];
   private static int[] bz = new int[6];
   private static int[] bA = new int[6];
   private static int[] bB = new int[6];
   private static int[] bC = new int[6];
   private static int[] bD = new int[6];
   private static int[] bE = new int[6];
   private static int[] bF = new int[6];
   private static String u = null;
   private static int eI = 0;
   private static int eJ = -1;
   private static int eK = 0;
   private static int eL = 0;
   private static int eM = 6;
   private static boolean bn = false;
   private static boolean bo = false;
   private static int eN = 0;
   private static int eO = -1;
   private static long[] d = new long[]{20L, 50L, 100L, 200L, 500L, 1000L};
   private static int[] bG = new int[]{20, 50, 100, 200, 500, 1000};
   private static int[] bH = new int[6];
   private static int[] bI = new int[6];
   private static int[] bJ = new int[]{-1, -1, -1, -1, -1};
   private static int[] bK = new int[]{778, 779, 780, 781, 782, 783, 787, 788, 789, 790, 803, 804, 808};
   private static int eP = 0;
   public static boolean i = true;
   private static int eQ = 0;
   private static int eR = 0;
   private static int eS = 0;
   private static boolean bp = false;
   private static int eT = 0;
   private static int eU = 0;
   private static boolean bq = false;
   private static int[] bL = new int[]{0, 0, 0, 0, 0, 0};
   private static int eV = f.T;
   private static int eW = f.U;
   private static int eX;
   private static int eY;
   private static int eZ;
   private static int fa;
   private static int[] bM;
   private static int[] bN;
   private static int[] bO;
   private static int fb;
   private static long s;
   private static long t;
   private static int[] bP;
   private static int[] bQ;
   private static int[] bR;
   private static int[] bS;
   private static int fc;
   private static int fd;
   private static int[] bT;
   private static int[] bU;
   private static int[] bV;
   private static int[] bW;
   private static int[] bX;
   private static int[] bY;
   private static String[] i = new String[]{"", "", ""};
   private static int fe = 0;
   private static int ff = 0;
   private static int fg = 0;
   private static int fh = 0;
   private static int fi = 0;
   private static int fj;
   private static int[] bZ;
   private static int[] ca;
   private static int[] cb;
   private static String[] j;
   private static String[] k;
   private static String[] l;
   private static int[] cc;
   private static int[] cd;
   private static String[] m;
   private static int[] ce;
   private static int[] cf;
   private static int[] cg;
   private static int[] ch;
   private static int[] ci;
   private static boolean[] k;
   private static String[] n;
   private static int[] cj;
   private static int[] ck;
   private static int[] cl;
   private static int[] cm;
   private static int[] cn;
   private static boolean[] l;
   private static String[] o;
   private static int[] co;
   private static int[] cp;
   private static int[] cq;
   private static int[] cr;
   private static int[] cs;
   private static boolean[] m;
   private static int[] ct;
   private static String[] p;
   private static int[] cu;
   private static int[] cv;
   private static int[] cw;
   private static int[] cx;
   private static int[] cy;
   private static int fk = 0;
   private static char h = 4;
   private static int fl = 297;
   private static short[] E = null;
   private static boolean[] n = null;
   private static short j = 0;
   private static boolean br = false;
   private static int fm = -1;
   private static boolean bs = true;
   private static boolean bt = true;
   private static int[] cz;
   private static int[] cA = new int[100];
   private static int fn;
   private static int fo;
   private static int fp;
   private static int fq;
   private static int fr;
   private static int fs;
   static int E;
   private static int ft;
   private static int fu;
   private static int fv;
   private static int fw;
   private static int fx;
   public static int F = eV >> 1;
   public static int G = eW >> 1;
   private static boolean bu = true;
   public static boolean j = true;
   public static int H;
   public static int I;
   private static int fy = 282;
   private static int fz = 52;
   private static int fA;
   private static int fB;
   private static boolean bv = false;
   private static int[] cB = new int[]{
      Integer.parseInt("/5".substring(1)),
      77,
      0,
      -1,
      -1,
      Integer.parseInt("/5".substring(1)),
      78,
      0,
      -1,
      -1,
      Integer.parseInt("/5".substring(1)),
      0,
      0,
      -1,
      -1,
      Integer.parseInt("/5".substring(1)),
      16,
      0,
      -1,
      -1,
      Integer.parseInt("/5".substring(1)),
      6,
      0,
      -1,
      -1,
      Integer.parseInt("/7".substring(1)),
      41,
      0,
      -1,
      -1
   };
   private static int[] cC = new int[0];
   static int J;
   private static int fC;
   static int K;
   private static boolean bw;
   static int L = -1;
   static d[] b;
   private static d[] c;
   private static e j;
   static e c;
   private static e k;
   private static e l;
   static e d;
   private static int fD;
   static int M;
   static String b;
   private static String v;
   private static short[] F;
   static int[] d;
   private static int[] cD;
   static boolean k;
   static int N;
   private static int fE;
   static int O;
   static short[] a;
   private static int[] cE;
   private static short[] G;
   private static int[] cF;
   static short[] b;
   private static int[] cG;
   private static short[] H;
   static short[] c;
   static short[] d;
   static short[] e;
   private static short[] I;
   private static short[] J;
   static short[] f;
   private static short[] K;
   private static int[] cH;
   private static short[] L;
   private static int[] cI;
   private static short[] M;
   static int P;
   static int Q;
   private static int fF;
   static boolean l = false;
   private static long u = 0L;
   private static long v = 0L;
   public static int R = -1;
   static boolean m = false;
   private static boolean bx = false;
   private static boolean by = false;
   private static String[] q = new String[]{"NokiaC5"};

   private static void a(int var0, boolean var1) {
      if (var1) {
         b[var0 >> 3] = (byte)(b[var0 >> 3] | 1 << (var0 & 7));
      } else {
         b[var0 >> 3] = (byte)(b[var0 >> 3] & ~(1 << (var0 & 7)));
      }
   }

   static void a(int var0) {
      int var1;
      if (a != null && a != -1 && ((var1 = a[a]) == 17 || var1 == 18) && var0 != 19 && var0 != 35 && var0 != 17 && var0 != 18 && var0 != 36) {
         R = true;
         boolean var2 = true;
         switch (var0) {
            case 7:
               p = br;
            default:
               var2 = false;
               break;
            case 8:
               p = bt;
               break;
            case 25:
               p = bx;
               break;
            case 27:
               p = bu;
               break;
            case 28:
               p = bs;
               break;
            case 29:
               p = bv;
               break;
            case 38:
               p = bw;
               break;
            case 39:
               p = by;
         }

         if (var2) {
            gJ();
            gI();
         }
      }

      if (a != null && a != -1 && ((var1 = a[a]) == 17 || var1 == 18) && var0 != 19 && var0 != 35 && var0 != 17 && var0 != 18 && var0 != 36 && var0 != 12) {
         P = true;
         a = true;
         i.e(0);
         i.e(1);
      }

      if (a < 15) {
         af = var0;
         ag = 0;
      }
   }

   private static void q(int var0) {
      af = var0;
      ag = 2;
   }

   private static void r(int var0) {
      int var1;
      if (a != null
         && a != -1
         && ((var1 = a[a]) == 17 || var1 == 18 || var1 == 26)
         && var0 != 19
         && var0 != 35
         && var0 != 17
         && var0 != 18
         && var0 != 36
         && var0 != 12) {
         P = true;
         a = true;
         i.e(0);
         i.e(1);
      }

      if (a < 15) {
         af = var0;
         ag = 3;
      }
   }

   private static void r() {
      ag = 1;
   }

   private static void s(int var0) {
      af = var0;
      ag = 4;
   }

   static int a() {
      return a > -1 ? a[a] : -1;
   }

   private static int o() {
      return a > 0 ? a[a - 1] : -1;
   }

   private static int p() {
      return a > -1 && a < 14 ? a[a + 1] : -1;
   }

   private static boolean d(int var0, int var1) {
      g.a = true;
      boolean var2 = false;
      if (var1 > -1) {
         try {
            switch (a[var1]) {
               case 1:
                  if ((var0 = var0) == 0) {
                     L = 0;
                     L = 16;
                     String var24;
                     if ((var24 = GloftGF2M.a.getAppProperty("IAP-EnableIAP")) != null && var24.equals("1") && f.h()) {
                        h = true;
                        f.d(f.a(L));
                     } else {
                        h = false;
                     }

                     s(true);
                     f.m();
                  }

                  if (var0 == 2) {
                     if ((var1 = f.h()) == 19 || var1 == 11) {
                        f.S = -1;
                     }

                     a(2);
                  }

                  var2 = false;
                  break;
               case 2:
                  if ((var0 = var0) == 0) {
                     String var22 = System.getProperty("microedition.platform");
                     int var31 = 0;

                     boolean var35;
                     while (true) {
                        if (var31 >= q.length) {
                           var35 = false;
                           break;
                        }

                        if (var22.indexOf(q[var31]) != -1) {
                           var35 = true;
                           break;
                        }

                        var31++;
                     }

                     av = !var35;

                     for (int var23 = 0; var23 < n.length; var23++) {
                        n[var23] = -1;
                        o[var23] = -1;
                     }

                     h = e;
                     t();
                  }

                  if (var0 == 2) {
                     if (ai > 5000) {
                        q(17);
                        if (av) {
                           aW(21);
                           av = false;
                        } else {
                           X = true;
                           W = true;
                           q(17);
                        }
                     } else {
                        w();
                     }
                  }

                  if (var0 == 3) {
                     a[19].a(f.a, 0, 0, 0, 0);
                  }

                  if (var0 == 5 && (f = f.c) != "") {
                     f.k();
                  }

                  var2 = false;
                  break;
               case 3:
                  if (var0 == 2) {
                     a(5);
                  }

                  var2 = false;
                  break;
               case 4:
                  if ((var0 = var0) == 0) {
                     b(0, true);
                     if (L != 7) {
                        a[0][2][5] = 49;
                     }

                     if (h == null) {
                        switch (aj) {
                           case 5:
                              h = e;
                              break;
                           case 17:
                              h = f;
                              break;
                           case 36:
                              if (s.equals("")) {
                                 h = f;
                              } else {
                                 h = g;
                              }
                        }

                        t();
                     } else if (f != null && f != "") {
                        f.c(f);
                        f = "";
                     }

                     bn = -1;
                     a(0, 5, true);
                  }

                  if (var0 == 1 && ax) {
                     aj = -1;
                     fE = 0;
                     ax = false;
                     q(17);
                  }

                  if (var0 == 5) {
                     h = null;
                     if (aj == 17 && aw) {
                        aw = false;
                        f.n(10);
                        f.n(1);
                        f.n(2);
                        f.n(3);
                        f.n(4);
                        f.n(5);
                        f.n(6);
                        f.n(7);
                     }

                     if (aj != -1) {
                        a(aj);
                     }

                     p = false;
                     aj = -1;
                  }

                  if (var0 == 2) {
                     String var19;
                     String var20 = (var19 = f.b(46)) == null ? "" : var19;
                     a[0][5] = var20;
                     w();
                     if (p && q) {
                        ag = 1;
                     }
                  }

                  if (var0 == 3) {
                     M(0);
                     if (al == 0) {
                        var1 = 170;
                     } else {
                        if (r && an > 0) {
                           int var30 = (ak + 2 < al ? ak + 2 : al) * 170 / al;
                           if ((var1 = 170 * (ak + 1) / al + 170 / al * am / an) > var30) {
                              var1 = var30;
                           }
                        } else {
                           var1 = 170 * (ak + 1) / al;
                        }

                        if (var1 > 170) {
                           var1 = 170;
                        }
                     }

                     f.a.setColor(26856);
                     short var34 = a[0][4][2];
                     short var11 = a[0][4][3];
                     short var32 = var34;
                     f.c(f.a, var32, var11, var1, 9);
                  }

                  var2 = false;
                  break;
               case 5:
               case 6:
               case 20:
               case 22:
               case 23:
               case 24:
               case 33:
               case 40:
               case 41:
               case 43:
               default:
                  new StringBuffer().append("State [").append(a[var1]).append("] is undefined. Message sent was: ").append(var0);
                  break;
               case 7:
                  var2 = r(var0);
                  break;
               case 8:
                  var2 = s(var0);
                  break;
               case 9:
                  var2 = w(var0);
                  break;
               case 10:
                  var2 = t(var0);
                  break;
               case 11:
                  var2 = u(var0);
                  break;
               case 12:
                  var2 = C(var0);
                  break;
               case 13:
                  var2 = F(var0);
                  break;
               case 14:
                  var2 = G(var0);
                  break;
               case 15:
                  var2 = E(var0);
                  break;
               case 16:
                  var2 = D(var0);
                  break;
               case 17:
                  var2 = K(var0);
                  break;
               case 18:
                  var2 = L(var0);
                  break;
               case 19:
                  var2 = M(var0);
                  break;
               case 21:
                  if ((var0 = var0) == 0) {
                     String var10000 = v;
                     String var27 = f.a.getAppProperty("GameVer");
                     v = f.a(var10000, new String[]{var27});
                     F = c[0].a(v, var1 = f.T - 20, false);
                     ak = f.U - 32;
                  }

                  if (var0 == 2) {
                     var1 = f.g();
                     byte var28 = 2;
                     if (var1 == 19) {
                        ag = 1;
                     } else if (var1 == 18 || var1 == 5 || var1 == 11) {
                        var28 = 4;
                     }

                     if (ak > 30) {
                        ak -= var28;
                     }
                  }

                  if (var0 == 3) {
                     f.a.setColor(0);
                     var1 = f.U;
                     var0 = f.T;
                     f.c(f.a, 0, 0, var0, var1);
                     c[0].d(1);
                     d var33 = c[0];
                     int var10004 = f.T >> 1;
                     int var4 = ak;
                     var0 = var10004;
                     short[] var18 = F;
                     String var29 = v;
                     var33.a(f.a, v, var18, var0, var4, 0, 999, 17, -1, false);
                     f.a(0, f.U >> 1, f.T, f.U >> 1, -16777216, 0, 16);
                  }

                  var2 = false;
                  break;
               case 25:
                  var2 = T(var0);
                  break;
               case 26:
                  var2 = V(var0);
                  break;
               case 27:
                  var2 = v(var0);
                  break;
               case 28:
                  var2 = x(var0);
                  break;
               case 29:
                  var2 = y(var0);
                  break;
               case 30:
                  var2 = A(var0);
                  break;
               case 31:
                  var2 = H(var0);
                  break;
               case 32:
                  var2 = I(var0);
                  break;
               case 34:
                  var2 = S(var0);
                  break;
               case 35:
                  if ((var0 = var0) == 0) {
                     if (bN == 15) {
                        T = false;
                     }

                     e.d(100);
                     f.c("/5");
                     c(0, 3);
                     f.k();
                     hu();
                     hv();
                     if (bN != 17) {
                        a(1, 74, true);
                        bk = false;
                     }

                     if (bN == 15) {
                        w &= -256;
                     }
                  }

                  if (var0 == 2) {
                     if (aN == 21) {
                        f(false);
                     }

                     if ((f.h() == 19 || bk) && bN != 17) {
                        X(56);
                        hy();
                     }

                     gW();
                     hw();
                  }

                  if (var0 == 3) {
                     gV();
                     p(false);
                     gX();
                  }

                  if (var0 == 5) {
                     if (bN == 19) {
                        e.n();
                        a(0, 1, 15, false);
                        a(0, 1, 15);
                     }

                     e = 0;
                     g = 0;

                     for (int var3 = 0; var3 < c.length; var3++) {
                        c[var3] = null;
                     }

                     c = null;

                     for (int var26 = 0; var26 < i.length; var26++) {
                        i[var26] = null;
                     }

                     i = null;
                     bN = 0;
                     bO = 0;
                     f = 0;
                     if (b[81] != null) {
                        b[81].a();
                        b[81] = null;
                     }

                     char var14 = '\uffff';
                     a(0, 101, var14, 1, 0);
                     c(0, 3);
                     a(1, 74, false);
                  }

                  var2 = false;
                  break;
               case 36:
                  var2 = N(var0);
                  break;
               case 37:
                  var2 = P(var0);
                  break;
               case 38:
                  var2 = O(var0);
                  break;
               case 39:
                  var2 = J(var0);
                  break;
               case 42:
                  var2 = Q(var0);
                  break;
               case 44:
                  var2 = R(var0);
            }
         } catch (Exception var5) {
         }
      }

      return var2;
   }

   private static void s() {
      int var0;
      for (var0 = a; var0 > 0; var0--) {
         int var1 = a[var0];
         if ((b[var1 >> 3] & 1 << (var1 & 7)) != 0) {
            break;
         }
      }

      while (var0 <= a) {
         d(3, var0);
         var0++;
      }

      if (d != null) {
         for (int var2 = 0; var2 < 250; var2++) {
            if ((d[var2] & 1) == 0) {
               a[var2] = null;
            } else {
               d[var2] = (byte)(d[var2] & -2);
            }
         }
      }
   }

   private static void t() {
      q = false;
      p = true;
      ak = 0;
      if (h != null) {
         al = h.length;
      } else {
         al = 0;
      }

      r = false;
      s = false;
   }

   private static void t(int var0) {
      switch (var0) {
         case 0:
            f.k();
            return;
         case 1:
            f.c("/2");
            ao = 2;
            return;
         case 2:
            f.c("/10");
            return;
         case 3:
         case 4:
         case 5:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 33:
         case 43:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 128:
         case 129:
         case 130:
         case 131:
         case 132:
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 138:
         case 139:
         default:
            break;
         case 6:
            f.c("/5");
            ao = 0;
            return;
         case 7:
            f.c("/7");
            ao = 1;
            return;
         case 8:
            return;
         case 9:
            iE();

            for (int var6 = 0; var6 < 6; var6++) {
               if (c[var6] != null) {
                  char var2 = '\uffff';
                  int var8 = var6;
                  a(2, var8, var2, 1, 0);
               }
            }

            c(2, 2);
            return;
         case 20:
            v(0);
            b(0);
            return;
         case 21:
            i.e(0);
            i.e(1);
            return;
         case 22:
            e.c();
            j = null;
            c = null;
            return;
         case 23:
            hg();
            return;
         case 30:
            if (L != 2 && L != 0 && L != 1 && L != 4 && L != 3 && L != 5 && L != 10 && L != 11 && L != 16 && L != 15) {
               L = 0;
            }

            String var5 = "/" + f.a(0);

            for (int var7 = 0; var7 < 12; var7++) {
               if (var7 != 10 && var7 != 1 && var7 != 2 && var7 != 3 && var7 != 4 && var7 != 5 && var7 != 6 && var7 != 7) {
                  f.a(var5, var7);
               }
            }

            return;
         case 31:
            u();
            return;
         case 32:
            v();
            return;
         case 34:
            k.a(GloftGF2M.a, f.a, f.T, f.U);
            return;
         case 35:
            return;
         case 36:
            V = true;
            return;
         case 37:
            f.b("/1");
            return;
         case 38:
            j();
            return;
         case 39:
            gK();
            return;
         case 40:
            p = bq;
            gI();
            b(27, true);
            return;
         case 41:
            a(1, 44, 3, 0, 24);
            return;
         case 42:
            iB();
            return;
         case 44:
            if (N == 0) {
               t = -1L;
               O = 0;
               h = 0;
            }

            b(false);
            return;
         case 45:
            a(0, 0, 1, 0, 24);
            a(0, 77, 1, 0, 24);
            a(0, 78, 1, 0, 24);
            a(0, 79, 1, 0, 24);
            a(0, 6, 1, 0, 136);
            a(0, 1, 1, 0, 136);
            a(0, 66, 1, 0, 136);
            a(0, 67, 1, 0, 136);
            a(0, 68, 1, 0, 136);
            a(0, 69, 1, 0, 136);
            a(0, 70, 1, 0, 136);
            a(0, 71, 1, 0, 136);
            a(0, 72, 1, 0, 136);
            a(0, 73, 1, 0, 136);
            a(0, 74, 1, 0, 136);
            a(0, 75, 1, 0, 136);
            a(0, 76, 1, 0, 136);
            a(0, 4, 1, 0, 24);
            a(0, 15, 1, 0, 24);
            a(0, 82, 1, 0, 24);
            a(0, 83, 1, 0, 24);
            a(0, 96, 1, 0, 24);
            a(0, 102, 1, 0, 24);
            a(0, 103, 1, 0, 24);
            a(0, 149, 1, 0, 24);
            a(0, 145, 1, 0, 24);
            y();
            a(0, 2, 1, 0, 24);
            a(0, 8, 1, 0, 136);
            a(0, 7, 1, 0, 136);
            a(0, 18, 1, 0, 136);
            a(0, 19, 1, 0, 136);
            a(0, 20, 1, 0, 136);
            a(0, 5, 1, 0, 136);
            a(0, 17, 1, 0, 136);
            a(0, 30, 1, 0, 24);
            a(0, 31, 1, 0, 24);
            a(0, 32, 1, 0, 24);
            a(0, 33, 1, 0, 24);
            a(0, 34, 1, 0, 24);
            a(0, 35, 1, 0, 24);
            a(0, 36, 1, 0, 24);
            a(0, 115, 1, 0, 24);
            a(0, 116, 1, 0, 24);
            a(0, 117, 1, 0, 24);
            a(0, 118, 1, 0, 24);
            a(0, 119, 1, 0, 24);
            a(0, 120, 1, 0, 24);
            a(0, 37, 1, 0, 24);
            a(0, 104, 1, 0, 24);
            a(0, 105, 1, 0, 24);
            a(0, 106, 1, 0, 24);
            a(0, 12, 1, 0, 24);
            a(0, 38, 1, 0, 24);
            a(0, 39, 1, 0, 24);
            a(0, 40, 1, 0, 24);
            a(0, 107, 1, 0, 24);
            a(0, 41, 1, 0, 24);
            a(0, 42, 1, 0, 24);
            a(0, 108, 1, 0, 24);
            a(0, 109, 1, 0, 24);
            a(0, 45, 1, 0, 24);
            a(0, 43, 1, 0, 24);
            a(0, 44, 1, 0, 24);
            a(0, 46, 1, 0, 24);
            a(0, 47, 1, 0, 24);
            a(0, 146, 1, 0, 24);
            a(0, 48, 1, 0, 24);
            a(0, 49, 1, 0, 24);
            a(0, 110, 1, 0, 24);
            a(0, 111, 1, 0, 24);
            a(0, 50, 1, 0, 24);
            a(0, 51, 1, 0, 24);
            a(0, 52, 1, 0, 24);
            a(0, 53, 1, 0, 24);
            a(0, 112, 1, 0, 24);
            a(0, 54, 1, 0, 24);
            a(0, 55, 1, 0, 24);
            a(0, 56, 1, 0, 24);
            a(0, 57, 1, 0, 24);
            a(0, 58, 1, 0, 24);
            a(0, 59, 1, 0, 24);
            a(0, 60, 1, 0, 24);
            a(0, 61, 1, 0, 24);
            a(0, 121, 1, 0, 24);
            a(0, 122, 1, 0, 24);
            a(0, 62, 1, 0, 24);
            a(0, 123, 1, 0, 24);
            a(0, 124, 1, 0, 24);
            a(0, 125, 1, 0, 24);
            a(0, 126, 1, 0, 24);
            a(0, 113, 1, 0, 24);
            a(0, 114, 1, 0, 24);
            a(0, 63, 1, 0, 24);
            a(0, 140, 1, 0, 24);
            a(0, 64, 1, 0, 24);
            a(0, 65, 1, 0, 24);
            a(0, 142, 1, 0, 24);
            a(0, 84, 1, 0, 136);
            a(0, 21, 1, 0, 136);
            a(0, 11, 1, 0, 136);
            a(0, 27, 1, 0, 136);
            a(0, 25, 1, 0, 136);
            a(0, 29, 1, 0, 136);
            a(0, 26, 1, 0, 136);
            a(0, 23, 1, 0, 136);
            a(0, 22, 1, 0, 136);
            a(0, 28, 1, 0, 136);
            a(0, 24, 1, 0, 136);
            a(0, 3, 1, 0, 24);
            a(0, 10, 1, 0, 24);
            a(0, 13, 1, 0, 24);
            a(0, 14, 1, 0, 24);
            a(0, 16, 3, 0, 24);
            a(0, 144, 1, 0, 24);
            a(0, 138, 1, 0, 24);
            a(0, 147, 1, 0, 24);
            a(0, 148, 1, 0, 24);
            a(0, 85, 15, 0, 24);
            a(0, 159, 1, 0, 24);
            a(0, 80, 1, 0, 24);
            a(0, 9, 1, 0, 136);
            a(0, 139, 1, 0, 136);
            a(0, 155, 1, 0, 24);
            a(0, 141, 1, 0, 24);
            a(0, 152, 1, 0, 24);
            a(0, 153, 63, 0, 24);
            a(0, 154, 63, 0, 24);
            return;
         case 46:
            N = fE;
            x();
            return;
         case 47:
            hn();
            u(3);
            if (N > 10) {
               if (!a(true)) {
                  aW(13);
               }
            } else if (N > 0 || s || !c(false)) {
               s = false;
               u(4 + N);
               e.b(0);
            }

            e.k();
            int[] var4 = new int[]{0, 0, 0};
            e.a(10, 0, var4);
            if (c != null && j != null) {
               c.r = j.r - (f.T >> 1);
               c.s = j.s - (f.U >> 1);
            }

            return;
         case 48:
            return;
         case 49:
            if (N > 0 && N <= 10) {
               var0 = g.a(8).a[N - 1][3];
               a(0, var0, 1, 0, 24);
               int var1;
               if ((var1 = g.a(18).a[e() - 1][1 + N - 1]) > d[N - 1][0]) {
                  d[N - 1][0] = var1;
               }

               return;
            }
            break;
         case 50:
            return;
         case 125:
            hm();
            break;
         case 126:
            ia();
            return;
         case 127:
            return;
         case 140:
            if (!r) {
               r = true;
               an = f(ao);
               new StringBuffer().append("[0/").append(an).append("] - EXECUTE SPRITE REQUESTS");
            }

            r = l(ao);
            return;
      }
   }

   private static void u() {
      a(2, 1, 1, 0, 136);
      a(2, 2, 1, 0, 136);
      a(2, 3, 1, 0, 136);
   }

   private static void v() {
      if (L == 15) {
         c[4] = c[2];
      }

      short[] var0 = (short[])f.a(5);
      c[4] = c[2];
      c[0] = c[2];
      c[0].a(var0);
      c[1].a(var0);
      c[2].a(var0);
      c[3].a(var0);
      c[4].a(var0);
   }

   private static void w() {
      try {
         if (ak >= 0 && h != null && h.length > 0) {
            t(h[ak]);
         }
      } catch (Exception var0) {
      }

      if (!q) {
         if (r) {
            if (h[ak] != 50 || !r.equals("")) {
               am++;
               return;
            }
         } else if (h[ak] != 50 || !r.equals("")) {
            ak++;
            am = 0;
            if (ak >= al) {
               q = true;
            }
         }
      }
   }

   private static d a(int var0, int var1, boolean var2, boolean var3, int var4, int var5) {
      d var6;
      (var6 = new d()).a(f.a(var0), 0);
      if (p(var0) != -1) {
         var6.b(p(var0));
         var2 = false;
      }

      int var7 = var0;
      d var16 = var6;
      d var9 = var16;
      int var13 = 0;
      boolean var14 = false;
      int var15 = var9.a;

      do {
         if ((var13 = a(cB, var7, var13)) >= 0) {
            int var8 = cB[var13];
            int var10 = cB[var13 + 2];
            int var11 = cB[var13 + 3];
            int var12 = cB[var13 + 4];
            var13 += 5;
            if (f.c.equals("/" + var8)) {
               if (var12 < 0) {
                  for (int var17 = 0; var17 < var15; var17++) {
                     var9.a(var17, var10, var11, -1);
                  }
               } else {
                  var9.a(var12, var10, var11, -1);
               }

               var14 = true;
            }
         }
      } while (var13 >= 0);

      boolean var18;
      if (var18 = false | var14 | a(var7, var16)) {
         var16.b();
      }

      if (var18) {
         return var6;
      }

      if (var2) {
         a(var6, var1, var4, var5);
         if (var3) {
            var6.b();
         }
      }

      return var6;
   }

   private static void a(d var0, int var1, int var2, int var3) {
      int var4 = var0.a;

      for (int var5 = 0; var5 < var4; var5++) {
         if ((var1 >> var5 & 1) != 0) {
            if (var2 == 0 && var3 == -1) {
               var0.a(var5, 0, -1, -1);
            } else {
               for (int var6 = var2; var6 <= var3; var6++) {
                  var0.a(var5, var6, -1);
               }
            }
         }
      }
   }

   private static void x() {
      a = false;
      f.c("/10");
      int var0 = 36 * J / 100;
      int var1 = 18 * J / 100;
      i.a(f.T, f.U, var0, var1);
      if (c == null) {
         c = f.a(0);
      }

      i.c();
      i.a(f.a(2), c, f.a(1), b[0]);
      f.k();
   }

   private static void y() {
      a(0, 127, 1, 0, 24);
      a(0, 128, 1, 0, 24);
      a(0, 129, 1, 0, 24);
      a(0, 130, 1, 0, 24);
      a(0, 131, 1, 0, 24);
      a(0, 132, 1, 0, 24);
      a(0, 133, 1, 0, 24);
      a(0, 134, 1, 0, 24);
      a(0, 135, 1, 0, 24);
      a(0, 137, 1, 0, 24);
      a(0, 136, 1, 0, 24);
   }

   private static void u(int var0) {
      f.c("/10");
      byte[] var10 = f.a(var0);
      f.k();
      int var18 = 0;
      boolean var6 = false;
      g.a = false;
      f.c("/9");

      while (var18 < var10.length && !var6) {
         short var2 = f.a(var10, var18);
         var18++;
         if (var2 != 50) {
            if (var2 == 54) {
               short var20 = f.a(var10, ++var18);
               var18 += 2;
               short var21 = f.a(var10, var18);
               var18++;
               if (!(var6 = var21 > d[N - 1][0])) {
                  for (int var22 = 0; var22 < 13; var22++) {
                     a[var22] = (var20 >> var22 & 1) != 0;
                  }
               }
            }
         } else {
            short var7 = f.a(var10, var18);
            var18 += 2;
            var2 = f.a(var10, var18);
            var18 += 2;
            short var3 = f.a(var10, var18);
            var18 += 2;
            byte var4 = f.a(var10, ++var18);
            byte var5 = f.a(var10, ++var18);
            var18 = ++var18 + 2;
            int[] var8 = new int[]{var2, var3, 11, 0};
            e var9 = null;
            if (var4 == 50 || var4 == 54 || var4 == 48) {
               var8[2] = 12;
            }

            switch (var4) {
               case 13:
                  var8[2] = 255;
                  c = var9 = e.a(var4, var8);
                  break;
               case 20:
                  (var9 = a(4, var5)).r = var2;
                  var9.s = var3;
                  break;
               case 32:
                  (var9 = a(15, var5)).r = var2;
                  var9.s = var3;
                  var9.A = var2;
                  var9.B = var3;
                  break;
               case 42:
                  if (var5 == -1) {
                     var8[2] = 12;
                     var8[3] = 2;
                     j = var9 = e.a(var4, var8);
                  } else {
                     var8[2] = 12;
                     var8[3] = 2;
                     (var9 = a(8, var5)).r = var2;
                     var9.s = var3;
                  }
                  break;
               case 48:
                  (var9 = a(11, var5)).r = var2;
                  var9.s = var3;
                  break;
               case 49:
                  var9 = e.a(var4, var8);
                  if (var5 != -1) {
                     Y(var5);
                     var9.e(var5);
                     var9.f(5);
                  } else {
                     var9.y = 65535;
                     var9.f(1);
                  }
                  break;
               case 50:
                  (var9 = a(3, var5)).r = var2;
                  var9.s = var3;
                  break;
               case 51:
                  (var9 = a(9, var5)).r = var2;
                  var9.s = var3;
                  break;
               case 52:
                  (var9 = a(2, var5)).g(3);
                  var9.r = var2;
                  var9.s = var3;
                  break;
               case 54:
                  (var9 = a(0, var5)).r = var2;
                  var9.s = var3;
                  var9.a.a(2);
                  var9.d = System.currentTimeMillis();
                  var9.b = Integer.MAX_VALUE;
            }

            if (var9 != null) {
               var9.z = var7;
               if (var9.a(2)) {
                  a(var9);
               }
            }
         }
      }

      f.k();
      g.a = true;
   }

   private static boolean l(int var0) {
      int var1;
      boolean var2 = (var1 = c(var0, 0, 3)) == -1;

      while (!var2) {
         var2 = var2 || !e(var0, var1);
         var1 = c(var0, var1 + 1, 3);
         var2 = var2 || var1 == -1;
      }

      return var1 >= 0;
   }

   static void b(int var0) {
      c(var0, 3);
   }

   private static void c(int var0, int var1) {
      for (int var2 = c(var0, 0, var1); var2 != -1; var2 = c(var0, var2, var1)) {
         e(var0, var2);
      }
   }

   private static boolean e(int var0, int var1) {
      boolean var2 = false;
      if ((a[var0][var1] & 1) != 0) {
         if (a[var0][var1] == null) {
            boolean var3 = (a[var0][var1] & 8) != 0;
            boolean var4 = (a[var0][var1] & 16) != 0;
            byte var5 = (byte)b[var0][var1];
            byte var6 = (byte)(b[var0][var1] >> 8);
            d[] var10000 = a[var0];
            short var10003 = a[var0][var1];
            byte var9 = var6;
            var6 = var5;
            boolean var11 = var4;
            var10000[var1] = a(var1, var10003, var3, var11, var6, var9);
            a[var0][var1] = (byte)(a[var0][var1] & -8);
         }
      } else if ((a[var0][var1] & 2) != 0) {
         if ((a[var0][var1] & '\uffff') == 65535) {
            a[var0][var1].a();
            a[var0][var1] = null;
            a[var0][var1] = 0;
         } else {
            int var14;
            if (a[var0][var1] == null) {
               var14 = 0;
            } else {
               int var7 = 0;

               for (int var12 = 0; var12 < 16; var12++) {
                  if (a[var0][var1].a(var12)) {
                     var7 |= 1 << var12;
                  }
               }

               var14 = var7;
            }

            int var8 = var14;

            for (int var10 = 0; var10 < 16; var10++) {
               if ((var8 & a[var0][var1] & 1 << var10) != 0) {
                  a[var0][var1].e(var10);
               }
            }

            a[var0][var1] = (byte)(a[var0][var1] & -3);
         }

         a[var0][var1] = 0;
         b[var0][var1] = -256;
         var2 = true;
      } else if ((a[var0][var1] & 4) != 0) {
         var2 = true;
      }

      return var2;
   }

   private static void v(int var0) {
      var0 = a[0].length;

      for (int var1 = 0; var1 < var0; var1++) {
         if ((a[0][var1] & 68) == 0) {
            char var3 = '\uffff';
            int var2 = var1;
            a(0, var2, var3, 1, 0);
         }
      }
   }

   static void a(int var0, int var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         if (a[var0][var1] != null) {
            return;
         }
      } else if (var3 == 1) {
         if ((a[var0][var1] & 1) != 0) {
            a[var0][var1] = 0;
         }

         if (a[var0][var1] == null) {
            return;
         }

         a[var0][var1].c();
      }

      if ((var4 & 8) != 0) {
         var4 ^= 8;
      }

      a[var0][var1] = (byte)(1 << var3 | var4);
      a[var0][var1] = (short)(a[var0][var1] | (short)var2);
      b[var0][var1] = -256;
   }

   private static int c(int var0, int var1, int var2) {
      while (var1 < i[var0]) {
         if ((a[var0][var1] & var2) != 0) {
            return var1;
         }

         var1++;
      }

      return -1;
   }

   private static int f(int var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < i[var0]; var2++) {
         if ((a[var0][var2] & 1) != 0) {
            var1++;
         }
      }

      return var1;
   }

   private static void w(int var0) {
      if (var0 >= 0 && var0 < 1000 && a[1][var0] == null) {
         a(1, var0, 1, 0, 56);
      }
   }

   private static void x(int var0) {
      for (int var3 = 0; var3 < i[1]; var3++) {
         if ((a[1][var3] & 32) != 0) {
            char var2 = '\uffff';
            int var1 = var3;
            a(1, var1, var2, 1, 0);
         }
      }

      c(1, 3);
   }

   private static void y(int var0) {
      int var1;
      if ((var1 = f(var0)) > 0) {
         if (var0 == 0) {
            if (f.c != "/5") {
               f.c("/5");
            }
         } else if (f.c != "/7") {
            f.c("/7");
         }

         if (ap <= 0) {
            System.gc();
            l(var0);
            ap = 100;
         } else {
            ap = ap - f.V;
         }

         if (var1 <= 1) {
            f.k();
         }
      }
   }

   private static String c(int var0) {
      int var2 = var0 / 86400;
      int var1;
      int var3 = (var1 = var0 % 86400) / 3600;
      int var6;
      int var4 = (var6 = var1 % 3600) / 60;
      var1 = var6 % 60;
      String var5 = "";
      if (var0 > 0) {
         if (var2 > 0) {
            var5 = var5 + var2 + ":";
         }

         if (var3 > 0) {
            var5 = var5 + var3 + ":";
         }

         if (var4 > 0) {
            if (var4 / 10 < 1) {
               var5 = var5 + "0";
            }

            var5 = var5 + var4 + ":";
         }

         if (var1 > 0) {
            if (var1 / 10 < 1) {
               var5 = var5 + "0";
            }

            var5 = var5 + var1;
         } else {
            var5 = var5 + "00";
         }
      } else {
         var5 = "-";
      }

      return var5;
   }

   private static String d(int var0) {
      int var2 = var0 / 86400;
      int var1;
      int var3 = (var1 = var0 % 86400) / 3600;
      int var10;
      int var4 = (var10 = var1 % 3600) / 60;
      var1 = var10 % 60;
      String var5 = "";
      if (var0 > 0) {
         if (var2 > 0) {
            String var6;
            var5 = var5 + var2 + ((var6 = f.b(193)) == null ? "" : var6) + " ";
         }

         if (var3 > 0) {
            String var7;
            var5 = var5 + var3 + ((var7 = f.b(194)) == null ? "" : var7) + " ";
         }

         if (var4 > 0) {
            if (var4 / 10 < 1) {
               var5 = var5 + "0";
            }

            String var8;
            var5 = var5 + var4 + ((var8 = f.b(195)) == null ? "" : var8) + " ";
         }

         if (var1 > 0) {
            if (var1 / 10 < 1) {
               var5 = var5 + "0";
            }

            String var9;
            var5 = var5 + var1 + ((var9 = f.b(196)) == null ? "" : var9);
         }
      } else {
         var5 = "-";
      }

      return var5;
   }

   static void a(int var0, int var1) {
      if (var1 != 0) {
         M = var0 * 100 / var1;
         b = d(var1 - var0);
      }
   }

   private static int g(int var0) {
      byte var1 = 0;
      if (var0 == 1) {
         var1 = 2;
      } else if (var0 == 2) {
         var1 = 0;
      } else if (var0 == 3) {
         var1 = 3;
      } else if (var0 == 4) {
         var1 = 1;
      } else if (var0 == 5) {
         var1 = 4;
      } else if (var0 == 6) {
         var1 = 5;
      } else if (var0 == 7) {
         var1 = 6;
      } else if (var0 == 8) {
         var1 = 7;
      } else if (var0 == 9) {
         var1 = 8;
      }

      return var1;
   }

   private static void a(boolean var0, int var1, int var2, int var3) {
      int[] var4 = new int[]{0, 0, 14};
      int var5 = 10;
      if (var1 < 100) {
         var5 = var1;
      } else if (var1 < 1000) {
         var5 = var1 / 2;
      } else if (var1 < 5000) {
         var5 = var1 / 3;
      } else if (var1 < 10000) {
         var5 = var1 / 4;
      } else if (var1 >= 10000) {
         var5 = var1 / 5;
      }

      while (var1 > 0) {
         int var6 = var1 < var5 ? var1 : var5;
         if ((var1 -= var6) > 0 && var1 < var5) {
            var6 += var1;
            var1 = 0;
         }

         int var7 = f.c(0, 50) - 25;
         int var8 = f.c(0, 50) - 25;
         e.a(47, 2, var4).a(var2 + var7, var3 + var8, var0 ? 10 : 9, 1000, var0, var6);
      }
   }

   static int a(int var0) {
      short var1 = 0;
      boolean var2 = false;

      for (int var3 = 0; var3 < 281; var3++) {
         if (var0 < cI[var3]) {
            var1 = M[var3];
            var2 = true;
            break;
         }
      }

      if (!var2) {
         var1 = M[280];
      }

      if (var1 < 1) {
         var1 = 1;
      }

      return var1;
   }

   private static int q() {
      String var0 = GloftGF2M.a.getAppProperty("MIDlet-Version");
      int[] var1 = new int[3];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4;
         if ((var4 = var0.charAt(var3)) >= '0' && var4 <= '9') {
            var1[var2] = var1[var2] * 10 + (var4 - '0');
         } else if (var4 == '.') {
            var2++;
         }
      }

      return 0 | var1[0] << 8 | var1[1] << 16 | var1[2] << 24;
   }

   private static void z() {
      byte[] var0 = new byte[11];
      int var1 = q();
      f.a(var0, 0, var1);
      var0[6] = (byte)(V ? 1 : 0);
      var0[7] = 0;
      var0[10] = (byte)(bh ? 1 : 0);

      try {
         f.a("RMSHeader", var0);
      } catch (Exception var2) {
         i(47, 48, 7);
      }
   }

   private static boolean j() {
      byte[] var0 = f.a("RMSHeader");
      int var1 = 0;
      if (var0 != null) {
         var1 = f.a(var0, 0);
      }

      if (var0 != null && var0.length >= 11 && var1 == q()) {
         V = var0[6] == 1;
         bh = var0[10] == 1;
         return true;
      } else {
         z();
         return false;
      }
   }

   static void a() {
      c(false);
   }

   private static void c(boolean var0) {
      if (N == 0 && d == -1) {
         if (var0 || e() >= 3 && K == -1) {
            z();
            if (d == -1) {
               byte[] var1;
               var0 = f.a(var1 = new byte[51200], 0, (byte)(!aW ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!X ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!W ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!aY ? 0 : 1));
               var0 = f.a(var1, var0, (byte)K);
               var0 = f.a(var1, var0, (byte)(!af ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!ag ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!d ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!ah ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!al ? 0 : 1));
               var0 = f.a(var1, var0, (byte)(!am ? 0 : 1));
               var0 = f.a(var1, var0, aN);

               for (int var2 = 0; var2 < h; var2++) {
                  var0 = f.a(var1, var0, ca[var2]);
                  var0 = f.a(var1, var0, cx[var2]);
                  var0 = f.a(var1, var0, ce[var2]);
                  var0 = f.a(var1, var0, (byte)(!k[var2] ? 0 : 1));
                  var0 = f.a(var1, var0, cj[var2]);
                  var0 = f.a(var1, var0, (byte)(!l[var2] ? 0 : 1));
                  var0 = f.a(var1, var0, co[var2]);
                  var0 = f.a(var1, var0, (byte)(!m[var2] ? 0 : 1));
               }

               for (int var74 = 0; var74 < fl; var74++) {
                  var0 = f.a(var1, var0, cy[var74]);
               }

               var0 = f.a(var1, var0, bs);
               var0 = f.a(var1, var0, bt);
               var0 = f.a(var1, var0, k);
               var0 = f.a(var1, var0, bv);
               var0 = f.a(var1, var0, (short)by);
               var0 = f.a(var1, var0, bB);
               var0 = f.a(var1, var0, (short)bG);
               var0 = f.a(var1, var0, bC);
               var0 = f.a(var1, var0, bE);
               var0 = f.a(var1, var0, bF);

               for (int var75 = 0; var75 < 6; var75++) {
                  var0 = f.a(var1, var0, Q[var75]);
               }

               for (int var76 = 0; var76 < 5; var76++) {
                  int var3 = h[var76].length;

                  for (int var4 = 0; var4 < var3; var4++) {
                     var0 = f.a(var1, var0, h[var76][var4]);
                  }
               }

               for (int var77 = 0; var77 < 10; var77++) {
                  for (int var81 = 0; var81 < 6; var81++) {
                     var0 = f.a(var1, var0, d[var77][var81]);
                  }
               }

               for (int var78 = 0; var78 < 10; var78++) {
                  for (int var82 = 0; var82 < 6; var82++) {
                     var0 = f.a(var1, var0, a[var78][var82]);
                  }
               }

               for (int var83 = 0; var83 < 10; var83++) {
                  for (int var121 = 0; var121 < 6; var121++) {
                     var0 = f.a(var1, var0, e[var83][var121]);
                  }
               }

               for (int var84 = 0; var84 < 20; var84++) {
                  var0 = f.a(var1, var0, g[var84][0]);
                  var0 = f.a(var1, var0, g[var84][1]);
                  var0 = f.a(var1, var0, g[var84][2]);

                  for (int var122 = 0; var122 < 3; var122++) {
                     var0 = f.a(var1, var0, f[var84][var122 << 1]);
                     var0 = f.a(var1, var0, f[var84][(var122 << 1) + 1]);
                  }
               }

               var0 = f.a(var1, var0, O);
               var0 = f.a(var1, var0, h);

               for (int var85 = 0; var85 < 6; var85++) {
                  var0 = f.a(var1, var0, c[var85]);
               }

               var0 = f.a(var1, var0, (byte)cF);

               for (int var86 = 0; var86 < cF; var86++) {
                  var0 = f.a(var1, var0, h[var86]);
                  var0 = f.a(var1, var0, b[var86]);
                  var0 = f.a(var1, var0, av[var86]);
                  var0 = f.a(var1, var0, at[var86]);
                  var0 = f.a(var1, var0, (byte)(!g[var86] ? 0 : 1));
               }

               var0 = f.a(var1, var0, (byte)A);

               for (int var87 = 0; var87 < A; var87++) {
                  var0 = f.a(var1, var0, i[var87]);
                  var0 = f.a(var1, var0, a[var87]);
                  var0 = f.a(var1, var0, c[var87]);
                  var0 = f.a(var1, var0, az[var87]);
               }

               for (int var88 = 0; var88 < bg; var88++) {
                  var0 = f.a(var1, var0, B[var88]);
                  var0 = f.a(var1, var0, e[var88]);
                  var0 = f.a(var1, var0, F[var88]);
                  var0 = f.a(var1, var0, (byte)(!d[var88] ? 0 : 1));
                  var0 = f.a(var1, var0, M[var88]);
               }

               for (int var89 = 0; var89 < 15; var89++) {
                  var0 = f.a(var1, var0, (byte)(!e[var89] ? 0 : 1));
               }

               for (int var90 = 0; var90 < 10; var90++) {
                  var0 = f.a(var1, var0, N[var90]);
               }

               for (int var91 = 0; var91 < 64; var91++) {
                  var0 = f.a(var1, var0, g[var91]);
               }

               for (int var92 = 0; var92 < 60; var92++) {
                  var0 = f.a(var1, var0, be[var92]);
               }

               for (int var93 = 0; var93 < 13; var93++) {
                  var0 = f.a(var1, var0, (byte)(!b[var93] ? 0 : 1));
               }

               for (int var94 = 0; var94 < 13; var94++) {
                  var0 = f.a(var1, var0, (byte)(!c[var94] ? 0 : 1));
               }

               var0 = f.a(var1, var0, t);
               var0 = f.a(var1, var0, v);
               u = System.currentTimeMillis() / 1000L;
               var0 = f.a(var1, var0, u);
               var0 = f.a(var1, var0, dr);

               for (int var95 = 0; var95 < 100; var95++) {
                  var0 = f.a(var1, var0, aQ[var95]);
               }

               var0 = f.a(var1, var0, aS);
               var0 = f.a(var1, var0, p);
               var0 = f.a(var1, var0, q);
               var0 = f.a(var1, var0, bK);
               var0 = f.a(var1, var0, bL);
               var0 = f.a(var1, var0, bM);
               var0 = f.a(var1, var0, eT);
               f.a(var1, var0, o);

               try {
                  f.a("save_gameplay", var1);
               } catch (Exception var6) {
                  i(47, 48, 7);
               }
            }

            if (d == -1 && N == 0) {
               byte[] var73;
               var0 = f.a(var73 = new byte[102400], 0, q());
               short var79 = 0;

               for (int var96 = 0; var96 < 13; var96++) {
                  if (a[var96]) {
                     var79 = (short)(var79 | 1 << var96);
                  }
               }

               var0 = f.a(var73, var0, var79);
               byte[] var123 = var73;
               e var5 = c;
               int var97 = var0;
               byte[] var68 = var73;
               var97 = f.a(var73, var97, (byte)var5.q);
               var97 = f.a(var68, var97, (short)var5.r);
               var97 = f.a(var68, var97, (short)var5.s);
               var0 = f.a(var68, var97, var5.t);

               for (e var80 = e.a[0]; var80 != null; var80 = var80.a) {
                  switch (var80.q) {
                     case 20:
                        var5 = var80;
                        var97 = var0;
                        byte[] var72 = var123;
                        var97 = f.a(var123, var97, (byte)var5.q);
                        var97 = f.a(var72, var97, (byte)var5.y);
                        var97 = f.a(var72, var97, (short)var5.r);
                        var97 = f.a(var72, var97, (short)var5.s);
                        var97 = f.a(var72, var97, (short)var5.t);
                        var97 = f.a(var72, var97, var5.C);
                        var0 = f.a(var72, var97, (byte)var5.D);
                        break;
                     case 22:
                        var0 = b(var123, var0, var80);
                        break;
                     case 42:
                        var5 = var80;
                        var97 = var0;
                        byte[] var71 = var123;
                        var97 = f.a(var123, var97, (byte)var5.q);
                        var97 = f.a(var71, var97, (byte)var5.y);
                        var97 = f.a(var71, var97, (short)var5.r);
                        var97 = f.a(var71, var97, (short)var5.s);
                        var97 = f.a(var71, var97, (short)var5.t);
                        var0 = f.a(var71, var97, var5.C);
                        break;
                     case 48:
                        var5 = var80;
                        var97 = var0;
                        byte[] var70 = var123;
                        var97 = f.a(var123, var97, (byte)var5.q);
                        var97 = f.a(var70, var97, (byte)var5.y);
                        var97 = f.a(var70, var97, (short)var5.r);
                        var97 = f.a(var70, var97, (short)var5.s);
                        var97 = f.a(var70, var97, (short)var5.t);
                        var97 = f.a(var70, var97, var5.C);
                        var0 = f.a(var70, var97, (byte)var5.D);
                        break;
                     case 49:
                        var0 = c(var123, var0, var80);
                        break;
                     case 50:
                        var0 = a(var123, var0, var80);
                        break;
                     case 52:
                        var0 = d(var123, var0, var80);
                        break;
                     case 54:
                        var0 = e(var123, var0, var80);
                  }
               }

               try {
                  f.a("save_farm" + N, var73, var0);
                  return;
               } catch (Exception var7) {
                  i(47, 48, 7);
               }
            }
         }
      }
   }

   private static boolean a(boolean var0) {
      var0 = false;
      if (j() && (var0 = c(true))) {
         for (int var1 = 0; var1 < h; var1++) {
            if (ca[var1] != -1) {
               e(ca[var1], var1, false);
            }
         }

         hh();
      }

      return var0;
   }

   private static boolean b(boolean var0) {
      byte[] var12;
      if ((var12 = f.a("save_gameplay")) == null) {
         return false;
      }

      int var1 = 0;
      aW = f.a(var12, 0) != 0;
      var1 = ++var1 + 2;
      aY = f.a(var12, 3) != 0;
      var1++;
      K = f.a(var12, 4);
      var1++;
      af = f.a(var12, 5) != 0;
      var1++;
      ag = f.a(var12, 6) != 0;
      var1++;
      d = f.a(var12, 7) != 0;
      var1++;
      ah = f.a(var12, 8) != 0;
      var1++;
      al = f.a(var12, 9) != 0;
      var1++;
      am = f.a(var12, 10) != 0;
      var1++;
      aN = f.a(var12, 11);
      var1 += 4;

      for (int var2 = 0; var2 < h; var2++) {
         ca[var2] = f.a(var12, var1);
         var1 += 4;
         if (ca[var2] == 255) {
            ca[var2] = -1;
         }

         cx[var2] = f.a(var12, var1);
         int var25 = var1 + 4;
         ce[var2] = f.a(var12, var25);
         int var26 = var25 + 4;
         k[var2] = f.a(var12, var26) != 0;
         cj[var2] = f.a(var12, ++var26);
         int var28 = var26 + 4;
         l[var2] = f.a(var12, var28) != 0;
         co[var2] = f.a(var12, ++var28);
         var1 = var28 + 4;
         m[var2] = f.a(var12, var1) != 0;
         var1++;
      }

      for (int var70 = 0; var70 < fl; var70++) {
         cy[var70] = f.a(var12, var1);
         var1 += 4;
      }

      bs = f.a(var12, var1);
      var1 += 4;
      bt = f.a(var12, var1);
      var1 += 4;
      k = f.a(var12, var1);
      var1 += 8;
      bv = f.a(var12, var1);
      var1 += 4;
      bP = bs;
      bQ = bt;
      l = k;
      bR = bv;
      by = f.a(var12, var1);
      var1 += 2;
      bB = f.a(var12, var1);
      var1 += 4;
      bG = f.a(var12, var1);
      var1 += 2;
      bC = f.a(var12, var1);
      var1 += 4;
      bE = f.a(var12, var1);
      var1 += 4;
      bF = f.a(var12, var1);
      var1 += 4;
      bS = bB;
      bT = bC;
      bU = bE;

      for (int var71 = 0; var71 < 6; var71++) {
         Q[var71] = f.a(var12, var1);
         var1 += 4;
         U[var71] = Q[var71];
      }

      for (int var72 = 0; var72 < 5; var72++) {
         int var3 = h[var72].length;

         for (int var4 = 0; var4 < var3; var4++) {
            h[var72][var4] = f.a(var12, var1);
            var1 += 4;
            j[var72][var4] = h[var72][var4];
         }
      }

      for (int var73 = 0; var73 < 10; var73++) {
         for (int var79 = 0; var79 < 6; var79++) {
            d[var73][var79] = f.a(var12, var1);
            var1 += 4;
         }
      }

      for (int var74 = 0; var74 < 10; var74++) {
         for (int var80 = 0; var80 < 6; var80++) {
            a[var74][var80] = f.a(var12, var1);
            var1 += 8;
         }
      }

      for (int var81 = 0; var81 < 10; var81++) {
         for (int var95 = 0; var95 < 6; var95++) {
            e[var81][var95] = f.a(var12, var1);
            var1 += 4;
         }
      }

      for (int var82 = 0; var82 < 20; var82++) {
         g[var82][0] = f.a(var12, var1);
         var1 += 4;
         g[var82][1] = f.a(var12, var1);
         var1 += 4;
         g[var82][2] = f.a(var12, var1);
         var1 += 4;

         for (int var96 = 0; var96 < 3; var96++) {
            f[var82][var96 << 1] = f.a(var12, var1);
            var1 += 4;
            f[var82][(var96 << 1) + 1] = f.a(var12, var1);
            var1 += 4;
         }
      }

      O = f.a(var12, var1);
      var1 += 4;
      h = f.a(var12, var1);
      var1 += 2;

      for (int var83 = 0; var83 < 6; var83++) {
         c[var83] = f.a(var12, var1);
         var1 += 8;
      }

      cF = f.a(var12, var1);
      var1++;

      for (int var84 = 0; var84 < cF; var84++) {
         int var97 = f.a(var12, var1);
         long var6 = f.a(var12, ++var1);
         int var48 = var1 + 8;
         int var75 = f.a(var12, var48);
         int var49 = var48 + 4;
         int var5 = f.a(var12, var49);
         var1 = var49 + 4;
         boolean var8 = f.a(var12, var1) != 0;
         var1++;
         byte var7 = (byte)var97;
         boolean var106 = var8;
         int var103 = var75;
         long var10 = var6;
         var97 = var5;
         var75 = var84;
         g var110 = g.a(7);
         int var9 = 0;

         while (var9 < var110.a && var97 != var110.a[var9][1]) {
            var9++;
         }

         if (var9 < var110.a) {
            at[var75] = var97;
            b[var75] = var10;
            au[var75] = var110.a[var9][2];
            av[var75] = var103;
            aw[var75] = var110.a[var9][15];
            g[var75] = var106;
            var97 = var110.a[var9][18];
            ax[var75] = d[var97];
            h[var75] = var7;
            cH = var75 + 1;
         }
      }

      A = f.a(var12, var1);
      var1++;

      for (int var85 = 0; var85 < A; var85++) {
         int var100 = f.a(var12, var1);
         long var107 = f.a(var12, ++var1);
         var1 += 8;
         int var77 = f.a(var12, var1);
         var1 += 4;
         int var104 = f.a(var12, var1);
         var1 += 4;
         byte var108 = (byte)var100;
         int var105 = var77;
         long var113 = var107;
         var100 = var104;
         var77 = var85;
         g var109 = g.a(22);
         g var111 = g.a(1);
         int var112 = 0;

         while (var112 < var109.a && var100 != var109.a[var112][1]) {
            var112++;
         }

         if (var112 < var109.a) {
            az[var77] = var100;
            a[var77] = var113;
            aA[var77] = var109.a[var112][2];
            c[var77] = var105;
            aB[var77] = var109.a[var112][12];
            var100 = var109.a[var112][15];
            aC[var77] = (short)var111.a[var100][3];
            aD[var77] = (short)var111.a[var100][4];
            i[var77] = var108;
            cK = var77 + 1;
         }
      }

      for (int var86 = 0; var86 < bg; var86++) {
         B[var86] = f.a(var12, var1);
         var1 += 4;
         e[var86] = f.a(var12, var1);
         F[var86] = f.a(var12, ++var1);
         var1 += 4;
         d[var86] = f.a(var12, var1) != 0;
         M[var86] = f.a(var12, ++var1);
         var1 += 4;
      }

      for (int var87 = 0; var87 < 15; var87++) {
         e[var87] = f.a(var12, var1) != 0;
         var1++;
      }

      for (int var88 = 0; var88 < 10; var88++) {
         N[var88] = f.a(var12, var1);
         var1 += 4;
      }

      for (int var89 = 0; var89 < 64; var89++) {
         g[var89] = f.a(var12, var1);
         var1 += 2;
      }

      for (int var90 = 0; var90 < 60; var90++) {
         be[var90] = f.a(var12, var1);
         var1 += 4;
      }

      if (b == null) {
         b = new boolean[13];
      }

      for (int var91 = 0; var91 < 13; var91++) {
         b[var91] = f.a(var12, var1) != 0;
         var1++;
      }

      if (c == null) {
         c = new boolean[13];
      }

      for (int var92 = 0; var92 < 13; var92++) {
         c[var92] = f.a(var12, var1) != 0;
         var1++;
      }

      t = f.a(var12, var1);
      var1 += 8;
      v = f.a(var12, var1);
      var1 += 8;
      u = f.a(var12, var1);
      var1 += 8;
      dr = f.a(var12, var1);
      var1 += 4;

      for (int var93 = 0; var93 < 100; var93++) {
         aQ[var93] = f.a(var12, var1);
         var1 += 4;
      }

      aS = f.a(var12, var1);
      var1 += 4;
      p = f.a(var12, var1);
      var1 += 8;
      q = f.a(var12, var1);
      var1 += 8;
      bK = f.a(var12, var1);
      var1 += 4;
      bL = f.a(var12, var1);
      var1 += 4;
      bM = f.a(var12, var1);
      var1 += 4;
      eT = f.a(var12, var1);
      var1 += 4;
      o = f.a(var12, var1);

      for (int var94 = 0; var94 < h; var94++) {
         if (ca[var94] != -1) {
            e(ca[var94], var94, false);
         }
      }

      hh();
      return true;
   }

   private static boolean c(boolean var0) {
      byte[] var4;
      if ((var4 = f.a("save_farm" + N)) == null) {
         return false;
      }

      int var1 = var4.length;
      short var2 = f.a(var4, 4);

      for (int var3 = 0; var3 < 13; var3++) {
         a[var3] = (var2 >> var3 & 1) != 0;
      }

      b(var4, 6, var1);
      return true;
   }

   private static int b(byte[] var0, int var1, int var2) {
      while (var1 < var2) {
         int var3 = f.a(var0, var1);
         var1++;
         switch (var3) {
            case 13:
               var3 = var1;
               byte[] var15 = var0;
               int[] var90 = new int[]{0, 0, 255};
               (c = e.a(13, var90)).r = f.a(var15, var3);
               var3 += 2;
               c.s = f.a(var15, var3);
               var3 += 2;
               c.t = f.a(var15, var3);
               var3 += 4;
               var1 = var3;
               break;
            case 20:
               var3 = var1;
               byte[] var14 = var0;
               byte var89 = f.a(var0, var3);
               e var97;
               (var97 = a(4, var89)).r = f.a(var14, ++var3);
               var3 += 2;
               var97.s = f.a(var14, var3);
               var3 += 2;
               var97.t = f.a(var14, var3);
               var3 += 2;
               var97.C = f.a(var14, var3);
               var3 += 4;
               var97.D = f.a(var14, var3);
               var3++;
               if (var97.a(2)) {
                  a(var97);
               }

               var1 = var3;
               break;
            case 22:
               var3 = var1;
               byte[] var13 = var0;
               byte var88 = f.a(var0, var3);
               e var96;
               (var96 = a(11, var88)).p = f.a(var13, ++var3);
               var3 += 2;
               var96.r = f.a(var13, var3);
               var3 += 2;
               var96.s = f.a(var13, var3);
               var3 += 2;
               var96.t = f.a(var13, var3);
               var3 += 2;
               var96.C = f.a(var13, var3);
               var3 += 4;
               var96.D = f.a(var13, var3);
               var3++;
               if (var96.a(2)) {
                  a(var96);
               }

               var1 = var3;
               break;
            case 42:
               var3 = var1;
               byte[] var12 = var0;
               byte var87 = f.a(var0, var3);
               var3++;
               e var95;
               if (var87 == -1) {
                  int[] var99 = new int[]{0, 0, 12, 2};
                  j = var95 = e.a(42, var99);
               } else {
                  var95 = a(8, var87);
               }

               var95.r = f.a(var12, var3);
               var3 += 2;
               var95.s = f.a(var12, var3);
               var3 += 2;
               var95.t = f.a(var12, var3);
               var3 += 2;
               var95.C = f.a(var12, var3);
               var3 += 4;
               var1 = var3;
               break;
            case 48:
               var3 = var1;
               byte[] var11 = var0;
               byte var86 = f.a(var0, var3);
               e var94;
               (var94 = a(11, var86)).r = f.a(var11, ++var3);
               var3 += 2;
               var94.s = f.a(var11, var3);
               var3 += 2;
               var94.t = f.a(var11, var3);
               var3 += 2;
               var94.C = f.a(var11, var3);
               var3 += 4;
               var94.D = f.a(var11, var3);
               var3++;
               if (var94.a(2)) {
                  a(var94);
               }

               var1 = var3;
               break;
            case 49:
               var3 = var1;
               byte[] var10 = var0;
               byte var85 = f.a(var0, var3);
               var3++;
               e var93;
               (var93 = a(49, 0, false)).y = var85;
               var93.r = f.a(var10, var3);
               var3 += 2;
               var93.s = f.a(var10, var3);
               var3 += 2;
               var93.t = f.a(var10, var3);
               var3 += 2;
               var93.C = f.a(var10, var3);
               var3 += 4;
               byte var98 = f.a(var10, var3);
               var3++;
               var93.f(var98);
               if (var85 > 0) {
                  Y(var85);
                  var93.e(var85);
               } else {
                  var93.J = a[0];
               }

               var93.b = f.a(var10, var3);
               var3 += 8;
               if (var93.a(2)) {
                  a(var93);
               }

               var1 = var3;
               break;
            case 50:
               var3 = var1;
               byte[] var9 = var0;
               byte var84 = f.a(var0, var3);
               e var92;
               (var92 = a(3, var84)).r = f.a(var9, ++var3);
               var3 += 2;
               var92.s = f.a(var9, var3);
               var3 += 2;
               var92.t = f.a(var9, var3);
               var3 += 2;
               var92.C = f.a(var9, var3);
               var3 += 4;
               var92.D = f.a(var9, var3);
               var3++;
               if (var84 == 12 || var84 == 11) {
                  var92.a = f.a(var9, var3);
                  var3 += 8;
               }

               if (var92.a(2)) {
                  a(var92);
               }

               var1 = var3;
               break;
            case 52:
               var3 = var1;
               byte[] var8 = var0;
               byte var83 = f.a(var0, var3);
               var3++;
               e var91;
               (var91 = a(2, var83)).y = var83;
               var91.r = f.a(var8, var3);
               var3 += 2;
               var91.s = f.a(var8, var3);
               var3 += 2;
               var91.t = f.a(var8, var3);
               var3 += 2;
               var91.C = f.a(var8, var3);
               var3 += 4;
               byte var6 = f.a(var8, var3);
               var3++;
               var91.g(var6);
               var91.c = f.a(var8, var3);
               var3 += 8;
               if (var91.a(2)) {
                  a(var91);
               }

               var1 = var3;
               break;
            case 54:
               var3 = var1;
               byte[] var7 = var0;
               byte var4 = f.a(var0, var3);
               var3++;
               e var5;
               (var5 = a(0, var4)).y = var4;
               var5.r = f.a(var7, var3);
               var3 += 2;
               var5.s = f.a(var7, var3);
               var3 += 2;
               var5.t = f.a(var7, var3);
               var3 += 2;
               var5.C = f.a(var7, var3);
               var3 += 4;
               var5.D = f.a(var7, var3);
               var3++;
               var5.h(var5.D);
               var5.q();
               var5.c = f.a(var7, var3);
               var3 += 4;
               var5.g = f.a(var7, var3);
               var5.d = f.a(var7, ++var3);
               var5.d = f.a(var7, ++var3);
               var3 += 8;
               var5.e = f.a(var7, var3);
               var3 += 8;
               var1 = var3;
         }
      }

      return var1;
   }

   private static int a(byte[] var0, int var1, e var2) {
      var1 = f.a(var0, var1, (byte)var2.q);
      var1 = f.a(var0, var1, (byte)var2.y);
      var1 = f.a(var0, var1, (short)var2.r);
      var1 = f.a(var0, var1, (short)var2.s);
      var1 = f.a(var0, var1, (short)var2.t);
      var1 = f.a(var0, var1, var2.C);
      var1 = f.a(var0, var1, (byte)var2.D);
      if (var2.y == 12 || var2.y == 11) {
         var1 = f.a(var0, var1, var2.a);
      }

      return var1;
   }

   private static int b(byte[] var0, int var1, e var2) {
      var1 = f.a(var0, var1, (byte)var2.q);
      var1 = f.a(var0, var1, (byte)var2.y);
      var1 = f.a(var0, var1, (short)var2.p);
      var1 = f.a(var0, var1, (short)var2.r);
      var1 = f.a(var0, var1, (short)var2.s);
      var1 = f.a(var0, var1, (short)var2.t);
      var1 = f.a(var0, var1, var2.C);
      return f.a(var0, var1, (byte)var2.D);
   }

   private static int c(byte[] var0, int var1, e var2) {
      var1 = f.a(var0, var1, (byte)var2.q);
      var1 = f.a(var0, var1, (byte)var2.y);
      var1 = f.a(var0, var1, (short)var2.r);
      var1 = f.a(var0, var1, (short)var2.s);
      var1 = f.a(var0, var1, (short)var2.t);
      var1 = f.a(var0, var1, var2.C);
      var1 = f.a(var0, var1, (byte)var2.D);
      return f.a(var0, var1, var2.b);
   }

   private static int d(byte[] var0, int var1, e var2) {
      var1 = f.a(var0, var1, (byte)var2.q);
      var1 = f.a(var0, var1, (byte)var2.y);
      var1 = f.a(var0, var1, (short)var2.r);
      var1 = f.a(var0, var1, (short)var2.s);
      var1 = f.a(var0, var1, (short)var2.t);
      var1 = f.a(var0, var1, var2.C);
      var1 = f.a(var0, var1, (byte)var2.D);
      return f.a(var0, var1, var2.c);
   }

   private static int e(byte[] var0, int var1, e var2) {
      var1 = f.a(var0, var1, (byte)var2.q);
      var1 = f.a(var0, var1, (byte)var2.y);
      var1 = f.a(var0, var1, (short)var2.r);
      var1 = f.a(var0, var1, (short)var2.s);
      var1 = f.a(var0, var1, (short)var2.t);
      var1 = f.a(var0, var1, var2.C);
      var1 = f.a(var0, var1, (byte)var2.D);
      var1 = f.a(var0, var1, var2.c);
      var1 = f.a(var0, var1, (byte)var2.g);
      var1 = f.a(var0, var1, (byte)var2.d);
      var1 = f.a(var0, var1, var2.d);
      return f.a(var0, var1, var2.e);
   }

   private static void A() {
      if (K != 13) {
         if (K == 10) {
            f = true;
         }

         if (K != 11 || !f(1, 42)) {
            if (!f(1, 42)) {
               X(58);
            } else {
               X(56);
            }

            e(-1);
            ah();
            d(!f(1, 42));
            a(false, fk, '\u0000');
            bu = a[1][42][10] != 1;
         }
      }
   }

   private static void B() {
      fk = 0;
      ix();
      if (cx[fk] == 1) {
         ep = 26;
      } else {
         X(59);
         a(26);
      }

      d(false);
   }

   private static void C() {
      fk = 1;
      ix();
      if (cx[fk] == 1) {
         ep = 26;
      } else {
         X(59);
         a(26);
      }

      d(false);
   }

   private static void D() {
      fk = 2;
      ix();
      if (cx[fk] == 1) {
         ep = 26;
      } else {
         X(59);
         a(26);
      }

      d(false);
   }

   private static void E() {
      fk = 3;
      ix();
      if (cx[fk] == 1) {
         ep = 26;
      } else {
         X(59);
         a(26);
      }

      d(false);
   }

   private static void F() {
      p = br;
      gJ();
      gI();
      X(59);
      c(2, 0, true);
      if (K == 40) {
         f = true;
      } else {
         if (K == -1 && aN == 13) {
            f = true;
         }
      }
   }

   private static void G() {
      if (b()) {
         gN();
      }

      if (e.b(2) == 0) {
         X(60);
         q(17);
         fE = 0;
         if (aN == 169) {
            f = true;
            return;
         }
      } else {
         X(55);
      }
   }

   private static void H() {
      a(false, null);
      a(14);
   }

   private static void I() {
      if (p != 1 && p != 2) {
         a(38);
         X(60);
         f(false);
      } else {
         X(55);
      }
   }

   private static void J() {
      X(59);
      if (e() >= 3) {
         X(59);
         i = false;
         a(34);
      } else {
         X(55);
      }
   }

   private static void K() {
      if (h) {
         if (e() >= 3) {
            X(59);
            i = true;
            a(34);
         } else {
            X(55);
         }
      }
   }

   private static void L() {
      if (!a(a)) {
         if (d == 0) {
            gS();
            o(false);
            g(false);
            f(true);
            d = -1;
         } else if (d == 1 && a != null) {
            switch (a.q) {
               case 20:
                  if ((bI <= 0 || !c(bI)) && (bJ <= 0 || !d(bJ))) {
                     j(false);
                     D = -1;
                     if (bI > 0) {
                        String var5;
                        var5 = (var5 = f.b(379)) == null ? "" : var5;
                        String var10 = f.a(bI - c(), L, " ");
                        a = f.a(var5, "%d", var10);
                        D = 18;
                        i = false;
                        m = true;
                     } else if (bJ > 0) {
                        String var7;
                        var7 = (var7 = f.b(381)) == null ? "" : var7;
                        String var11 = f.a(bJ - d(), L, " ");
                        a = f.a(var7, "%d", var11);
                        D = 19;
                        i = true;
                        m = true;
                     }

                     if (D != -1) {
                        a(34);
                     }
                  } else {
                     gS();
                  }
                  break;
               case 49:
                  if (a.y != 0 || (bI <= 0 || !c(bI)) && (bJ <= 0 || !d(bJ))) {
                     if ((j <= 0 || !c(j)) && (k <= 0 || !d(k))) {
                        j(false);
                        D = -1;
                        if (bI > 0) {
                           String var0;
                           var0 = (var0 = f.b(379)) == null ? "" : var0;
                           String var1 = f.a(bI - c(), L, " ");
                           a = f.a(var0, "%d", var1);
                           D = 18;
                           i = false;
                           m = true;
                        } else if (bJ > 0) {
                           String var3;
                           var3 = (var3 = f.b(381)) == null ? "" : var3;
                           String var9 = f.a(bJ - d(), L, " ");
                           a = f.a(var3, "%d", var9);
                           D = 19;
                           i = true;
                           m = true;
                        }

                        if (D != -1) {
                           a(34);
                        }
                     } else {
                        a.f(8);
                        a(5, a);
                        gS();
                     }
                  } else {
                     a.f(8);
                     a(5, a);
                     gS();
                  }
               case 50:
            }
         } else if (d == 4 && a != null) {
            if (K == 52) {
               f = true;
            }

            gS();
            j(false);
         } else {
            gS();
            o(false);
            g(false);
         }

         ag();
      }
   }

   private static void M() {
      X(56);
      ah();
   }

   private static void N() {
      if (d != null) {
         int var0 = 0;
         switch (d.q) {
            case 49:
            case 50:
            case 52:
            case 54:
               var0 = d.K;
            case 51:
            case 53:
            default:
               if (!e(var0)) {
                  X(55);
                  if (var0 > 0) {
                     String var1;
                     var1 = (var1 = f.b(381)) == null ? "" : var1;
                     String var2 = f.a(var0 - d(), L, " ");
                     a = f.a(var1, "%d", var2);
                     D = 19;
                     i = true;
                     m = true;
                     a(34);
                  }
               } else {
                  X(48);
                  d.E();
                  if (K == 18) {
                     b();
                  }
               }
         }
      }

      a(false, null);
   }

   private static void O() {
      boolean var10000;
      if (by >= bz) {
         by = 0;
         a[1][33][7] = -1;
         i(1, 33);
         var10000 = true;
      } else {
         var10000 = false;
      }

      if (var10000) {
         ao(19);
      }
   }

   private static void P() {
      d = 3;
      b(false, e);
      a(e, true);
      e = null;
   }

   private static void Q() {
      d = 3;
      b(false, e);
      a(e, true);
      e = null;
      int var0 = e.a(0, 49);
      if (a.y == 0 && var0 <= d[22]) {
         i(485, 486, 7);
      } else {
         String var3;
         String var10000 = (var3 = f.b(441)) == null ? "" : var3;
         String var4;
         String var10001 = (var4 = f.b(442)) == null ? "" : var4;
         e var2 = a;
         String var1 = var10001;
         String var5 = var10000;
         eq = 2;
         h = var2;
         a(4, 5, true);
         a(4, 6, true);
         a(4, 7, true);
         h(7, 0, 11);
         o = var5;
         p = var1;
         q = f.a(h.a(), L, " ");
         a(4, 14, true);
         a(4, 16, true);
         a(4, 17, true);
         var0 = j(a[4][9][7]);
         c[var0].a(var1, a[4][9][5], false);
         b(4, 5, 185, 160);
         a[4][9][3] = (short)(a[4][5][3] + 20);
         a[4][12][3] = (short)(a[4][5][3] + 160 - 4);
         if (a[4][11][5] > -1 && a[a[4][11][5]] == null) {
            short var7 = a[4][11][5];
            a(1, var7, 1, 0, 24);
            f.c("/7");
            c(1, 3);
            f.k();
         }

         a[4][11][3] = (short)(a[4][5][3] + 160 - 44);
         a(19);
         if (a != null && a.q == 54) {
            a.u();
         }
      }

      ah();
   }

   private static void R() {
      d = 3;
      b(false, e);
      a(e, true);
      e = null;
      if (b(5) + e.a(2) >= b()) {
         ah();
         b(471, 477);
      } else {
         X(49);
         if (a != null && a.q == 54) {
            a.u();
         }

         int var0 = a.J;
         c(a);
         if (var0 < G[0] || var0 > G[63] || var0 % 2 == 1) {
            a(true);
            m(var0);
         }

         j(false);
      }
   }

   private static void S() {
      X(56);
      j(false);
   }

   private static void T() {
      X(56);
      j(false);
   }

   private static void U() {
      if (a[1][76][5] == 20) {
         X(55);
      } else {
         X(60);
      }

      if (aJ == 0) {
         if (K == 45) {
            f = 1;
         } else {
            f = (aH + aI) % aI;
         }

         Y(y[f]);
      } else {
         e = y[0];
      }
   }

   private static void V() {
      if (a[1][77][5] == 20) {
         X(55);
      } else {
         X(60);
      }

      if (aJ == 0) {
         if (K == 45) {
            f = 1;
         } else {
            f = (aH + 1 + aI) % aI;
         }

         Y(y[f]);
      } else {
         e = y[1];
      }

      if (fB == 20 && fA == 123) {
         t = false;
         u = false;
         bu = true;
         e(-1);
      }
   }

   private static void W() {
      if (a[1][78][5] == 20) {
         X(55);
      } else {
         X(60);
      }

      if (aJ == 0) {
         if (K == 45) {
            f = 1;
         } else {
            f = (aH + 2 + aI) % aI;
         }

         Y(y[f]);
      } else {
         e = y[2];
      }
   }

   private static void X() {
      if (a[1][79][5] == 20) {
         X(55);
      } else {
         X(60);
      }

      if (aJ == 0) {
         if (K == 45) {
            f = 1;
         } else {
            f = (aH + 3 + aI) % aI;
         }

         Y(y[f]);
      } else {
         e = y[3];
      }
   }

   private static void Y() {
      if (a[1][80][5] == 20) {
         X(55);
      } else {
         X(60);
      }

      if (aJ == 0) {
         if (K == 45) {
            f = 1;
         } else {
            f = (aH + 4 + aI) % aI;
         }

         Y(y[f]);
      } else {
         e = y[4];
      }
   }

   private static void Z() {
      if (a[1][81][5] == 20) {
         X(55);
      } else {
         X(60);
      }

      if (aJ == 0) {
         if (K == 45) {
            f = 1;
         } else {
            f = (aH + 5 + aI) % aI;
         }

         Y(y[f]);
      } else {
         e = y[5];
      }
   }

   private static void aa() {
      X(60);
      if (a == 1) {
         ix();
         ep = 26;
      } else {
         a(26);
      }

      a(false, fk, '\u0000');
   }

   private static void ab() {
      if (O > 1) {
         X(56);
         a(false, -1);
         a(31);
      } else {
         X(55);
      }
   }

   private static void ac() {
      X(56);
      if (f(f[5])) {
         id();
         a(32);
      }
   }

   private static void ad() {
      X(56);
   }

   private static void ae() {
      X(60);
   }

   private static void d(boolean var0) {
      if (f(1, 42) != var0) {
         int var1;
         bp = var1 = E();
         if (var1 <= 0) {
            P(1);
         } else {
            for (int var2 = 42; var2 <= 62; var2++) {
               L(1);
            }

            b[1][42][6] = (short)(var1 + 2 - 1);
            a[1][42][6] = (short)(var1 + 2 - 1);
            int var6;
            if ((var6 = 264 - (var1 - 1) * 36 - 18) < 147) {
               var6 = 147;
            }

            b[1][42][3] = (short)var6;
            b[1][51][3] = (short)(var6 + -22);
            a(1, 42, var0);
            a(1, 51, var0);
            b(1, 42, var0);
            b(1, 43, var0);
            b(1, 44, var0);
            b(1, 45, var0);
            b(1, 46, var0);
            a[1][47][18] = 0;
            a[1][48][18] = 0;
            a[1][49][18] = 0;
            a[1][50][18] = 0;
            var6 += 21;
            if (var0) {
               for (int var5 = 0; var5 < var1; var5++) {
                  int var3 = var5;
                  int var4 = -1;
                  if (bZ[var3] != -1) {
                     var4 = cd[var3] - 1;
                  }

                  var3 = var4;
                  if (var4 != -1) {
                     a[1][var5 + 43][6] = (short)var3;
                     a(1, var5 + 43, true);
                     b[1][var5 + 47][3] = (short)var6;
                     b[1][var5 + 43][3] = (short)var6;
                  }

                  if (cx[var5] == 1) {
                     aK |= 1 << var5;
                     a[1][var5 + 55][3] = (short)(var6 + -10);
                  } else {
                     a(1, var5 + 55, false);
                  }

                  var6 += 33;
               }

               P(1);
            } else {
               a(1, 43, false);
               a(1, 44, false);
               a(1, 45, false);
               a(1, 46, false);
               a(1, 55, false);
               a(1, 56, false);
               a(1, 57, false);
               a(1, 58, false);
               a[1][47][10] = 0;
               a[1][48][10] = 0;
               a[1][49][10] = 0;
               a[1][50][10] = 0;
               ae = false;
               aK = 0;
               P(1);
            }
         }
      }
   }

   private static void e(boolean var0) {
      if (!var0) {
         a(1, 63, var0);
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 < h; var2++) {
            if (W(var2) && cx[var2] == 1) {
               var1++;
            }
         }

         if (var1 == 0) {
            a(1, 63, false);
         } else {
            if (f(1, 52)) {
               a(1, 63, var0);
            }

            a[1][63][6] = (short)(var1 - 1);
         }
      }
   }

   private static void f(boolean var0) {
      a(1, 52, !t && !u && e == null && a == null ? var0 : false);
      a(1, 67, var0);
      if (E() > 0) {
         b(1, 52, !t && !u && e == null && a == null ? var0 : false);
      }

      b(1, 67, var0);
      if (g(2) || f(f[2])) {
         a(1, 68, var0);
         b(1, 68, var0);
      }

      e(var0);
      if (!var0) {
         d(false);
      } else {
         P(1);
      }
   }

   private static void g(boolean var0) {
      if (K == -1 && aN == 160) {
         a(1, 73, var0);
      }
   }

   private static void h(boolean var0) {
      int var1 = var0 ? 1 : 0;
      if (K != -1) {
         a(1, 72, var0);
         a[1][72][18] = (short)var1;
      }

      if (K != 42 && K != 52 && aN != 14) {
         a[1][73][10] = (short)var1;
         a[1][73][18] = (short)var1;
      }
   }

   static void a(boolean var0, int var1, int var2) {
      if (var0) {
         t = var0;
         bu = false;
      }

      if (K == -1 && !u) {
         if (N != 0) {
            i(!var0);
         } else {
            f(!var0);
         }
      }

      int var3 = var0 ? 1 : 0;
      int var4 = !var0 && !u ? 0 : 1;
      if (K == 7) {
         a[1][73][10] = 0;
         a[1][73][18] = 0;
      } else {
         a[1][73][10] = (short)var4;
         a[1][73][18] = (short)var4;
      }

      for (int var8 = 75; var8 <= 83; var8++) {
         a(1, var8, var0);
         a[1][var8][18] = (short)var3;
      }

      if (var0) {
         aJ = var1;
         g var5 = null;
         byte var6 = 0;
         var3 = 0;
         switch (aJ) {
            case 0:
               var6 = 12;
               var5 = g.a(2);
               var3 = 1;
               aI = 11;
               break;
            case 1:
               var6 = 8;
               var5 = g.a(21);
               aI = 0;
         }

         aH = var2 - 1;
         v = new int[var6];
         w = new int[var6];
         x = new int[var6];
         y = new int[var6];
         var4 = 0;

         while (var3 < var6) {
            switch (aJ) {
               case 0:
                  var4 = var5.a[var3][5] - 1;
                  if (var5.a[var3][8] <= e()) {
                     v[var4] = var5.a[var3][3];
                     w[var4] = var5.a[var3][4] - 12;
                  } else {
                     v[var4] = 20;
                     w[var4] = 123;
                  }

                  x[var4] = var5.a[var3][6];
                  y[var4] = var3;
                  break;
               case 1:
                  if (var5.a[var3][3] > -1) {
                     v[var4] = var5.a[var3][3];
                     w[var4] = var5.a[var3][4];
                     x[var4] = 0;
                     y[var4] = var3;
                     var4++;
                     aI++;
                  } else {
                     v[var4] = -1;
                     w[var4] = -1;
                  }
            }

            var3++;
         }

         f = var2;
         if (aJ == 0) {
            Y(y[f]);
         }

         af();
         P(1);
      } else {
         O(1);
         v = null;
         w = null;
         x = null;
         y = null;
      }
   }

   private static void af() {
      int var0 = 76;
      int var1 = 0;
      int var2 = aI;
      if (aI > 3) {
         var1 = aH;
         var2 = aH + 3;
      }

      while (var1 < var2) {
         a(1, var0, true);
         if (var1 < 0) {
            if (aI + var1 >= 0 && a[1][var0] != null && v != null && w != null) {
               a[1][var0][5] = (short)v[aI + var1];
               a[1][var0][6] = (short)w[aI + var1];
            }
         } else if (var1 >= aI) {
            if (var1 - aI >= 0) {
               a[1][var0][5] = (short)v[var1 - aI];
               a[1][var0][6] = (short)w[var1 - aI];
            }
         } else if (a[1][var0] != null && v != null && w != null && var1 >= 0) {
            a[1][var0][5] = (short)v[var1];
            a[1][var0][6] = (short)w[var1];
         }

         if (var0 == 77) {
            fB = a[1][var0][5];
            fA = a[1][var0][6];
         }

         var1++;
         var0++;
      }

      while (var0 <= 81) {
         a(1, var0, false);
         var0++;
      }
   }

   static void a(boolean var0, e var1) {
      if (N == 0) {
         if (var0) {
            e(-1);
         }

         d = var1;
         a(1, 0, var0);
         a(1, 3, var0);
         a(1, 1, var0);
         a(1, 2, var0);
         a(1, 4, var0);
         a(1, 5, var0);
         a(1, 6, var0);
         a(1, 7, var0);
         O(1);
         if (d != null) {
            if (d.q == 54 && d.a(32)) {
               String var4;
               String var5 = (var4 = f.b(464)) == null ? "" : var4;
               a[1][6] = var5;
            } else {
               String var2;
               String var3 = (var2 = f.b(463)) == null ? "" : var2;
               a[1][6] = var3;
            }

            String var6 = b;
            a[1][7] = var6;
            String var7 = Integer.toString(d.K);
            a[1][5] = var7;
         }

         if (d != null && d.q == 49) {
            f(false);
            e = var1;
            ab = true;
            b(true, e);
            aa(-1);
            bu = false;
         }
      }
   }

   static boolean a() {
      return a[1][0][10] == 1;
   }

   private static void a(boolean var0, boolean var1, boolean var2) {
      int var3 = var0 ? 1 : 0;
      if (E() > 0) {
         b(1, 52, !t && !u && e == null && a == null ? var0 : false);
      }

      e(var0);
      b(1, 67, var0);
      if (!var2) {
         a(1, 14, h ? false : var0);
         a(1, 15, h ? false : var0);
         a(1, 16, var0);
         a(1, 13, var0);
         a(1, 18, var0);
         a(1, 19, h ? var0 : false);
         a(1, 20, h ? var0 : false);
         a(1, 21, var0);
         if (e() < 50) {
            a(1, 23, var0);
            a(1, 24, var0);
         } else {
            a(1, 23, false);
            a(1, 24, false);
         }

         a(1, 25, var0);
         a[1][38][10] = (short)(var1 ? var3 : 0);
      } else {
         a(1, 14, false);
         b(1, 14, false);
         a(1, 16, false);
         a(1, 20, false);
         b(1, 20, false);
         a(1, 21, false);
         a(1, 23, false);
         a(1, 24, false);
         a(1, 25, true);
         a(1, 15, false);
         a(1, 19, false);
      }

      a(1, 28, false);
      a(1, 29, false);
      a(1, 30, false);
      if (!g(23) && !f(f[23])) {
         a(1, 32, false);
         a(1, 33, false);
      } else {
         a(1, 32, var1 ? false : var0);
         a(1, 33, var1 ? false : var0);
      }

      a[1][37][10] = (short)(var1 ? var3 : 0);
      a[1][37][18] = (short)(var1 ? var3 : 0);
   }

   private static void i(boolean var0) {
      int var1 = var0 ? 1 : 0;
      a[1][37][10] = (short)var1;
      a[1][37][18] = (short)var1;
      a(1, 66, var0);
      b(1, 66, var0);
   }

   private static void ag() {
      if (ad) {
         ad = false;
         a(true, fk, a);
      }
   }

   private static int h(int var0) {
      return g.a(2).a[var0][5] - 1;
   }

   private static void j(boolean var0) {
      g(false);
      o(var0);
      i.d();
      k = true;
      if (d == 0 || d == 1 || d == 4) {
         d = -1;
         f(true);
      }

      ag();
   }

   private static void ah() {
      if (d != -1 && K == -1) {
         boolean var0 = false;
         if (d == 4) {
            int var1;
            a(var1 = a.b(), a.y, a);
            if (var1 == 3) {
               b(a, true);
               var0 = true;
            }
         }

         if (d == 4 || d == 0 || d == 1) {
            a.G();
         } else if (a.a(2)) {
            a.r = aC;
            a.s = aD;
            a(a);
         }

         j(var0);
      }
   }

   private static void ai() {
      a(1, 41, true);
      b(1, 41, true);
   }

   private static void k(boolean var0) {
      a(1, 34, var0);
      b(1, 34, var0);
   }

   private static void aj() {
      fn = 0;
      X(56);
      ag = 1;
   }

   private static void ak() {
      if (K == -1 && aN == 160) {
         i = false;
         a(34);
      }
   }

   private static void al() {
      if (K == -1 && aN == 160) {
         i = true;
         a(34);
      }
   }

   private static void am() {
      if (cb == 1 && bZ == 0 && ca == -1) {
         X(60);
         m(0, 0 + E);
      } else if (bZ == 2 && E == 0 && fu == 0 && e.a(0, 49) >= w()) {
         X(55);
         i(487, 488, 7);
      } else {
         ar(0 + E);
         if (K == 41) {
            f = true;
         }
      }
   }

   private static void an() {
      if (cb == 1 && bZ == 0 && ca == -1) {
         X(60);
         m(0, 1 + E);
      } else {
         ar(1 + E);
      }
   }

   private static void ao() {
      if (cb == 1 && bZ == 0 && ca == -1) {
         X(60);
         m(0, 2 + E);
      } else {
         ar(2 + E);
      }
   }

   private static void ap() {
      if (cb == 1 && bZ == 0 && ca == -1) {
         X(60);
         m(0, 3 + E);
      } else {
         ar(3 + E);
      }
   }

   private static void aq() {
      if (cb == 1 && bZ == 0 && ca == -1) {
         X(60);
         m(0, 4 + E);
      } else {
         ar(4 + E);
      }
   }

   private static void ar() {
      if (cb == 1 && bZ == 0 && ca == -1) {
         X(60);
         m(0, 4);
      } else {
         ar(5);
      }
   }

   private static void as() {
      X(60);
      A(0);
   }

   private static void at() {
      X(60);
      A(1);
   }

   private static void au() {
      X(60);
      A(2);
   }

   private static void av() {
      X(60);
      A(3);
   }

   private static void aw() {
      X(60);
      A(4);
   }

   private static void ax() {
      X(60);
      A(5);
   }

   private static void ay() {
      if (K != 41 && K != 13 && K != 14) {
         m(2, -1);
         z(0);
      }
   }

   private static void az() {
      if (K != 41) {
         ap(0);
         z(1);
      }
   }

   private static void aA() {
      if (K != 41 && K != 13 && K != 14) {
         m(3, -1);
         z(2);
      }
   }

   private static void aB() {
      if (K != 41 && K != 13 && K != 14) {
         m(4, -1);
         z(3);
      }
   }

   private static void aC() {
      if (K != 41 && K != 13 && K != 14) {
         m(0, -1);
         z(4);
      }
   }

   private static void z(int var0) {
      cb = var0;

      for (int var1 = 18; var1 <= 22; var1++) {
         a(2, var1, false);
      }

      if ((fn = cb) != ce) {
         var0 = fn - ce;
         ce = fn;
         if (var0 == 4) {
            dX = 3;
            dW = 1;
         } else if (var0 == -4) {
            dX = 0;
            dW = 0;
         } else if (dX + var0 > 3) {
            dW++;
         } else if (dX + var0 == -1) {
            dX = 0;
            dW--;
         } else {
            dX += var0;
         }

         hz();
      }

      a[2][dX + 18][10] = 1;
      R(0);
   }

   private static void A(int var0) {
      if (ei - E == var0 && ei != -1) {
         ei = -1;
      } else {
         ei = E + var0;
      }
   }

   private static void aD() {
      X(56);
      ag = 1;
   }

   private static void aE() {
      if (K != 56) {
         X(63);
      }

      hB();
      q(cc, 3);
   }

   private static void aF() {
      if (K != 56) {
         X(63);
      }

      ay = false;
      a(3, 3, false);
      a(3, 6, true);

      for (int var0 = 177; var0 <= 189; var0++) {
         a(3, var0, false);
      }

      for (int var4 = 190; var4 <= 200; var4++) {
         a(3, var4, true);
      }

      a(3, 205, true);
      a(3, 204, true);
      a(3, 202, false);
      a(3, 201, false);
      int var5 = 0;
      cc = 0;
      au(0);
      g var2;
      int var1 = (var2 = g.a(1)).a;

      for (int var3 = 0; var3 < var1; var3++) {
         if (e(0, var3) > 0 && var2.a[var3][12] > 0) {
            ah[cc] = var2.a[var3][2];
            ai[cc] = var3;
            aj[cc] = 0;
            ak[cc] = var2.a[var3][7];
            j[cc] = (short)e(0, var3);
            k[cc] = (short)var2.a[var3][3];
            l[cc] = (short)var2.a[var3][4];
            m[cc] = 0;
            n[cc] = (short)var2.a[var3][1];
            g[cc] = (byte)var2.a[var3][9];
            cc++;
            if (var5 < 15) {
               c(var5, true);
               var5++;
            }
         }
      }

      for (int var6 = var5; var6 < 15; var6++) {
         c(var6, false);
      }

      if (z() > 0) {
         a[3][204][6] = 218;
         d(3, 204, 1);
      } else {
         a[3][204][6] = 219;
         d(3, 204, 0);
      }

      P(3);
      at(0);
      U(0);
      q(cc, 3);
   }

   private static void aG() {
      X(60);
      at(0);
   }

   private static void aH() {
      X(60);
      at(1);
   }

   private static void aI() {
      X(60);
      at(2);
   }

   private static void aJ() {
      X(60);
      at(3);
   }

   private static void aK() {
      X(60);
      at(4);
   }

   private static void aL() {
      X(60);
      at(5);
   }

   private static void aM() {
      X(60);
      at(6);
   }

   private static void aN() {
      X(60);
      at(7);
   }

   private static void aO() {
      X(60);
      at(8);
   }

   private static void aP() {
      X(60);
      at(9);
   }

   private static void aQ() {
      X(60);
      at(10);
   }

   private static void aR() {
      X(60);
      at(11);
   }

   private static void aS() {
      X(60);
      at(12);
   }

   private static void aT() {
      X(60);
      at(13);
   }

   private static void aU() {
      X(60);
      at(14);
   }

   private static void aV() {
      if (m != null && j != null && j[cd] - m[cd] > 0) {
         m[cd]++;
         av(ak[cd]);
         X(63);
      } else {
         X(55);
      }

      if (z() > 0) {
         a[3][204][6] = 218;
         d(3, 204, 1);
      } else {
         a[3][204][6] = 219;
         d(3, 204, 0);
      }
   }

   private static void aW() {
      if (m != null && m[cd] > 0) {
         m[cd]--;
         av(-ak[cd]);
         X(63);
      } else {
         X(55);
      }

      if (z() > 0) {
         a[3][204][6] = 218;
         d(3, 204, 1);
      } else {
         a[3][204][6] = 219;
         d(3, 204, 0);
      }
   }

   private static void aX() {
      if (K == 56) {
         f = true;
      }

      if (q(al[cd])) {
         g var0 = g.a(1);
         X(48);

         for (int var1 = 0; var1 < 3; var1++) {
            int var2;
            if ((var2 = f[al[cd]][var1 << 1]) > -1) {
               a(0, var2, -ap[var1]);
               int var3;
               int var4;
               a(var4 = var0.a[var2][1], var3 = ap[var1], 16, false);
               a(var4, ap[var1], 16);
            }
         }

         x = x + m(an[cd]);
         y = y + m(ao[cd]);
         a(cd, (g)null);
         n(cd, cd);
         at(cd - E);
         a(0, 1, 40);
         if (K == 56) {
            ag = 1;
         }
      } else {
         X(55);
      }
   }

   private static void aY() {
      x = x + z();
      au(0);

      for (int var0 = 0; var0 < cc; var0++) {
         if (m[var0] > 0) {
            X(48);
            a(0, ai[var0], -m[var0]);
            short var1;
            a(n[var0], var1 = m[var0], 16, false);
            a(n[var0], m[var0], 16);
         }
      }

      if (x > 0) {
         j[cd] = (short)(j[cd] - m[cd]);
         m[cd] = 0;
         n = 0L;
         eh = 1;
      } else {
         X(55);
      }
   }

   private static void aZ() {
      X(60);
      a(cd, (g)null);
      n(cd, cd);
      at(cd - E);
      c(cd - E, true);
   }

   private static void ba() {
      switch (eq) {
         case 2:
            X(48);
            int var0 = h.J;
            h.F();
            if (var0 < G[0] || var0 > G[63] || var0 % 2 == 1) {
               a(true);
               m(var0);
            }

            ag = 1;
            return;
         case 3:
            X(56);
            er = 34;
            ag = 1;
      }
   }

   private static void bb() {
      switch (eq) {
         case 2:
            X(56);
            ag = 1;
            return;
         case 3:
            X(56);
            ag = 1;
      }
   }

   private static void bc() {
      X(60);
      c(3, 2, false);
   }

   private static void bd() {
      bf();
   }

   private static void be() {
      bf();
   }

   private static void bf() {
      int var0 = 0;
      if (eq != 2 && eq != 3 && eq != 4) {
         String var1;
         if (o.equals((var1 = f.b(292)) == null ? "" : var1)) {
            g var3 = g.a(3);
            int var8 = g(O);
            var0 = var3.a[var8][1];
            if (O == 1) {
               a(var0, 1, 27);
            } else if (O == 9) {
               a(var0, 1, 27);
            }

            a(var0, 1, 27, false);
            if (O >= 9) {
               D = 7;
            }

            var0 = 1;
         }

         if (o.equals((var1 = f.b(300)) == null ? "" : var1)) {
            if (fm != -1) {
               a(true, fm, '\u0002');
            }

            fm = -1;
            var0 = 0;

            boolean var10000;
            while (true) {
               if (var0 >= 13) {
                  var10000 = true;
                  break;
               }

               if (!a[var0]) {
                  var10000 = false;
                  break;
               }

               var0++;
            }

            if (var10000) {
               D = 6;
            }

            var0 = 1;
         }

         if (ep == 26) {
            X(59);
         } else {
            X(60);
         }

         if (var0) {
            s(17);
         } else {
            ag = 1;
         }

         if (i != null) {
            if (i.J != -1) {
               var0 = a(i.J, 1, 1, false);
               i.B();
               if (var0 == 1) {
                  e[] var10 = new e[30];
                  var0 = e.a(0, 22, var10, 30);

                  for (int var2 = 0; var2 < var0; var2++) {
                     var10[var2].B();
                  }
               }
            } else {
               i.B();
            }

            i = null;
         }
      }
   }

   private static void bg() {
      ag = 1;
      if (K == -1) {
         bo();
      }

      int var0 = fk;
      if (fk != -1) {
         if (m(cf[var0]) != 0 && !k[var0] || m(ck[var0]) != 0 && !l[var0] || m(cp[var0]) != 0 && !m[var0]) {
            if (ch[var0] == 38) {
               m(cg[var0]);
            }
         } else {
            l(var0, false);
            a(true, var0, '\u0002');
         }
      }

      X(56);
   }

   private static void bh() {
      if (e(ci[fk])) {
         if (cx[fk] == 2) {
            p(fk, 0);
            ix();
         }

         X(48);
      } else {
         X(55);
         if (ci[fk] > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(ci[fk] - d(), L, " ");
            String var3;
            p = var3 = f.a(var0, "%d", var1);
            a = var3;
            D = 19;
            i = true;
            m = true;
            a(34);
         }
      }
   }

   private static void bi() {
      if (e(cn[fk])) {
         if (cx[fk] == 2) {
            p(fk, 1);
            ix();
         }

         X(48);
      } else {
         X(55);
         if (cn[fk] > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(cn[fk] - d(), L, " ");
            String var3;
            p = var3 = f.a(var0, "%d", var1);
            a = var3;
            D = 19;
            i = true;
            m = true;
            a(34);
         }
      }
   }

   private static void bj() {
      if (e(cs[fk])) {
         if (cx[fk] == 2) {
            p(fk, 2);
            ix();
         }

         X(48);
      } else {
         X(55);
         if (cs[fk] > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(cs[fk] - d(), L, " ");
            String var3;
            p = var3 = f.a(var0, "%d", var1);
            a = var3;
            D = 19;
            i = true;
            m = true;
            a(34);
         }
      }
   }

   private static void bk() {
      br = false;
      if (cx[fk] == 3) {
         int var0 = c.r + (f.T >> 1);
         int var1 = c.s + (f.U >> 1);
         if (m(cu[fk]) > 0) {
            a(true, m(cu[fk]), var0, var1);
         }

         if (m(cv[fk]) > 0) {
            a(false, m(cv[fk]), var0, var1);
         }

         if (!h && m(cw[fk]) > 0) {
            int[] var2 = new int[]{0, 0, 14};
            int var3 = f.c(0, 50) - 25;
            int var4 = f.c(0, 50) - 25;
            e.a(47, 2, var2).a(var0 + var3, var1 + var4, 2, 1000, false, m(cw[fk]));
         }

         if (r()) {
            D = 4;
         } else if (ca[fk] != 16) {
            if (ca[fk] == 52) {
               D = 14;
            } else if (ca[fk] == 4) {
               D = 15;
            } else if (ca[fk] == 2) {
               D = 16;
            } else if (ch[fk] == 8) {
               D = 17;
            }
         }

         if (!aW && D == -1) {
            var0 = 0;

            for (int var6 = 0; var6 < fl; var6++) {
               if (cy[var6] != -1) {
                  var0++;
               }
            }

            if (var0 % 15 == 0) {
               D = 13;
            }
         }
      }

      ba(fk);
      if (q()) {
         a(true, fk, '\u0001');
      }

      ag = 1;
      d(false);
      X(60);
   }

   private static void bl() {
      X(60);
      d(ch[fk], cg[fk]);
      bo();
   }

   private static void bm() {
      X(60);
      d(cm[fk], cl[fk]);
      bo();
   }

   private static void bn() {
      X(60);
      d(cr[fk], cq[fk]);
      bo();
   }

   private static void d(int var0, int var1) {
      if (var0 == 12) {
         if (var1 - a[0] < 12) {
            ag = 1;
            f = h(var1 - a[0]);
            aE = 0;
         } else {
            X(60);
            p = br;
            gJ();
            gI();
            c(2, 0, false);
         }
      } else {
         if (var0 != 14) {
            if (var0 == 16 || var0 == 33 || var0 == 11) {
               e[] var20 = new e[1];
               e.a(0, 50, 9, var20, 1);
               if (var20[0] != null) {
                  r(8);
               }

               return;
            }

            if (var0 == 6) {
               ag = 1;
               if (var1 == b[14]) {
                  e[] var19 = new e[1];
                  e.a(0, 50, 14, var19, 1);
                  if (var19[0] != null) {
                     c.a(var19[0].r, var19[0].s, 1000);
                  }

                  return;
               }

               return;
            }

            if (var0 == 9) {
               if (var1 >= H[0] && var1 <= H[62]) {
                  X(60);
                  p = br;
                  gJ();
                  gI();
                  c(4, 3, false);
                  return;
               }

               return;
            }

            if (var0 == 17 || var0 == 38 || var0 == 21) {
               byte var18;
               byte var23;
               if ((var1 < G[0] || var1 > G[63]) && var1 != 2998 && var1 != 2999 && var1 != 2994 && var1 != 2995 && var1 != 2996) {
                  if (var1 >= a[0] && var1 <= a[21]) {
                     var23 = 0;
                     var18 = 2;
                  } else if (var1 >= H[0] && var1 <= H[62]) {
                     var23 = 3;
                     var18 = 4;
                  } else {
                     var18 = 2;
                     var23 = 0;
                  }
               } else {
                  if (var1 >= G[0] && var1 <= G[3]) {
                     var23 = 4;
                  } else {
                     var23 = 1;
                  }

                  var18 = 0;
                  m(var1);
               }

               p = br;
               gJ();
               gI();
               c(var18, var23, false);
               return;
            }

            if (var0 == 25) {
               if (var1 >= I[0] && var1 <= I[56]) {
                  if (O > 0) {
                     r(11);
                     return;
                  }
               } else {
                  if (var1 >= J[0] && var1 <= J[5]) {
                     e[] var17 = new e[1];
                     e.a(0, 50, 14, var17, 1);
                     if (var17[0] != null) {
                        r(27);
                     }

                     return;
                  }

                  if (O > 0) {
                     r(11);
                     return;
                  }
               }

               return;
            }

            if (var0 == 18) {
               e[] var16 = new e[1];
               e.a(0, 50, 14, var16, 1);
               if (var16[0] != null) {
                  r(27);
                  return;
               }

               ag = 1;
               return;
            }

            if (var0 == 27) {
               var0 = var1;
               byte var21 = 0;
               if (var0 == b[2]) {
                  var21 = 1;
               } else if (var0 == b[0]) {
                  var21 = 2;
               } else if (var0 == b[3]) {
                  var21 = 3;
               } else if (var0 == b[1]) {
                  var21 = 4;
               } else if (var0 == b[4]) {
                  var21 = 5;
               } else if (var0 == b[5]) {
                  var21 = 6;
               } else if (var0 == b[6]) {
                  var21 = 7;
               } else if (var0 == b[7]) {
                  var21 = 8;
               } else if (var0 == b[8]) {
                  var21 = 9;
               }

               byte var15 = var21;
               ag = 1;
               if (var15 <= O) {
                  b(292, 293, 15);
                  return;
               }

               e[] var22 = new e[1];
               e.a(0, 50, 18, var22, 1);
               if (var22[0] != null) {
                  c.a(var22[0].r, var22[0].s, 1000);
               }

               return;
            }

            if (var0 == 10) {
               ag = 1;
               g var11 = g.a(11);
               int var2 = 0;
               int var3 = 0;
               if (var11 != null) {
                  var2 = var11.a[0][1];
                  var3 = var11.a[1][1];
               }

               if (var1 == var2) {
                  e[] var13 = new e[1];
                  e.a(0, 48, 0, var13);
                  if (var13[0] != null) {
                     c.a(var13[0].r, var13[0].s, 1000);
                  }

                  return;
               }

               if (var1 == var3) {
                  e[] var12 = new e[1];
                  e.a(0, 48, 1, var12);
                  if (var12[0] != null) {
                     c.a(var12[0].r, var12[0].s, 1000);
                  }
               }

               return;
            }

            if (var0 == 22) {
               ag = 1;
               if (var1 == c[2]) {
                  e[] var10 = new e[1];
                  e.a(0, 54, 17, 27, var10, 1);
                  if (var10[0] != null) {
                     c.a(var10[0].r, var10[0].s, 1000);
                     return;
                  }

                  e.a(0, 54, 41, 63, var10, 1);
                  if (var10[0] != null) {
                     c.a(var10[0].r, var10[0].s, 1000);
                  }

                  return;
               }

               if (var1 == c[1]) {
                  e[] var9 = new e[1];
                  e.a(0, 54, 5, 15, var9, 1);
                  if (var9[0] != null) {
                     c.a(var9[0].r, var9[0].s, 1000);
                  }

                  return;
               }

               return;
            }

            if (var0 == 19 || var0 == 41) {
               ag = 1;
               e[] var8 = new e[1];
               if (var1 >= G[1] && var1 <= G[63]) {
                  e.b(0, 54, var1, var8, 1);
               } else if (var1 == 2999) {
                  e.a(0, 54, G[1], G[63], var8);
               } else if (var1 == 2998) {
                  e.a(0, 54, G[5], G[15], var8);
               } else if (var1 == 2997) {
                  e.a(0, 54, G[17], G[27], var8);
               } else if (var1 == 2996) {
                  e.a(0, 54, G[29], G[39], var8);
               } else if (var1 == 2995) {
                  e.a(0, 54, G[41], G[51], var8);
               } else if (var1 == 2994) {
                  e.a(0, 54, G[53], G[63], var8);
               }

               if (var8[0] != null) {
                  c.a(var8[0].r, var8[0].s, 1000);
               }

               return;
            }

            if (var0 == 39) {
               if (var1 >= H[0] && var1 <= H[30]) {
                  dq = 2;
               }

               r(28);
               return;
            }

            if (var0 == 8) {
               if (a[var1]) {
                  ag = 1;
                  a(var1, 1, 8, false);
                  return;
               }

               r = var1;
               r(12);
               return;
            }

            if (var0 == 23 || var0 == 24 || var0 == 28 || var0 == 29 || var0 == 30 || var0 == 26) {
               ag = 1;
               e[] var7 = new e[1];
               e.a(0, 50, 15, var7, 1);
               if (var7[0] != null) {
                  c.a(var7[0].r, var7[0].s, 1000);
               }

               return;
            }

            if (var0 == 7) {
               if (var1 == b[12]) {
                  ag = 1;
                  e[] var6 = new e[1];
                  e.a(0, 50, 12, var6, 1);
                  if (var6[0] != null) {
                     c.a(var6[0].r, var6[0].s, 1000);
                  }

                  return;
               }

               if (var1 >= b[0] && var1 <= b[8]) {
                  ag = 1;
                  e[] var5 = new e[1];
                  e.a(0, 50, 18, var5, 1);
                  if (var5[0] != null) {
                     c.a(var5[0].r, var5[0].s, 1000);
                  }

                  return;
               }

               return;
            }

            if (var0 == 3) {
               ag = 1;
               e[] var4 = new e[1];
               e.a(0, 50, 17, var4, 1);
               if (var4[0] != null) {
                  c.a(var4[0].r, var4[0].s, 1000);
               }

               return;
            }

            if (var0 == 4 || var0 == 5) {
               r(31);
               return;
            }

            if (var0 == 34 && var1 == c[110]) {
               p = br;
               gJ();
               gI();
               c(0, 4, false);
               return;
            }
         }

         ag = 1;
      }
   }

   private static void bo() {
      int var0;
      if ((var0 = bZ[fk]) == f[0] && !af) {
         af = true;
         aN = 161;
         f = false;
         e = false;
         am = true;
      } else if (var0 == f[1] && !ag) {
         ag = true;
         am = true;
         K = 13;
         f = false;
         e = false;
         ak = true;
      } else if (var0 == f[2] && !ah) {
         am = true;
         ah = true;
         aN = 167;
         f = false;
         e = false;
      } else if (var0 == f[23] && !ai) {
         ai = true;
         D = 8;
      } else if (var0 == f[38] && !aj) {
         aj = true;
         D = 12;
      } else if ((ch[fk] != 38 || cg[fk] != 2999) && (cm[fk] != 38 || cl[fk] != 2999) && (cr[fk] != 38 || cq[fk] != 2999)) {
         if (ch[fk] == 32 && cg[fk] == 2999 || cm[fk] == 32 && cl[fk] == 2999 || cr[fk] == 32 && cq[fk] == 2999) {
            m(0);
         }
      } else {
         m(G[0]);
      }

      int var1 = 0;

      for (int var2 = 0; var2 < 22; var2++) {
         if (var0 == E[var2] && j != var2 + 1) {
            n[var2] = true;
            j = (short)(var2 + 1);
            var1 = 1;
            break;
         }
      }

      if (var1) {
         int var16 = m(cf[fk]);
         var0 = m(ck[fk]);
         var1 = m(cp[fk]);
         int var3;
         int[] var4 = new int[(var3 = var16 + var0 + var1) << 1];
         int[] var5 = new int[var3 << 1];
         int[] var6 = new int[var3 << 1];
         g var8 = g.a(11);

         for (int var9 = 0; var9 < var16; var9++) {
            var5[var9] = cg[fk];
            var4[var9] = i(cg[fk]);

            for (int var10 = 0; var10 < 67; var10++) {
               if (var5[var9] == var8.a[var10][1]) {
                  var6[var9] = var10;
                  break;
               }
            }
         }

         for (int var25 = 0; var25 < var16; var25++) {
            var4[var16 + var25] = f.c(8412, 8511);
            var5[var16 + var25] = -1;
            var6[var16 + var25] = -1;
         }

         int var7 = var16 << 1;

         for (int var26 = 0; var26 < var0; var26++) {
            var5[var7 + var26] = cl[fk];
            var4[var7 + var26] = i(cl[fk]);

            for (int var31 = 0; var31 < 67; var31++) {
               if (var5[var7 + var26] == var8.a[var31][1]) {
                  var6[var7 + var26] = var31;
                  break;
               }
            }
         }

         var7 += var0;

         for (int var27 = 0; var27 < var0; var27++) {
            var4[var7 + var27] = f.c(8412, 8511);
            var5[var7 + var27] = -1;
            var6[var7 + var27] = -1;
         }

         var7 = (var16 << 1) + (var0 << 1);

         for (int var28 = 0; var28 < var1; var28++) {
            var5[var7 + var28] = cq[fk];
            var4[var7 + var28] = i(cq[fk]);

            for (int var32 = 0; var32 < 67; var32++) {
               if (var5[var7 + var28] == var8.a[var32][1]) {
                  var6[var7 + var28] = var32;
                  break;
               }
            }
         }

         var7 += var1;

         for (int var29 = 0; var29 < var1; var29++) {
            var4[var7 + var29] = f.c(8412, 8511);
            var5[var7 + var29] = -1;
            var6[var7 + var29] = -1;
         }

         int[] var30 = new int[2];
         int[] var33 = new int[2];
         int[] var13 = new int[4];
         var1 = 0;

         while (var1 < var3 << 1) {
            for (int var17 = 0; var17 <= r; var17++) {
               a(var17, var13);
               int[] var24 = var33;
               int[] var21 = var13;
               int var11 = f.c(var13[0], var21[1]);
               var7 = f.c(var21[2], var21[3]);
               var24[0] = var11;
               var24[1] = var7;
               d(var33, var30);
               e var23;
               if ((var23 = a(22, 0, var30[0], var30[1], false)) != null) {
                  var23.C();
                  var23.p = var4[var1];
                  var23.J = var5[var1];
                  var23.y = var6[var1];
                  if (++var1 >= var3 << 1) {
                     break;
                  }
               }
            }
         }
      }
   }

   private static int i(int var0) {
      int var1 = 0;
      g var2 = g.a(11);

      for (int var3 = 0; var3 < 67; var3++) {
         if (var0 == var2.a[var3][1]) {
            var1 = var2.a[var3][2];
            break;
         }
      }

      return var1;
   }

   private static void bp() {
      X(56);
      aG = true;
      ag = 1;
      if (K == 27) {
         f = true;
         aG = false;
      }
   }

   private static void bq() {
      if (dd <= dh && de <= di) {
         if (cK < A) {
            a(0, db, -dd);
            a(0, dc, -de);
            int var6 = cX;
            int var5 = cW;
            int var4 = cV;
            int var3 = cT;
            int var2 = cU;
            int var1 = cY;
            int var0 = cK;
            az[var0] = var1;
            aA[var0] = var2;
            c[var0] = var3;
            long var7 = System.currentTimeMillis() / 1000L;
            a[var0] = var7;
            aB[var0] = var4;
            aC[var0] = var5;
            aD[var0] = var6;
            cK = var0 + 1;
            aC = true;
            cA = 0;
            cB = 0;
            a(6, 41, true);
            if (aI) {
               dj = 0;
            } else {
               aI = true;
               g = 1;
               dj = 0;
               a(6, 42, true);
               b(6, 42, true);
            }

            if (K == 26) {
               f = true;
            }

            if (!al) {
               al = true;
               K = 27;
               e = false;
               f = false;
            }
         } else {
            D = 9;
            ag = 1;
         }

         hL();
         X(60);
      } else {
         X(55);
      }
   }

   private static void br() {
      if (e(df)) {
         if (b(5) + e.a(2) + dd - dh > b()) {
            X(55);
            h(df);
            D = 2;
            s(17);
         } else {
            a(0, db, dd - dh);
            hL();
            X(48);
         }
      } else {
         X(55);
         if (df > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(df - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            i = true;
            m = true;
            a(34);
         }
      }
   }

   private static void bs() {
      if (e(dg)) {
         if (b(5) + e.a(2) + de - di > b()) {
            X(55);
            h(dg);
            D = 2;
            s(17);
         } else {
            a(0, dc, de - di);
            hL();
            X(48);
         }
      } else {
         X(55);
         if (dg > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(dg - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            i = true;
            m = true;
            a(34);
         }
      }
   }

   private static void bt() {
      if (K == 27) {
         f = false;
         e = false;
         K = 28;
      }

      X(56);
      aG = false;
      ag = 1;
   }

   private static void bu() {
      if (aN == 170) {
         f = true;
      }

      X(56);
      aE = true;
      ag = 1;
      a(7, 44, false);
      b(7, 44, false);
      d = 0;
      cE = 0;
      aA = false;
      aB = false;
   }

   private static void bv() {
      a(7, 44, false);
      b(7, 44, false);
      X(60);
      aE = true;
      c = d;
      cg = cE;
      hD();
      aA = false;
      aB = false;
   }

   private static void bw() {
      if (ct <= cx && cu <= cy) {
         if (cH < cF) {
            a(0, cr, -ct);
            a(0, cs, -cu);
            if (aB && aA) {
               if (1 <= bG) {
                  bG--;
               }

               aA = false;
            }

            boolean var6 = aB;
            int var5 = cn;
            int var4 = cm;
            int var3 = ck;
            int var2 = cl;
            int var1 = co;
            int var0 = cH;
            at[var0] = var1;
            au[var0] = var2;
            av[var0] = var3;
            long var7 = System.currentTimeMillis() / 1000L;
            b[var0] = var7;
            aw[var0] = var4;
            ax[var0] = var5;
            g[var0] = var6;
            cH = var0 + 1;
            aC = true;
            cA = 0;
            cB = 0;
            a(7, 46, true);
            if (aD) {
               cC = 0;
            } else {
               aD = true;
               e = 1;
               cC = 0;
               a(7, 53, true);
               b(7, 53, true);
            }

            aB = false;
         } else {
            D = 10;
            ag = 1;
         }

         hE();
         X(60);
      } else {
         X(55);
      }
   }

   private static void bx() {
      aA = true;
      X(60);
      u(true);
      a(7, 22, false);
      b(7, 22, false);
      P(7);
   }

   private static void by() {
      if (e(cv)) {
         if (b(5) + e.a(2) + ct - cx > b()) {
            X(55);
            h(cv);
            D = 2;
            s(17);
         } else {
            a(0, cr, ct - cx);
            hE();
            X(48);
         }
      } else {
         X(55);
         if (cv > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(cv - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      }
   }

   private static void bz() {
      if (e(cw)) {
         if (b(5) + e.a(2) + cu - cy > b()) {
            X(55);
            h(cw);
            D = 2;
            s(17);
         } else {
            a(0, cs, cu - cy);
            hE();
            X(48);
         }
      } else {
         X(55);
         if (cw > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(cw - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      }
   }

   private static void bA() {
      B(cr);
   }

   private static void bB() {
      B(cs);
   }

   private static void bC() {
      if (aN == 170) {
         f = false;
         e = false;
         aN = 171;
      }

      X(56);
      aE = false;
      ag = 1;
      a(7, 44, false);
      b(7, 44, false);
      d = 0;
      cE = 0;
   }

   private static void B(int var0) {
      char var1 = c;
      int var2 = cg;
      boolean var3 = false;
      g var4 = g.a(7);

      for (int var5 = 0; var5 < var4.a; var5++) {
         if (var4.a[var5][18] == var0 && e() >= var4.a[var5][5]) {
            var3 = true;
            d = c;
            cE = cg;
            cg = var4.a[var5][3];
            c = (char)(var4.a[var5][4] - 1);
            break;
         }
      }

      if (!var3) {
         c = var1;
         cg = var2;
      } else {
         a(7, 44, true);
         b(7, 44, true);
         hD();
         aA = false;
         aB = false;
         X(60);
      }
   }

   private static void bD() {
      if (aF) {
         int var0;
         if ((var0 = a()) == 27) {
            l(z);
         } else if (var0 == 11) {
            ay(z);
         }

         aF = false;
         cI = 0;
         z = 0;
      }

      if (K != 24 && K != 25) {
         X(56);
         ag = 1;
         if (K == 30 || K == 173) {
            f = true;
         }
      }
   }

   private static void e(int var0, int var1) {
      if (var1 == 27) {
         if (!aH) {
            X(60);
            if (K == 29) {
               f = true;
            }

            var0 = cL + var0;
            if (!aF) {
               g var10 = g.a(22);
               int var12 = 0;

               for (int var13 = 0; var13 < 6; var13++) {
                  if (az[var0] == var10.a[var13][1]) {
                     var12 = var13;
                     break;
                  }
               }

               if (c(1, var12)) {
                  k(var1 = var10.a[var12][13]);
                  cP = var1;
                  ax(var0 - cL - E);
                  a(az[var0], 1, 18, false);
                  var0 = var0 - cL - E;
                  a[22][var0 + 87][5] = a[22][26 + var0 * 15][5];
                  a[22][var0 + 87][6] = a[22][26 + var0 * 15][6];
                  a(22, var0 + 87, true);
                  a(22, 26 + var0 * 15, false);
                  aF = true;
                  cI = 0;
                  z = var0;
               }
            }
         }
      } else {
         if (var1 == 11) {
            if (az) {
               return;
            }

            X(60);
            if (aN == 172) {
               f = true;
            }

            if (!aF) {
               g var8 = g.a(7);
               int var2 = 0;
               int var3 = 0;

               for (int var4 = 0; var4 < 83; var4++) {
                  if (at[var0] == var8.a[var4][1]) {
                     if (g[var0]) {
                        var3 = var8.a[var4][13];
                     }

                     var2 = var4;
                     break;
                  }
               }

               int var14 = var8.a[var2][18];
               if (b(5) + e.a(2) + 1 > b()) {
                  D = 2;
                  s(17);
                  return;
               }

               if (g[var0]) {
                  a(0, var14 + 1, 1);
                  a(var3, 1, 25, false);
                  a(var3, 1, 25);
               } else {
                  a(0, var14, 1);
                  a(at[var0], 1, 25, false);
                  a(at[var0], 1, 25);
               }

               k(var1 = var8.a[var2][16]);
               cJ = var1;
               ax(var0 - E);
               var0 -= E;
               a[22][var0 + 87][5] = a[22][26 + var0 * 15][5];
               a[22][var0 + 87][6] = a[22][26 + var0 * 15][6];
               a(22, var0 + 87, true);
               a(22, 26 + var0 * 15, false);
               aF = true;
               cI = 0;
               z = var0;
            }
         }
      }
   }

   private static void bE() {
      int var0;
      if ((var0 = a()) == 27 && i[cL] == 4 || var0 == 11 && h[0] == 4) {
         e(0, var0);
      }
   }

   private static void bF() {
      int var0;
      if ((var0 = a()) == 27 && i[cL + 1] == 4 || var0 == 11 && h[1] == 4) {
         e(1, var0);
      }
   }

   private static void bG() {
      int var0;
      if ((var0 = a()) == 27 && i[cL + 2] == 4 || var0 == 11 && h[2] == 4) {
         e(2, var0);
      }
   }

   private static void bH() {
      int var0;
      if ((var0 = a()) == 27 && i[cL + 3] == 4 || var0 == 11 && h[3] == 4) {
         e(3, var0);
      }
   }

   private static void bI() {
      int var0;
      if ((var0 = a()) == 27 && i[cL + 4] == 4 || var0 == 11 && h[4] == 4) {
         e(4, var0);
      }
   }

   private static void bJ() {
      switch (a()) {
         case 11:
            if (cF > 0) {
               E(0);
            }
            break;
         case 27:
            if (cL < A) {
               E(0);
               return;
            }
      }
   }

   private static void bK() {
      switch (a()) {
         case 11:
            if (1 < cF) {
               E(1);
            }
            break;
         case 27:
            if (cL + 1 < A) {
               E(1);
               return;
            }
      }
   }

   private static void bL() {
      switch (a()) {
         case 11:
            if (2 < cF) {
               E(2);
            }
            break;
         case 27:
            if (cL + 2 < A) {
               E(2);
               return;
            }
      }
   }

   private static void bM() {
      switch (a()) {
         case 11:
            if (3 < cF) {
               E(3);
            }
            break;
         case 27:
            if (cL + 3 < A) {
               E(3);
               return;
            }
      }
   }

   private static void bN() {
      switch (a()) {
         case 11:
            if (4 < cF) {
               E(4);
            }
            break;
         case 27:
            if (cL + 4 < A) {
               E(4);
               return;
            }
      }
   }

   private static void C(int var0) {
      if (e(aE[var0])) {
         X(48);
         aC(var0);
      } else {
         X(55);
         if (aE[var0] > 0) {
            String var1;
            var1 = (var1 = f.b(381)) == null ? "" : var1;
            String var2 = f.a(aE[var0] - d(), L, " ");
            a = f.a(var1, "%d", var2);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      }
   }

   private static void D(int var0) {
      if (e(ay[var0])) {
         X(48);
         az(var0);
      } else {
         X(55);
         if (ay[var0] > 0) {
            String var1;
            var1 = (var1 = f.b(381)) == null ? "" : var1;
            String var2 = f.a(ay[var0] - d(), L, " ");
            a = f.a(var1, "%d", var2);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      }
   }

   private static void bO() {
      if (K == 171 || K == 28) {
         f = true;
      }

      if (a() == 27) {
         C(cL);
      } else {
         D(0);
      }

      b(22, 16, false);
      O(22);
   }

   private static void bP() {
      if (a() == 27) {
         C(cL + 1);
      } else {
         D(1);
      }

      b(22, 31, false);
      O(22);
   }

   private static void bQ() {
      if (a() == 27) {
         C(cL + 2);
      } else {
         D(2);
      }

      b(22, 46, false);
      O(22);
   }

   private static void bR() {
      if (a() == 27) {
         C(cL + 3);
      } else {
         D(3);
      }

      b(22, 61, false);
      O(22);
   }

   private static void bS() {
      if (a() == 27) {
         C(cL + 4);
      } else {
         D(4);
      }

      b(22, 76, false);
      O(22);
   }

   private static void bT() {
      X(56);
      if (a() == 27) {
         aD(cL);
      } else {
         aA(0);
      }
   }

   private static void bU() {
      X(56);
      if (a() == 27) {
         aD(cL + 1);
      } else {
         aA(1);
      }
   }

   private static void bV() {
      X(56);
      if (a() == 27) {
         aD(cL + 2);
      } else {
         aA(2);
      }
   }

   private static void bW() {
      X(56);
      if (a() == 27) {
         aD(cL + 3);
      } else {
         aA(3);
      }
   }

   private static void bX() {
      X(56);
      if (a() == 27) {
         aD(cL + 4);
      } else {
         aA(4);
      }
   }

   private static void bY() {
      cd();
   }

   private static void bZ() {
      cd();
   }

   private static void ca() {
      cd();
   }

   private static void cb() {
      cd();
   }

   private static void cc() {
      cd();
   }

   private static void cd() {
      if (a() == 27) {
         if (A < cG) {
            int var4 = A + 1;
            if (e(var4 = cD[var4 - 4])) {
               X(48);
               int var11 = b[0][8];
               if (++A != cG) {
                  fs = A + 1;
               }

               hJ();
               b[0][8] = var11;
               return;
            }

            X(55);
            String var9;
            var9 = (var9 = f.b(381)) == null ? "" : var9;
            String var6 = f.a(var4 - d(), L, " ");
            a = f.a(var9, "%d", var6);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      } else {
         if (cF < cG) {
            int var0 = cF + 1;
            if (e(var0 = cD[var0 - 4])) {
               X(48);
               cF++;
               if (a() == 27) {
                  if (A != cG) {
                     fs = A + 1;
                  }
               } else if (cF != cG) {
                  fs = cF + 1;
               }

               int var8 = b[0][8];
               hH();
               b[0][8] = var8;
               return;
            }

            X(55);
            String var1;
            var1 = (var1 = f.b(381)) == null ? "" : var1;
            String var3 = f.a(var0 - d(), L, " ");
            a = f.a(var1, "%d", var3);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      }
   }

   private static void ce() {
      if (a() == 27) {
         cQ = cN + ea;
         if (e() >= j[cQ]) {
            X(60);
            a(9);
         } else {
            X(55);
         }

         if (K == 25) {
            f = true;
            return;
         }
      } else {
         cg = as[c] + ea;
         if (e() >= r[c][cg]) {
            X(60);
            a(10);
            return;
         }

         X(55);
      }
   }

   private static void cf() {
      if (a() == 27) {
         cQ = cN + 1 + ea;
         if (e() >= j[cQ]) {
            X(60);
            a(9);
         } else {
            X(55);
         }
      } else {
         cg = as[c] + 1 + ea;
         if (e() >= r[c][cg]) {
            X(60);
            a(10);
         } else {
            X(55);
         }
      }
   }

   private static void cg() {
      if (a() == 27) {
         cQ = cN + 2 + ea;
         if (e() >= j[cQ]) {
            X(60);
            a(9);
         } else {
            X(55);
         }
      } else {
         cg = as[c] + 2 + ea;
         if (e() >= r[c][cg]) {
            X(60);
            a(10);
         } else {
            X(55);
         }
      }
   }

   private static void ch() {
      if (a() == 27) {
         cQ = cN + 3 + ea;
         if (e() >= j[cQ]) {
            X(60);
            a(9);
         } else {
            X(55);
         }
      } else {
         cg = as[c] + 3 + ea;
         if (e() >= r[c][cg]) {
            X(60);
            a(10);
         } else {
            X(55);
         }
      }
   }

   private static void ci() {
      if (a() == 27) {
         cQ = cN + 4 + ea;
         if (e() >= j[cQ]) {
            X(60);
            a(9);
         } else {
            X(55);
         }
      } else {
         cg = as[c] + 4 + ea;
         if (e() >= r[c][cg]) {
            X(60);
            a(10);
         } else {
            X(55);
         }
      }
   }

   private static void cj() {
      if (a() == 27) {
         cQ = cN + 5;
         if (e() >= j[cQ]) {
            X(60);
            a(9);
         } else {
            X(55);
         }
      } else {
         cg = as[c] + 5;
         if (e() >= r[c][cg]) {
            X(60);
            a(10);
         } else {
            X(55);
         }
      }
   }

   private static void ck() {
      if (c != 0) {
         a('\u0000');
      }
   }

   private static void cl() {
      if (c != 1) {
         a('\u0001');
      }
   }

   private static void cm() {
      if (c != 2) {
         a('\u0002');
      }
   }

   private static void cn() {
      E(-1);
   }

   private static void co() {
      cp();
   }

   private static void cp() {
      if (K == -1 && aN == 160) {
         a(34);
      }
   }

   private static void cq() {
      cr();
   }

   private static void cr() {
      if (K == -1 && aN == 160) {
         m = true;
         i = true;
         a(34);
      }
   }

   private static void E(int var0) {
      if (a() == 27) {
         if (!aH) {
            X(60);
         } else if (K != 25) {
            X(56);
         }

         if (K < 28 || K > 30 || aH) {
            if (K == 25) {
               if (!aH) {
                  v(true);
               }
            } else if (aH) {
               v(false);
            } else {
               dZ = 0;
               ea = 0;
               eb = 0;
               dZ = cM;
               if (var0 == -1 || cL + var0 >= cK) {
                  v(true);
               }
            }
         }
      } else {
         if (!az) {
            X(60);
         } else {
            X(56);
         }

         if (az) {
            dZ = 0;
            ea = 0;
            eb = 0;
            t(false);
         } else {
            if (var0 == -1 || var0 >= cH) {
               t(true);
            }
         }
      }
   }

   private static void cs() {
      if (!by) {
         if (ar == 3 && D) {
            eH = o();
            eG = 11;
            a(42);
         } else {
            dc();
         }
      }
   }

   private static void ct() {
      if (w) {
         if (eU > 0) {
            eG = eU;
            a(42);
            eU = 0;
         } else {
            df();
            di();
         }
      } else {
         dw();
      }
   }

   private static void cu() {
      at = 4;
      if (k()) {
         eG = 3 + eO;
         a(42);
      } else {
         f.a(bH[eO], "Cash");
         A = false;
         dk();
      }
   }

   private static void cv() {
      at = 4;
      if (k()) {
         eG = 3;
         a(42);
      } else {
         f.a(bH[0], "Cash");
         A = false;
         dk();
      }
   }

   private static void cw() {
      at = 4;
      if (k()) {
         eG = 4;
         a(42);
      } else {
         f.a(bH[1], "Cash");
         A = false;
         dk();
      }
   }

   private static void cx() {
      at = 4;
      if (k()) {
         eG = 5;
         a(42);
      } else {
         f.a(bH[2], "Cash");
         A = false;
         dk();
      }
   }

   private static void cy() {
      at = 4;
      if (k()) {
         eG = 6;
         a(42);
      } else {
         f.a(bH[3], "Cash");
         A = false;
         dk();
      }
   }

   private static void cz() {
      at = 4;
      if (k()) {
         eG = 7;
         a(42);
      } else {
         f.a(bH[4], "Cash");
         A = false;
         dk();
      }
   }

   private static void cA() {
      at = 4;
      if (k()) {
         eG = 8;
         a(42);
      } else {
         f.a(bH[5], "Cash");
         A = false;
         dk();
      }
   }

   private static void cB() {
      if (!y) {
         dk();
         df();
         do();
         dp();
         dr();
         dv();
         dt();
         dh();
         dl();
         is();
         eU = 0;
      }
   }

   private static void cC() {
      dm();
      q(eL, 2);
      is();
      if (f.i()) {
         dq();
         dg();
         ar = 3;
         as = 3;
         q(eL, 2);
         is();
      } else {
         dg();
         eU = 0;
      }
   }

   private static void F(int var0) {
      by = true;
      if (h) {
         b(8, 208, false);
         b(8, 213, false);
         cC();
         bx = true;
         i = true;
         a(34);
      }

      String var1;
      String var4;
      var1 = h ? ((var1 = f.b(381)) == null ? "" : var1) : ((var4 = f.b(864)) == null ? "" : var4);
      String var2 = f.a(bA[var0] - d(), L, " ");
      var1 = f.a(var1, "%d", var2);
      String var3;
      a((var3 = f.b(380)) == null ? "" : var3, var1, 7);
   }

   private static void cD() {
      if (e(bA[0])) {
         g(bG[0]);
         String var0 = f.a(d(), L, " ");
         a[8][7] = var0;
         var0 = f.a(c(), L, " ");
         a[8][4] = var0;
         X(48);
      } else {
         X(55);

         try {
            Thread.sleep(200L);
         } catch (Exception var1) {
         }

         F(0);
         X(57);
      }
   }

   private static void cE() {
      if (e(bA[1])) {
         g(bG[1]);
         String var0 = f.a(d(), L, " ");
         a[8][7] = var0;
         var0 = f.a(c(), L, " ");
         a[8][4] = var0;
      } else {
         X(55);

         try {
            Thread.sleep(200L);
         } catch (Exception var1) {
         }

         F(1);
         X(57);
      }
   }

   private static void cF() {
      if (e(bA[2])) {
         g(bG[2]);
         String var0 = f.a(d(), L, " ");
         a[8][7] = var0;
         var0 = f.a(c(), L, " ");
         a[8][4] = var0;
      } else {
         X(55);

         try {
            Thread.sleep(200L);
         } catch (Exception var1) {
         }

         F(2);
         X(57);
      }
   }

   private static void cG() {
      if (e(bA[3])) {
         g(bG[3]);
         String var0 = f.a(d(), L, " ");
         a[8][7] = var0;
         var0 = f.a(c(), L, " ");
         a[8][4] = var0;
      } else {
         X(55);

         try {
            Thread.sleep(200L);
         } catch (Exception var1) {
         }

         F(3);
         X(57);
      }
   }

   private static void cH() {
      if (e(bA[4])) {
         g(bG[4]);
         String var0 = f.a(d(), L, " ");
         a[8][7] = var0;
         var0 = f.a(c(), L, " ");
         a[8][4] = var0;
      } else {
         X(55);

         try {
            Thread.sleep(200L);
         } catch (Exception var1) {
         }

         F(4);
         X(57);
      }
   }

   private static void cI() {
      if (e(bA[5])) {
         g(bG[5]);
         String var0 = f.a(d(), L, " ");
         a[8][7] = var0;
         var0 = f.a(c(), L, " ");
         a[8][4] = var0;
      } else {
         X(55);

         try {
            Thread.sleep(200L);
         } catch (Exception var1) {
         }

         F(5);
         X(57);
      }
   }

   private static void cJ() {
      try {
         f.S = -1;
      } catch (Exception var0) {
         var0.printStackTrace();
      }
   }

   private static void cK() {
      dp();
      dq();
   }

   private static void cL() {
      aX(0);
   }

   private static void cM() {
      aX(1);
   }

   private static void cN() {
      aX(2);
   }

   private static void cO() {
      aX(3);
   }

   private static void cP() {
      aX(4);
   }

   private static void cQ() {
      aX(5);
   }

   private static void cR() {
      aX(6);
   }

   private static void cS() {
      aX(7);
   }

   private static void cT() {
      aX(8);
   }

   private static void cU() {
      aX(9);
   }

   private static void cV() {
      y(true);
   }

   private static void cW() {
      if (eI > 0) {
         eI--;
         bJ[eI] = -1;
      } else {
         eG = 9;
         a(42);
      }
   }

   private static void cX() {
      if (eI < 5) {
         eG = 10;
         a(42);
      } else {
         int var0 = 0;
         byte var1 = 1;

         for (int var2 = 4; var2 >= 0; var2--) {
            var0 += bJ[var2] * var1;
            var1 *= 10;
         }

         if (f.k(var0)) {
            f.l();
            h((int)f.a(200L));
            String var3 = Integer.toString(d());
            a[8][7] = var3;
            dr();
            y(false);
            f.q();
            ds();
         } else {
            dr();
            y(false);
            as = 7;
            eP = 11;
            du();
         }
      }
   }

   private static void cY() {
      if (eN == 7) {
         eG = 2;
         a(42);
      } else {
         f.p();
         dr();
         dn();
      }
   }

   private static void cZ() {
      X(60);
      aW(20);
   }

   private static void da() {
      dt();
      bn = false;
      if (bx) {
         bx = false;
         i = false;
         dh();
         dl();
      } else if (m) {
         ag = 1;
         m = false;
         dc();
      } else if (bm) {
         dg();
         di();
      } else {
         i = true;
         a(34);
      }
   }

   private static void db() {
      if (!by) {
         if ((as < 6 || as > 10) && as != 3) {
            bn = false;
            dk();
            df();
            do();
            dp();
            dr();
            dv();
            dt();
            if (eL > 0) {
               dg();
               di();
            }
         } else {
            bn = false;
            dv();
            at = 3;
         }
      }
   }

   private static void dc() {
      ag = 1;
      ar = 0;
      as = 0;
      y = false;
      bn = true;
   }

   private static boolean k() {
      return eN != 0;
   }

   private static void dd() {
      a(8, 210, false);
      b(8, 210, false);
      a(8, 212, false);
      a(8, 211, false);
   }

   private static void de() {
      if (u != null && !u.equals("")) {
         a(8, 210, true);
         b(8, 210, true);
         a(8, 212, true);
         String var0;
         var0 = (var0 = f.b(w ? 45 : 767)) == null ? "" : var0;
         a[8][212] = var0;
         a(8, 211, true);
      } else {
         dd();
      }
   }

   private static void df() {
      if (w) {
         de();
         String var0;
         var0 = (var0 = f.b(767)) == null ? "" : var0;
         a[8][212] = var0;
         a(8, 211, true);
         a(8, 208, true);
         b(8, 208, true);
         a(8, 159, false);
         a(8, 160, false);
         P(8);
         w = false;
      }
   }

   private static void dg() {
      if (h) {
         a(8, 14, true);
         b(8, 14, true);
         b(8, 11, false);
         a(8, 11, false);
         a(8, 16, false);
         a(8, 13, true);
         D = true;
         if (f.i()) {
            ar = 3;
         } else {
            ar = 2;
         }

         as = ar;
         P(8);
      }
   }

   private static void dh() {
      if (h) {
         a(8, 11, true);
         b(8, 11, true);
      }

      b(8, 14, false);
      a(8, 14, false);
      a(8, 13, false);
      a(8, 16, true);
      a(8, 210, false);
      b(8, 210, false);
      a(8, 212, false);
      a(8, 211, false);
      D = false;
      ar = 1;
      as = 1;
      P(8);
   }

   private static void di() {
      if (!x) {
         dj();
         if (bo) {
            if (eL != 0 || eJ != 10 && eJ != 6) {
               int var0 = 0;
               int var1 = f.a("Cash");

               for (int var2 = 0; var2 < var1; var2++) {
                  int var3;
                  if ((var3 = f.b(var2, "Cash")) != -1) {
                     bz[var0++] = var3 - 1;
                  }
               }
            }

            is();
            if (eL != fs) {
               q(eL, 2);
            }

            de();
            int var4 = eL - E >= 4 ? 4 : eL - E;

            for (int var5 = 0; var5 < var4; var5++) {
               a(8, 28 + var5 * 15, true);
               a(8, 19 + var5 * 15, true);
               a(8, 27 + var5 * 15, true);
               a(8, 23 + var5 * 15, true);
            }

            for (int var6 = var4; var6 < 4; var6++) {
               a(8, 19 + var6 * 15, false);
               a(8, 27 + var6 * 15, false);
               a(8, 23 + var6 * 15, false);
               a(8, 28 + var6 * 15, false);
            }
         }

         P(8);
         z(true);
         x = true;
         ar = 2;
         as = 2;
      }
   }

   private static void dj() {
      a(8, 19, false);
      a(8, 27, false);
      b(8, 27, false);
      a(8, 23, false);
      a(8, 34, false);
      a(8, 42, false);
      b(8, 42, false);
      a(8, 38, false);
      a(8, 49, false);
      a(8, 57, false);
      b(8, 57, false);
      a(8, 53, false);
      a(8, 64, false);
      a(8, 72, false);
      b(8, 72, false);
      a(8, 68, false);
      a(8, 79, false);
      a(8, 87, false);
      b(8, 87, false);
      a(8, 83, false);
      a(8, 94, false);
      a(8, 102, false);
      b(8, 102, false);
      a(8, 98, false);
      a(8, 28, false);
      a(8, 43, false);
      a(8, 58, false);
      a(8, 73, false);
      a(8, 88, false);
      a(8, 103, false);
      a(8, 114, false);
   }

   private static void dk() {
      if (x) {
         a(8, 210, false);
         b(8, 210, false);
         a(8, 212, false);
         a(8, 211, false);
         a(8, 109, false);
         a(8, 113, false);
         b(8, 113, false);
         a(8, 110, false);
         a(8, 18, false);
         dj();
         P(8);
         x = false;
      }
   }

   private static void dl() {
      if (!E) {
         if (eM != fs) {
            q(eM, 2);
         }

         int var0 = eM - E >= 4 ? 4 : eM - E;

         for (int var1 = 0; var1 < var0; var1++) {
            a(8, 116 + var1 * 6, true);
            a(8, 120 + var1 * 6, true);
            a(8, 117 + var1 * 6, true);
            a(8, 119 + var1 * 6, true);
         }

         for (int var2 = var0; var2 < 4; var2++) {
            a(8, 116 + var2 * 6, false);
            a(8, 120 + var2 * 6, false);
            a(8, 117 + var2 * 6, false);
            a(8, 119 + var2 * 6, false);
         }

         P(8);
         z(false);
         E = true;
         ar = 1;
         as = 1;
      }
   }

   private static void dm() {
      if (E) {
         a(8, 116, false);
         a(8, 120, false);
         b(8, 120, false);
         a(8, 117, false);
         a(8, 119, false);
         a(8, 122, false);
         a(8, 126, false);
         b(8, 126, false);
         a(8, 123, false);
         a(8, 125, false);
         a(8, 128, false);
         a(8, 132, false);
         b(8, 132, false);
         a(8, 129, false);
         a(8, 131, false);
         a(8, 134, false);
         a(8, 138, false);
         b(8, 138, false);
         a(8, 135, false);
         a(8, 137, false);
         a(8, 140, false);
         a(8, 144, false);
         b(8, 144, false);
         a(8, 141, false);
         a(8, 143, false);
         a(8, 146, false);
         a(8, 150, false);
         b(8, 150, false);
         a(8, 147, false);
         a(8, 149, false);
         a(8, 152, false);
         a(8, 156, false);
         b(8, 156, false);
         a(8, 153, false);
         a(8, 155, false);
         P(8);
         E = false;
      }
   }

   private static void dn() {
      if (!y) {
         a(8, 208, false);
         b(8, 208, false);
         P(8);
         y = true;
      }
   }

   private static void do() {
      if (y) {
         a(8, 208, true);
         b(8, 208, true);
         P(8);
         y = false;
      }
   }

   private static void dp() {
      if (z) {
         a(8, 164, false);
         b(8, 164, false);
         a(8, 166, false);
         b(8, 166, false);
         a(8, 165, false);
         a(8, 167, false);
         a(8, 163, false);
         P(8);
         z = false;
      }
   }

   private static void dq() {
      if (!A) {
         a(8, 186, true);
         b(8, 186, true);
         a(8, 187, true);
         a(8, 168, true);
         b(8, 168, true);
         a(8, 169, true);
         a(8, 170, true);
         b(8, 170, true);
         a(8, 171, true);
         a(8, 172, true);
         b(8, 172, true);
         a(8, 173, true);
         a(8, 174, true);
         b(8, 174, true);
         a(8, 175, true);
         a(8, 176, true);
         b(8, 176, true);
         a(8, 177, true);
         a(8, 178, true);
         b(8, 178, true);
         a(8, 179, true);
         a(8, 180, true);
         b(8, 180, true);
         a(8, 181, true);
         a(8, 182, true);
         b(8, 182, true);
         a(8, 183, true);
         a(8, 184, true);
         b(8, 184, true);
         a(8, 185, true);
         a(8, 188, true);
         b(8, 188, true);
         a(8, 189, true);
         a(8, 190, true);
         b(8, 190, true);
         a(8, 200, true);
         a(8, 191, true);
         a(8, 192, true);
         b(8, 192, true);
         a(8, 193, true);
         a(8, 194, true);
         b(8, 194, true);
         a(8, 195, true);
         a(8, 196, true);
         b(8, 196, true);
         a(8, 197, true);
         a(8, 198, true);
         a(8, 199, true);
         P(8);
         A = true;
         ar = 3;
         as = 3;
         b(8, 14, true);
      }
   }

   private static void dr() {
      a(8, 186, false);
      b(8, 186, false);
      a(8, 187, false);
      a(8, 168, false);
      b(8, 168, false);
      a(8, 169, false);
      a(8, 170, false);
      b(8, 170, false);
      a(8, 171, false);
      a(8, 172, false);
      b(8, 172, false);
      a(8, 173, false);
      a(8, 174, false);
      b(8, 174, false);
      a(8, 175, false);
      a(8, 176, false);
      b(8, 176, false);
      a(8, 177, false);
      a(8, 178, false);
      b(8, 178, false);
      a(8, 179, false);
      a(8, 180, false);
      b(8, 180, false);
      a(8, 181, false);
      a(8, 182, false);
      b(8, 182, false);
      a(8, 183, false);
      a(8, 184, false);
      b(8, 184, false);
      a(8, 185, false);
      a(8, 188, false);
      b(8, 188, false);
      a(8, 189, false);
      a(8, 190, false);
      b(8, 190, false);
      a(8, 200, false);
      a(8, 191, false);
      a(8, 192, false);
      b(8, 192, false);
      a(8, 193, false);
      a(8, 194, false);
      b(8, 194, false);
      a(8, 195, false);
      a(8, 196, false);
      b(8, 196, false);
      a(8, 197, false);
      a(8, 198, false);
      a(8, 199, false);
      P(8);
      A = false;
      if (ar != 3) {
         ar = 0;
      }
   }

   private static void ds() {
      if (!B) {
         a(8, 202, true);
         b(8, 202, true);
         a(8, 203, true);
         a(8, 201, true);
         dd();
         P(8);
         B = true;
         ar = 5;
         bn = true;
      }
   }

   private static void dt() {
      if (B) {
         a(8, 202, false);
         b(8, 202, false);
         a(8, 203, false);
         a(8, 201, false);
         B = false;
      }
   }

   private static void du() {
      if (!C) {
         dj();
         a(8, 213, true);
         if (!by) {
            b(8, 213, true);
         } else {
            b(8, 213, false);
         }

         a(8, 214, true);
         P(8);
         C = true;
         ar = 6;
      }
   }

   private static void dv() {
      if (C) {
         a(8, 213, false);
         b(8, 213, false);
         a(8, 214, false);
         P(8);
         C = false;
      }
   }

   private static void dw() {
      il();
      if (u != null && !u.equals("")) {
         dk();
         dm();
         if (!w) {
            de();
            String var0;
            var0 = (var0 = f.b(45)) == null ? "" : var0;
            a[8][212] = var0;
            a(8, 211, false);
            a(8, 208, false);
            b(8, 208, false);
            a(8, 209, false);
            a(8, 159, true);
            a(8, 160, true);
            P(8);
            w = true;
         }
      }
   }

   private static void dx() {
      X(56);
      if (ev == 4 && o() != 41) {
         r(41);
      } else {
         ag = 1;
      }
   }

   private static void dy() {
      if (!bj) {
         if (d[0 + E][4] != -1) {
            aT(0);
         }
      }
   }

   private static void dz() {
      if (!bj) {
         if (d[1 + E][4] != -1) {
            aT(1);
         }
      }
   }

   private static void dA() {
      if (!bj) {
         if (d[2 + E][4] != -1) {
            aT(2);
         }
      }
   }

   private static void dB() {
      if (!bj) {
         if (d[3 + E][4] != -1) {
            aT(3);
         }
      }
   }

   private static void dC() {
      if (!bj) {
         if (d[4][4] != -1) {
            aT(4);
         }
      }
   }

   private static void dD() {
      if (!bj) {
         if (d[0 + E][3] != -1) {
            aS(0);
         }
      }
   }

   private static void dE() {
      if (!bj) {
         if (d[1 + E][3] != -1) {
            aS(1);
         }
      }
   }

   private static void dF() {
      if (!bj) {
         if (d[2 + E][3] != -1) {
            aS(2);
         }
      }
   }

   private static void dG() {
      if (!bj) {
         if (d[3 + E][3] != -1) {
            aS(3);
         }
      }
   }

   private static void dH() {
      if (!bj) {
         if (d[4][3] != -1) {
            aS(4);
         }
      }
   }

   private static void dI() {
      aU(0);
   }

   private static void dJ() {
      aU(1);
   }

   private static void dK() {
      aU(2);
   }

   private static void dL() {
      aU(3);
   }

   private static void dM() {
      aU(4);
   }

   private static void dN() {
      if (H) {
         a(9, 10, false);
         H = false;
      }

      m(false);
      l(false);
   }

   private static void l(boolean var0) {
      if (!F || var0) {
         a(9, 5, true);
         a(9, 6, false);
         b(9, 11, true);
         a(9, 12, true);
         b(9, 12, true);
         a(9, 13, true);
         a(9, 16, true);
         a(9, 17, true);
         a(9, 18, true);
         a(9, 19, true);
         a(9, 20, true);
         a(9, 23, true);
         a(9, 24, true);
         a(9, 27, true);
         a(9, 28, true);
         a(9, 29, true);
         a(9, 30, true);
         a(9, 31, true);
         a[9][11][10] = 1;
         a[9][11][18] = 1;
         a(9, 34, true);
         a(9, 35, true);
         a(9, 38, true);
         a(9, 39, true);
         a(9, 40, true);
         a(9, 41, true);
         a(9, 42, true);
         a(9, 45, true);
         a(9, 46, true);
         a(9, 49, true);
         a(9, 50, true);
         a(9, 51, true);
         a(9, 52, true);
         a(9, 53, true);
         a(9, 56, true);
         a(9, 57, true);
         a(9, 60, true);
         a(9, 61, true);
         a(9, 62, true);
         a(9, 63, true);
         a(9, 64, true);
         P(9);
         F = true;
         var0 = 0;

         for (int var1 = 0; var1 < es; var1++) {
            if (var0 < 4) {
               k(var1, F);
               var0++;
            }
         }
      }
   }

   private static void m(boolean var0) {
      if (G || var0) {
         b(9, 68, false);
         a(9, 69, false);
         b(9, 69, false);
         a(9, 70, false);
         a(9, 73, false);
         a(9, 81, false);
         a(9, 78, false);
         a(9, 84, false);
         b(9, 84, false);
         a(9, 85, false);
         a(9, 88, false);
         a(9, 96, false);
         a(9, 93, false);
         a(9, 99, false);
         b(9, 99, false);
         a(9, 100, false);
         a(9, 103, false);
         a(9, 111, false);
         a(9, 108, false);
         a(9, 114, false);
         b(9, 114, false);
         a(9, 115, false);
         a(9, 118, false);
         a(9, 126, false);
         a(9, 123, false);
         a(9, 129, false);
         b(9, 129, false);
         a(9, 130, false);
         a(9, 133, false);
         a(9, 141, false);
         a(9, 138, false);
         G = false;
      }
   }

   private static void dO() {
      X(56);
      q(es, 2);
      ag = 1;
   }

   private static void dP() {
      if (System.currentTimeMillis() / 1000L - a[ew][4] >= 86400L) {
         X(60);
         a(16);
      } else {
         X(55);
      }
   }

   private static void dQ() {
      gN();
      e(-1);
      ah();
      a(false, null);
      gP();
      b(false, null);
      e.d(100);
      bF = b();
      fE = ew + 1;
      a(g.a(8).a[ew][1], 1, 23, false);
      id();
      a(false, -1);
      X(60);
      c(false);
      q(36);
   }

   private static void dR() {
      if (System.currentTimeMillis() / 1000L - a[ew][1] >= 86400L) {
         X(60);
         a(15);
      } else {
         X(55);
      }
   }

   private static void dS() {
      if (e(eC)) {
         X(48);
         o(0);
      } else {
         X(55);
         if (eC > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(eC - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      }
   }

   private static void dT() {
      if (e(eF)) {
         X(48);
         o(1);
      } else {
         X(55);
         if (eF > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(eF - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            m = true;
            i = true;
            a(34);
         }
      }
   }

   private static void dU() {
      X(60);
      ae(ew);
      ig();
   }

   private static void dV() {
      X(60);
      if (eB >= e[ew][2] && eE >= e[ew][5]) {
         g var0 = g.a(24);
         g var1 = g.a(1);
         int var2 = d[ew][1] / d[25];
         int var3 = e[ew][2];
         int var4 = e[ew][5];
         int var5 = var1.a[e[ew][2] + e[ew][1]][11] * var3 + var1.a[e[ew][5] + e[ew][4]][11] * var4;
         j(ew, var5 / (var3 + var4) * var0.a[var2][6] / e());
         aV(0);
         aV(1);
         k(ey);
         g(ez);
         ae(ew);
         ig();
         a(756 + ew, a[17][25][5], a[17][25][6]);
      }
   }

   private static void dW() {
      X(56);
      ag = 1;
   }

   private static void dX() {
      switch (a()) {
         case 28:
            X(60);
            aJ = true;
            c(3, 2, true);
      }
   }

   private static void dY() {
      switch (a()) {
         case 28:
            a(new int[]{0, 4});
            G(0);
      }
   }

   private static void dZ() {
      switch (a()) {
         case 28:
            a(new int[]{3});
            G(1);
      }
   }

   private static void ea() {
      switch (a()) {
         case 28:
            a(new int[]{1, 2});
            G(2);
            if (K == 50) {
               f = true;
            }
      }
   }

   private static void eb() {
      switch (a()) {
         case 15:
            aL(E);
            return;
         case 16:
            aI(E);
            break;
         case 28:
            dp = 0 + do + E;
            ag = 1;
            if (K == 51) {
               f = true;
               return;
            }
      }
   }

   private static void ec() {
      switch (a()) {
         case 15:
            aL(1 + E);
            return;
         case 16:
            aI(1 + E);
         default:
            return;
         case 28:
            dp = 1 + do + E;
            ag = 1;
      }
   }

   private static void ed() {
      switch (a()) {
         case 15:
            aL(2 + E);
            return;
         case 16:
            aI(2 + E);
         default:
            return;
         case 28:
            dp = 2 + do + E;
            ag = 1;
      }
   }

   private static void ee() {
      switch (a()) {
         case 15:
            aL(3 + E);
            return;
         case 16:
            aI(3 + E);
         default:
            return;
         case 28:
            dp = 3 + do + E;
            ag = 1;
      }
   }

   private static void ef() {
      switch (a()) {
         case 15:
            aL(4);
            return;
         case 16:
            aI(4);
         default:
            return;
         case 28:
            dp = 4 + do;
            ag = 1;
      }
   }

   private static void eg() {
      switch (a()) {
         case 15:
            aL(5);
            return;
         case 16:
            aI(5);
         default:
            return;
         case 28:
            dp = 5 + do;
            ag = 1;
      }
   }

   private static void G(int var0) {
      dq = var0;

      for (int var1 = 6; var1 <= 8; var1++) {
         a(10, var1, false);
      }

      a(10, var0 + 6, true);
   }

   private static void eh() {
      X(56);
      ag = 1;
   }

   private static void ei() {
      x();
      hj();
      e[] var0 = new e[100];
      int var1 = e.a(0, 54, aU, aW, aV, aX, var0, 100);
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         var2 += var0[var3].e;
      }

      int var13 = e.e(0, 54);
      if (var2 > 0 && var13 + var2 > y()) {
         X(55);
         aS = true;
         ag = 1;
      } else {
         hj();
         var0 = new e[100];
         var1 = e.a(0, 52, aU, aW, aV, aX, var0, 100);
         var2 = e.a(0, 52);
         if (var1 > 0 && var2 + var1 > x()) {
            X(55);
            aT = true;
            ag = 1;
         } else if (!b((int)c(h))) {
            X(55);
            j = c(h);
            String var6;
            String var7 = (var6 = f.b(379)) == null ? "" : var6;
            String var10 = f.a(j - c(), L, " ");
            a = f.a(var7, "%d", var10);
            D = 18;
            m = true;
            i = false;
            a(34);
         } else {
            X(48);
            aR = true;
            q(true);
            hj();
            int[] var5 = new int[2];
            int[] var9 = new int[2];
            int[] var12 = new int[2];
            var9[0] = aU + aW >> 1;
            var9[1] = aV + aX >> 1;
            d(var9, var5);
            var12[0] = var5[0] * J / 100 - i.d();
            var12[1] = var5[1] * J / 100 - i.e();
            (e = new i(b[13], 0, 0)).b(2, 2);
            aT = 1;
            c.a(var5[0], var5[1], 1000);
            X(54);
            k(false);
            if (f(1, 41)) {
               as = true;
               a(1, 41, false);
               b(1, 41, false);
            } else {
               as = false;
            }

            if (f(1, 32)) {
               at = true;
               a(1, 32, false);
               b(1, 32, false);
               a(1, 33, false);
            } else {
               at = false;
            }

            f(false);
         }
      }
   }

   private static void ej() {
      if (!e(m(bc))) {
         X(55);
         j = m(bc);
         String var0;
         var0 = (var0 = f.b(381)) == null ? "" : var0;
         String var1 = f.a(j - d(), L, " ");
         a = f.a(var0, "%d", var1);
         D = 19;
         m = true;
         i = true;
         a(34);
      } else {
         X(48);
         b[r] = true;
         hf();
         P(11);
      }
   }

   private static void ek() {
      if (!e(m(bd))) {
         X(55);
         j = m(bd);
         String var0;
         var0 = (var0 = f.b(381)) == null ? "" : var0;
         String var1 = f.a(j - d(), L, " ");
         a = f.a(var0, "%d", var1);
         D = 19;
         m = true;
         i = true;
         a(34);
      } else {
         X(48);
         c[r] = true;
         hf();
         P(11);
      }
   }

   private static void el() {
      if (K == 36) {
         f = true;
      }

      if (e() == 50) {
         D = 5;
      }

      ag = 1;
      X(60);
   }

   private static boolean m(int var0) {
      return g(n(var0));
   }

   private static void H(int var0) {
      var0 = n(var0);

      for (int var1 = 0; var1 < h; var1++) {
         if (ca[var1] == var0) {
            fk = var1;
            fk = var1;
            ix();
            ep = 26;
            return;
         }
      }
   }

   private static void em() {
      X(56);
      ag = 1;
   }

   private static void en() {
      du = 0;
      if (O < 1) {
         if (m(O)) {
            if (h == 3) {
               a(30);
            } else {
               a(30);
               if (aN == 163 || aN == 161) {
                  aN = 164;
                  f = false;
                  e = false;
               }
            }
         } else {
            H(O);
         }
      } else {
         a(11);
      }

      X(60);
   }

   private static void eo() {
      du = 1;
      if (O < 2) {
         ew();
      } else {
         ek = 0;
         a(31);
      }

      X(60);
   }

   private static void ep() {
      du = 2;
      if (O < 3) {
         ew();
      } else {
         a(b[3], 1, 7, false);
         a(32);
      }

      X(60);
   }

   private static void eq() {
      if (O < 4) {
         du = 3;
         ew();
      } else {
         z(0);
      }
   }

   private static void er() {
      if (O < 5) {
         du = 4;
         ew();
      } else {
         z(1);
      }
   }

   private static void es() {
      if (O < 6) {
         du = 5;
         ew();
      } else {
         z(2);
      }
   }

   private static void et() {
      if (O < 7) {
         du = 6;
         ew();
      } else {
         z(3);
      }
   }

   private static void eu() {
      if (O < 8) {
         du = 7;
         ew();
      } else {
         z(4);
      }
   }

   private static void ev() {
      if (O < 9) {
         du = 8;
         ew();
      } else {
         z(5);
      }
   }

   private static void ew() {
      if (m(O)) {
         a(30);
         X(60);
      } else {
         H(O);
         X(55);
      }
   }

   private static void ex() {
      a(13, 44, false);
      a[13][44][5] = -1;
      a[13][7][10] = 1;
      int[] var0 = new int[]{0, 0, 14};
      e.a(47, 2, var0).a(620, 365, 10, 1000, false, 1);
      X(60);
   }

   private static void ey() {
      if (B(du)) {
         if (b(dt)) {
            X(48);
            a((short)2);
            if (p == 0L) {
               g var3 = g.a(3);
               int var4 = g(O + 1);
               q = var3.a[var4][21] * 60;
               dx = var3.a[var4][22];
               p = System.currentTimeMillis() / 1000L;
            }

            if (aN == 164 || aN == 161) {
               f = false;
               e = false;
               aN = 166;
            }

            a(14, 52, true);
            b(14, 52, true);
            O(14);
            return;
         }

         X(55);
         if (dt > 0) {
            String var0;
            var0 = (var0 = f.b(379)) == null ? "" : var0;
            String var1 = f.a(dt - c(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 18;
            i = false;
            m = true;
            a(34);
            return;
         }
      } else {
         X(55);
      }
   }

   private static void ez() {
      X(56);
      ag = 1;
   }

   private static void eA() {
      if (e(dv)) {
         X(48);
         q = 0L;
         p = 0L;
      } else {
         X(55);
         if (dv > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(dv - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            i = true;
            m = true;
            a(34);
         }
      }
   }

   private static void eB() {
      X(60);
      x(aP = !aP);
   }

   private static void eC() {
      aQ = true;
      p = 0L;
      hP();
      s(17);
   }

   private static void eD() {
      X(56);
      ag = 1;
   }

   private static void eE() {
      gO();
      hS();
   }

   private static void eF() {
      X(60);
      fL();
      fP();
   }

   private static void eG() {
      X(60);
      fL();
      fM();
   }

   private static void eH() {
      gO();
      String var0 = "http://www.gameloft.com/privacy-notice/";

      try {
         f.a(var0);
      } catch (Exception var1) {
      }
   }

   private static void eI() {
      X(60);
      aW(12);
      aY = !aY;
   }

   private static void eJ() {
      gM();
      a(44);
   }

   private static void eK() {
      X(60);

      try {
         Thread.sleep(500L);
      } catch (Exception var0) {
      }

      GloftGF2M.a.destroyApp(true);
   }

   private static void eL() {
      X(56);
      if (O) {
         a(15, 140, false);
         b(15, 140, false);
         a(15, 142, false);
         b(15, 142, false);
         O = false;
      }

      fK();
   }

   private static void eM() {
      if (b() && aw == 12) {
         gM();
      }

      X(56);
      fN();
      fK();
   }

   private static void eN() {
      X(60);
      fQ();
      if (!L) {
         L = true;
         a(15, 46, true);
         b(15, 46, true);
         a(15, 40, true);
         b(15, 40, true);
         a(15, 43, true);
         b(15, 43, true);
         P(15);
         n(false);
      }
   }

   private static void eO() {
      X(60);
      fQ();
      fO();
   }

   private static void eP() {
      X(63);
      if (--dM < 1) {
         dM = 17;
      }

      if (dM == 7 && --dM < 1) {
         dM = 17;
      }

      if (!h && dM == 11 && --dM < 1) {
         dM = 17;
      }

      hU();
   }

   private static void eQ() {
      X(63);
      if (++dM > 17) {
         dM = 1;
      }

      if (dM == 7 && ++dM > 17) {
         dM = 1;
      }

      if (!h && dM == 11 && ++dM > 17) {
         dM = 1;
      }

      hU();
   }

   private static void eR() {
      short var0 = a[15][59][6];
      if (dN <= dO / 2 - var0 / 2) {
         dN += 20;
      }
   }

   private static void eS() {
      if (dN >= -dO / 2) {
         dN -= 20;
      }
   }

   private static void eT() {
      X(56);
      if (K) {
         a(15, 48, false);
         b(15, 48, false);
         a(15, 52, false);
         b(15, 52, false);
         a(15, 53, false);
         b(15, 53, false);
         a(15, 51, false);
         a(15, 54, false);
         b(15, 54, false);
         a(15, 55, false);
         b(15, 55, false);
         K = false;
         f.n(10);
         n(true);
      }

      fP();
   }

   private static void eU() {
      if (b() && aw == 0) {
         gM();
      }

      X(56);
      fQ();
      fK();
   }

   private static void eV() {
      X(60);
      fL();
      fN();
      fQ();
      fR();
      ag = 1;
   }

   private static void eW() {
      X(56);
      if (L) {
         L = false;
         a(15, 46, false);
         b(15, 46, false);
         a(15, 40, false);
         b(15, 40, false);
         a(15, 43, false);
         b(15, 43, false);
         n(true);
      }

      fP();
   }

   private static void eX() {
      if (W) {
         W = false;
         gM();
      } else {
         W = true;
         X(0);
      }
   }

   private static void eY() {
      if (X) {
         X = false;
      } else {
         X = true;
         gN();

         try {
            Thread.sleep(200L);
         } catch (Exception var0) {
         }

         X(60);
      }
   }

   private static void eZ() {
      X(60);
      k(100);
   }

   private static void fa() {
      X(60);
      ak(0);
   }

   private static void fb() {
      X(60);
      bG++;
   }

   private static void fc() {
      X(60);
      bG = 0;
   }

   private static void fd() {
      X(60);
      h(1000);
   }

   private static void fe() {
      X(60);
      ai(0);
   }

   private static void ff() {
      X(60);
      g(100000);
   }

   private static void fg() {
      X(60);
      g(1000000);
   }

   private static void fh() {
      X(60);
      ah(0);
   }

   private static void fi() {
      X(56);
      fR();
      fK();
   }

   private static void fj() {
      X(60);
      aj(49);
      hq();
   }

   private static void fk() {
      X(60);
      hq();
   }

   private static void fl() {
      X(60);
      if (++dH >= 297) {
         dH = 0;
      }

      m = e(dH);
   }

   private static void fm() {
      X(60);
      if ((dH += 10) >= 297) {
         dH = 0;
      }

      m = e(dH);
   }

   private static void fn() {
      X(60);
      if (--dH < 0) {
         dH = 296;
      }

      m = e(dH);
   }

   private static void fo() {
      X(60);
      if ((dH -= 10) < 0) {
         dH = 296;
      }

      m = e(dH);
   }

   private static void fp() {
      X(60);

      for (int var0 = h - 1; var0 >= 0; var0--) {
         if (bZ[var0] >= 0) {
            fk = var0;
            l(var0, true);
            ba(var0);
         }
      }

      e(dH, 0, true);
      eD();
   }

   private static void fq() {
      X(60);
      o(dI << 2, dI);
   }

   private static void fr() {
      X(60);
      o((dI << 2) + 1, dI);
   }

   private static void fs() {
      X(60);
      o((dI << 2) + 2, dI);
   }

   private static void ft() {
      X(60);
      o((dI << 2) + 3, dI);
   }

   private static void fu() {
      X(60);
      if (dI < 14) {
         dI++;
      } else {
         dI = 0;
      }

      fS();
   }

   private static void fv() {
      X(60);
      if (dI > 0) {
         dI--;
      } else {
         dI = 14;
      }

      fS();
   }

   private static void fw() {
      X(60);
      c(false);
      aW(1);
   }

   private static void fx() {
      X(60);

      for (r = 1; r < 13; r++) {
         hj();
         q(true);
      }

      eD();
   }

   private static void fy() {
      X(60);
      O = 9;
      e.k();
   }

   private static void fz() {
      X(60);
      if (a[15][111][6] < 9) {
         a[15][111][6]++;
      } else {
         a[15][111][6] = 0;
      }

      e(15, 116, d[a[15][111][6]][1]);
   }

   private static void fA() {
      X(60);
      if (a[15][111][6] > 0) {
         a[15][111][6]--;
      } else {
         a[15][111][6] = 9;
      }

      e(15, 116, d[a[15][111][6]][1]);
   }

   private static void fB() {
      X(60);
      d[a[15][111][6]][1] = d[a[15][111][6]][1] + 100 < 0 ? 0 : (d[a[15][111][6]][1] + 100 > d[24] ? d[24] : d[a[15][111][6]][1] + 100);
      e(15, 116, d[a[15][111][6]][1]);
   }

   private static void fC() {
      X(60);
      d[a[15][111][6]][1] = d[a[15][111][6]][1] - 100 < 0 ? 0 : (d[a[15][111][6]][1] - 100 > d[24] ? d[24] : d[a[15][111][6]][1] - 100);
      e(15, 116, d[a[15][111][6]][1]);
   }

   private static void fD() {
      X(60);
      i(60);
   }

   private static void fE() {
      X(60);
      l(0, 10);
   }

   private static void fF() {
      X(60);
      l(1, 10);
   }

   private static void fG() {
      X(60);
      l(2, 10);
   }

   private static void fH() {
      X(60);
      l(3, 10);
   }

   private static void fI() {
      X(60);
      l(4, 10);
   }

   private static void fJ() {
      X(60);
      l(5, 10);
   }

   private static String e(int var0) {
      String var1 = "";
      if (var0 >= 0 && var0 < 297 && K[var0] != -1) {
         short var3;
         if (!f.j(q(var3 = K[var0]))) {
            bb(var3);
         }

         String var2;
         var1 = (var2 = f.b(K[var0])) == null ? "" : var2;
      }

      return var1;
   }

   private static void n(boolean var0) {
      a(15, 0, true);
      a(15, 145, true);
      if (var0) {
         a(15, 144, true);
         a(15, 150, true);
      } else {
         a(15, 144, false);
         a(15, 150, false);
      }
   }

   private static void fK() {
      if (!I) {
         n(true);
         int var0 = 0;
         String var1 = f.b();

         for (int var2 = 0; var2 < bc.length; var2++) {
            if ((bc[var2] != 64 || var1 != null && !var1.equals("0") && !var1.equals("")) && (bc[var2] != 839 || k.a())) {
               bb[var0] = bc[var2];
               var0++;
            }
         }

         j(0, var0, 5);

         for (int var3 = 0; var3 < fp; var3++) {
            if (bb[var3] == 839) {
               a[15][3 + (var3 << 1)][12] = 1;
               a[15][2 + (var3 << 1)][5] = 20;
               a[15][2 + (var3 << 1)][21] = 0;
               a[15][2 + (var3 << 1)][6] = 159;
            }

            a(15, 3 + (var3 << 1), true);
            a(15, 2 + (var3 << 1), true);
            b(15, 2 + (var3 << 1), true);
         }

         for (int var4 = fp; var4 < 5; var4++) {
            a(15, 2 + (var4 << 1), false);
            b(15, 2 + (var4 << 1), false);
         }

         a(15, 151, true);
         a(15, 14, true);
         b(15, 14, true);
         P(15);
         I = true;
         b();
      }
   }

   private static void fL() {
      if (I) {
         a(15, 147, false);
         b(15, 147, false);
         a(15, 2, false);
         b(15, 2, false);
         a(15, 3, false);
         a(15, 4, false);
         b(15, 4, false);
         a(15, 16, false);
         a(15, 6, false);
         b(15, 6, false);
         a(15, 8, false);
         b(15, 8, false);
         a(15, 152, false);
         b(15, 152, false);
         a(15, 14, false);
         b(15, 14, false);
         a(15, 10, false);
         b(15, 10, false);
         I = false;
      }
   }

   private static void fM() {
      if (!J) {
         J = true;
         f.a("/" + f.a(0), 11);
         n(true);
         hT();
         a(15, 18, true);
         b(15, 18, true);
         a(15, 20, true);
         b(15, 20, true);
         a(15, 22, true);
         P(15);
         b[0][9] = -40;
         R(0);
         b();
         X(12);
      }
   }

   private static void fN() {
      if (J) {
         a(15, 18, false);
         b(15, 18, false);
         a(15, 20, false);
         b(15, 20, false);
         a(15, 22, false);
         a[12] = null;
         J = false;
      }
   }

   private static void fO() {
      if (!K) {
         K = true;
         f.a("/" + f.a(0), 10);
         n(false);
         a(15, 48, true);
         b(15, 48, true);
         a(15, 52, true);
         a(15, 53, true);
         a(15, 151, true);
         a(15, 51, true);
         a(15, 54, true);
         b(15, 54, true);
         a(15, 55, true);
         b(15, 55, true);
         dM = 1;
         dN = 0;
         P(15);
         hU();
      }
   }

   private static void fP() {
      if (!M) {
         a(15, 24, true);
         b(15, 24, true);
         a(15, 28, true);
         b(15, 28, true);
         a(15, 12, true);
         b(15, 12, true);
         a(15, 30, false);
         b(15, 30, false);
         a(15, 151, true);
         b(15, 151, true);
         a(15, 34, true);
         b(15, 34, true);
         a(15, 26, true);
         b(15, 26, true);
         P(15);
         M = true;
      }
   }

   private static void fQ() {
      if (M) {
         a(15, 24, false);
         b(15, 24, false);
         a(15, 28, false);
         b(15, 28, false);
         a(15, 30, false);
         b(15, 30, false);
         a(15, 12, false);
         b(15, 12, false);
         a(15, 34, false);
         b(15, 34, false);
         a(15, 26, false);
         b(15, 26, false);
         a(15, 151, false);
         b(15, 151, false);
         M = false;
      }
   }

   private static void fR() {
      if (N) {
         a(15, 62, false);
         b(15, 62, false);
         a(15, 60, false);
         b(15, 60, false);
         a(15, 63, false);
         a(15, 64, false);
         a(15, 65, false);
         b(15, 65, false);
         a(15, 66, false);
         b(15, 66, false);
         a(15, 67, false);
         a(15, 68, false);
         b(15, 68, false);
         a(15, 70, false);
         a(15, 71, false);
         a(15, 72, false);
         b(15, 72, false);
         a(15, 73, false);
         a(15, 74, false);
         b(15, 74, false);
         a(15, 76, false);
         a(15, 77, false);
         a(15, 78, false);
         b(15, 78, false);
         a(15, 79, false);
         a(15, 80, false);
         b(15, 80, false);
         a(15, 82, false);
         a(15, 83, false);
         a(15, 84, false);
         b(15, 84, false);
         a(15, 85, false);
         a(15, 86, false);
         b(15, 86, false);
         a(15, 88, false);
         b(15, 88, false);
         a(15, 90, false);
         b(15, 90, false);
         a(15, 91, false);
         b(15, 91, false);
         a(15, 92, false);
         b(15, 92, false);
         a(15, 93, false);
         b(15, 93, false);
         a(15, 94, false);
         b(15, 94, false);
         a(15, 95, false);
         b(15, 95, false);
         a(15, 99, false);
         a(15, 100, false);
         a(15, 101, false);
         a(15, 102, false);
         a(15, 103, false);
         b(15, 103, false);
         a(15, 104, false);
         b(15, 104, false);
         a(15, 105, false);
         b(15, 105, false);
         a(15, 107, false);
         b(15, 107, false);
         a(15, 109, false);
         b(15, 109, false);
         a(15, 114, false);
         b(15, 114, false);
         a(15, 115, false);
         b(15, 115, false);
         a(15, 112, false);
         b(15, 112, false);
         a(15, 113, false);
         b(15, 113, false);
         a(15, 111, false);
         a(15, 116, false);
         a(15, 117, false);
         a(15, 118, false);
         a(15, 119, false);
         a(15, 120, false);

         for (int var0 = 121; var0 <= 138; var0++) {
            a(15, var0, false);
         }

         N = false;
      }
   }

   private static void fS() {
      int var0 = 107 + dI;
      a(1, var0, 1, 0, 24);
      f.c("/7");
      c(1, 3);
      f.k();
      a[15][99][5] = (short)var0;
      a[15][100][5] = (short)var0;
      a[15][101][5] = (short)var0;
      a[15][102][5] = (short)var0;
      P(15);
   }

   private static void fT() {
      X(56);
      ag = 1;
   }

   private static void fU() {
      if (a[16][63][6] == 48) {
         X(48);
         aP(1);
      } else {
         X(55);
      }
   }

   private static void fV() {
      if (a[16][69][6] == 48) {
         X(48);
         aP(2);
      } else {
         X(55);
      }
   }

   private static void fW() {
      if (a[16][75][6] == 48) {
         X(48);
         aP(3);
      } else {
         X(55);
      }
   }

   private static void fX() {
      if (a[16][81][6] == 48) {
         X(48);
         aP(4);
      } else {
         X(55);
      }
   }

   private static void fY() {
      if (a[16][87][6] == 48) {
         X(48);
         aP(5);
      } else {
         X(55);
      }
   }

   private static void fZ() {
      X(60);
      if (a[a] == 25) {
         it();
      }
   }

   private static void ga() {
      X(56);
      ag = 1;
   }

   private static void gb() {
      switch (a()) {
         case 15:
            aJ(33);
            return;
         case 16:
            aG(33);
      }
   }

   private static void gc() {
      switch (a()) {
         case 15:
            aJ(1);
            return;
         case 16:
            aG(1);
      }
   }

   private static void gd() {
      switch (a()) {
         case 15:
            aJ(32);
            return;
         case 16:
            aG(32);
      }
   }

   private static void ge() {
      switch (a()) {
         case 15:
            aL(0);
            return;
         case 16:
            aI(0);
      }
   }

   private static void gf() {
      switch (a()) {
         case 15:
            aL(1);
            return;
         case 16:
            aI(1);
      }
   }

   private static void gg() {
      switch (a()) {
         case 15:
            aL(2);
            return;
         case 16:
            aI(2);
      }
   }

   private static void gh() {
      switch (a()) {
         case 15:
            aL(3);
            return;
         case 16:
            aI(3);
      }
   }

   private static void gi() {
      switch (a()) {
         case 15:
            aL(4);
            return;
         case 16:
            aI(4);
      }
   }

   private static void gj() {
      X(56);
      ag = 1;
   }

   private static void gk() {
      X(60);
      c(3, 2, true);
   }

   private static void gl() {
      X(60);
      a(27);
   }

   private static void gm() {
      X(60);
      a(27);
   }

   private static void gn() {
      X(60);
      a(27);
   }

   private static void go() {
      X(60);
      a(27);
   }

   private static void gp() {
      X(60);
      a(27);
   }

   private static void gq() {
      X(60);
      a(27);
   }

   private static void gr() {
      X(60);
      ag = 1;
   }

   private static void gs() {
      if (s > t) {
         X(60);
         if (U(0)) {
            a(1, 1, 3, false);
         }
      } else {
         X(55);
         if (!f(24, 32)) {
            a(24, 32, true);
         } else {
            a(24, 32, false);
         }
      }
   }

   private static void gt() {
      if (e(fi)) {
         X(48);
         if (U(2)) {
            a(1, 1, 3, false);
         }
      } else {
         X(55);
         if (fi > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(fi - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            i = true;
            a(34);
            m = true;
         }
      }
   }

   private static void gu() {
      if (e(fh)) {
         X(48);
         if (U(1)) {
            a(1, 1, 3, false);
         }
      } else {
         X(55);
         if (fh > 0) {
            String var0;
            var0 = (var0 = f.b(381)) == null ? "" : var0;
            String var1 = f.a(fh - d(), L, " ");
            a = f.a(var0, "%d", var1);
            D = 19;
            i = true;
            a(34);
            m = true;
         }
      }
   }

   private static void gv() {
      X(56);
      ag = 1;
   }

   private static void gw() {
      if (e[el] == 1) {
         X(60);
         ag(el);
      } else {
         X(55);
      }
   }

   private static void gx() {
      if (e[el + 1] == 1) {
         X(60);
         ag(el + 1);
      } else {
         X(55);
      }
   }

   private static void gy() {
      if (e[el + 2] == 1) {
         X(60);
         ag(el + 2);
      } else {
         X(55);
      }
   }

   private static void gz() {
      if (e[el + 3] == 1) {
         X(60);
         ag(el + 3);
      } else {
         X(55);
      }
   }

   private static void gA() {
      if (e[el + 4] == 1) {
         X(60);
         ag(el + 4);
      } else {
         X(55);
      }
   }

   private static void gB() {
      ij();
      X(60);
      if (eG == 1) {
         try {
            Thread.sleep(500L);
            return;
         } catch (Exception var0) {
         }
      }
   }

   private static void gC() {
      X(56);
      ik();
   }

   private static void gD() {
      X(60);
      t = "";
      switch (eG) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         default:
            ag = 1;
            return;
         case 13:
            if (o() == 4) {
               ax = true;
            }

            ag = 1;
            return;
         case 15:
            ag = 1;
            return;
         case 16:
            ag = 1;
            return;
         case 17:
            ag = 1;
            return;
         case 18:
            ag = 1;
      }
   }

   private static void gE() {
      X(56);
      ik();
   }

   private static void gF() {
      X(56);
      ij();
   }

   private static void gG() {
      X(60);
      eU = eG;
      bq = true;
      ag = 1;
   }

   private static void I(int var0) {
      boolean var1 = true;
      switch (var0) {
         case 2:
            b(27, true);
            a(1, 0, 1, 0, 24);
            a(1, 122, 1, 0, 24);
            a(1, 20, 1, 0, 24);
            a(1, 19, 1, 0, 24);
            break;
         case 3:
         case 6:
         case 9:
         case 15:
         case 16:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 31:
         case 32:
         case 33:
         case 35:
         default:
            var1 = false;
            break;
         case 4:
         case 5:
            if (var0 == 4) {
               a(1, 0, 1, 0, 24);
               a(1, 122, 1, 0, 24);
               a(1, 49, 1, 0, 24);
               a(1, 20, 1, 0, 24);
            }

            a(1, 33, 1, 0, 24);
            break;
         case 7:
            a(1, 4, 1, 0, 24);
            break;
         case 8:
            a(1, 28, 1, 0, 24);
            break;
         case 10:
            a(1, 12, 1, 0, 24);
            break;
         case 11:
            a(1, 12, 1, 0, 24);
            a(1, 14, 1, 0, 24);
            a(1, 11, 1, 0, 24);
            break;
         case 12:
            a(1, 11, 1, 0, 24);
            break;
         case 13:
            a(1, 7, 1, 0, 24);
            break;
         case 14:
            a(1, 7, 1, 0, 24);
            a(1, 14, 1, 0, 24);
            a(1, 34, 1, 0, 24);
            break;
         case 25:
            a(1, 7, 1, 0, 24);
            a(1, 32, 1, 0, 24);
            a(1, 35, 1, 0, 24);
            a(1, 34, 1, 0, 24);
            break;
         case 26:
            a(1, 11, 1, 0, 24);
            break;
         case 27:
            a(1, 11, 1, 0, 24);
            a(1, 34, 1, 0, 24);
            break;
         case 28:
            a(1, 12, 1, 0, 24);
            a(1, 4, 1, 0, 24);
            break;
         case 29:
            a(1, 16, 1, 0, 24);
            a(1, 27, 1, 0, 24);
            a(1, 35, 1, 0, 24);
            a(1, 36, 1, 0, 24);
            break;
         case 30:
            a(1, 35, 1, 0, 24);
            a(1, 36, 1, 0, 24);
            break;
         case 34:
            a(1, 43, 1, 0, 24);
            a(1, 37, 1, 0, 24);
            a(1, 38, 1, 0, 24);
            break;
         case 36:
            a(1, 18, 1, 0, 24);
            a(1, 31, 1, 0, 24);
            a(1, 10, 1, 0, 24);
         case 17:
            a(1, 1, 1, 0, 24);
            a(1, 6, 1, 0, 24);
            a(1, 3, 1, 0, 24);
            a(1, 2, 1, 0, 24);
            a(1, 13, 1, 0, 24);
            a(1, 10, 1, 0, 24);
            a(1, 12, 1, 0, 24);
            a(1, 9, 1, 0, 24);
            a(1, 23, 1, 0, 24);
            a(1, 22, 1, 0, 24);
            a(1, 40, 1, 0, 24);
            a(1, 41, 1, 0, 24);
            a(1, 5, 1, 0, 24);
            a(1, 48, 1, 0, 24);
         case 37:
            break;
         case 38:
            a(1, 4, 1, 0, 24);
            a(1, 28, 1, 0, 24);
            a(1, 45, 1, 0, 24);
            break;
         case 39:
            a(1, 34, 1, 0, 24);
      }

      if (var1) {
         f.c("/7");
         c(1, 1);
         f.k();
      }

      switch (var0) {
         case 25:
            b = new i[7];

            for (int var4 = 0; var4 < 7; var4++) {
               b[var4] = new i(a[32], 0, 0);
            }
         default:
            return;
         case 29:
            c = new i[6];

            for (int var2 = 0; var2 < 6; var2++) {
               c[var2] = new i(a[36], 0, 0);
            }

            d = new i[3];

            for (int var3 = 0; var3 < 3; var3++) {
               d[var3] = new i(a[36], 0, 0);
            }

            b = new i(a[36], 0, 0);
      }
   }

   private static void J(int var0) {
      switch (var0) {
         case 2:
            char var37 = '\uffff';
            a(1, 19, var37, 1, 0);
         case 3:
         case 6:
         case 9:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 31:
         case 32:
         case 33:
         case 35:
         case 37:
         default:
            break;
         case 4:
         case 5:
            char var34 = '\uffff';
            a(1, 0, var34, 1, 0);
            var34 = '\uffff';
            a(1, 49, var34, 1, 0);
            var34 = '\uffff';
            a(1, 122, var34, 1, 0);
            V(0);
            break;
         case 7:
            char var33 = '\uffff';
            a(1, 4, var33, 1, 0);
            break;
         case 8:
            char var32 = '\uffff';
            a(1, 28, var32, 1, 0);
            break;
         case 10:
            char var31 = '\uffff';
            a(1, 12, var31, 1, 0);
            break;
         case 11:
            char var29 = '\uffff';
            a(1, 14, var29, 1, 0);
            var29 = '\uffff';
            a(1, 11, var29, 1, 0);
            break;
         case 12:
            char var28 = '\uffff';
            a(1, 11, var28, 1, 0);
            break;
         case 13:
            char var27 = '\uffff';
            a(1, 7, var27, 1, 0);
            break;
         case 14:
            char var26 = '\uffff';
            a(1, 7, var26, 1, 0);
            break;
         case 25:
            for (int var21 = 0; var21 < 7; var21++) {
               b[var21] = null;
            }

            char var22 = '\uffff';
            a(1, 7, var22, 1, 0);
            var22 = '\uffff';
            a(1, 32, var22, 1, 0);
            var22 = '\uffff';
            a(1, 35, var22, 1, 0);
            var22 = '\uffff';
            a(1, 34, var22, 1, 0);
            break;
         case 26:
            char var20 = '\uffff';
            a(1, 11, var20, 1, 0);
            break;
         case 27:
            char var18 = '\uffff';
            a(1, 34, var18, 1, 0);
            var18 = '\uffff';
            a(1, 11, var18, 1, 0);
            break;
         case 28:
            char var17 = '\uffff';
            a(1, 4, var17, 1, 0);
            break;
         case 29:
            for (int var11 = 0; var11 < 6; var11++) {
               c[var11] = null;
            }

            for (int var12 = 0; var12 < 3; var12++) {
               d[var12] = null;
            }

            b = null;
            char var13 = '\uffff';
            a(1, 16, var13, 1, 0);
            var13 = '\uffff';
            a(1, 27, var13, 1, 0);
            var13 = '\uffff';
            a(1, 35, var13, 1, 0);
            var13 = '\uffff';
            a(1, 36, var13, 1, 0);
            break;
         case 30:
            char var9 = '\uffff';
            a(1, 35, var9, 1, 0);
            var9 = '\uffff';
            a(1, 36, var9, 1, 0);
            break;
         case 34:
            char var6 = '\uffff';
            a(1, 43, var6, 1, 0);
            var6 = '\uffff';
            a(1, 37, var6, 1, 0);
            var6 = '\uffff';
            a(1, 38, var6, 1, 0);
            break;
         case 36:
            char var4 = '\uffff';
            a(1, 18, var4, 1, 0);
            var4 = '\uffff';
            a(1, 31, var4, 1, 0);
            break;
         case 38:
            char var2 = '\uffff';
            a(1, 4, var2, 1, 0);
            var2 = '\uffff';
            a(1, 28, var2, 1, 0);
            break;
         case 39:
            char var1 = '\uffff';
            a(1, 34, var1, 1, 0);
      }

      c(1, 2);
   }

   private static void b(int var0, boolean var1) {
      if (a[var0] != null) {
         K(var0);
      } else {
         f.c("/6");
         int var7;
         byte[] var8 = f.a(var7 = var0);
         int var2 = 0;
         int var4 = 0;

         while (var2 < var8.length) {
            var4++;
            int var3 = f.a(var8, var2) & 255;
            var2 += 8;
            byte var10001;
            switch (var3) {
               case 201:
                  var10001 = 9;
                  break;
               case 202:
                  var10001 = 10;
                  break;
               case 203:
                  var10001 = 14;
                  break;
               case 204:
                  var10001 = 19;
                  break;
               case 205:
                  var10001 = 23;
                  break;
               case 206:
                  var10001 = 12;
                  break;
               case 207:
                  var10001 = 13;
                  break;
               case 208:
                  var10001 = 1;
                  break;
               case 209:
                  var10001 = 7;
                  break;
               default:
                  var10001 = 0;
            }

            var2 += var10001;
         }

         var2 = 0;
         b[var7] = new short[var4][];
         a[var7] = new short[var4][];
         a[var7] = new String[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            int var110 = f.a(var8, var2) & 255;
            byte var129;
            switch (var110) {
               case 201:
                  var129 = 7;
                  break;
               case 202:
                  var129 = 8;
                  break;
               case 203:
                  var129 = 12;
                  break;
               case 204:
                  var129 = 14;
                  break;
               case 205:
                  var129 = 18;
                  break;
               case 206:
                  var129 = 10;
                  break;
               case 207:
                  var129 = 13;
                  break;
               case 208:
                  var129 = 1;
                  break;
               case 209:
                  var129 = 7;
                  break;
               default:
                  var129 = 0;
            }

            int var6 = 5 + var129;
            b[var7][var5] = new short[var6];
            switch (var110) {
               case 201:
                  short[] var119 = b[var7][var5];
                  int var102 = var2;
                  byte[] var128 = var8;
                  int var103 = a(var8, var102, var119);
                  var119[5] = f.a(var128, var103);
                  int var104 = var103 + 2;
                  var119[6] = f.a(var128, var104);
                  var2 = var104 + 2;
                  var119[7] = (short)(f.a(var128, var2) & 0xFF);
                  var119[8] = (short)(f.a(var128, ++var2) & 0xFF);
                  var119[9] = (short)(f.a(var128, ++var2) & 0xFF);
                  var119[10] = (short)(f.a(var128, ++var2) & 0xFF);
                  var119[11] = (short)(f.a(var128, ++var2) & 0xFF);
                  var2++;
                  break;
               case 202:
                  short[] var118 = b[var7][var5];
                  int var93 = var2;
                  byte[] var127 = var8;
                  int var94 = a(var8, var93, var118);
                  var118[5] = f.a(var127, var94);
                  int var95 = var94 + 2;
                  var118[6] = f.a(var127, var95);
                  var2 = var95 + 2;
                  var118[7] = (short)(f.a(var127, var2) & 0xFF);
                  var118[8] = (short)(f.a(var127, ++var2) & 0xFF);
                  var118[9] = (short)(f.a(var127, ++var2) & 0xFF);
                  var118[10] = (short)(f.a(var127, ++var2) & 0xFF);
                  var118[11] = (short)(f.a(var127, ++var2) & 0xFF);
                  var118[12] = (short)(f.a(var127, ++var2) & 0xFF);
                  var2++;
                  break;
               case 203:
                  short[] var117 = b[var7][var5];
                  int var80 = var2;
                  byte[] var126 = var8;
                  int var81 = a(var8, var80, var117);
                  var117[5] = f.a(var126, var81);
                  int var82 = var81 + 2;
                  var117[6] = f.a(var126, var82);
                  var2 = var82 + 2;
                  var117[7] = (short)(f.a(var126, var2) & 0xFF);
                  var117[8] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[9] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[10] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[11] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[12] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[13] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[14] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[15] = (short)(f.a(var126, ++var2) & 0xFF);
                  var117[16] = (short)(f.a(var126, ++var2) & 0xFF);
                  var2++;
                  break;
               case 204:
                  short[] var116 = b[var7][var5];
                  int var65 = var2;
                  byte[] var125 = var8;
                  int var66 = a(var8, var65, var116);
                  var116[5] = f.a(var125, var66);
                  int var67 = var66 + 2;
                  var116[6] = f.a(var125, var67);
                  int var68 = var67 + 2;
                  var116[7] = (short)(f.a(var125, var68) & 0xFF);
                  var116[8] = (short)(f.a(var125, ++var68) & 0xFF);
                  var116[9] = (short)(f.a(var125, ++var68) & 0xFF);
                  var116[10] = (short)(f.a(var125, ++var68) & 0xFF);
                  var116[11] = (short)(f.a(var125, ++var68) & 0xFF);
                  var116[12] = (short)(f.a(var125, ++var68) & 0xFF);
                  var116[13] = f.a(var125, ++var68);
                  int var75 = var68 + 2;
                  var116[14] = f.a(var125, var75);
                  int var76 = var75 + 2;
                  var116[15] = f.a(var125, var76);
                  var2 = var76 + 2;
                  var116[16] = (short)(f.a(var125, var2) & 0xFF);
                  var116[17] = (short)(f.a(var125, ++var2) & 0xFF);
                  var116[18] = (short)(f.a(var125, ++var2) & 0xFF);
                  var2++;
                  break;
               case 205:
                  short[] var115 = b[var7][var5];
                  int var46 = var2;
                  byte[] var124 = var8;
                  int var47 = a(var8, var46, var115);
                  var115[5] = (short)(f.a(var124, var47) & 0xFF);
                  var115[6] = (short)(f.a(var124, ++var47) & 0xFF);
                  var115[7] = (short)(f.a(var124, ++var47) & 0xFF);
                  var115[8] = (short)(f.a(var124, ++var47) & 0xFF);
                  var115[9] = (short)(f.a(var124, ++var47) & 0xFF);
                  var115[10] = (short)(f.a(var124, ++var47) & 0xFF);
                  var115[11] = (short)(f.a(var124, ++var47) & 0xFF);
                  var115[12] = (short)(f.a(var124, ++var47) & 0xFF);
                  var115[13] = f.a(var124, ++var47);
                  int var56 = var47 + 2;
                  var115[14] = f.a(var124, var56);
                  int var57 = var56 + 2;
                  var115[15] = f.a(var124, var57);
                  int var58 = var57 + 2;
                  var115[16] = f.a(var124, var58);
                  int var59 = var58 + 2;
                  var115[17] = f.a(var124, var59);
                  var2 = var59 + 2;
                  var115[18] = (short)(f.a(var124, var2) & 0xFF);
                  var115[19] = (short)(f.a(var124, ++var2) & 0xFF);
                  var115[20] = (short)(f.a(var124, ++var2) & 0xFF);
                  var115[21] = (short)(f.a(var124, ++var2) & 0xFF);
                  var115[22] = (short)(f.a(var124, ++var2) & 0xFF);
                  var2++;
                  break;
               case 206:
                  short[] var114 = b[var7][var5];
                  int var35 = var2;
                  byte[] var123 = var8;
                  int var36 = a(var8, var35, var114);
                  var114[5] = (short)(f.a(var123, var36) & 0xFF);
                  var114[6] = f.a(var123, ++var36);
                  int var38 = var36 + 2;
                  var114[7] = f.a(var123, var38);
                  var2 = var38 + 2;
                  var114[8] = (short)(f.a(var123, var2) & 0xFF);
                  var114[9] = (short)(f.a(var123, ++var2) & 0xFF);
                  var114[10] = (short)(f.a(var123, ++var2) & 0xFF);
                  var114[11] = (short)(f.a(var123, ++var2) & 0xFF);
                  var114[12] = (short)(f.a(var123, ++var2) & 0xFF);
                  var114[13] = (short)(f.a(var123, ++var2) & 0xFF);
                  var114[14] = (short)(f.a(var123, ++var2) & 0xFF);
                  var2++;
                  break;
               case 207:
                  short[] var113 = b[var7][var5];
                  int var21 = var2;
                  byte[] var122 = var8;
                  var2 = a(var8, var21, var113);
                  var113[5] = f.a(var122, var2);
                  var113[6] = f.a(var122, ++var2);
                  var113[7] = f.a(var122, ++var2);
                  var113[8] = f.a(var122, ++var2);
                  var113[9] = f.a(var122, ++var2);
                  var113[10] = f.a(var122, ++var2);
                  var113[11] = f.a(var122, ++var2);
                  var113[12] = f.a(var122, ++var2);
                  var113[13] = f.a(var122, ++var2);
                  var113[14] = f.a(var122, ++var2);
                  var113[15] = f.a(var122, ++var2);
                  var113[16] = f.a(var122, ++var2);
                  var113[17] = f.a(var122, ++var2);
                  var2++;
                  break;
               case 208:
                  short[] var112 = b[var7][var5];
                  int var19 = var2;
                  byte[] var121 = var8;
                  var2 = a(var8, var19, var112);
                  var112[5] = (short)(f.a(var121, var2) & 0xFF);
                  var2++;
                  break;
               case 209:
                  short[] var111 = b[var7][var5];
                  int var11 = var2;
                  byte[] var120 = var8;
                  var2 = a(var8, var11, var111);
                  var111[5] = (short)(f.a(var120, var2) & 0xFF);
                  var111[6] = (short)(f.a(var120, ++var2) & 0xFF);
                  var111[7] = (short)(f.a(var120, ++var2) & 0xFF);
                  var111[8] = (short)(f.a(var120, ++var2) & 0xFF);
                  var111[9] = (short)(f.a(var120, ++var2) & 0xFF);
                  var111[10] = (short)(f.a(var120, ++var2) & 0xFF);
                  var111[11] = (short)(f.a(var120, ++var2) & 0xFF);
                  var2++;
            }
         }

         f.k();
      }
   }

   private static void K(int var0) {
      if (a[var0] == null) {
         b(var0, true);
      } else {
         for (int var1 = b[var0].length - 1; var1 >= 0; var1--) {
            L(var0);
         }
      }
   }

   private static void L(int var0) {
      if (a[var0] == null) {
         b(var0, true);
      }
   }

   private static int a(byte[] var0, int var1, short[] var2) {
      var2[0] = (short)(f.a(var0, var1) & 0xFF);
      var2[1] = f.a(var0, ++var1);
      var1 += 2;
      var2[2] = f.a(var0, var1);
      var1 += 2;
      var2[3] = f.a(var0, var1);
      var1 += 2;
      var2[4] = (short)(f.a(var0, var1) & 0xFF);
      return var1 + 1;
   }

   private static void M(int var0) {
      for (int var1 = 0; var1 < a[var0].length; var1++) {
         int var3 = var1;
         if (a[var0][var3] != null) {
            short[] var10000 = a[var0][var3];
            int var4 = var3;
            short[] var14 = var10000;
            switch (var10000[0]) {
               case 201:
                  short[] var11 = var14;
                  short var16 = var14[2];
                  short var19 = var11[3];
                  short var21 = var11[5];
                  short var23 = var11[6];
                  if (var11[10] == 1) {
                     int var26 = var11[7] & 255;
                     int var27 = var11[8] & 255;
                     int var12 = var11[9] & 255;
                     int var25 = var26 << 16 | var27 << 8 | var12;
                     f.a.setColor(var25);
                     short var22 = var23;
                     short var20 = var21;
                     short var17 = var19;
                     short var13 = var16;
                     f.d(f.a, var13, var17, var20, var22);
                  }
                  break;
               case 202:
                  short[] var2 = var14;
                  if (var14[11] != 0) {
                     short var15 = var2[2];
                     short var18 = var2[3];
                     short var5 = var2[5];
                     short var6 = var2[6];
                     int var7 = var2[8] & 255;
                     int var8 = var2[9] & 255;
                     int var9 = var2[10] & 255;
                     int var10;
                     var7 = (var10 = var2[7] & 255) << 24 | var7 << 16 | var8 << 8 | var9;
                     if (var10 != 0) {
                        if (var10 == 255) {
                           f.a.setColor(var7);
                           f.c(f.a, var15, var18, var5, var6);
                        } else {
                           f.o(var7);
                           f.e(f.a, var15, var18, var5, var6);
                        }
                     }
                  }
               case 203:
               default:
                  break;
               case 204:
                  if (a[var0][var4] != null) {
                     if (a[var0][var4][12] == 2) {
                        b(a[var0][var4], var0, var4, 0, 0);
                     } else {
                        a(a[var0][var4], var0, var4, 0, 0);
                     }
                  }
                  break;
               case 205:
                  a(var0, var14, 0, 0, var4);
            }
         }
      }
   }

   private static void a(String var0, int var1, int var2, int var3, int var4) {
      short[] var10001 = a[var1][var2];
      int var25 = var4;
      var2 = var3;
      short[] var18 = var10001;
      var0 = var0;
      int var28 = var18[14];
      short var5 = var18[15];
      if (var18[16] == 1) {
         short var6 = var18[9];
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (var18[12] == 1) {
            var7 = f.a(f.a);
            var8 = f.b(f.a);
            var9 = f.c(f.a);
            var10 = f.d(f.a);
         }

         if (var18[12] == 1) {
            a[2][j(var18[7])].a(var0, null);
            if (d.d > var18[5]) {
               int var11 = au;
               if (au < 0) {
                  var11 = 0;
               }

               int var12;
               if ((var12 = var11 * 20 / 1000 % ((d.d << 1) + var18[5])) > d.d + var18[5]) {
                  var12 = -((d.d << 1) + var18[5] - var12);
               }

               var2 -= var12;
            }

            short var10000 = var18[2];
            short var46 = var18[3];
            short var50 = var18[5];
            short var14 = var18[6];
            short var13 = var50;
            short var36 = var46;
            short var30 = var10000;
            short var31 = var14;
            var14 = var13;
            f.b(f.a, var30, var36, var14, var31);
         }

         int var32 = 0;
         short var37;
         if ((var37 = var18[17]) >= 0 && var37 < 10 && b[var37] != null && (b[var37][12] & 8) != 0) {
            int var40 = b[var37][0] >> 16 & 65535;
            var37 = b[var37][0] & 65535;
            if (a[a[var40][var37][5]].h(a[var40][var37][6]) > 0) {
               int[] var33 = new int[4];
               a[a[var40][var37][5]].a(a[var40][var37][6], 0, var33, 0);
               int var45 = a[var40][var37][2] + var33[0];
               int var48 = a[var40][var37][3] + var33[1];
               int var51 = var33[2];
               int var43 = var33[3];
               var40 = var51;
               var37 = var48;
               var32 = var45;
               int var35 = var43;
               var43 = var40;
               f.b(f.a, var32, var37, var43, var35);
               var32 = 1;
            }
         }

         a(var0, var18[2] + var2 + var28, var18[3] + var25 + var5, var18[5], var18[6], var18[10], var6, var18[7], var18[8], false, false);
         if (var18[12] == 1) {
            var3 = var10;
            var2 = var9;
            var1 = var8;
            int var16 = var7;
            var28 = var3;
            var3 = var2;
            f.b(f.a, var16, var1, var3, var28);
         }

         if (var32) {
            var1 = f.U;
            int var17 = f.T;
            var2 = var1;
            var1 = var17;
            f.b(f.a, 0, 0, var1, var2);
         }
      }
   }

   static void a(String var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      var10 = 0;
      int var11 = 0;
      int var12 = 0;
      var7 = j(var7);
      switch (var5) {
         case 0:
            var10 = 16;
            var12 = var2;
            break;
         case 1:
            var10 = 2;
            var12 = var2 + (var4 >> 1);
            break;
         case 2:
            var10 = 32;
            var12 = var2 + var4;
      }

      switch (var6) {
         case 0:
            var10 |= 4;
            var11 = var1;
            break;
         case 1:
            var10 |= 1;
            var11 = var1 + (var3 >> 1);
            break;
         case 2:
            var10 |= 8;
            var11 = var1 + var3;
      }

      var1 = 0;
      if (a[2] != null) {
         if (a[2][var7] != null) {
            if (a[2] != null && a[2][var7] != null) {
               var1 = a[2][var7].f();
            }

            if (var8 >= 0) {
               a[2][var7].d(var8);
            }

            if (var9) {
               short[] var14 = a[2][var7].a(var0, var3, false);
               d var10000 = a[2][var7];
               byte var18 = var10;
               var5 = var12;
               var4 = var11;
               short[] var15 = var14;
               var10000.a(f.a, var0, var15, var4, var5, 0, -1, var18, -1, false);
            } else {
               a[2][var7].a(f.a, var0, var11, var12, var10);
               a[2][var7].d(var1);
            }
         }
      }
   }

   private static void b(String var0, int var1, int var2, int var3, int var4) {
      short[] var10001 = a[var1][var2];
      var3 = var4;
      short[] var15 = var10001;
      var0 = var0;
      if (var15[16] == 1) {
         int var25 = var15[9];
         var2 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (var15[12] == 2) {
            var2 = f.a(f.a);
            var5 = f.b(f.a);
            var6 = f.c(f.a);
            var7 = f.d(f.a);
         }

         if (var15[12] == 2) {
            c[j(var15[7])].a(var0, null);
            int var9 = c[j(var15[7])].a(var0, var15[5], false)[0];
            d var8 = c[j(var15[7])];
            int var10;
            if ((var10 = var9 * var8.e() + (var9 - 1) * var8.c()) > var15[6]) {
               var9 = 0;
               int var27 = 0;
               switch (var15[10]) {
                  case 0:
                     var9 = var10 + (var15[6] >> 1);
                     var27 = var10;
                     break;
                  case 1:
                     var9 = var10 + (var15[6] >> 1);
                     var27 = var10 + var15[6] >> 1;
                     break;
                  case 2:
                     var9 = var10 + var15[6];
                     var27 = var15[6];
               }

               var10 = au;
               if (au < 0) {
                  var10 = 0;
               }

               if ((var10 = var10 * 20 / 1000 % var9) > var27) {
                  var10 = -(var9 - var10);
               }

               var3 -= var10;
            }

            short var10000 = var15[2];
            short var49 = var15[3];
            short var10002 = var15[5];
            short var11 = var15[6];
            short var41 = var10002;
            short var35 = var49;
            short var28 = var10000;
            short var29 = var11;
            var11 = var41;
            f.b(f.a, var28, var35, var11, var29);
         }

         int var30 = 0;
         short var36;
         if ((var36 = var15[17]) >= 0 && var36 < 10 && b[var36] != null && (b[var36][12] & 8) != 0) {
            int var42 = b[var36][0] >> 16 & 65535;
            var36 = b[var36][0] & 65535;
            if (a[a[var42][var36][5]].h(a[var42][var36][6]) > 0) {
               int[] var31 = new int[4];
               a[a[var42][var36][5]].a(a[var42][var36][6], 0, var31, 0);
               int var47 = a[var42][var36][2] + var31[0];
               int var51 = a[var42][var36][3] + var31[1];
               int var53 = var31[2];
               int var45 = var31[3];
               var42 = var53;
               var36 = var51;
               var30 = var47;
               int var33 = var45;
               var45 = var42;
               f.b(f.a, var30, var36, var45, var33);
               var30 = 1;
            }
         }

         a(var0, var15[2], var15[3] + var3, var15[5], var15[6], var15[10], var25, var15[7], var15[8], true, false);
         if (var15[12] == 2) {
            var3 = var7;
            int var20 = var6;
            var1 = var5;
            int var13 = var2;
            var25 = var3;
            var3 = var20;
            f.b(f.a, var13, var1, var3, var25);
         }

         if (var30) {
            var1 = f.U;
            int var14 = f.T;
            var2 = var1;
            var1 = var14;
            f.b(f.a, 0, 0, var1, var2);
         }
      }
   }

   private static void f(int var0, int var1) {
      a(var0, a[var0][var1], 0, 0, var1);
   }

   private static void a(int var0, short[] var1, int var2, int var3, int var4) {
      short var5 = var1[5];
      short var6 = var1[6];
      int var27 = var1[7];
      int var31 = var1[17];
      if (var1[10] == 1) {
         if (var5 != -1) {
            d var7;
            if ((var7 = var5 < 1000 ? a[var5] : b[var5 - 1000]) != null) {
               int var8 = 0;
               int var9 = 0;
               boolean var10 = false;
               if (var1[9] == 1) {
                  if (var1[8] < 0 || var1[8] >= 255) {
                     return;
                  }

                  var8 = var7.f();
                  var7.d(var1[8]);
                  var10 = true;
               }

               if (var1[19] >= 0 && var1[19] < 10 && b[var1[19]] != null && (b[var1[19]][12] & 8) != 0) {
                  int var11 = b[var1[19]][0] >> 16 & 65535;
                  int var12 = b[var1[19]][0] & 65535;
                  if (a[b[var11][var12][5]].h(b[var11][var12][6]) > 0) {
                     int[] var41 = new int[4];
                     a[b[var11][var12][5]].a(b[var11][var12][6], 0, var41, 0);
                     int var10000 = b[var11][var12][2] + var41[0];
                     int var10001 = b[var11][var12][3] + var41[1];
                     int var10002 = var41[2];
                     int var13 = var41[3];
                     var12 = var10002;
                     var11 = var10001;
                     var9 = var10000;
                     int var43 = var13;
                     var13 = var12;
                     f.b(f.a, var9, var11, var13, var43);
                     var9 = 1;
                  }
               }

               if (var0 == 1 && (var4 >= 88 && var4 <= 90 || var4 >= 76 && var4 <= 81)) {
                  int var47 = 75;
                  if (var4 >= 88 && var4 <= 90) {
                     var47 = 84;
                  }

                  int var52 = a[1][var47][5];
                  int var44 = a[1][var47][6];
                  if (a[var52].h(var44) > 0) {
                     int[] var14 = new int[4];
                     a[var52].a(var44, 0, var14, 0);
                     int var55 = a[1][var47][2] + var14[0];
                     int var59 = a[1][var47][3] + var14[1];
                     int var63 = var14[2];
                     var47 = var14[3];
                     var44 = var63;
                     var4 = var59;
                     var0 = var55;
                     var52 = var47;
                     var47 = var44;
                     f.b(f.a, var0, var4, var47, var52);
                  }

                  var9 = 1;
               }

               if (var31 < 0) {
                  if (var6 > -1 && var6 < 255) {
                     if (var5 == 1 && var6 == 26) {
                        var7.a(f.a, var6, var1[2], var1[3], 0);
                        if (by > 0) {
                           int var50 = f.a.getColor();
                           var0 = -1201919;
                           f.a.setColor(var0);
                           int var62 = var1[2] + -15;
                           int var64 = var1[3] + -15;
                           var31 = 360 * by / bz;
                           f.a(f.a, var62, var64, 30, 30, 90, var31);
                           var0 = var50;
                           f.a.setColor(var0);
                        }
                     } else if (var1[21] != 0) {
                        short var60 = var1[2];
                        var27 = var1[3];
                        short var23 = var60;
                        short[] var16 = var1;
                        short var32 = var1[5];
                        short var37 = var16[6];
                        d var39 = a[var32];
                        if (a[var37] == null && !n(var37)) {
                           a(var16);
                        }

                        if (o(var37) && n(var37)) {
                           a(var16);
                        }

                        if (a[var37] != null || n(var37) && !o(var37)) {
                           d[var37] = (byte)(d[var37] | 1);
                           if (n(var37)) {
                              c(var37, var23, var27);
                              var39.a(f.a, var37, var23, var27, 0);
                           } else {
                              f.a(f.a, a[var37], var23, var27);
                           }
                        }
                     } else if (var1[22] != 0) {
                        short var61 = var1[2];
                        var27 = var1[3];
                        short var24 = var61;
                        short[] var17 = var1;
                        short var33 = var1[5];
                        short var38 = var17[6];
                        var5 = var17[22];
                        d var34;
                        if ((var0 = Math.max((var34 = var33 < 1000 ? a[var33] : b[var33 - 1000]).d(var38), var34.e(var38))) < var5) {
                           var34.a(f.a, var38, var24, var27, 0);
                        } else {
                           var0 = var5 * 100 / var0;
                           var34.c(f.a, var38, var24, var27, var0);
                        }
                     } else {
                        var7.a(f.a, var6, var1[2], var1[3], 0);
                     }
                  }
               } else if (a[var31] != null) {
                  if (var5 == 32) {
                     if (var27 == 3) {
                        b[0].a(var1[2], var1[3]);
                     } else if (var27 == 4) {
                        b[1].a(var1[2], var1[3]);
                     } else if (var27 == 5) {
                        b[2].a(var1[2], var1[3]);
                     }
                  } else {
                     a[var31].a(var1[2], var1[3]);
                     a[var31].b();
                  }
               }

               if (var10) {
                  var7.d(var8);
               }

               if (var9) {
                  int var25 = f.U;
                  var0 = f.T;
                  var27 = var25;
                  int var26 = var0;
                  f.b(f.a, 0, 0, var26, var27);
               }
            }
         }
      }
   }

   private static void c(int var0, int var1, int var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < j.length; var6++) {
         if (j[var6] == var0) {
            var3 = n[var6];
            var4 = o[var6];
            var5 = var6;
         }
      }

      if (k[var5] == 1) {
         var0 = 16316664;
         f.a.setColor(var0);
         if (l[var5] == 1) {
            var0 = 9222389;
            f.a.setColor(var0);
         }

         if (l[var5] == 2) {
            var0 = 4231416;
            f.a.setColor(var0);
         }

         if (l[var5] == 3) {
            var0 = 15955720;
            f.a.setColor(var0);
         }

         if (l[var5] == 4) {
            var0 = 10921894;
            f.a.setColor(var0);
         }

         if (l[var5] == 5) {
            var0 = 1419558;
            f.a.setColor(var0);
         }

         if (l[var5] == 6) {
            var0 = 12160035;
            f.a.setColor(var0);
         }

         if (l[var5] == 7) {
            var0 = 9091054;
            f.a.setColor(var0);
         }

         if (l[var5] == 8) {
            var0 = 3218743;
            f.a.setColor(var0);
         }

         if (l[var5] == 10) {
            var0 = 5282294;
            f.a.setColor(var0);
         }

         int var10000 = var1 + 3;
         int var10001 = var3 - 6;
         int var7 = var4;
         int var50 = var10001;
         var0 = var10000;
         f.c(f.a, var0, var2, var50, var7);
      }

      if (k[var5] == 2) {
         var0 = 12619808;
         f.a.setColor(var0);
         if (l[var5] == 2) {
            var0 = 4231416;
            f.a.setColor(var0);
         }

         if (l[var5] == 3) {
            var0 = 15955720;
            f.a.setColor(var0);
         }

         if (l[var5] == 7) {
            var0 = 9091054;
            f.a.setColor(var0);
         }

         int var67 = var1 + 3;
         int var51 = var3 - 6;
         var0 = var67;
         f.c(f.a, var0, var2, var51, 3);
         var67 = var2 + 3;
         int var57 = var4 - 6;
         var51 = var67;
         f.c(f.a, var1, var51, 3, var57);
         var67 = var2 + var4 - 3;
         int var8 = var3 - 7;
         var57 = var67;
         f.c(f.a, var0, var57, var8, 3);
         var67 = var1 + var3 - 3;
         var57 = var4 - 6;
         var0 = var67;
         f.c(f.a, var0, var51, 3, var57);
      }

      if (k[var5] == 0) {
         var0 = 16316664;
         f.a.setColor(var0);
         if (l[var5] == 1) {
            var0 = 9222389;
            f.a.setColor(var0);
         }

         if (l[var5] == 2) {
            var0 = 4231416;
            f.a.setColor(var0);
         }

         if (l[var5] == 3) {
            var0 = 15955720;
            f.a.setColor(var0);
         }

         if (l[var5] == 4) {
            var0 = 10921894;
            f.a.setColor(var0);
         }

         if (l[var5] == 5) {
            var0 = 1419558;
            f.a.setColor(var0);
         }

         if (l[var5] == 6) {
            var0 = 12160035;
            f.a.setColor(var0);
         }

         if (l[var5] == 8) {
            var0 = 3218743;
            f.a.setColor(var0);
         }

         if (l[var5] == 9) {
            var0 = 14211280;
            f.a.setColor(var0);
         }

         int var71 = var1 + 2;
         int var78 = var2 + 2;
         int var10002 = var3 - 4;
         int var65 = var4 - 4;
         int var60 = var10002;
         int var53 = var78;
         var0 = var71;
         f.c(f.a, var0, var53, var60, var65);
         var0 = 12619808;
         f.a.setColor(var0);
         if (m[var5] == 1) {
            var0 = 8173541;
            f.a.setColor(var0);
         }

         if (m[var5] == 2) {
            var0 = 12107984;
            f.a.setColor(var0);
         }

         if (m[var5] == 3) {
            var0 = 16316664;
            f.a.setColor(var0);
         }

         if (m[var5] == 4) {
            var0 = 3218743;
            f.a.setColor(var0);
         }

         if (m[var5] == 5) {
            var0 = 1419558;
            f.a.setColor(var0);
         }

         var71 = var1 + 3;
         var53 = var3 - 6;
         var0 = var71;
         f.c(f.a, var0, var2, var53, 2);
         var71 = var2 + 4;
         var60 = var4 - 8;
         var53 = var71;
         f.c(f.a, var1, var53, 2, var60);
         var71 = var2 + var4 - 3;
         var65 = var3 - 6;
         var60 = var71;
         f.c(f.a, var0, var60, var65, 2);
         var71 = var1 + var3 - 2;
         var60 = var4 - 8;
         var0 = var71;
         f.c(f.a, var0, var53, 2, var60);
         if (m[var5] == 0) {
            var0 = 5715752;
            f.a.setColor(var0);
            var71 = var1 + 4;
            var78 = var2 + var4 - 1;
            var60 = var3 - 7;
            var53 = var78;
            var0 = var71;
            f.c(f.a, var0, var53, var60, 1);
         }

         if (m[var5] == 1) {
            var0 = 4625144;
            f.a.setColor(var0);
            var71 = var1 + 4;
            var78 = var2 + var4 - 1;
            var2 = var3 - 7;
            var1 = var78;
            var0 = var71;
            f.c(f.a, var0, var1, var2, 1);
         }
      }
   }

   private static boolean n(int var0) {
      for (int var1 = 0; var1 < j.length; var1++) {
         if (var0 == j[var1]) {
            return true;
         }
      }

      return false;
   }

   private static boolean o(int var0) {
      for (int var1 = 0; var1 < j.length; var1++) {
         if (j[var1] == var0 && n[var1] == -1) {
            return true;
         }
      }

      return false;
   }

   private static void N(int var0) {
      for (int var1 = 0; var1 < j.length; var1++) {
         if (j[var1] == var0) {
            n[var1] = -1;
         }
      }
   }

   private static void a(short[] var0) {
      short var1 = var0[5];
      short var2 = var0[6];
      d var26 = a[var1];
      int var3 = Integer.MIN_VALUE;
      int var4 = Integer.MIN_VALUE;
      int var7 = 0;
      int var8 = 0;
      short var9 = var26.a[var2];
      int var10 = var26.i(var2);

      for (int var11 = 0; var11 < var10; var11++) {
         int var5 = var26.b(var9 + var11);
         int var6 = var26.c(var9 + var11);
         var8 = var26.b(var2, var11);
         var7 = var26.a[var8] & 255;
         int var12 = var26.b(var2, var11);
         var8 = var26.b[var12] & 255;
         if (var3 < var5 + var7) {
            var3 = var5 + var7;
         }

         if (var4 < var6 + var8) {
            var4 = var6 + var8;
         }
      }

      int var34 = var3;
      int var35 = var4;
      int[] var13 = new int[var34 * var35];
      int var14 = 0;
      if (var0[21] == 1) {
         var14 = var10 - 1;
      } else if (var0[21] == 2) {
         var14 = 4;
      }

      for (int var15 = 0; var15 < var14; var15++) {
         int var27 = var26.b(var9 + var15);
         int var29 = var26.c(var9 + var15);
         int var31 = var26.b(var2, var15);
         var7 = var26.a[var31] & 255;
         int var33 = var26.b(var2, var15);
         var8 = var26.b[var33] & 255;
         int var24 = var26.c(var2, var15);
         int[] var16 = new int[var7 * var8];
         if (var26.c != null) {
            var16 = (int[])var26.a(var26.b(var2, var15));
         } else {
            var26.a[0][var26.b(var2, var15)].a(var16, 0, var7, 0, 0, var7, var8);
         }

         for (int var17 = 0; var17 < var8; var17++) {
            for (int var18 = 0; var18 < var7; var18++) {
               int var19 = var18;
               int var20 = var17;
               if ((var24 & 1) != 0) {
                  var19 = var7 - var18 - 1;
               }

               if ((var24 & 2) != 0) {
                  var20 = var8 - var17 - 1;
               }

               if (var27 + var18 + (var29 + var17) * var34 < var34 * var35 && var19 + var20 * var7 < var8 * var7) {
                  var13[var27 + var18 + (var29 + var17) * var34] = var16[var19 + var20 * var7];
               }
            }
         }
      }

      for (int var43 = var14; var43 < var10; var43++) {
         int var28 = var26.b(var9 + var43);
         int var30 = var26.c(var9 + var43);
         var14 = var26.b(var2, var43);
         int var41 = var26.a[var14] & 255;
         var14 = var26.b(var2, var43);
         int var42 = var26.b[var14] & 255;
         int var25 = var26.c(var2, var43);
         int var39;
         if (var41 == 1) {
            if (var28 < var3 >> 1) {
               var39 = var3 - (var28 << 1);
            } else {
               var39 = var7;
            }
         } else {
            var39 = var41;
         }

         int var40;
         if (var42 == 1) {
            if (var30 < var4 >> 1) {
               var40 = var4 - (var30 << 1);
            } else {
               var40 = var8;
            }
         } else {
            var40 = var42;
         }

         int[] var45 = new int[var41 * var42];
         if (var26.c != null) {
            var45 = (int[])var26.a(var26.b(var2, var43));
         } else {
            var26.a[0][var26.b(var2, var43)].a(var45, 0, var41, 0, 0, var41, var42);
         }

         for (int var38 = 0; var38 < var40; var38++) {
            for (int var21 = 0; var21 < var39; var21++) {
               int var22 = var21;
               int var23 = var38;
               if (var41 == 1) {
                  var22 = 0;
               } else if ((var25 & 1) != 0) {
                  var22 = var41 - var22 - 1;
               }

               if (var42 == 1) {
                  var23 = 0;
               } else if ((var25 & 2) != 0) {
                  var23 = var42 - var23 - 1;
               }

               if (var28 + var21 + (var30 + var38) * var34 < var34 * var35 && var22 + var23 * var41 < var42 * var41) {
                  var13[var28 + var21 + (var30 + var38) * var34] = var45[var22 + var23 * var41];
               }
            }
         }
      }

      if (n(var2)) {
         for (int var44 = 0; var44 < j.length; var44++) {
            if (j[var44] == var2) {
               n[var44] = var34;
               o[var44] = var35;
            }
         }
      } else {
         a[var2] = j.a(var13, var34, var35);
      }
   }

   private static void a(int var0, int var1, int var2, int var3) {
      short var10 = a[1][var1][5];
      short var12 = a[1][var1][6];
      int var13 = a[1][var2][6];
      d var11 = var10 < 1000 ? a[var10] : b[var10 - 1000];
      int var4 = Integer.MIN_VALUE;
      short var5 = var11.a[var13];
      int var6 = var11.i(var13);
      short var7 = var11.a[var12];
      int var8 = var11.i(var12);

      for (int var9 = 0; var9 < var6; var9++) {
         var13 = var11.b(var5 + var9);
         if (var4 < var13) {
            var4 = var13;
         }
      }

      if (var8 >= 2) {
         int var15 = var4 * var3 / 100;
         var11.a(var7 + var8 - 2, var15);
      }

      a[var12] = null;
      N(var12);
   }

   private static void b(int var0, int var1, int var2, int var3) {
      short var9 = a[4][var1][5];
      short var11 = a[4][var1][6];
      d var10;
      short var4 = (var10 = var9 < 1000 ? a[var9] : b[var9 - 1000]).a[var11];
      int var5 = var10.i(var11);
      int var7 = var10.b(var11, 0);
      int var6 = var10.a[var7] & 255;
      int var8 = var10.b(var11, 0);
      var7 = var10.b[var8] & 255;

      for (int var13 = 4; var13 < var5; var13++) {
         if (var10.b(var4 + var13) == var10.b(var4 + 1)) {
            var10.a(var4 + var13, var2 - var6);
         } else if (var10.c(var4 + var13) == var10.c(var4 + 2)) {
            var10.b(var4 + var13, var3 - var7);
         }
      }

      var10.a(var4 + 1, var2 - var6);
      var10.b(var4 + 2, var3 - var7);
      var10.a(var4 + 3, var2 - var6);
      var10.b(var4 + 3, var3 - var7);
      a[var11] = null;
      N(var11);
   }

   private static void O(int var0) {
      bn = var0;

      for (int var1 = 0; var1 < a[var0].length; var1++) {
         if (a[var0][var1][0] == 205 && a[var0][var1][5] > -1 && a[var0][var1][18] == 1 && a[var0][var1][10] == 1) {
            short var2 = a[var0][var1][5];
            short var3 = a[var0][var1][6];
            d var7;
            if ((var7 = var2 < 1000 ? a[var2] : b[var2 - 1000]) == null) {
               break;
            }

            int var4;
            if ((var4 = var7.h(var3)) > 0) {
               int[] var5 = new int[4];

               for (int var6 = 0; var6 < var4; var6++) {
                  var7.a(var3, var6, var5, 0);
               }
            }
         }
      }
   }

   private static void P(int var0) {
      bn = var0;
      O(var0);
      int var8;
      bn = var8 = var0;

      for (int var1 = 0; var1 < 10; var1++) {
         if (b[var1] != null) {
            b[var1] = null;
         }
      }

      for (int var9 = 0; var9 < a[var8].length; var9++) {
         short var2 = -1;
         if (a[var8][var9][0] == 205) {
            var2 = a[var8][var9][19];
         } else if (a[var8][var9][0] == 204) {
            var2 = a[var8][var9][17];
         }

         if (var2 >= 0 && var2 < 10) {
            if (b[var2] == null) {
               b[var2] = new int[13];
               b[var2][0] = var8 << 16 | var9 & 65535;
               b[var2][1] = var8 << 16 | var9 & 65535;
               b[var2][2] = -1;
               b[var2][3] = -1;
               b[var2][4] = Integer.MAX_VALUE;
               b[var2][5] = Integer.MAX_VALUE;
               b[var2][6] = Integer.MIN_VALUE;
               b[var2][7] = Integer.MIN_VALUE;
               b[var2][8] = 0;
               b[var2][9] = 0;
               b[var2][10] = 0;
               b[var2][11] = 0;
               b[var2][12] = 8;
            } else {
               b[var2][1] = var8 << 16 | var9 & 65535;
               if (f(var8, var9)) {
                  int var3 = 0;
                  int var4 = 0;
                  int var5 = 0;
                  int var6 = 0;
                  if (a[var8][var9][0] == 205) {
                     short var10 = a[var8][var9][5];
                     short var12 = a[var8][var9][6];
                     d var7;
                     if ((var7 = (var10 = var10) < 1000 ? a[var10] : b[var10 - 1000]) == null || a[var8][var9][6] < 0) {
                        continue;
                     }

                     var3 = var7.f(var12);
                     var4 = var7.g(var12);
                     var5 = var7.d(var12);
                     var6 = var7.e(var12);
                     if (a[var8][var9][22] != 0) {
                        if (var5 > a[var8][var9][22]) {
                           int var13 = var5 - a[var8][var9][22];
                           var3 += var13 >> 1;
                           var5 = a[var8][var9][22];
                        }

                        if (var6 > a[var8][var9][22]) {
                           int var14 = var6 - a[var8][var9][22];
                           var4 += var14 >> 1;
                           var6 = a[var8][var9][22];
                        }
                     }
                  } else if (a[var8][var9][0] == 204) {
                     var5 = a[var8][var9][5];
                     var6 = a[var8][var9][6];
                  }

                  if (b[var2][4] > a[var8][var9][2] + var3) {
                     b[var2][4] = a[var8][var9][2] + var3;
                  }

                  if (b[var2][6] < a[var8][var9][2] + var3 + var5) {
                     b[var2][6] = a[var8][var9][2] + var3 + var5 + 10;
                  }

                  if (b[var2][5] > a[var8][var9][3] + var4) {
                     b[var2][5] = a[var8][var9][3] + var4;
                  }

                  if (b[var2][7] < a[var8][var9][3] + var4 + var6) {
                     b[var2][7] = a[var8][var9][3] + var4 + var6 + 10;
                  }
               }
            }
         }
      }
   }

   private static void a(int var0, int var1, boolean var2) {
      if (a[var0] != null) {
         if (a[var0][var1][0] == 205) {
            a[var0][var1][10] = (short)(var2 ? 1 : 0);
            if (var2 && a[var0][var1][7] > -1 && a[var0][var1][7] < 30) {
               c(var0, var1, a[var0][var1][7], -1);
               return;
            }

            if (!var2 && a[var0][var1][17] > -1 && a[var0][var1][17] < 30) {
               i(var0, var1);
               return;
            }
         } else {
            if (a[var0][var1][0] == 204) {
               a[var0][var1][16] = (short)(var2 ? 1 : 0);
               return;
            }

            if (a[var0][var1][0] == 202) {
               a[var0][var1][11] = (short)(var2 ? 1 : 0);
            }
         }
      }
   }

   private static boolean f(int var0, int var1) {
      boolean var2 = false;
      if (a[var0][var1][0] == 205) {
         var2 = a[var0][var1][10] != 0;
      } else if (a[var0][var1][0] == 204) {
         var2 = a[var0][var1][16] != 0;
      } else if (a[var0][var1][0] == 202) {
         var2 = a[var0][var1][11] != 0;
      }

      return var2;
   }

   private static void b(int var0, int var1, boolean var2) {
      if (a[var0] != null) {
         if (a[var0][var1][0] == 205) {
            a[var0][var1][18] = (short)(var2 ? 1 : 0);
         }
      }
   }

   private static boolean g(int var0, int var1) {
      return a[var0][var1][0] == 205 && a[var0][var1][18] != 0;
   }

   private static void Q(int var0) {
      switch (var0 >> 16 & 65535) {
         case 0:
            return;
         case 1:
            switch (var0) {
               case 65539:
                  N();
                  return;
               case 65550:
                  J();
                  return;
               case 65556:
                  K();
                  return;
               case 65568:
                  O();
                  return;
               case 65570:
                  return;
               case 65573:
                  G();
                  return;
               case 65577:
                  H();
                  return;
               case 65579:
                  B();
                  return;
               case 65580:
                  C();
                  return;
               case 65581:
                  D();
                  return;
               case 65582:
                  E();
                  return;
               case 65588:
                  A();
                  return;
               case 65589:
                  aa();
                  return;
               case 65603:
                  F();
                  return;
               case 65604:
                  I();
                  return;
               case 65606:
                  L();
                  return;
               case 65607:
                  M();
                  return;
               case 65612:
                  U();
                  return;
               case 65613:
                  V();
                  return;
               case 65614:
                  W();
                  return;
               case 65615:
                  X();
                  return;
               case 65616:
                  Y();
                  return;
               case 65617:
                  Z();
                  return;
               case 65624:
                  Q();
                  return;
               case 65625:
                  P();
                  return;
               case 65626:
                  R();
                  return;
               case 65628:
                  S();
                  return;
               case 65629:
                  T();
                  return;
               case 65630:
                  ab();
                  return;
               case 65639:
                  ac();
                  return;
               case 65644:
                  ad();
                  return;
               case 65646:
                  ae();
               case 65540:
               case 65541:
               case 65542:
               case 65543:
               case 65544:
               case 65545:
               case 65546:
               case 65547:
               case 65548:
               case 65549:
               case 65551:
               case 65552:
               case 65553:
               case 65554:
               case 65555:
               case 65557:
               case 65558:
               case 65559:
               case 65560:
               case 65561:
               case 65562:
               case 65563:
               case 65564:
               case 65565:
               case 65566:
               case 65567:
               case 65569:
               case 65571:
               case 65572:
               case 65574:
               case 65575:
               case 65576:
               case 65578:
               case 65583:
               case 65584:
               case 65585:
               case 65586:
               case 65587:
               case 65590:
               case 65591:
               case 65592:
               case 65593:
               case 65594:
               case 65595:
               case 65596:
               case 65597:
               case 65598:
               case 65599:
               case 65600:
               case 65601:
               case 65602:
               case 65605:
               case 65608:
               case 65609:
               case 65610:
               case 65611:
               case 65618:
               case 65619:
               case 65620:
               case 65621:
               case 65622:
               case 65623:
               case 65627:
               case 65631:
               case 65632:
               case 65633:
               case 65634:
               case 65635:
               case 65636:
               case 65637:
               case 65638:
               case 65640:
               case 65641:
               case 65642:
               case 65643:
               case 65645:
               default:
                  return;
            }
         case 2:
            switch (var0) {
               case 131076:
                  ak();
                  return;
               case 131081:
                  al();
                  return;
               case 131083:
                  ay();
                  return;
               case 131086:
                  az();
                  return;
               case 131087:
                  aA();
                  return;
               case 131088:
                  aB();
                  return;
               case 131089:
                  aC();
               default:
                  return;
               case 131105:
                  am();
                  return;
               case 131118:
                  as();
                  return;
               case 131119:
                  an();
                  return;
               case 131132:
                  at();
                  return;
               case 131133:
                  ao();
                  return;
               case 131146:
                  au();
                  return;
               case 131147:
                  ap();
                  return;
               case 131160:
                  av();
                  return;
               case 131161:
                  aq();
                  return;
               case 131174:
                  aw();
                  return;
               case 131175:
                  ar();
                  return;
               case 131188:
                  ax();
                  return;
               case 131194:
                  aj();
                  return;
            }
         case 3:
            switch (var0) {
               case 196610:
                  aE();
                  return;
               case 196613:
                  aF();
                  return;
               case 196618:
                  aG();
                  return;
               case 196629:
                  aH();
                  return;
               case 196640:
                  aI();
                  return;
               case 196651:
                  aJ();
                  return;
               case 196662:
                  aK();
                  return;
               case 196673:
                  aL();
                  return;
               case 196684:
                  aM();
                  return;
               case 196695:
                  aN();
                  return;
               case 196706:
                  aO();
                  return;
               case 196717:
                  aP();
                  return;
               case 196728:
                  aQ();
                  return;
               case 196739:
                  aR();
                  return;
               case 196750:
                  aS();
                  return;
               case 196761:
                  aT();
                  return;
               case 196772:
                  aU();
                  return;
               case 196804:
                  aV();
                  return;
               case 196807:
                  aW();
               default:
                  return;
               case 196809:
                  aZ();
                  return;
               case 196810:
                  aX();
                  return;
               case 196812:
                  aY();
                  return;
               case 196818:
                  aD();
                  return;
            }
         case 4:
            switch (var0) {
               case 262148:
                  be();
               default:
                  return;
               case 262156:
                  bd();
                  return;
               case 262160:
                  ba();
                  return;
               case 262161:
                  bb();
                  return;
               case 262180:
                  bc();
                  return;
            }
         case 5:
            switch (var0) {
               case 327685:
                  bl();
                  return;
               case 327691:
                  bh();
                  return;
               case 327694:
                  bm();
                  return;
               case 327700:
                  bi();
                  return;
               case 327703:
                  bn();
               default:
                  return;
               case 327709:
                  bj();
                  return;
               case 327737:
                  bk();
                  return;
               case 327741:
                  bg();
                  return;
            }
         case 6:
            switch (var0) {
               case 393226:
                  br();
                  return;
               case 393231:
                  bs();
                  return;
               case 393250:
                  bq();
                  return;
               case 393255:
                  bp();
                  return;
               case 393258:
                  bt();
               default:
                  return;
            }
         case 7:
            switch (var0) {
               case 458765:
                  by();
                  return;
               case 458770:
                  bz();
                  return;
               case 458774:
                  bx();
                  return;
               case 458781:
                  bA();
                  return;
               case 458782:
                  bB();
                  return;
               case 458792:
                  bw();
                  return;
               case 458796:
                  bv();
                  return;
               case 458800:
                  bu();
                  return;
               case 458805:
                  bC();
               default:
                  return;
            }
         case 8:
            switch (var0) {
               case 524299:
                  cC();
                  return;
               case 524302:
                  cB();
                  return;
               case 524315:
                  cv();
                  return;
               case 524330:
                  cw();
                  return;
               case 524345:
                  cx();
                  return;
               case 524360:
                  cy();
                  return;
               case 524375:
                  cz();
                  return;
               case 524390:
                  cA();
                  return;
               case 524401:
                  cu();
                  return;
               case 524408:
                  cD();
                  return;
               case 524414:
                  cE();
                  return;
               case 524420:
                  cF();
                  return;
               case 524426:
                  cG();
                  return;
               case 524432:
                  cH();
                  return;
               case 524438:
                  cI();
                  return;
               case 524452:
                  cK();
                  return;
               case 524454:
                  cJ();
                  return;
               case 524456:
                  cM();
                  return;
               case 524458:
                  cN();
                  return;
               case 524460:
                  cO();
                  return;
               case 524462:
                  cP();
                  return;
               case 524464:
                  cQ();
                  return;
               case 524466:
                  cR();
                  return;
               case 524468:
                  cS();
                  return;
               case 524470:
                  cT();
                  return;
               case 524472:
                  cU();
                  return;
               case 524474:
                  cL();
                  return;
               case 524476:
                  cV();
                  return;
               case 524478:
                  cW();
                  return;
               case 524480:
                  cX();
                  return;
               case 524482:
                  cY();
                  return;
               case 524484:
                  cZ();
                  return;
               case 524490:
                  da();
                  return;
               case 524496:
                  cs();
                  return;
               case 524498:
                  ct();
                  return;
               case 524501:
                  db();
               default:
                  return;
            }
         case 9:
            switch (var0) {
               case 589827:
                  dN();
               default:
                  return;
               case 589836:
                  dI();
                  return;
               case 589838:
                  dy();
                  return;
               case 589839:
                  dD();
                  return;
               case 589847:
                  dJ();
                  return;
               case 589849:
                  dz();
                  return;
               case 589850:
                  dE();
                  return;
               case 589858:
                  dK();
                  return;
               case 589860:
                  dA();
                  return;
               case 589861:
                  dF();
                  return;
               case 589869:
                  dL();
                  return;
               case 589871:
                  dB();
                  return;
               case 589872:
                  dG();
                  return;
               case 589880:
                  dM();
                  return;
               case 589882:
                  dC();
                  return;
               case 589883:
                  dH();
                  return;
               case 589973:
                  dx();
                  return;
            }
         case 10:
            switch (var0) {
               case 655363:
                  dY();
                  return;
               case 655364:
                  dZ();
                  return;
               case 655365:
                  ea();
                  return;
               case 655373:
                  eb();
                  return;
               case 655381:
                  ec();
                  return;
               case 655389:
                  ed();
                  return;
               case 655397:
                  ee();
                  return;
               case 655405:
                  ef();
                  return;
               case 655413:
                  eg();
               default:
                  return;
               case 655424:
                  dW();
                  return;
               case 655433:
                  dX();
                  return;
            }
         case 11:
            switch (var0) {
               case 720898:
                  eh();
                  return;
               case 720903:
                  ei();
                  return;
               case 720925:
                  ej();
                  return;
               case 720926:
                  ek();
               default:
                  return;
            }
         case 12:
            switch (var0) {
               case 786438:
                  el();
               default:
                  return;
            }
         case 13:
            switch (var0) {
               case 851975:
                  en();
                  return;
               case 851976:
                  eo();
                  return;
               case 851977:
                  ep();
                  return;
               case 851978:
                  eq();
                  return;
               case 851979:
                  er();
                  return;
               case 851980:
                  es();
                  return;
               case 851981:
                  et();
                  return;
               case 851982:
                  eu();
                  return;
               case 851983:
                  ev();
                  return;
               case 852011:
                  em();
                  return;
               case 852012:
                  ex();
               case 851984:
               case 851985:
               case 851986:
               case 851987:
               case 851988:
               case 851989:
               case 851990:
               case 851991:
               case 851992:
               case 851993:
               case 851994:
               case 851995:
               case 851996:
               case 851997:
               case 851998:
               case 851999:
               case 852000:
               case 852001:
               case 852002:
               case 852003:
               case 852004:
               case 852005:
               case 852006:
               case 852007:
               case 852008:
               case 852009:
               case 852010:
               default:
                  return;
            }
         case 14:
            switch (var0) {
               case 917514:
                  ey();
                  return;
               case 917522:
                  eA();
                  return;
               case 917551:
                  eC();
               default:
                  return;
               case 917556:
                  ez();
                  return;
               case 917571:
                  eB();
                  return;
            }
         case 15:
            switch (var0) {
               case 983042:
                  eE();
                  return;
               case 983044:
                  eF();
                  return;
               case 983046:
                  eG();
                  return;
               case 983048:
                  eH();
                  return;
               case 983050:
                  eV();
                  return;
               case 983052:
                  eI();
                  return;
               case 983054:
                  fw();
                  return;
               case 983058:
                  eM();
                  return;
               case 983064:
                  eN();
                  return;
               case 983068:
                  eO();
                  return;
               case 983080:
                  eX();
                  return;
               case 983083:
                  eY();
                  return;
               case 983086:
                  eW();
                  return;
               case 983088:
                  eT();
                  return;
               case 983092:
                  eR();
                  return;
               case 983093:
                  eS();
                  return;
               case 983094:
                  eP();
                  return;
               case 983095:
                  eQ();
                  return;
               case 983100:
                  fi();
                  return;
               case 983105:
                  ff();
                  return;
               case 983106:
                  fg();
                  return;
               case 983108:
                  fh();
                  return;
               case 983112:
                  fd();
                  return;
               case 983114:
                  fe();
                  return;
               case 983118:
                  eZ();
                  return;
               case 983120:
                  fa();
                  return;
               case 983124:
                  fb();
                  return;
               case 983126:
                  fc();
                  return;
               case 983128:
                  fj();
                  return;
               case 983130:
                  fk();
                  return;
               case 983131:
                  fl();
                  return;
               case 983132:
                  fn();
                  return;
               case 983133:
                  fm();
                  return;
               case 983134:
                  fo();
                  return;
               case 983135:
                  fp();
                  return;
               case 983139:
                  fq();
                  return;
               case 983140:
                  fr();
                  return;
               case 983141:
                  fs();
                  return;
               case 983142:
                  ft();
                  return;
               case 983143:
                  fu();
                  return;
               case 983144:
                  fv();
                  return;
               case 983147:
                  fx();
                  return;
               case 983149:
                  fy();
                  return;
               case 983152:
                  fz();
                  return;
               case 983153:
                  fA();
                  return;
               case 983154:
                  fB();
                  return;
               case 983155:
                  fC();
                  return;
               case 983160:
                  fD();
                  return;
               case 983163:
                  fE();
                  return;
               case 983164:
                  fF();
                  return;
               case 983167:
                  fG();
                  return;
               case 983170:
                  fH();
                  return;
               case 983173:
                  fI();
                  return;
               case 983176:
                  fJ();
               case 983043:
               case 983045:
               case 983047:
               case 983049:
               case 983051:
               case 983053:
               case 983055:
               case 983056:
               case 983057:
               case 983059:
               case 983060:
               case 983061:
               case 983062:
               case 983063:
               case 983065:
               case 983066:
               case 983067:
               case 983069:
               case 983070:
               case 983071:
               case 983072:
               case 983073:
               case 983074:
               case 983075:
               case 983076:
               case 983077:
               case 983078:
               case 983079:
               case 983081:
               case 983082:
               case 983084:
               case 983085:
               case 983087:
               case 983089:
               case 983090:
               case 983091:
               case 983096:
               case 983097:
               case 983098:
               case 983099:
               case 983101:
               case 983102:
               case 983103:
               case 983104:
               case 983107:
               case 983109:
               case 983110:
               case 983111:
               case 983113:
               case 983115:
               case 983116:
               case 983117:
               case 983119:
               case 983121:
               case 983122:
               case 983123:
               case 983125:
               case 983127:
               case 983129:
               case 983136:
               case 983137:
               case 983138:
               case 983145:
               case 983146:
               case 983148:
               case 983150:
               case 983151:
               case 983156:
               case 983157:
               case 983158:
               case 983159:
               case 983161:
               case 983162:
               case 983165:
               case 983166:
               case 983168:
               case 983169:
               case 983171:
               case 983172:
               case 983174:
               case 983175:
               case 983177:
               case 983178:
               case 983179:
               case 983181:
               case 983183:
               case 983184:
               case 983185:
               case 983186:
               case 983188:
               case 983189:
               case 983190:
               default:
                  return;
               case 983180:
                  eK();
                  return;
               case 983182:
                  eL();
                  return;
               case 983187:
                  eD();
                  return;
               case 983191:
                  eU();
                  return;
               case 983192:
                  eJ();
                  return;
            }
         case 16:
            switch (var0) {
               case 1048639:
                  fU();
                  return;
               case 1048645:
                  fV();
                  return;
               case 1048651:
                  fW();
                  return;
               case 1048657:
                  fX();
                  return;
               case 1048663:
                  fY();
               default:
                  return;
               case 1048672:
                  fT();
                  return;
            }
         case 17:
            switch (var0) {
               case 1114115:
                  dP();
                  return;
               case 1114117:
                  dQ();
                  return;
               case 1114120:
                  dR();
                  return;
               case 1114142:
                  dS();
                  return;
               case 1114148:
                  dT();
                  return;
               case 1114159:
                  dU();
                  return;
               case 1114160:
                  dV();
               default:
                  return;
               case 1114173:
                  dO();
                  return;
            }
         case 18:
         case 25:
         case 26:
         default:
            c = false;
            return;
         case 19:
            switch (var0) {
               case 1245198:
                  gw();
                  return;
               case 1245212:
                  gx();
                  return;
               case 1245226:
                  gy();
                  return;
               case 1245240:
                  gz();
                  return;
               case 1245254:
                  gA();
               default:
                  return;
               case 1245261:
                  gv();
                  return;
            }
         case 20:
            switch (var0) {
               case 1310724:
                  fZ();
               default:
                  return;
            }
         case 21:
            switch (var0) {
               case 1376258:
                  gb();
                  return;
               case 1376259:
                  gc();
                  return;
               case 1376260:
                  gd();
                  return;
               case 1376271:
                  ge();
                  return;
               case 1376277:
                  gf();
                  return;
               case 1376283:
                  gg();
                  return;
               case 1376289:
                  gh();
                  return;
               case 1376295:
                  gi();
               default:
                  return;
               case 1376302:
                  ga();
                  return;
            }
         case 22:
            switch (var0) {
               case 1441796:
                  cp();
                  return;
               case 1441797:
                  co();
                  return;
               case 1441800:
                  cr();
                  return;
               case 1441801:
                  cq();
                  return;
               case 1441804:
                  bJ();
                  return;
               case 1441808:
                  bO();
                  return;
               case 1441811:
                  bE();
                  return;
               case 1441814:
                  bY();
                  return;
               case 1441817:
                  bT();
                  return;
               case 1441819:
                  bK();
                  return;
               case 1441823:
                  bP();
                  return;
               case 1441826:
                  bF();
                  return;
               case 1441829:
                  bZ();
                  return;
               case 1441832:
                  bU();
                  return;
               case 1441834:
                  bL();
                  return;
               case 1441838:
                  bQ();
                  return;
               case 1441841:
                  bG();
                  return;
               case 1441844:
                  ca();
                  return;
               case 1441847:
                  bV();
                  return;
               case 1441849:
                  bM();
                  return;
               case 1441853:
                  bR();
                  return;
               case 1441856:
                  bH();
                  return;
               case 1441859:
                  cb();
                  return;
               case 1441862:
                  bW();
                  return;
               case 1441864:
                  bN();
               case 1441798:
               case 1441799:
               case 1441802:
               case 1441803:
               case 1441805:
               case 1441806:
               case 1441807:
               case 1441809:
               case 1441810:
               case 1441812:
               case 1441813:
               case 1441815:
               case 1441816:
               case 1441818:
               case 1441820:
               case 1441821:
               case 1441822:
               case 1441824:
               case 1441825:
               case 1441827:
               case 1441828:
               case 1441830:
               case 1441831:
               case 1441833:
               case 1441835:
               case 1441836:
               case 1441837:
               case 1441839:
               case 1441840:
               case 1441842:
               case 1441843:
               case 1441845:
               case 1441846:
               case 1441848:
               case 1441850:
               case 1441851:
               case 1441852:
               case 1441854:
               case 1441855:
               case 1441857:
               case 1441858:
               case 1441860:
               case 1441861:
               case 1441863:
               case 1441865:
               case 1441866:
               case 1441867:
               case 1441869:
               case 1441870:
               case 1441872:
               case 1441873:
               case 1441875:
               case 1441876:
               case 1441878:
               case 1441879:
               case 1441880:
               case 1441881:
               case 1441882:
               case 1441883:
               case 1441884:
               case 1441885:
               case 1441886:
               case 1441887:
               case 1441889:
               case 1441890:
               case 1441891:
               case 1441892:
               case 1441893:
               case 1441894:
               case 1441895:
               case 1441896:
               case 1441897:
               case 1441898:
               case 1441899:
               case 1441901:
               case 1441902:
               case 1441903:
               case 1441904:
               case 1441905:
               case 1441906:
               case 1441907:
               case 1441908:
               case 1441910:
               case 1441911:
               case 1441912:
               case 1441913:
               case 1441914:
               case 1441915:
               case 1441916:
               case 1441917:
               case 1441919:
               case 1441920:
               case 1441921:
               case 1441922:
               case 1441923:
               case 1441924:
               case 1441925:
               case 1441926:
               case 1441928:
               case 1441929:
               case 1441930:
               case 1441931:
               case 1441932:
               case 1441933:
               case 1441934:
               case 1441935:
               case 1441937:
               case 1441938:
               case 1441939:
               case 1441940:
               case 1441941:
               case 1441942:
               case 1441943:
               case 1441944:
               case 1441946:
               case 1441947:
               case 1441948:
               case 1441949:
               case 1441950:
               case 1441951:
               case 1441952:
               case 1441953:
               case 1441957:
               case 1441958:
               case 1441959:
               case 1441960:
               case 1441961:
               case 1441962:
               default:
                  return;
               case 1441868:
                  bS();
                  return;
               case 1441871:
                  bI();
                  return;
               case 1441874:
                  cc();
                  return;
               case 1441877:
                  bX();
                  return;
               case 1441888:
                  bD();
                  return;
               case 1441900:
                  ce();
                  return;
               case 1441909:
                  cf();
                  return;
               case 1441918:
                  cg();
                  return;
               case 1441927:
                  ch();
                  return;
               case 1441936:
                  ci();
                  return;
               case 1441945:
                  cj();
                  return;
               case 1441954:
                  ck();
                  return;
               case 1441955:
                  cl();
                  return;
               case 1441956:
                  cm();
                  return;
               case 1441963:
                  cn();
                  return;
            }
         case 23:
            switch (var0) {
               case 1507330:
                  gl();
                  return;
               case 1507334:
                  gm();
                  return;
               case 1507338:
                  gn();
                  return;
               case 1507342:
                  go();
                  return;
               case 1507346:
                  gp();
                  return;
               case 1507350:
                  gq();
               case 1507331:
               case 1507332:
               case 1507333:
               case 1507335:
               case 1507336:
               case 1507337:
               case 1507339:
               case 1507340:
               case 1507341:
               case 1507343:
               case 1507344:
               case 1507345:
               case 1507347:
               case 1507348:
               case 1507349:
               case 1507351:
               case 1507352:
               case 1507353:
               case 1507354:
               case 1507355:
               default:
                  return;
               case 1507356:
                  gj();
                  return;
               case 1507357:
                  gk();
                  return;
            }
         case 24:
            switch (var0) {
               case 1572877:
                  gr();
                  return;
               case 1572884:
                  gs();
                  return;
               case 1572886:
                  gt();
                  return;
               case 1572888:
                  gu();
               default:
                  return;
            }
         case 27:
            switch (var0) {
               case 1769479:
                  gC();
                  return;
               case 1769481:
                  gB();
                  return;
               case 1769483:
                  gD();
                  return;
               case 1769485:
                  gF();
                  return;
               case 1769487:
                  gG();
               case 1769480:
               case 1769482:
               case 1769484:
               case 1769486:
               case 1769488:
               default:
                  return;
               case 1769489:
                  gE();
            }
      }
   }

   private static void R(int var0) {
      if (!h(var0, 1)) {
         int var1 = b[var0][0] >> 16 & 65535;
         int var2 = b[var0][0] & 65535;
         int var3 = b[var0][1] & 65535;
         short var4 = a[var1][var2][5];
         short var5 = a[var1][var2][6];
         int[] var6 = new int[4];
         a[var4].a(var5, 0, var6, 0);
         var2++;

         for (; var2 <= var3; var2++) {
            a[var1][var2][2] = (short)(b[var1][var2][2] + b[var0][8]);
            a[var1][var2][3] = (short)(b[var1][var2][3] + b[var0][9]);
            d var9;
            if (a[var1][var2][0] == 205 && a[var1][var2][18] == 1 && (var9 = (var4 = a[var1][var2][5]) < 1000 ? a[var4] : b[var4 - 1000]) != null) {
               var5 = a[var1][var2][6];
               if (var9.h(var5) > 0) {
                  var6 = new int[4];
                  var9.a(var5, 0, var6, 0);
               }
            }
         }
      }
   }

   private static void S(int var0) {
      if (!h(var0, 1)) {
         int var1 = b[var0][0] >> 16 & 65535;
         int var2 = b[var0][0] & 65535;
         int var3 = b[var0][1] & 65535;
         short var4 = b[var1][var2][2];
         short var5 = b[var1][var2][3];
         var2++;

         for (; var2 <= var3; var2++) {
            a[var1][var2][2] = (short)(b[var1][var2][2] + b[var0][8]);
            int var6 = a[var1][var2][2] - var4;
            var6 = f.e(b[var0][4] * b[var0][4] - var6 * var6);
            a[var1][var2][3] = (short)(var5 - var6);
            if (a[var1][var2][0] == 205 && a[var1][var2][18] == 1 && a[var1][var2][5] > -1) {
               short var11 = a[var1][var2][5];
               short var7 = a[var1][var2][6];
               if (a[var11].h(var7) > 0) {
                  int[] var8 = new int[4];
                  a[var11].a(var7, 0, var8, 0);
               }
            }
         }
      }
   }

   private static void g(int var0, int var1) {
      int var2 = b[var0][0] >> 16 & 65535;
      if (h(var0, 4)) {
         b[var0][8] = b[var0][8] + (b[var0][10] - a[var2][var1][2]);
         S(var0);
      } else {
         b[var0][8] = b[var0][8] + (b[var0][10] - a[var2][var1][2]);
         b[var0][9] = b[var0][9] + (b[var0][11] - a[var2][var1][3]);
         R(var0);
      }

      int var3 = b[var0][0] & 65535;
      int var4 = b[var0][1] & 65535;
      if (b[var0][2] != -1) {
         if (var1 == var3 + 1) {
            a[var2][b[var0][2]][10] = 0;
         } else {
            a[var2][b[var0][2]][10] = 1;
         }
      }

      if (b[var0][3] != -1) {
         if (var1 == var4 || a[var2][var1 + 1][10] == 0) {
            a[var2][b[var0][3]][10] = 0;
            return;
         }

         a[var2][b[var0][3]][10] = 1;
      }
   }

   private static void h(int var0, int var1) {
      if (a[var0][var1][0] == 205 && a[var0][var1][18] == 1) {
         short var2 = a[var0][var1][5];
         short var3 = a[var0][var1][6];
         if (a[var2].h(var3) > 0) {
            int[] var4 = new int[4];
            a[var2].a(var3, 0, var4, 0);
         }
      }
   }

   private static void T(int var0) {
      b[var0][12] = b[var0][12] | 1;
   }

   private static void U(int var0) {
      b[var0][12] = b[var0][12] & -2;
   }

   private static boolean h(int var0, int var1) {
      return (b[var0][12] & var1) == var1;
   }

   private static int a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;

      while (var7 < 10 && c[var7] != null) {
         var7++;
      }

      if (var7 < 10) {
         c[var7] = new int[8];
         c[var7][0] = var0;
         c[var7][1] = var1;
         c[var7][2] = var2;
         c[var7][3] = var3;
         c[var7][4] = var4;
         c[var7][5] = var5;
         c[var7][6] = var6;
         c[var7][7] = 0;
      }

      return var7;
   }

   private static void gH() {
      if (c != null) {
         for (int var0 = 0; var0 < 10; var0++) {
            if (c[var0] != null) {
               int var1 = var0;
               c[var1][7] = c[var1][7] + f.V;
               int var2 = c[var1][0] >> 16 & 65535;
               int var3 = c[var1][0] & 65535;
               int var4 = c[var1][1] & 65535;
               if (a[var2] != null && b[var2] != null) {
                  int var5;
                  if (c[var1][7] >= c[var1][6]) {
                     var5 = (c[var1][6] << 8) / c[var1][6];
                  } else if ((var5 = (c[var1][7] << 8) / c[var1][6]) < 0) {
                     var5 = 0;
                  }

                  int var6 = 0;
                  int var7 = 0;
                  if (c[var1][2] != c[var1][4]) {
                     var6 = (var5 * (c[var1][4] - c[var1][2]) >> 8) + c[var1][2];
                  }

                  if (c[var1][3] != c[var1][5]) {
                     var7 = (var5 * (c[var1][5] - c[var1][3]) >> 8) + c[var1][3];
                  }

                  for (int var9 = var3; var9 <= var4; var9++) {
                     if (var2 != 24 && (var2 != 1 || var3 != 103)) {
                        if (a == 32767) {
                           a = b[var2][var9][2];
                        }

                        a[var2][var9][2] = (short)(a + var6);
                        if (c[var1][4] > c[var1][2]) {
                           if (a[var2][var9][2] > b[var2][var9][2]) {
                              a[var2][var9][2] = b[var2][var9][2];
                           }
                        } else if (a[var2][var9][2] < b[var2][var9][2]) {
                           a[var2][var9][2] = b[var2][var9][2];
                        }

                        if (b == 32767) {
                           b = b[var2][var9][3];
                        }

                        a[var2][var9][3] = (short)(b + var7);
                        if (c[var1][5] > c[var1][3]) {
                           if (a[var2][var9][3] > b[var2][var9][3]) {
                              a[var2][var9][3] = b[var2][var9][3];
                           }
                        } else if (a[var2][var9][3] < b[var2][var9][3]) {
                           a[var2][var9][3] = b[var2][var9][3];
                        }
                     } else {
                        a[var2][var9][2] = (short)(var6 + 27);
                        a[var2][var9][3] = (short)(var7 + -24);
                     }

                     h(var2, var9);
                  }
               }

               if (c[var0][7] >= c[var0][6]) {
                  a = 32767;
                  b = 32767;
                  c[var0] = null;
               }
            }
         }
      }

      ae = true;
      if ((aK & 1) != 0) {
         a[1][55][10] = 1;
      }

      if ((aK & 2) != 0) {
         a[1][56][10] = 1;
      }

      if ((aK & 4) != 0) {
         a[1][57][10] = 1;
      }

      if ((aK & 8) != 0) {
         a[1][58][10] = 1;
      }

      for (int var8 = 0; var8 < 30; var8++) {
         if (a[var8] != null) {
            a[var8].c(f.V);
         }
      }
   }

   private static int j(int var0) {
      byte var1 = 0;
      if (var0 == 1) {
         var1 = 1;
      } else if (var0 == 2) {
         var1 = 2;
      } else if (var0 == 3) {
         var1 = 3;
      } else if (var0 == 4) {
         var1 = 4;
      }

      return var1;
   }

   private static void V(int var0) {
      a[var0] = null;
      b[var0] = null;
   }

   private static void gI() {
      for (int var0 = 0; var0 < p.length; var0++) {
         if (a[p[var0]] == null) {
            b(p[var0], true);
         }
      }
   }

   private static void gJ() {
      for (int var0 = 0; var0 < 28; var0++) {
         int var2 = var0;
         int[] var1 = p;
         int var3 = 0;

         boolean var10000;
         while (true) {
            if (var3 >= var1.length) {
               var10000 = false;
               break;
            }

            if (var1[var3] == var2) {
               var10000 = true;
               break;
            }

            var3++;
         }

         if (!var10000) {
            V(var0);
         }
      }
   }

   private static void c(int var0, int var1, int var2, int var3) {
      i(var0, var1);
      int var4 = 0;
      if (var0 == 1 && var1 == 33) {
         var4 = 5;
      }

      while (var4 < 30 && a[var4] != null) {
         var4++;
      }

      if (var4 < 30) {
         short var5;
         d var6 = (var5 = a[var0][var1][5]) < 1000 ? a[var5] : b[var5 - 1000];
         a[var4] = new i(var6, 0, 0);
         a[var4].b(var2, var3);
         a[var0][var1][17] = (short)var4;
      }
   }

   private static void i(int var0, int var1) {
      if (i(var0, var1)) {
         a[a[var0][var1][17]] = null;
         a[var0][var1][17] = -1;
      }
   }

   private static boolean i(int var0, int var1) {
      return a[var0][var1][0] == 205 ? a[var0][var1][17] > -1 && a[var0][var1][17] < 30 : false;
   }

   private static void W(int var0) {
      int var1 = a[var0].length;

      for (int var2 = 0; var2 < var1; var2++) {
         i(var0, var2);
      }
   }

   private static void d(int var0, int var1, int var2) {
      if (a[var0][var1][0] == 205) {
         a[var0][var1][20] = (short)var2;
      }
   }

   static void c(int var0) {
      if (X) {
         if (V && !Z) {
            X(var0);
         }
      }
   }

   private static void gK() {
      try {
         f.c("/3");
         a = new String[av];

         for (int var0 = 0; var0 < av; var0++) {
            byte[] var1;
            if ((var1 = f.a(var0)).length > 0) {
               if (var1[0] == 77) {
                  a[var0] = "audio/midi";
               } else if (var1[0] == -1) {
                  a[var0] = "audio/mpeg";
               } else if (var1[0] == 82) {
                  a[var0] = "audio/x-wav";
               } else if (var1[0] == 35) {
                  a[var0] = "audio/amr";
               }

               a[var0] = new ByteArrayInputStream(var1);
            }
         }

         f.k();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private static boolean l() {
      return a != null ? a.getState() == 400 : false;
   }

   static boolean b() {
      return a != null && a.getState() == 400;
   }

   public static void d(int var0) {
      X(var0);
   }

   private static void X(int var0) {
      if (X || p(var0)) {
         if (W || !p(var0)) {
            if (a[var0] != null) {
               if (l() && p(aw)) {
                  ay = 0;
               } else if (!l() || s[var0] < s[aw]) {
                  try {
                     short var1 = 500;
                     if (var0 == 63) {
                        var1 = 200;
                     }

                     if (System.currentTimeMillis() - b < var1 && b != -1L) {
                        if (var0 != aw) {
                           if ((var0 = var0) == 60 || var0 == 59 || var0 == 37 || var0 == 39 || var0 == 31) {
                              return;
                           }

                           if (ay < ax && q[0] != var0) {
                              q[ay] = var0;
                              ay++;
                           }
                        }
                     } else {
                        b = System.currentTimeMillis();
                        gM();
                        a[var0].reset();
                        (a = Manager.createPlayer(a[var0], a[var0])).start();
                        aw = var0;
                        long var2 = System.currentTimeMillis();
                        if (var0 < 14) {
                           d = var2;
                           c = var0;
                        } else {
                           e = var2;
                           c = var0;
                           if (K == -1) {
                              S = true;
                           }
                        }
                     }
                  } catch (Exception var4) {
                     var4.printStackTrace();
                  }
               }
            }
         }
      }
   }

   private static void gL() {
      if (X || W) {
         if (!T) {
            X(12);
            T = true;
            Y = true;
         } else if (U) {
            X(0);
            U = false;
            Y = true;
         } else {
            long var0 = System.currentTimeMillis();
            if (S) {
               if (var0 - e > 6000L) {
                  S = false;
               }
            } else if (!S && !Y) {
               Y = true;
               if (az == 0) {
                  r = new int[9];

                  for (int var6 = 0; var6 < 9; var6++) {
                     r[var6] = var6 + 1;
                  }

                  int[] var7 = r;

                  for (int var3 = r.length - 1; var3 >= 0; var3--) {
                     int var10 = f.c(0, var7.length);
                     int var5 = var7[var10];
                     var7[var10] = var7[var3];
                     var7[var3] = var5;
                  }

                  if (aA == r[az]) {
                     az++;
                  }
               }

               int var8;
               aA = var8 = r[az];
               short var9 = 6000;
               long var11;
               if (c < 14L) {
                  var11 = var0 - d;
                  var9 = 24000;
               } else {
                  var11 = var0 - e;
               }

               if (var11 > var9) {
                  X(var8);
               }

               if (az < 8) {
                  az++;
               } else {
                  az = 0;
               }

               if (!W) {
                  d = System.currentTimeMillis();
               }
            } else {
               if (!S && Y) {
                  long var2;
                  if ((var2 = var0 - d) > 25000L) {
                     Y = false;
                  }

                  if (var2 > 10000L && var2 < 20000L) {
                     int var4 = f.c(64, 67);
                     if (f.c(0, 100) < 80 && var0 - f > 5000L) {
                        if (aB != -1 && aB == var4) {
                           if (++var4 > 66) {
                              var4 = 64;
                           }
                        }

                        X(var4);
                        f = var0;
                     }

                     b();
                  }
               }
            }
         }
      }
   }

   private static boolean p(int var0) {
      return var0 >= 0 && var0 <= 13;
   }

   private static void gM() {
      try {
         if (a != null) {
            a.stop();
            a.deallocate();
            a.close();
            a = null;
         }
      } catch (Exception var0) {
      }
   }

   private static void gN() {
      if (p(aw)) {
         gM();
      }
   }

   private static void gO() {
      X(60);

      try {
         Thread.sleep(1000);
      } catch (InterruptedException var0) {
      }
   }

   private static void gP() {
      d = -1;
      a = null;
      f = null;
      aa = false;
      e = -1;
      aE = -1;
      f = 0;
      g = 1;
      c = null;
   }

   private static boolean m() {
      boolean var0 = false;
      int var1 = f.h();
      int var2 = 0;
      int var3 = 0;
      if (var1 == 19 && K != 52 && K != 42 && K != 15) {
         boolean var4 = false;
         if (d == 4) {
            int var5;
            a(var5 = a.b(), a.y, a);
            if (var5 == 3) {
               b(a, true);
               var4 = true;
            }
         }

         if (d == 4 || d == 0 || d == 1) {
            a.G();
         }

         X(56);
         j(var4);
      }

      if ((var1 == 5 || var1 == 11) && !a(a)) {
         if (d == 1) {
            switch (a.q) {
               case 20:
                  if ((bI <= 0 || !c(bI)) && (bJ <= 0 || !d(bJ))) {
                     j(false);
                     if (bI > 0) {
                        String var7;
                        String var13 = (var7 = f.b(379)) == null ? "" : var7;
                        String var18 = Integer.toString(bI - c());
                        var13 = f.a(var13, "%d", var18);
                        String var8;
                        b((var8 = f.b(378)) == null ? "" : var8, var13, 7, 0);
                     } else if (bJ > 0) {
                        String var9;
                        String var15 = (var9 = f.b(381)) == null ? "" : var9;
                        String var19 = Integer.toString(bJ - bv);
                        var15 = f.a(var15, "%d", var19);
                        String var10;
                        b((var10 = f.b(380)) == null ? "" : var10, var15, 7, 0);
                     }
                  } else {
                     gS();
                  }
                  break;
               case 49:
                  a.f(8);
                  a(5, a);
                  gS();
               case 50:
            }
         } else if (d == 0) {
            gS();
            o(false);
            g(false);
            f(true);
            d = -1;
         } else if (d == 4) {
            if (K == 52) {
               f = true;
            }

            gS();
            j(false);
         } else {
            gS();
            o(false);
            g(false);
         }

         ag();
      }

      byte var17 = 3;
      byte var20 = 3;
      byte var11 = 1;
      if (a != null && a.q == 49) {
         var17 = 36;
         var20 = 18;
         var11 = 5;
         if (K == 42) {
            var17 = 0;
            var20 = 0;
         }
      }

      if ((f.h(1) || f.h(8)) && ah % var11 == 0) {
         var2 = 0;
         var3 = -var20 * J / 100;
         var0 = true;
      } else if ((f.h(2) || f.h(14)) && ah % var11 == 0) {
         var2 = 0;
         var3 = var20 * J / 100;
         var0 = true;
      } else if ((f.h(3) || f.h(10)) && ah % var11 == 0) {
         var2 = -var17 * J / 100;
         var3 = 0;
         var0 = true;
      } else if ((f.h(4) || f.h(12)) && ah % var11 == 0) {
         var2 = var17 * J / 100;
         var3 = 0;
         var0 = true;
      } else if (f.h(7) && ah % var11 == 0) {
         var2 = -var17 * J / 100;
         var3 = -var20 * J / 100;
         var0 = true;
      } else if (f.h(9) && ah % var11 == 0) {
         var2 = var17 * J / 100;
         var3 = -var20 * J / 100;
         var0 = true;
      } else if (f.h(13) && ah % var11 == 0) {
         var2 = -var17 * J / 100;
         var3 = var20 * J / 100;
         var0 = true;
      } else if (f.h(15) && ah % var11 == 0) {
         var2 = var17 * J / 100;
         var3 = var20 * J / 100;
         var0 = true;
      }

      if (var0 && K != 15 && K != 51) {
         int[] var6 = new int[2];
         int[] var12 = new int[2];
         var6[0] = a.r + var2;
         var6[1] = a.s + var3;
         c(var6, var12);
         if (a(var12[0], var12[1]) < 0) {
            return true;
         }

         if (a != null) {
            a.r = var6[0];
            a.s = var6[1];
         }

         c.h();
         return true;
      } else {
         return false;
      }
   }

   private static void a(e var0, boolean var1) {
      f = null;
      if (var0 != null && N == 0 && var0.a(1)) {
         e(-1);
         a(false, null);
         if (var0.q == 50 && var0.y < 9) {
            f(true);
            d = -1;
            l = null;
            return;
         }

         a = var0;
         var0.e = true;
         if (aa = a.a(16777216)) {
            a.k(16777216);
         }

         if (a != null) {
            a.e = true;
            if (c == null) {
               d var2 = b[3];
               (c = new i(var2, a.r, a.s)).b(2, -1);
            } else {
               c.a(a.r, a.s);
            }
         } else {
            c = null;
         }

         k = true;
         aC = a.r;
         aD = a.s;
         if (a.q == 54) {
            a.h(4);
            if (a.a(32)) {
               if (d == 0) {
                  a.c = true;
                  a.f = System.currentTimeMillis();
               } else if (d == 4) {
                  a.e = System.currentTimeMillis() / 1000L;
                  g var10 = g.a(0);
                  a.e = var10.a[a.y][13] * 60;
                  a.c = true;
                  a.f = System.currentTimeMillis();
               }
            }

            bD = e.e(0, 54);
            if ((d == 4 || d == 0) && bD > y()) {
               ah();
               D = 3;
               s(17);
               return;
            }
         } else if (a.q == 52 && (d == 4 || d == 0)) {
            int var9 = e.a(0, 52);
            int var3 = x();
            if (var9 > var3) {
               ah();
               D = 20;
               s(17);
               return;
            }
         }

         if (d != 3) {
            g(true);
         }

         f(false);
         a(false, -1, '\u0000');
         if (var1 && a.a(2)) {
            b(var0);
         }

         a.u = a.r * J / 100 - i.d();
         a.v = a.s * J / 100 - i.e();
         a[1][72][2] = (short)a.u;
         a[1][72][3] = (short)(a.v - 80);
         h(true);
         O(1);
         if (a.E > -1 && a.F > -1 || a.G > -1 && a.H > -1) {
            int var5;
            int var13;
            if (a.E > -1) {
               int var4 = a.E;
               var1 = a.E & 32767;
               d var11;
               var13 = (var11 = (var4 & 32768) != 0 ? a[var1] : b[var1]).d(a.F) >> 1;
               var5 = var11.e(a.F) >> 1;
            } else {
               int var6 = a.G;
               var1 = a.G & 32767;
               d var12;
               var13 = (var12 = (var6 & 32768) != 0 ? a[var1] : b[var1]).d(a.H) >> 1;
               var5 = var12.e(a.H) >> 1;
            }

            if (a.r - var13 > i.d() && a.s - var5 > i.e()) {
               a.H();
            }

            i.d();
            k = true;
         }

         a.t = 100;
         bu = false;
      }
   }

   private static void gQ() {
      int var0 = 88;
      int var1 = aF;

      for (int var2 = aF + 3; var1 < var2; var0++) {
         if (var1 < 0) {
            a[1][var0][5] = (short)t[var1 + aG];
            a[1][var0][6] = (short)u[var1 + aG];
         } else if (var1 >= aG) {
            a[1][var0][5] = (short)t[var1 - aG];
            a[1][var0][6] = (short)u[var1 - aG];
         } else {
            a[1][var0][5] = (short)t[var1];
            a[1][var0][6] = (short)u[var1];
         }

         var1++;
      }
   }

   private static void gR() {
      if (a[1][89][5] == 1 && a[1][89][6] == 17) {
         if (ab) {
            a(false, null);
         }

         ab = false;
         Q(65624);
      } else if (a[1][89][5] == 1 && a[1][89][6] == 36) {
         if (ab) {
            a(false, null);
         }

         ab = false;
         X(40);
         Q(65625);
      } else if (a[1][89][5] == 1 && a[1][89][6] == 16) {
         if (ab) {
            a(false, null);
         }

         ab = false;
         Q(65626);
      } else if (a[1][89][5] == 1 && a[1][89][6] == 25) {
         if (ab) {
            a(false, null);
         }

         ab = false;
         Q(65568);
         e = null;
         f(true);
         a(true, false, false);
         b(false, e);
         bu = true;
      } else if (a[1][89][5] == 1 && a[1][89][6] == 37) {
         d = e;
         Q(65539);
         e = null;
         f(true);
         a(true, false, false);
         b(false, e);
         bu = true;
      } else {
         X(55);
      }
   }

   private static void b(boolean var0, e var1) {
      int var2 = var0 ? 1 : 0;
      a[1][88][10] = (short)var2;
      a[1][90][10] = (short)var2;
      a[1][84][10] = (short)var2;
      a[1][73][10] = (short)var2;
      a[1][89][10] = (short)var2;
      a[1][91][10] = (short)var2;
      aF = 0;

      for (int var3 = 88; var3 <= 90; var3++) {
         a[1][var3][5] = b[1][var3][5];
         a[1][var3][6] = b[1][var3][6];
      }

      if (var0) {
         if (var1 == null || var1.q != 49) {
            t = new int[]{1, 1, 1};
            u = new int[]{17, 36, 16};
            aG = 3;
         } else if ((var1.D == 3 || var1.D == 4) && ab) {
            if (a[1][32][10] == 1) {
               t = new int[]{1, 1, 1, 1};
               u = new int[]{25, 37, 17, 36};
               if (by < bz) {
                  t[0] = 20;
                  u[0] = 123;
               }

               aG = 4;
            } else {
               t = new int[]{1, 1, 1};
               u = new int[]{17, 37, 36};
               aG = 3;
            }
         }
      } else {
         t = null;
         u = null;
         aG = 0;
      }

      a[1][85][10] = (short)var2;
      a[1][86][10] = (short)var2;
      a[1][87][10] = (short)var2;
      a[1][92][10] = (short)var2;
      a[1][93][10] = (short)var2;
      if (var1 != null) {
         if (!var1.a(64) && var0 && var1.q != 49) {
            t[0] = 20;
            u[0] = 123;
         }

         if (!var1.a(128) && var0 && var1.q != 49) {
            t[2] = 20;
            u[2] = 123;
         }

         if (var1.a(64) && var1.a(128)) {
            a[1][92][10] = 0;
         }

         if (var0) {
            gQ();
         }
      }
   }

   private static void gS() {
      if (a != null) {
         int var0 = a.J;
         a.e = false;
         if (aa) {
            aa = false;
            a.j(16777216);
            a.H();
         }

         a.t = 12;
         gU();
         if (d == 0) {
            X(48);
            a(a.J, 1, 17, false);
            a(a.J, 1, 9, false);
         }

         if (d == 1) {
            X(48);
            a(a.J, 1, 17, false);
            a(a.J, 1, 9, false);
            if (a.q == 49 && K == 42) {
               q++;
            }
         } else if (d == 3 || d == 4) {
            if (aC != a.r && aD != a.s) {
               a(a.J, 1, 6, false);
            }

            if (d == 4) {
               a(a.J, 1, 39, false);
               a(a.J, 1, 9, false);
            }
         }

         int var1 = 0;
         int var2 = 0;
         if (d == 1) {
            var1 = bI;
            var2 = bJ;
         }

         if (bI > 0) {
            b(bI);
            bI = 0;
         }

         if (bJ > 0) {
            e(bJ);
            bJ = 0;
         }

         if (d == 1) {
            bI = var1;
            bJ = var2;
         }

         if (a.q == 54) {
            boolean var5 = false;
            a.h(0);
            if (d == 0) {
               if (a.a(32)) {
                  a.c = false;
                  a.f = 0L;
               }

               var5 = true;
               if (a.d > 0) {
                  int[] var8 = new int[]{0, 0, 14};
                  e.a(47, 2, var8).a(a.r, a.s, 10, 1000, false, a.d);
               }

               a.q();
               if (a.a(32)) {
                  a.r();
               }
            } else if (d == 4) {
               var5 = false;
               if (a.a(32)) {
                  a.c = false;
                  a.f = 0L;
               }

               a.v();
            }

            if (var5 && !a.a(32)) {
               a.k(4);
               a.k(16);
               a.k(256);
               a.h(2);
            }
         } else if (a.q == 52) {
            if (d == 0) {
               a(a.J, 1, 12, false);
            }

            if (d == 0) {
               a.g(2);
            }
         } else if (a.q == 20) {
            if ((d == 0 || d == 1) && (var2 = g.a(4).a[a.y][19]) > 0) {
               int[] var4 = new int[]{0, 0, 14};
               e.a(47, 2, var4).a(a.r, a.s, 10, 1000, false, var2);
            }
         } else if (a.q == 50 && d == 0) {
            a.a = System.currentTimeMillis() / 1000L;
         }

         if (a.a(2)) {
            a(a);
         }

         if (d == 1 && a.q == 49) {
            if (e.a(0, 49) < w()) {
               e var9;
               (var9 = a(a.q, 0, a.r, a.s, true)).J = a[0];
               a(var9, false);
            } else {
               a = null;
               c = null;
               j(false);
            }
         } else if (d == 1 && a.q == 20) {
            e var6;
            (var6 = a(4, a.y)).J = a.J;
            a(var6, false);
         } else {
            a = null;
            c = null;
         }

         try {
            Thread.sleep(500L);
         } catch (Exception var3) {
         }

         X(34);
         if (var0 != 0 && (d == 0 || d == 4) && (var0 < G[0] || var0 > G[63] || var0 % 2 == 1)) {
            a(true);
            m(var0);
         }
      }
   }

   private static void o(boolean var0) {
      if (a != null) {
         a.e = false;
         if (aa) {
            aa = false;
            a.j(16777216);
            a.H();
         }

         a.t = 12;
         if (d == 3) {
            a.r = aC;
            a.s = aD;
            if (a.q == 54) {
               a.h(0);
            }

            gU();
         } else if (!var0) {
            a.e();
         }
      }

      a = null;
      e = null;
      c = null;
      if (d == 3) {
         f(true);
         d = -1;
      }

      b(false, null);
      h(false);
      a(true, false, false);
      O(1);
      ag();
      bu = true;
      bI = 0;
      bJ = 0;
   }

   private static void gT() {
      if (c != null && a != null) {
         if (K == 15 || K == 53) {
            return;
         }

         c.a(a.u, a.v);
         c.d(J);
         f.b(true);
         if (K != 42) {
            c.b();
         }

         if (K == -1) {
            a[1][73][10] = 1;
         }

         bu = false;
         f.b(false);
      }
   }

   static void e(int var0) {
      int var1 = aE;
      aE = -1;
      c = false;
      if (e == 0) {
         a(false, 0, f);
      } else if (e == 1) {
         a(false, 1, f);
      }

      e = var0;
      if (var0 == 0) {
         a(true, 0, f);
         if (var1 == -1) {
            X(60);
            return;
         }
      } else if (e == 1) {
         if (k != null && k.q == 49) {
            u = true;
            if (K == -1) {
               f(false);
               i(false);
            }

            a[1][73][10] = 1;
            a[1][73][18] = 1;
            if (d == null) {
               d = new i(b[159], 0, 0);
               return;
            }
         }
      } else if (e == 1) {
         c = true;
         aL = 30;
         aM = 1;
      }
   }

   private static void Y(int var0) {
      if (K == 45) {
         var0 = 1;
      }

      g var1 = g.a(2);
      g = var0;
      h = var1.a[g][14];
      i = var1.a[g][11];
      j = var1.a[g][6];
      k = var1.a[g][7];
      l = var1.a[g][1];
      m = var1.a[g][9];
      n = var1.a[g][8];
      o = var1.a[g][12];
   }

   private static void gU() {
      if (a.a(2)) {
         e[] var0 = new e[50];
         int var1 = e.a(0, 54, var0, a);

         for (int var2 = 0; var2 < var1; var2++) {
            int[] var3 = new int[2];
            a(var0[var2], var3, var0[var2].r, var0[var2].s);
            var0[var2].d(var3[0], var3[1]);
         }
      }
   }

   private static void gV() {
      if (!a) {
         e.b();
         hi();
         gT();
         M(1);
         if (c) {
            a[aL].a(f.a, aM, 0, 0, 0);
         }

         iD();
      }
   }

   private static void gW() {
      if (eK == 0) {
         if (f.i()) {
            eK = 1;
         } else {
            eK = 2;
         }
      }

      if (eK == 1) {
         eK = 2;
         bn = false;
         i = true;
         a(34);
         m = true;
      }

      if (b[3] != null && !h(3, 1) && aI > 3) {
         if (b[3][8] < -60) {
            Z(1);
         } else if (b[3][8] > 60) {
            Z(-1);
         }
      }

      int var0 = bj & 65535;
      if ((bj >> 16 & 65535) == 1 && var0 == 83) {
         c = true;
         int var4 = b[3][0] >> 16 & 65535;
         var0 = b[3][0] & 65535;
         int var1 = b[3][1] & 65535;
         int var2 = Integer.MAX_VALUE;
         int var3 = 0;

         for (int var5 = var0 + 1; var5 <= var1; var5++) {
            int var6;
            if (a[var4][var5][10] == 1
               && (var6 = (a[var4][var5][2] - b[3][10]) * (a[var4][var5][2] - b[3][10]) + (a[var4][var5][3] - b[3][11]) * (a[var4][var5][3] - b[3][11])) < var2
               )
             {
               var3 = var5;
               var2 = var6;
            }
         }

         var3 = var3 < var0 + 1 ? var0 + 1 : (var3 > var1 ? var1 : var3);
         var0 = var4 << 16 | var3 & 65535;
         aL = a[var0 >> 16 & 65535][var0 & 65535][5];
         aM = a[var0 >> 16 & 65535][var0 & 65535][6];
      }

      c.i();
      e.a();
      l = false;
      e.a(0);
      ht();
      if (d != null) {
         short var15 = a[1][0][2];
         short var21 = a[1][0][3];
         int[] var9 = new int[2];
         int[] var12 = new int[2];
         var9[0] = d.r;
         var9[1] = d.s;
         b(var9, var12);

         for (int var13 = 0; var13 <= 7; var13++) {
            a[1][var13][2] = (short)(var12[0] + bj[var13 << 1]);
            a[1][var13][3] = (short)(var12[1] + bj[(var13 << 1) + 1]);
         }

         M = M < 0 ? 0 : (M > 100 ? 100 : M);
         a(1, 1, 0, M);
         if (var15 != a[1][0][2] || var21 != a[1][0][3]) {
            O(1);
         }

         String var16 = b;
         a[1][7] = var16;
         String var10 = Integer.toString(d.K);
         a[1][5] = var10;
      }

      gY();
      if (c != null) {
         c.c(f.V);
         if (a != null) {
            int[] var17 = new int[2];
            int[] var22 = new int[2];
            var17[0] = a.r;
            var17[1] = a.s;
            b(var17, var22);
            a[1][72][2] = (short)a.u;
            a[1][72][3] = (short)(a.v - 50);
            h(1, 70);
            h(1, 71);
            if (!a(a)) {
               a[1][70][6] = 11;
               a[1][70][18] = 1;
            } else {
               a[1][70][6] = 12;
               a[1][70][18] = 0;
            }
         }
      }

      i.a(null, 0, 0, 0);
      gL();
      if (a[1][94][10] != 0) {
         if (ej < 100) {
            if (System.currentTimeMillis() - ej > 1000L && !bf) {
               X(61);
               bf = true;
            }

            ej++;
            if (a[1][94][2] == i && a[1][94][18] == 0) {
               a[1][94][18] = 1;
               O(1);
            }
         } else {
            bf = false;
            a(false, -1);
         }
      }

      if (f(1, 103)) {
         if (a == 1) {
            long var18;
            if ((var18 = System.currentTimeMillis()) - r > 10L && !bf) {
               X(61);
               bf = true;
            }

            if (var18 - r > 5000L) {
               h(false, -1);
            }
         } else if (a == 2) {
            if (a[1][103][2] > f.T) {
               id();
            }

            if (System.currentTimeMillis() - r > 5000L) {
               h(false, -1);
            }
         } else {
            id();
         }
      }

      c();
      if (bu) {
         j = false;
         int var19;
         if ((var19 = f.g()) != 8
            && var19 != 10
            && var19 != 12
            && var19 != 14
            && var19 != 1
            && var19 != 3
            && var19 != 4
            && var19 != 2
            && var19 != 9
            && var19 != 13
            && var19 != 15
            && var19 != 7
            && var19 != -1
            && (f.h(8) || f.h(1) || f.h(14) || f.h(2) || f.h(10) || f.h(3) || f.h(12) || f.h(4) || f.h(7) || f.h(9) || f.h(13) || f.h(15))) {
            f.j();
         }

         label284:
         if (!f.h(8) && !f.h(1)) {
            int var10000;
            byte var10001;
            label399: {
               if (!f.h(14) && !f.h(2)) {
                  if (f.h(10) || f.h(3)) {
                     if ((F -= 15) <= 10) {
                        F = 10;
                        H = -15;
                        I = 0;
                        j = true;
                     }
                     break label284;
                  }

                  if (f.h(12) || f.h(4)) {
                     if ((F += 15) >= eV - 15) {
                        F = eV - 15;
                        H = 15;
                        I = 0;
                        j = true;
                     }
                     break label284;
                  }

                  if (f.h(7)) {
                     if (F < 15 || G < 15 + fz) {
                        H = -15;
                        I = -15;
                        j = true;
                     }

                     F = F - (F < 15 ? 0 : 15);
                     G = G - (G < 32 + fz ? 0 : 15);
                     break label284;
                  }

                  if (f.h(9)) {
                     if (F > eV - 15 || G < 15 + fz) {
                        H = 15;
                        I = -15;
                        j = true;
                     }

                     F = F + (F > eV - 15 ? 0 : 15);
                     G = G - (G < 32 + fz ? 0 : 15);
                     break label284;
                  }

                  if (f.h(13)) {
                     if (F < 20 || G > fy - 20) {
                        H = -15;
                        I = 15;
                        j = true;
                     }

                     F = F - (F < 20 ? 0 : 15);
                     G = G + (G > fy - 20 ? 0 : 15);
                     break label284;
                  }

                  if (!f.h(15)) {
                     break label284;
                  }

                  if (F > eV - 20 || G > fy - 20) {
                     H = 15;
                     I = 15;
                     j = true;
                  }

                  F = F + (F > eV - 20 ? 0 : 15);
                  var10000 = G;
                  if (G > fy - 20) {
                     var10001 = 0;
                     break label399;
                  }
               } else {
                  if (G > fy - 15 - 17) {
                     H = 0;
                     I = 15;
                     j = true;
                     break label284;
                  }

                  var10000 = G;
               }

               var10001 = 15;
            }

            G = var10000 + var10001;
         } else if (G < fz + 15) {
            H = 0;
            I = -15;
            j = true;
         } else {
            G -= 15;
         }
      }

      e[] var11 = new e[1];
      e.a(0, 50, 14, var11, 1);
      if (var11[0] != null && var11[0].a && !g()) {
         var11[0].a = false;
         var11[0].G();
      }

      if (ap) {
         int var20 = 100 * t() / u();
         a(1, 24, 23, var20);
         ap = false;
      }
   }

   private static e a(int var0, int var1, boolean var2) {
      int[] var3 = new int[2];
      int[] var4;
      (var4 = new int[2])[0] = f.T >> 1;
      var4[1] = f.U >> 1;
      a(var4, var3);
      c(var3, var4);
      d(var4, var3);
      return a(49, 0, var3[0], var3[1], var2);
   }

   private static e a(int var0, int var1, int var2, int var3, boolean var4) {
      int[] var6 = new int[]{var2, var3, 11};
      if (var0 == 50 || var0 == 54 || var0 == 48 || var0 == 22) {
         var6[2] = 12;
      }

      e var5 = e.a(var0, 0, var6);
      int[] var7;
      (var7 = new int[2])[0] = var2;
      var7[1] = var3;
      a(var5, var7, var2, var3);
      var5.r = var7[0];
      var5.s = var7[1];
      if (var4 && K == -1) {
         c.a(var7[0], var7[1], 1000);
      }

      return var5;
   }

   private static e a(int var0, int var1) {
      e var2 = null;
      int[] var3 = new int[2];
      int[] var4;
      (var4 = new int[2])[0] = f.T >> 1;
      var4[1] = f.U >> 1;
      a(var4, var3);
      c(var3, var4);
      d(var4, var3);
      g var21 = g.a(var0);
      switch (var0) {
         case 0:
            int[] var15 = new int[]{
               var3[0],
               var3[1],
               12,
               var21.a[var1][27],
               var21.a[var1][28],
               var21.a[var1][31],
               var21.a[var1][32],
               var21.a[var1][34],
               var21.a[var1][19],
               var21.a[var1][33],
               var21.a[var1][35],
               var21.a[var1][36]
            };
            (var2 = e.a(54, 0, var15)).y = var1;
            var2.q();
            if (var21.a[var1][34] == 1) {
               var2.r();
            } else {
               var2.c = var21.a[var1][14];
               var2.g = var21.a[var1][17];
               var2.f = var21.a[var1][24];
            }

            var2.d = 0;
            var2.J = var21.a[var1][1];
            var0 = var21.a[var1][31];
            byte var18 = 0;
            if (var0 == 7) {
               var18 = 0;
            } else if (var0 == 8) {
               var18 = 1;
            } else if (var0 == 19) {
               var18 = 2;
            } else if (var0 == 18) {
               var18 = 3;
            } else if (var0 == 20) {
               var18 = 4;
            } else if (var0 == 17) {
               var18 = 5;
            } else if (var0 == 5) {
               var18 = 5;
            }

            var2.a = var18;
            var2.a = (byte)var21.a[var1][37];
            if (var2.y >= 2 && var2.y <= 3) {
               var2.a = 20;
            }

            var2.e = (short)var21.a[var1][12];
            var2.b = (short)var21.a[var1][29];
            var2.c = (short)var21.a[var1][30];
            d var17;
            short var19 = (var17 = b[var21.a[var1][31]]).a[var2.b];
            var2.h = var17.b(var19);
            var2.i = var17.c(var19);
            short var20 = var17.a[var2.c];
            var2.j = var17.b(var20);
            var2.k = var17.c(var20);
            if (var21.a[var1][19] != 5 && var21.a[var1][19] != 110) {
               var2.l = var21.a[var1][18];
            }

            if (var21.a[var1][22] != 5 && var21.a[var1][22] != 110) {
               var2.m = var21.a[var1][21];
            }
         case 1:
         case 5:
         case 6:
         case 7:
         case 10:
         case 12:
         case 13:
         case 14:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         default:
            break;
         case 2:
            int[] var14 = new int[]{var3[0], var3[1], 12, var21.a[var1][9], var21.a[var1][19], var21.a[var1][20]};
            (var2 = e.a(52, 0, var14)).y = var1;
            var2.J = var21.a[var1][1];
            var2.I = var21.a[var1][14];
            var2.a = var21.a[var1][12];
            var2.L = var21.a[var1][11];
            var2.K = (byte)var21.a[var1][15];
            var2.G = (byte)var21.a[var1][9];
            var2.H = (byte)var21.a[var1][10];
            if (var1 >= 12) {
            }
            break;
         case 3:
            int[] var13 = new int[]{
               var3[0],
               var3[1],
               12,
               var1,
               var21.a[var1][25],
               var21.a[var1][26],
               var21.a[var1][23],
               var21.a[var1][24],
               var21.a[var1][27],
               var21.a[var1][28],
               var21.a[var1][29]
            };
            (var2 = e.a(50, 0, var13)).J = var21.a[var1][1];
            if (var2.y == 12 || var2.y == 11) {
               var2.a = System.currentTimeMillis() / 1000L;
               var2.a = false;
            }
            break;
         case 4:
            int[] var12 = new int[]{
               var3[0],
               var3[1],
               var21.a[var1][15],
               var21.a[var1][0],
               var21.a[var1][12],
               var21.a[var1][13],
               var21.a[var1][11],
               var21.a[var1][9],
               var21.a[var1][10],
               var21.a[var1][16],
               var21.a[var1][17]
            };
            (var2 = e.a(20, 0, var12)).y = var1;
            var2.J = var21.a[var1][1];
            break;
         case 8:
            int[] var11 = new int[]{var3[0], var3[1], 12, var21.a[var1][3]};
            (var2 = e.a(42, 0, var11)).y = var1;
            break;
         case 9:
            int[] var10 = new int[]{var3[0], var3[1], var21.a[var1][4], var21.a[var1][0], var21.a[var1][1], var21.a[var1][2], var21.a[var1][3]};
            (var2 = e.a(51, 0, var10)).y = var1;
            break;
         case 11:
            if (var1 == -1) {
               int[] var7 = new int[]{var3[0], var3[1], 12};
               (var2 = e.a(22, 0, var7)).y = var1;
               var2.J = -1;
            } else if (var1 >= 4 && var1 <= 50) {
               int[] var9 = new int[]{var3[0], var3[1], 12};
               (var2 = e.a(22, 0, var9)).y = var1;
               var2.J = var21.a[var1][1];
            } else {
               int[] var8 = new int[]{var3[0], var3[1], 12, var21.a[var1][7], var21.a[var1][8], var21.a[var1][9]};
               (var2 = e.a(48, 0, var8)).y = var1;
               var2.J = var21.a[var1][1];
            }
            break;
         case 15:
            int[] var6 = new int[]{
               var3[0], var3[1], var21.a[var1][7], var21.a[var1][1], var21.a[var1][2], var21.a[var1][4], var21.a[var1][5], var21.a[var1][3], var21.a[var1][6]
            };
            (var2 = e.a(32, 0, var6)).y = var1;
            break;
         case 28:
            int[] var5 = new int[]{90, var21.a[var1][1], var21.a[var1][2], var21.a[var1][3], var21.a[var1][4]};
            (var2 = e.a(34, 0, var5)).y = var1;
      }

      return var2;
   }

   static void a(int[] var0, int[] var1) {
      if (J == 100) {
         var1[0] = c.r + var0[0];
         var1[1] = c.s + var0[1];
      } else if (J == 50) {
         var1[0] = c.r + var0[0] << 1;
         var1[1] = c.s + var0[1] << 1;
      } else {
         var1[0] = (c.r + var0[0]) * 100 / J;
         var1[1] = (c.s + var0[1]) * 100 / J;
      }
   }

   static void b(int[] var0, int[] var1) {
      var1[0] = var0[0] - c.r;
      var1[1] = var0[1] - c.s;
   }

   private static void Z(int var0) {
      if (K != 45) {
         aH = (aH += var0) % aI;
      }

      int var1 = b[3][8];
      af();
      b[3][8] = var1 + (a[1][77][2] - a[1][76][2]) * var0;
      S(3);
   }

   private static void p(boolean var0) {
      if (f(1, 16)) {
         a(f.a(c(), L, " "), 1, 17, 0, 0);
      }

      if (f(1, 25)) {
         if (var0 && N > 10) {
            a("" + 0, 1, 27, 0, 0);
         } else {
            if (e() < 50) {
               a(f.a(t(), L, " ") + " / " + f.a(u(), L, " "), 1, 26, 0, 0);
            }

            a("" + e(), 1, 27, 0, 0);
         }
      }

      if (f(1, 21)) {
         a(f.a(d(), L, " "), 1, 22, 0, 0);
      }

      if (f(1, 103)) {
         String var2;
         b((var2 = f.b(458)) == null ? "" : var2, 1, 104, 0, 0);
      } else {
         if (f(1, 94)) {
            for (int var1 = 0; var1 < 4; var1++) {
               a("" + bh[var1], 1, 95 + (var1 << 1), 0, 0);
            }
         }
      }
   }

   private static void gX() {
      if (ac && f(1, 53)) {
         a(e, 1, 54, -5, 0);
      }

      if (ae) {
         if (f(1, 55)) {
            String var0;
            a((var0 = f.b(152)) == null ? "" : var0, 1, 59, 0, 0);
         }

         if (f(1, 56)) {
            String var1;
            a((var1 = f.b(152)) == null ? "" : var1, 1, 60, 0, 0);
         }

         if (f(1, 57)) {
            String var2;
            a((var2 = f.b(152)) == null ? "" : var2, 1, 61, 0, 0);
         }

         if (f(1, 58)) {
            String var3;
            a((var3 = f.b(152)) == null ? "" : var3, 1, 62, 0, 0);
         }
      }
   }

   private static void gY() {
      if (ac && f(1, 53)) {
         long var0 = System.currentTimeMillis();
         if (g < var0) {
            ac = false;
            a(false, fk, '\u0000');
         }

         int var2 = (int)((g - var0) / 5L % 255L);
         int var3 = 10 + f.d(f.Z - var2) / 20;
         d = (short)((c = (short)(a[1][52][2] + 50 + var3)) + 15);
         a[1][53][2] = c;
         a[1][54][2] = d;
      }

      if (ae) {
         int var4 = (int)(System.currentTimeMillis() / 5L % 255L);
         var4 = 10 + f.d(f.Z - var4) / 20;
         d = (short)((c = (short)(a[1][52][2] + 50 + var4)) + 15);
         a[1][55][2] = c;
         a[1][56][2] = c;
         a[1][57][2] = c;
         a[1][58][2] = c;
         a[1][55][3] = (short)(a[1][43][3] + -16);
         a[1][56][3] = (short)(a[1][44][3] + -16);
         a[1][57][3] = (short)(a[1][45][3] + -16);
         a[1][58][3] = (short)(a[1][46][3] + -16);
         a[1][59][2] = d;
         a[1][60][2] = d;
         a[1][61][2] = d;
         a[1][62][2] = d;
         a[1][59][3] = (short)(a[1][43][3] + -21);
         a[1][60][3] = (short)(a[1][44][3] + -21);
         a[1][61][3] = (short)(a[1][45][3] + -21);
         a[1][62][3] = (short)(a[1][46][3] + -21);
      }
   }

   private static void a(boolean var0, int var1, char var2) {
      int var3;
      if ((var3 = a()) != 17 && var3 != 18 && var0) {
         ad = true;
         a = var2;
         fk = var1;
      } else {
         if (f(1, 52)) {
            ac = (boolean)var0;
         } else if (var0) {
            ad = true;
            a = var2;
            var0 = 0;
         }

         if (var0) {
            fk = var1;
            if (var2 == 1) {
               String var4;
               e = (var4 = f.b(152)) == null ? "" : var4;
            } else if (var2 == 2) {
               String var5;
               e = (var5 = f.b(153)) == null ? "" : var5;
            } else {
               e = "%Task%";
            }

            g = System.currentTimeMillis() + 5000L;
            a(1, 53, true);
            b(1, 53, true);
            a(1, 54, true);
            X(41);
         } else {
            a(1, 53, false);
            b(1, 53, false);
         }

         var0 = -1;

         for (int var8 = 0; var8 < h; var8++) {
            if (cx[var8] == 3) {
               var0 = var8;
            }
         }

         if ((var0 = var0) != -1) {
            fk = var0;
            a(26);
            ad = false;
            a = 0;
            a(1, 53, false);
            b(1, 53, false);
         }

         O(1);
      }
   }

   private static void gZ() {
      if (b != null || aP != -1) {
         ha();
      }

      switch (aN) {
         case 160:
            if (!g(1, 52) && E() > 0) {
               b(1, 52, true);
               iz();
            }

            if (p == 1 && g(1, 52)) {
               b(1, 52, false);
               O(1);
               return;
            }
            break;
         case 161:
            if (!e) {
               e = true;
               ao = false;
               if (a() == 17) {
                  e[] var5 = new e[1];
                  e.a(0, 50, 18, var5, 1);
                  if (var5[0] != null) {
                     c.a(var5[0].r, var5[0].s, 1000);
                  }
               }
            }

            if (c.D == 1) {
               ao = true;
            } else if (c.D == 0 && ao) {
               f = true;
            }

            if (f) {
               aN++;
               f = false;
               e = false;
               return;
            }
            break;
         case 162:
            if (!e) {
               e = true;
               String var4;
               a((var4 = f.b(19)) == null ? "" : var4, 15, 0);
            }

            if (f) {
               aN++;
               f = false;
               e = false;
            }

            f = true;
            return;
         case 163:
            if (!e) {
               f = false;
               e = true;
               if (a() == 17) {
                  e[] var3 = new e[1];
                  e.a(0, 50, 18, var3, 1);
                  a(var3[0], 0, -20);
               }
            }

            if (a() == 17 && g(1, 52)) {
               b(1, 52, false);
               O(1);
               return;
            }
            break;
         case 164:
            if (!e) {
               e = true;
               return;
            }
         case 165:
         default:
            break;
         case 166:
            if (!e) {
               e = true;
               f = false;
               aN = 160;
               f = false;
               e = false;
               return;
            }
            break;
         case 167:
            if (!e) {
               e = true;
               String var1;
               a((var1 = f.b(25)) == null ? "" : var1, 7, 0);
               e[] var2 = new e[1];
               e.a(0, 50, 15, var2, 1);
               if (var2[0] != null) {
                  c.a(var2[0].r, var2[0].s, 1000);
               }
            }

            if (f) {
               f = false;
               e = false;
               aN++;
            }

            f = true;
            return;
         case 168:
            if (!e) {
               e = true;
               f = false;
               e[] var0 = new e[1];
               e.a(0, 50, 15, var0, 1);
               if (var0[0] != null) {
                  a(var0[0], 0, -40);
               }
            }

            if (f) {
               f = false;
               e = false;
               aN = 160;
               b();
               return;
            }
            break;
         case 169:
            if (N == 0) {
               e = true;
               f = true;
            }

            if (!e) {
               e = true;
               f = false;
               a(1, 10, true);
            }

            if (f) {
               am = false;
               f = false;
               e = false;
               aN = 160;
               a(1, 10, false);
            }
      }
   }

   private static int d(int var0, int var1) {
      return var0 == 0 ? var1 * d[14] / d[8] : var0 / d[8];
   }

   private static void ha() {
      if (b != null) {
         a[1][9][2] = (short)((b.r + aQ) * J / 100 - c.r);
         a[1][9][3] = (short)((b.s + aR) * J / 100 - c.s);
      } else {
         if (a[1][aP] != null) {
            int var0 = a[1][aP][2] + aQ;
            int var1 = a[1][aP][3] + aR;
            a[1][9][2] = (short)var0;
            a[1][9][3] = (short)var1;
         }
      }
   }

   private static void hb() {
      a(1, 16, false);
      a(1, 13, false);
      a(1, 18, false);
      a(1, 25, false);
      a(1, 21, false);
      a(1, 30, false);
      a(1, 52, false);
      e(false);
      a(1, 67, false);
      a(1, 41, false);
      a(1, 34, false);
      a(1, 68, false);
      b(1, 68, false);
      a(1, 19, false);
      a(1, 15, false);
      a(1, 14, false);
      a(1, 20, false);
      a(1, 28, false);
      a(1, 23, false);
      a(1, 24, false);
      a(1, 29, false);
      a(1, 32, false);
      a(1, 33, false);
      b(1, 52, false);
      b(1, 67, false);
      O(1);
   }

   private static void aa(int var0) {
      a(1, 16, true);
      a(1, 13, true);
      a(1, 18, true);
      a(1, 25, true);
      a(1, 21, true);
      a(1, 30, false);
      a(1, 52, false);
      e(false);
      a(1, 67, false);
      a(1, 14, !h);
      a(1, 20, h);
      a(1, 28, false);
      if (e() >= 50) {
         a(1, 23, false);
         a(1, 24, false);
      } else {
         a(1, 23, true);
         a(1, 24, true);
      }

      a(1, 29, false);
      a(1, 32, false);
      a(1, 33, false);
      b(1, 52, false);
      b(1, 67, false);
      b(1, 71, false);
      b(1, 14, false);
      b(1, 20, false);
      a(1, 19, h);
      a(1, 15, !h);
      if (var0 == 40 || var0 == 13) {
         a(1, 67, true);
         b(1, 67, true);
      }

      O(1);
   }

   private static void ab(int var0) {
      b(2, 31, false);
      b(2, 122, false);
      a(2, 122, false);
      b(2, 3, false);
      b(2, 7, false);
      b(2, 23, false);
      b(2, 24, false);
      b(2, 25, false);
      b(2, 26, false);
      b(2, 27, false);
      b(2, 33, false);
      b(2, 47, false);
      b(2, 61, false);
      b(2, 75, false);
      b(2, 89, false);
      b(2, 46, false);
      b(2, 60, false);
      b(2, 74, false);
      b(2, 88, false);
      b(2, 102, false);
      a(2, 46, false);
      a(2, 60, false);
      a(2, 74, false);
      a(2, 88, false);
      a(2, 102, false);
      if (var0 == 41) {
         b(2, 33, true);
      }
   }

   private static void ac(int var0) {
      a(3, 210, false);
      b(3, 210, false);
      b(3, 202, false);
      b(3, 201, false);
      b(3, 5, false);
      a(3, 214, false);
      if (var0 == 56) {
         b(3, 202, true);
         a(3, 214, true);
      }

      P(3);
      T(0);
   }

   private static void ad(int var0) {
      a(10, 64, false);
      b(10, 64, false);
      a(10, 73, false);
      b(10, 73, false);
      b(10, 3, false);
      b(10, 4, false);
      b(10, 5, false);
      if (var0 == 51) {
         a(10, 78, true);
      } else if (var0 == 50) {
         b(10, 5, true);
         a(10, 79, true);
      }

      P(10);
      T(0);
   }

   private static void hc() {
      K++;
      f = false;
      e = false;
   }

   private static void hd() {
      switch (K) {
         case 1:
            if (!e) {
               e = true;
               w &= -256;
               hb();
               e[] var37 = new e[20];
               int var40 = e.a(0, 49, var37, 20);

               for (int var42 = 0; var42 < var40; var42++) {
                  var37[var42].f(5);
               }

               b(22, 4, false);
               b(22, 8, false);
            }

            if (f) {
               hc();
               K = 2;
            }

            f = true;
            return;
         case 2:
            if (!e && c.D == 0) {
               w &= -256;
               hb();
               i(2, 3, 7);
               e = true;
               f = false;
            }

            if (f) {
               j.j(8);
               hc();
            }

            f = true;
            return;
         case 3:
            if (!e) {
               e = true;
               f = false;
               w &= -3;
               aa(K);
               String var36;
               a((var36 = f.b(4)) == null ? "" : var36, 7, 0);
            }

            if (f) {
               hc();
               K = 5;
            }

            f = true;
            return;
         case 4:
            if (!e) {
               f = false;
               e = true;
               e[] var35 = new e[5];
               e.a(0, 49, var35, 5);
               if (var35[1] != null) {
                  a(var35[1], 35, -100);
                  c.a(var35[1].r, var35[1].s, 1000);
               }

               w &= -3;
            }

            if (f) {
               hc();
               b();
               return;
            }
            break;
         case 5:
            if (!e) {
               f = false;
               e = true;
               w |= 2;
               e[] var33 = new e[3];
               e.a(0, 49, var33, 3);
               a(var33[2], 0, -30);
               fn = 0;
               q = 0;
            }

            e[] var34 = new e[1];
            e.a(2, 47, var34, 1);
            if (q >= 1 && fn == 0) {
               a(1, 12, true);
               fn = 1;
            }

            if (!u) {
               a(1, 12, false);
            }

            if (q >= 6 && var34[0] == null) {
               f = true;
            }

            if (f) {
               hc();
               K = 6;
               w &= -3;
               b();
               a(1, 12, false);
            }

            return;
         case 6:
            if (!e) {
               e = true;
               String var32;
               a((var32 = f.b(6)) == null ? "" : var32, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 7:
            if (!e) {
               e = true;
               f = false;
               e[] var31 = new e[3];
               e.a(0, 49, var31, 3);
               if (var31[1] != null) {
                  a(var31[1], 0, -30);
                  c.a(var31[1].r, var31[1].s, 1000);
               }

               w &= -2;
               f = 0;
            }

            if (f) {
               hc();
               b();
               w &= -2;
               a[1][11][10] = 0;
               return;
            }
            break;
         case 8:
            if (!e) {
               e = true;
               e[] var29 = new e[3];
               e.a(0, 49, var29, 3);
               fn = 0;
               w |= 1;
               q = 0;
            }

            e[] var30 = new e[1];
            e.a(2, 47, var30, 1);
            if (q >= 1 && fn == 0) {
               a(1, 12, true);
               fn = 1;
            }

            if (!u) {
               a(1, 12, false);
            }

            if (q >= 6 && var30[0] == null) {
               f = true;
            }

            if (f) {
               a(false, 0, f);
               w &= -2;
               hc();
               b();
               a(1, 12, false);
            }

            return;
         case 9:
            if (!e) {
               e = true;
               i(17, 18, 7);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 10:
            if (!e) {
               e = true;
               f = false;
               iB();
               a(1, 64, true);
               a(1, 52, true);
               b(1, 52, true);
               P(1);
            }

            if (f) {
               a(1, 64, false);
               hc();
               return;
            }
            break;
         case 11:
            if (!e) {
               e = true;
               a(1, 65, true);
            }

            if (f) {
               a(1, 65, false);
               hc();
               return;
            }
            break;
         case 12:
            if (!e) {
               e = true;
            }

            if (f) {
               return;
            }
            break;
         case 13:
            if (!e) {
               b(1, 52, false);
               e = true;
               b();
               a(1, 69, true);
               P(1);
            }

            if (g(1, 52)) {
               b(1, 52, false);
               b(1, 67, true);
               P(1);
            }

            if (f) {
               hc();
               return;
            }
            break;
         case 14:
            if (!e) {
               e = true;
            }

            if (a != null && a.q == 54 && a.y == 16) {
               f = true;
            }

            if (f) {
               hc();
               return;
            }
            break;
         case 15:
            if (!e) {
               e = true;
               w &= -3;
               int[] var28 = new int[2];
               int[] var39;
               (var39 = new int[2])[0] = 27;
               var39[1] = 31;
               d(var39, var28);
               a.r = var28[0];
               a.s = var28[1];
               c.a(a.r, a.s, 1000);
               A(false);
               e[] var41 = new e[1];
               e.a(0, 54, 16, var41, 1);
               a(var41[0], 0, -40);
               a(1, 69, false);
               a(1, 71, false);
               b(1, 71, false);
               b(1, 52, false);
               b(1, 67, false);
               b(1, 53, false);
               P(1);
            }

            if (f = a == null) {
               A(true);
               hc();
               return;
            }
            break;
         case 16:
            if (!e) {
               e = true;
               String var27;
               a((var27 = f.b(5)) == null ? "" : var27, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 17:
            if (!e) {
               e = true;
               e[] var26 = new e[1];
               e.a(0, 54, 16, var26, 1);
               a(var26[0], 0, -100);
            }

            if (g(1, 52)) {
               b(1, 52, false);
               b(1, 53, false);
               b(1, 67, false);
            }

            if (f) {
               hc();
               b();
               return;
            }
            break;
         case 18:
            if (!e) {
               e = true;
               e[] var25 = new e[1];
               e.a(0, 54, 16, var25, 1);
               if (var25[0] != null) {
                  a(true, var25[0]);
                  he();
               }
            }

            if (g(1, 52)) {
               b(1, 52, false);
               b(1, 53, false);
               b(1, 67, false);
               P(1);
            }

            if (f) {
               hc();
               b();
               return;
            }
            break;
         case 19:
            if (!e) {
               e = true;
               String var24;
               a((var24 = f.b(16)) == null ? "" : var24, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 20:
            if (!e) {
               e = true;
               String var23;
               a((var23 = f.b(20)) == null ? "" : var23, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 21:
            if (!e) {
               f(false);
               a(false, fk, '\u0000');
               w &= -256;
               ao(17);
               e = true;
               f = false;
            }

            if (f) {
               hc();
               ak = false;
            }

            f = true;
            return;
         case 22:
            if (!e) {
               e = true;
               String var22;
               a((var22 = f.b(22)) == null ? "" : var22, 7, 0);
               bu = false;
               a(a, 0, -50);
            }

            if (g(1, 52)) {
               b(1, 52, false);
               b(1, 53, false);
            }

            if (f) {
               hc();
               b();
            }

            f = true;
            return;
         case 23:
            if (!e) {
               e = true;
               f = false;
               e[] var21 = new e[1];
               e.a(0, 50, 14, var21, 1);
               if (var21[0] != null) {
                  a(var21[0], 5, -50);
                  var21[0].j(512);
               }
            }

            if (g(1, 52)) {
               b(1, 52, false);
               b(1, 53, false);
               b(1, 67, false);
               O(1);
            }

            if (f) {
               hc();
               b();
               return;
            }
            break;
         case 24:
            if (!e) {
               a(22, 194, true);
               e = true;
               b(22, 96, false);
               a(22, 96, false);
               O(22);
            }

            if (f) {
               hc();
               a(22, 194, false);
               return;
            }
            break;
         case 25:
            if (!e) {
               a(22, 195, true);
               e = true;
               T(1);
            }

            if (f) {
               U(1);
               O(22);
               hc();
               a(22, 195, false);
               return;
            }
            break;
         case 26:
            if (!e) {
               e = true;
               a(6, 39, false);
               b(6, 39, false);
               O(6);
            }

            if (!f(6, 45) && a[6][34][6] == 48) {
               a(6, 45, true);
            }

            if (f) {
               a(6, 45, false);
               hc();
               return;
            }
            break;
         case 27:
            if (!e) {
               e = true;
               a(6, 45, false);
               a(6, 44, true);
               a(6, 39, true);
               b(6, 39, true);
               b(6, 34, false);
               b(6, 10, false);
               b(6, 15, false);
               O(6);
            }

            if (f) {
               hc();
               a(6, 44, false);
               return;
            }
            break;
         case 28:
            if (!e) {
               e = true;
               a(6, 44, false);
               a(22, 99, true);
               a(22, 25, false);
               b(22, 25, false);
               b(22, 171, false);
               cL = 0;
            }

            if (!h(0, 1)) {
               T(0);
               O(22);
            }

            if (f) {
               a(22, 99, false);
               hc();
               return;
            }
            break;
         case 29:
            if (!e) {
               e = true;
               a(22, 100, true);
            }

            if (!h(0, 1)) {
               T(0);
               O(22);
            }

            if (f) {
               a(22, 100, false);
               hc();
               return;
            }
            break;
         case 30:
            if (!e) {
               a(22, 192, true);
               a(22, 96, true);
               b(22, 96, true);
               e = true;
               U(0);
               O(22);
            }

            if (f) {
               a(22, 192, false);
               b(22, 171, true);
               hc();
               return;
            }
            break;
         case 31:
            if (!e) {
               e = true;
               i(27, 24, 7);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 32:
            if (!e) {
               e = true;
               f = false;
               e[] var20 = new e[1];
               e.a(0, 54, 17, var20, 1);
               if (var20[0] != null) {
                  a(var20[0], 0, -50);
               }

               w = (w |= 255) & -2;
            }

            if (f) {
               return;
            }
            break;
         case 33:
            if (!e) {
               e = true;
               b();
               String var19;
               a((var19 = f.b(23)) == null ? "" : var19, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 34:
            if (!e) {
               e = true;
               f = false;
               b(1, 52, false);
               b(1, 53, false);
               e[] var18 = new e[1];
               e.a(0, 54, 17, var18, 1);
               if (var18[0] != null) {
                  var18[0].q();
                  a(var18[0], 0, -50);
               }
            }

            if (f) {
               hc();
               b();
               return;
            }
            break;
         case 35:
            if (!e) {
               e = true;
               b(1, 52, false);
               b(1, 53, false);
               e[] var17 = new e[1];
               e.a(0, 54, 17, var17, 1);
               if (!var17[0].a(16)) {
                  a(true, var17[0]);
                  he();
               }
            }

            if (f) {
               hc();
               b();
               return;
            }
            break;
         case 36:
            if (!e) {
               e = true;
            }

            if (f) {
               hc();
               return;
            }
            break;
         case 37:
            if (!e) {
               e = true;
               e[] var15 = new e[40];
               int var38 = e.a(0, 49, var15, 40);
               w |= 1;

               for (int var2 = 0; var2 < var38; var2++) {
                  var15[var2].E();
                  var15[var2].H();
               }

               String var16;
               a((var16 = f.b(12)) == null ? "" : var16, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 38:
            if (!e) {
               e = true;
               f = false;
               aa(K);
               q = 0;
               w = (w &= ~(1 << 255)) | 2;
               e[] var13 = new e[1];
               e.a(0, 49, var13, 1);
               if (var13[0] != null) {
                  a(var13[0], 0, -50);
                  c.a(var13[0].r, var13[0].s, 1000);
               }

               aq = false;
            }

            if (q > 0 && !aq) {
               aq = true;
               b();
            }

            if (q >= 6) {
               e[] var14 = new e[1];
               e.a(2, 47, var14, 1);
               if (var14[0] == null) {
                  f = true;
               }
            }

            if (f) {
               w &= -3;
               hc();
               return;
            }
            break;
         case 39:
            if (!e) {
               e = true;
               aa(K);
               w &= -2;
               String var12;
               a((var12 = f.b(13)) == null ? "" : var12, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 40:
            if (!e) {
               e = true;
               f = false;
               a(1, 69, true);
               aa(K);
            }

            if (f) {
               hc();
               a(1, 69, false);
               return;
            }
            break;
         case 41:
            if (!e) {
               ab(K);
               if (dV == 0) {
                  a(2, 134, true);
               } else {
                  a[2][134][10] = 0;
                  a[2][131][10] = 1;
               }

               a(2, 11, true);
               b(2, 11, true);
               b(2, 14, false);
               b(2, 15, false);
               b(2, 16, false);
               b(2, 17, false);
               P(2);
               T(0);
               e = true;
            }

            if (f) {
               a(2, 131, false);
               hc();
               return;
            }
            break;
         case 42:
            if (!e) {
               e = true;
               bu = false;
               a(1, 71, false);
               b(1, 71, false);
               aa(K);
               w |= 32;
               q = 0;
               if (a != null) {
                  a.r = 1080;
                  a.s = 432;
                  c.a(a.r, a.s, 1000);
               }
            }

            if (q >= 2) {
               f = true;
            }

            if (f) {
               a(1, 67, true);
               b(1, 67, true);
               o(false);
               g(false);
               d = -1;
               w &= -33;
               hc();
               return;
            }
            break;
         case 43:
            if (!e) {
               e = true;
               aa(K);
               String var11;
               a((var11 = f.b(15)) == null ? "" : var11, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 44:
            if (!e) {
               e = true;
               f = false;
               e[] var10 = new e[5];
               e.a(0, 49, var10, 5);
               a(var10[4], 0, -50);
               w |= 1;
               f = 1;
            }

            if (f) {
               hc();
               b();
               w &= -2;
               return;
            }
            break;
         case 45:
            if (!e) {
               e = true;
               w |= 1;
               aq = false;
               q = 0;
               e(0);
            }

            if (q > 0 && !aq) {
               aq = true;
               b();
            }

            if (q >= 8) {
               f = true;
            }

            if (f) {
               hc();
               w &= -2;
               a(false, 0, f);
               U(3);
               return;
            }
            break;
         case 46:
            if (!e) {
               e = true;
               i(9, 10, 7);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 47:
            if (!e) {
               e = true;
               f = false;
               w &= -256;
               hb();
               e[] var9 = new e[1];
               e.a(0, 50, 10, var9, 1);
               if (var9[0] != null) {
                  var9[0].k(512);
               }
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 48:
            if (!e) {
               f = false;
               e = true;
               String var7;
               a((var7 = f.b(11)) == null ? "" : var7, 7, 0);
            }

            if (f) {
               e[] var8 = new e[1];
               e.a(0, 50, 10, var8, 1);
               if (var8[0] != null) {
                  a(var8[0], 0, -50);
                  c.a(var8[0].r, var8[0].s, 1000);
               }

               hc();
            }

            f = true;
            return;
         case 49:
            if (!e) {
               f = false;
               e = true;
               aa(K);
               e[] var6 = new e[1];
               e.a(0, 50, 10, var6, 1);
               if (var6[0] != null) {
                  var6[0].j(512);
               }

               a(1, 9, 1);
            }

            if (f) {
               b();
               hc();
               return;
            }
            break;
         case 50:
            if (!e) {
               ad(K);
               e = true;
            }

            if (f) {
               a(10, 79, false);
               hc();
               return;
            }
            break;
         case 51:
            if (!e) {
               ad(K);
               e = true;
            }

            if (f) {
               a(10, 78, false);
               hc();
               return;
            }
            break;
         case 52:
            if (!e) {
               int[] var5 = new int[2];
               int[] var1;
               (var1 = new int[2])[0] = 30;
               var1[1] = 28;
               d(var1, var5);
               a.r = var5[0];
               a.s = var5[1];
               c.a(var5[0], var5[1], 1000);
               w |= 1;
               b(1, 70, true);
               a(1, 71, false);
               b(1, 71, false);
               P(1);
               e = true;
            }

            if (f = a == null) {
               hc();
               w &= -2;
               return;
            }
            break;
         case 53:
            if (!e) {
               e = true;
               String var4;
               a((var4 = f.b(8)) == null ? "" : var4, 7, 0);
            }

            if (f) {
               hc();
            }

            f = true;
            return;
         case 54:
            if (!e) {
               e[] var3 = new e[1];
               e.a(0, 50, 9, var3, 1);
               if (var3[0] != null) {
                  a(var3[0], 0, -50);
               }

               aa(K);
               f = false;
               e = true;
            }

            if (f) {
               hc();
               K = 56;
               b();
               return;
            }
            break;
         case 55:
            if (!e) {
               e = true;
            }

            if (f) {
               hc();
               return;
            }
            break;
         case 56:
            if (!e) {
               e = true;
               ac(K);
            }

            if (f) {
               hc();
               a(3, 214, false);
               return;
            }
            break;
         case 57:
            if (!e) {
               e = true;
               aq = false;
            }

            e[] var0 = new e[1];
            e.a(2, 47, var0, 1);
            if (var0[0] != null) {
               aq = true;
            }

            if (aq && var0[0] == null) {
               f = true;
            }

            if (f) {
               hc();
            }

            return;
         case 58:
            if (!e) {
               e = true;
               f = false;
               aa(K);
               w |= 255;
               a(false, 0, f);
               a(true, false, false);
               f(true);
               a(false, null);
            }

            if (e() >= 2) {
               f = true;
            }

            if (f) {
               hc();
               return;
            }
            break;
         case 59:
            if (!e) {
               e = true;
               iB();
               a(1, 52, true);
               b(1, 52, true);
               f = false;
               K = -1;
               aN = 160;
               S = true;
               w |= 255;
               a(false, 0, f);
               D = 13;
               r();
            }
      }
   }

   private static void a(e var0, int var1, int var2) {
      b = var0;
      aQ = var1;
      aR = var2;
      a(1, 9, true);
      c(1, 9, 1, -1);
   }

   private static void he() {
      b = null;
      aP = 0;
      aQ = 60;
      aR = -20;
      a(1, 9, true);
      c(1, 9, 1, -1);
   }

   static void b() {
      b = null;
      aP = -1;
      aR = 0;
      aQ = 0;
      a(1, 9, false);
      i(1, 9);
   }

   private static void hf() {
      aR = false;
      aS = false;
      aT = false;
      aT = 0;
      g var0 = g.a(12);
      int var5 = 0;
      int var2 = 0;

      while (!var2) {
         if (var0.a[var5][1] == r) {
            var2 = 1;
         } else if (var5 < var0.a) {
            var5++;
         } else {
            var5 = 0;
            var2 = 1;
         }
      }

      int var1 = var0.a[var5][3];
      var2 = var0.a[var5][4];
      int var3 = var0.a[var5][7];
      int var4 = var0.a[var5][8];
      h = b((long)var0.a[var5][2]);
      aY = l(var0.a[var5][5]);
      ba = l(var0.a[var5][9]);
      bc = l(var0.a[var5][6]);
      bd = l(var0.a[var5][10]);
      if (c(i = b((long)c())) > c(h)) {
         i = h;
      }

      for (int var10 = 0; var10 < 2; var10++) {
         int var12;
         if (var10 == 0) {
            var12 = var1;
         } else {
            var12 = var3;
         }

         switch (var12) {
            case 1:
               var0 = g.a(0);
               short var19 = 1008;
               short var21 = 0;
               short var7 = 0;
               int var23 = var0.a;

               for (int var28 = 0; var28 < var23; var28++) {
                  int var25;
                  if (var10 == 0) {
                     var25 = var2;
                  } else {
                     var25 = var4;
                  }

                  if (var25 == var0.a[var28][1]) {
                     var19 = (short)var0.a[var28][3];
                     var21 = (short)var0.a[var28][4];
                     var7 = (short)var0.a[var28][32];
                     if (var10 == 0) {
                        be = (short)var0.a[var28][2];
                     } else {
                        bf = (short)var0.a[var28][2];
                     }
                     break;
                  }
               }

               a[11][var10 + 35][5] = var19;
               a[11][var10 + 35][6] = var21;
               a[11][var10 + 35][8] = var7;
               if (var10 == 0) {
                  aZ = l(aZ = (aZ = e.b(0, var2)) + e(3, var2 - 2000));
               } else {
                  bb = l(bb = (bb = e.b(0, var4)) + e(3, var4 - 2000));
               }
               break;
            case 2:
               var0 = g.a(2);
               short var18 = 9;
               short var20 = 0;
               int var22 = var0.a;

               for (int var27 = 0; var27 < var22; var27++) {
                  int var24;
                  if (var10 == 0) {
                     var24 = var2;
                  } else {
                     var24 = var4;
                  }

                  if (var24 == var0.a[var27][1]) {
                     var18 = (short)var0.a[var27][3];
                     var20 = (short)var0.a[var27][4];
                     if (var10 == 0) {
                        be = (short)var0.a[var27][2];
                     } else {
                        bf = (short)var0.a[var27][2];
                     }
                     break;
                  }
               }

               a[11][var10 + 35][5] = var18;
               a[11][var10 + 35][6] = var20;
               a[11][var10 + 35][8] = 0;
               w(a[11][var10 + 35][5]);
               if (var10 == 0) {
                  aZ = l(aZ = (aZ = e.b(0, var2)) + e(4, var2 - 3000 - 12));
               } else {
                  bb = l(bb = (bb = e.b(0, var4)) + e(4, var4 - 3000 - 12));
               }
               break;
            case 3:
               var0 = g.a(1);
               short var17 = 2;
               short var6 = 0;
               int var8 = var0.a;

               for (int var11 = 0; var11 < var8; var11++) {
                  int var9;
                  if (var10 == 0) {
                     var9 = var2;
                  } else {
                     var9 = var4;
                  }

                  if (var9 == var0.a[var11][1]) {
                     var17 = (short)var0.a[var11][3];
                     var6 = (short)var0.a[var11][4];
                     if (var10 == 0) {
                        be = (short)var0.a[var11][2];
                     } else {
                        bf = (short)var0.a[var11][2];
                     }
                     break;
                  }
               }

               a[11][var10 + 35][5] = var17;
               a[11][var10 + 35][6] = var6;
               a[11][var10 + 35][8] = 0;
               w(a[11][var10 + 35][5]);
               if (var10 == 0) {
                  aZ = l(aZ = e(0, var2 - 4000));
               } else {
                  bb = l(bb = e(0, var4 - 4000));
               }
         }
      }

      int var26;
      label120: {
         var26 = 0;
         if (!n()) {
            a(11, 25, false);
            a(11, 22, false);
            a(11, 33, false);
            a(11, 29, false);
            a(11, 26, false);
            a(11, 23, false);
            a(11, 34, false);
            a(11, 30, false);
         } else {
            if (!b[r] && m(aZ) < m(aY)) {
               a(11, 25, false);
               a(11, 22, false);
               a(11, 33, true);
               a(11, 29, true);
            } else {
               var26++;
               a(11, 25, true);
               a(11, 22, true);
               a(11, 33, false);
               a(11, 29, false);
            }

            if (!c[r] && m(bb) < m(ba)) {
               a(11, 26, false);
               a(11, 23, false);
               a(11, 34, true);
               a(11, 30, true);
            } else {
               var26++;
               a(11, 26, true);
               a(11, 23, true);
               a(11, 34, false);
               a(11, 30, false);
            }

            if (a[r - 1]) {
               var26++;
               a(11, 27, true);
               a(11, 24, true);
               break label120;
            }
         }

         a(11, 27, false);
         a(11, 24, false);
      }

      if (a[r - 1]) {
         if (r == 1) {
            a[11][37][5] = 10;
            a[11][37][6] = 10;
         } else {
            a[11][37][5] = 1141;
            a[11][37][6] = 0;
         }
      } else if (r == 1) {
         a[11][37][5] = 10;
         a[11][37][6] = 10;
      } else {
         a[11][37][5] = 1141;
         a[11][37][6] = 1;
      }

      if (c(i) == c(h)) {
         var26++;
         a(11, 28, true);
      } else {
         a(11, 28, false);
      }

      if (var26 == 4) {
         ar = true;
         a(11, 7, true);
         b(11, 7, true);
         a[11][3][10] = 1;
      } else {
         ar = false;
         a(11, 7, false);
         b(11, 7, false);
         a[11][3][10] = 0;
      }
   }

   private static void q(boolean var0) {
      byte var1 = 11;
      int var2 = 10;
      int var3 = 13;
      int var4 = 12;
      int[] var6 = new int[2];
      int[] var7 = new int[2];
      hj();
      switch (r) {
         case 1:
            var2 = 2;
            var1 = 2;
            break;
         case 2:
            var2 = 2;
            var1 = 2;
            break;
         case 3:
            var1 = 2;
            break;
         case 4:
            var1 = 2;
            var3 = 2;
            break;
         case 5:
            var1 = 2;
            var3 = 2;
            var2 = 2;
            break;
         case 6:
            var1 = 2;
            var3 = 2;
            var2 = 2;
            break;
         case 7:
            var1 = 2;
            var3 = 2;
            var2 = 2;
            break;
         case 8:
            var1 = 2;
            var3 = 2;
            var2 = 2;
            break;
         case 9:
            var1 = 2;
            var3 = 2;
            var4 = 2;
            break;
         case 10:
            var1 = 2;
            var3 = 2;
            var4 = 2;
            break;
         case 11:
            var1 = 2;
            var3 = 2;
            var4 = 2;
            break;
         case 12:
            var1 = 2;
            var3 = 2;
            var2 = 2;
            var4 = 2;
      }

      if (r > 0 && r < 13) {
         for (int var8 = aU; var8 < aW; var8 += 2) {
            for (int var9 = aV; var9 <= aX; var9 += 2) {
               int var15;
               label145: {
                  var7[0] = var8;
                  var7[1] = var9;
                  d(var7, var6);
                  var15 = var6[0] / 36;
                  int var10 = var6[1] / 18;
                  byte var10000;
                  if (var8 == aU) {
                     var10000 = var1;
                  } else if (var9 == aV) {
                     var10000 = (byte)var2;
                  } else if (var9 == aX) {
                     var10000 = (byte)var3;
                  } else if (var8 == aW - 2) {
                     if (var9 % 4 != 2) {
                        if ((var15 = i.a(0, var15, var10)) >= 5) {
                           var15 = var15 - 5 < 0 ? 0 : (var15 - 5 > 3 ? 3 : var15 - 5);
                        }
                        break label145;
                     }

                     var10000 = (byte)var4;
                  } else {
                     if ((var15 = i.a(0, var15, var10)) < 5) {
                        break label145;
                     }

                     var10000 = (byte)(var15 - 5 < 0 ? 0 : (var15 - 5 > 3 ? 3 : var15 - 5));
                  }

                  var15 = var10000;
               }

               i.a(var6[0], var6[1], var15);
            }
         }

         if (b[r] != null) {
            b[r].q = -1;
         }

         i.d();
         var4 = aX;
         var3 = aW;
         var2 = aV;

         for (int var11 = aU; var11 < var3; var11++) {
            for (int var16 = var2; var16 < var4; var16++) {
               int var18 = var16 * 96 + var11;
               f[var18] = 0;
            }
         }

         a[r] = true;
         if (r < 12 && b[r + 1] != null) {
            b[r + 1].F = 0;
         }

         if (N == 0 && var0) {
            a(r, 1, 8, false);
            a(r, 1, 8);
         }

         e[] var19 = new e[100];
         int var20 = e.a(0, -1, aU, aW, aV, aX, var19, 100);

         for (int var17 = 0; var17 < var20; var17++) {
            if (!var19[var17].a(4096)) {
               var19[var17].j(512);
               if (var19[var17].q == 54 && var0 && !var19[var17].a(32)) {
                  var19[var17].k(4);
                  var19[var17].k(16);
                  var19[var17].k(256);
                  var19[var17].q();
                  var19[var17].h(2);
               }

               if (var19[var17].a(2)) {
                  a(var19[var17]);
               }

               if (N == 0 && var0) {
                  int var21 = var19[var17].J;
                  if (var19[var17].J < G[0] || var21 > G[63] || var21 % 2 == 1) {
                     a(true);
                     m(var21);
                  }
               }
            }
         }

         i.d();
         k = true;
      }
   }

   private static void hg() {
      a = new boolean[13];

      for (int var0 = 0; var0 < 13; var0++) {
         a[var0] = false;
      }

      a[0] = true;
      if (N == 0) {
         b = new e[13];
      }

      b = new boolean[13];
      c = new boolean[13];

      for (int var1 = 0; var1 < 13; var1++) {
         b[var1] = false;
         c[var1] = false;
      }
   }

   private static void hh() {
      for (r = 1; r < 13 && a != null && a[r]; r++) {
         hj();
         q(false);
      }
   }

   private static void hi() {
      if (e != null && !e.a()) {
         e.d(J);
         f.b(true);
         e.b();
         f.b(false);
      }
   }

   private static void hj() {
      int[] var0 = new int[4];
      a(r, var0);
      aU = var0[0];
      aW = var0[1];
      aV = var0[2];
      aX = var0[3];
   }

   private static void hk() {
      int[] var0 = new int[9];
      int[] var1 = new int[2];
      int[] var2 = new int[2];

      for (int var3 = 1; var3 < 13; var3++) {
         r = var3;
         if (!a[var3]) {
            hj();
            var1[0] = aU + 12;
            var1[1] = aV + 12;
            d(var1, var2);
            var0[0] = var2[0];
            var0[1] = var2[1];
            var0[2] = 12;
            var0[3] = 141;
            if ((!a[var3 - 1] || var3 != 13) && (!a[var3 - 1] || a[var3 + 1])) {
               var0[4] = 1;
            } else {
               var0[4] = 0;
            }

            var0[5] = 0;
            var0[6] = -1;
            var0[7] = -1;
            var0[8] = 0;
            if (N == 0) {
               b[var3] = e.a(32, 0, var0);
               b[var3].j(16777216);
            }
         }
      }
   }

   private static boolean n() {
      short var0 = 0;
      switch (r) {
         case 1:
            var0 = 24;
            break;
         case 2:
            var0 = 43;
            break;
         case 3:
            var0 = 59;
            break;
         case 4:
            var0 = 89;
            break;
         case 5:
            var0 = 130;
            break;
         case 6:
            var0 = 153;
            break;
         case 7:
            var0 = 183;
            break;
         case 8:
            var0 = 210;
            break;
         case 9:
            var0 = 243;
            break;
         case 10:
            var0 = 251;
            break;
         case 11:
            var0 = 283;
            break;
         case 12:
            var0 = 290;
      }

      return g(var0);
   }

   private static int r() {
      int var0 = 1;

      while (var0 < 13 && a[var0]) {
         var0++;
      }

      return var0 - 1;
   }

   private static void hl() {
      d = new int[10][];
      e = new int[10][];
      a = new long[10][];
      g var0 = g.a(8);

      for (int var1 = 0; var1 < 10; var1++) {
         d[var1] = new int[6];
         d[var1][0] = var0.a[var1][7];
         d[var1][1] = var0.a[var1][8];
         d[var1][2] = 0;
         d[var1][3] = -1;
         d[var1][4] = -1;
         d[var1][5] = 5;
         e[var1] = new int[6];
      }

      z = new int[(var0 = g.a(24)).a];

      for (int var3 = 0; var3 < var0.a; var3++) {
         z[var3] = var0.a[var3][7];
      }

      for (int var4 = 0; var4 < 10; var4++) {
         a[var4] = new long[6];
      }
   }

   static boolean c() {
      long var0 = System.currentTimeMillis() / 1000L;
      g var2 = g.a(8);
      g var3 = g.a(18);
      g var4 = g.a(24);
      boolean var5 = false;

      for (int var6 = 0; var6 < 10; var6++) {
         if (a[var6][3] > 0L) {
            long var7 = var0 - a[var6][3];

            for (int var9 = d[var6][1] / d[25]; var7 >= z[var9]; var9 = d[var6][1] / d[25]) {
               a[var6][3] = a[var6][3] + z[var9];
               if ((d[ew][2] & 16) != 16) {
                  j(var6, -var4.a[var9][8]);
               }

               d[ew][2] = 0;
               var7 = var0 - a[var6][3];
            }
         }

         if (a[var6][4] > 0L) {
            if (a[ew][4] + 86400L - var0 <= 0L) {
               a[ew][4] = 0L;
               break;
            }

            while (true) {
               long var23 = var0 - a[var6][4];
               int var18 = d[var6][1] / d[25];
               if (var23 < z[var18]) {
                  break;
               }

               a[var6][4] = a[var6][4] + z[var18];
               if ((d[ew][2] & 1) != 1) {
                  j(var6, -var4.a[var18][9]);
               }

               d[ew][2] = 0;
            }
         }

         if (a[var6][2] > 0L && var0 - a[var6][2] >= 86400L) {
            int var19 = var6;
            g var8 = g.a(18);
            a[var19][2] = 0L;
            if (var8.a[e() - 1][11] > -1) {
               for (int var24 = 0; var24 < 2; var24++) {
                  e[var19][var24 * 3] = 0;
                  e[var19][var24 * 3 + 1] = -1;
                  e[var19][var24 * 3 + 2] = 0;
               }

               int var25 = f.c(0, 100);
               int var10 = 0;

               for (int var11 = 0; var11 < 2 && var10 < var8.a[e() - 1][11]; var11++) {
                  if (var25 < var8.a[e() - 1][13]) {
                     int var38 = var8.a[e() - 1][11] - var10;
                     int var34 = var11;
                     var10 = var19;
                     g var40 = g.a(1);
                     int var44 = 0;
                     int[] var46 = new int[117];

                     for (int var50 = 0; var50 < 117; var50++) {
                        if (!b(var10, 1, var50) && var40.a[var50][5] < var38 && var40.a[var50][11] <= e() && var40.a[var50][14] >= 1) {
                           var46[var44++] = var50;
                        }
                     }

                     int var51 = 0;
                     if (var44 > 0) {
                        e[var10][var34 * 3] = 1;
                        e[var10][var34 * 3 + 1] = var46[f.c(0, var44)];
                        e[var10][var34 * 3 + 2] = f.c(1, var38 / var40.a[e[var10][var34 * 3 + 1]][5] < 5 ? var38 / var40.a[e[var10][var34 * 3 + 1]][5] : 5);
                        var51 = e[var10][var34 * 3 + 2] * var40.a[e[var10][var34 * 3 + 1]][5];
                     }

                     var10 += var51;
                  } else if (var25 < var8.a[e() - 1][13] + var8.a[e() - 1][14]) {
                     int var37 = var8.a[e() - 1][11] - var10;
                     int var33 = var11;
                     var10 = var19;
                     g var39 = g.a(4);
                     int var42 = 0;
                     int[] var45 = new int[63];

                     for (int var48 = 0; var48 < 63; var48++) {
                        if (!b(var10, 2, var48)
                           && var39.a[var48][8] <= e()
                           && var39.a[var48][16] >= 1
                           && var39.a[var48][7] == 0
                           && d(var39.a[var48][6], var39.a[var48][7]) < var37) {
                           var45[var42++] = var48;
                        }
                     }

                     int var49 = 0;
                     if (var42 > 0) {
                        e[var10][var33 * 3] = 2;
                        e[var10][var33 * 3 + 1] = var45[f.c(0, var42)];
                        var42 = d(var39.a[e[var10][var33 * 3 + 1]][6], var39.a[e[var10][var33 * 3 + 1]][7]);
                        e[var10][var33 * 3 + 2] = f.c(1, var37 / var42 < 5 ? var37 / var42 : 5);
                        var49 = e[var10][var33 * 3 + 2] * var42;
                     }

                     var10 += var49;
                  } else {
                     int var13 = var8.a[e() - 1][11] - var10;
                     int var12 = var11;
                     var10 = var19;
                     g var14 = g.a(16);
                     int var15 = 0;
                     int[] var16 = new int[15];

                     for (int var17 = 0; var17 < 15; var17++) {
                        if (!b(var10, 3, var17) && var14.a[var17][4] <= e() && var14.a[var17][5] < var13) {
                           var16[var15] = var17;
                           var15++;
                        }
                     }

                     int var47 = 0;
                     if (var15 > 0) {
                        e[var10][var12 * 3] = 3;
                        var15 = var16[f.c(0, var15)];
                        e[var10][var12 * 3 + 1] = (var15 << 2) + f.c(0, 3);
                        var13 = var14.a[var15][5];
                        e[var10][var12 * 3 + 2] = 1;
                        var47 = e[var10][var12 * 3 + 2] * var13;
                     }

                     var10 += var47;
                  }
               }
            }
         }

         if (a[var6][5] > 0L && var0 - a[var6][5] >= 86400L) {
            if (var2.a[var6][10] <= d[var6][1] && f.c(0, 100) < var2.a[var6][9]) {
               int var30 = var3.a - 1;

               while (var30 > 0 && var3.a[var30][12] > d[var6][1]) {
                  var30--;
               }

               int var22 = e() < (d[var6][0] < var30 ? d[var6][0] : var30) ? e() : (d[var6][0] < var30 ? d[var6][0] : var30);
               int var20 = var6;
               g var26 = g.a(1);
               int var32 = 0;
               int[] var31 = new int[117];

               for (int var35 = 0; var35 < 117; var35++) {
                  if (var26.a[var35][11] <= var22 && var26.a[var35][11] >= 0 && var26.a[var35][12] >= 1) {
                     if (var26.a[var35][11] > 0) {
                        var32 = 0;
                     }

                     var31[var32++] = var35;
                  }
               }

               if (var32 > 0) {
                  d[var20][3] = var31[f.c(0, var32)];
                  a(cG[0] + var20, 1, 31, false);
                  a(cG[0] + var20, 1, 31);
               }
            }

            a[var6][5] = var0;
         }

         int var21 = var6;
         if (e[var21][0] != 0 || d[var6][3] != -1 || d[var6][4] != -1) {
            var5 = true;
         }
      }

      return var5;
   }

   private static boolean b(int var0, int var1, int var2) {
      return e[var0][0] == var1 && e[var0][1] == var2;
   }

   private static void ae(int var0) {
      if (e[var0] != null) {
         for (int var1 = 0; var1 < 2; var1++) {
            e[var0][var1 * 3] = 0;
         }
      }

      a[var0][2] = System.currentTimeMillis() / 1000L;
   }

   private static void e(int var0, int var1, int var2) {
      int var3 = var1 + 4;
      var2 /= d[25];

      while (var1 < var3) {
         var2 -= 3;
         if (var2 >= 0) {
            a[var0][var1][6] = 31;
         } else {
            a[var0][var1][6] = (short)(var2 + 31);
            var2 = 0;
         }

         var1++;
      }
   }

   private static void j(int var0, int var1) {
      d[var0][1] = d[var0][1] + var1 < 0 ? 0 : (d[var0][1] + var1 > d[24] ? d[24] : d[var0][1] + var1);
   }

   private static void a(int var0, g var1) {
      if (var1 == null) {
         var1 = g.a(23);
      }

      g[var0][0] = l(0);
      g[var0][1] = l(0);
      g[var0][2] = 0;

      for (int var3 = 0; var3 < 3; var3++) {
         f[var0][var3 << 1] = -1;
         f[var0][(var3 << 1) + 1] = 0;
      }

      if (var0 < var1.a[e() - 1][6]) {
         if (var0 == 0 && K != -1) {
            f[var0][0] = 9;
            f[var0][1] = 6;
            g[var0][0] = l(200);
            g[var0][1] = l(10);
            g[var0][2] = f.c(409, 438);
            return;
         }

         int var2 = f.c(var1.a[e() - 1][1], var1.a[e() - 1][2]);
         int var12 = 0;

         for (int var4 = 0; var4 < 3 && var12 < var2; var4++) {
            int var10002 = var2 - var12;
            int var6 = var1.a[e() - 1][4];
            int var5 = var10002;
            var12 = var4;
            g var7 = g.a(1);
            int var8 = 0;
            int[] var9 = new int[117];

            for (int var10 = 0; var10 < 117; var10++) {
               int var11 = var10;
               if (f[var0][0] != var11 && f[var0][2] != var11 && var7.a[var10][5] < var5 && var7.a[var10][11] <= e() && var7.a[var10][12] >= 1) {
                  var9[var8] = var10;
                  var8++;
               }
            }

            int var15 = 0;
            if (var8 > 0) {
               f[var0][var12 << 1] = var9[f.c(0, var8)];
               var5 /= var7.a[f[var0][var12 << 1]][5];
               f[var0][(var12 << 1) + 1] = f.c(1, var5 < var6 ? var5 : var6);
               var15 = f[var0][(var12 << 1) + 1] * var7.a[f[var0][var12 << 1]][5];
            }

            var12 += var15;
         }

         g[var0][0] = l(var12);
         g[var0][1] = l(var1.a[e() - 1][5]);
         g[var0][2] = f.c(409, 438);
      }
   }

   private static boolean q(int var0) {
      if (!au) {
         return false;
      }

      boolean var1 = true;

      for (int var2 = 0; var1 && var2 < 3; var2++) {
         boolean var10000;
         label32: {
            if (f[var0] != null) {
               if (f[var0][var2 << 1] <= -1 || f[var0][var2 << 1] >= 117) {
                  continue;
               }

               if (f[var0][(var2 << 1) + 1] <= e(0, f[var0][var2 << 1])) {
                  var10000 = true;
                  break label32;
               }
            }

            var10000 = false;
         }

         var1 = var10000;
      }

      return var1;
   }

   static boolean d() {
      for (int var0 = 0; var0 < A[e() - 1]; var0++) {
         if (q(var0)) {
            return true;
         }
      }

      return false;
   }

   private static void hm() {
      g var0 = g.a(25);

      for (int var1 = 0; var1 < bg; var1++) {
         if (B[var1] == -1) {
            B[var1] = var0.a[var1][1];
            String var2;
            b[var1] = (var2 = f.b(var0.a[var1][3])) == null ? "" : var2;
            c[var1] = (var2 = f.b(var0.a[var1][6])) == null ? "" : var2;
            C[var1] = var0.a[var1][4];
            D[var1] = var0.a[var1][5];
            E[var1] = var0.a[var1][7];
            F[var1] = l(0);
            G[var1] = l(var0.a[var1][8]);
            H[var1] = var0.a[var1][9];
            d[var1] = false;
            I[var1] = var0.a[var1][10];
            J[var1] = var0.a[var1][11];
            K[var1] = var0.a[var1][12];
            L[var1] = var0.a[var1][13];
         } else if (B[var1] == var0.a[var1][1]) {
            String var4;
            b[var1] = (var4 = f.b(var0.a[var1][3])) == null ? "" : var4;
            c[var1] = (var4 = f.b(var0.a[var1][6])) == null ? "" : var4;
            C[var1] = var0.a[var1][4];
            D[var1] = var0.a[var1][5];
            E[var1] = var0.a[var1][7];
            G[var1] = l(var0.a[var1][8]);
            H[var1] = var0.a[var1][9];
            I[var1] = var0.a[var1][10];
            J[var1] = var0.a[var1][11];
            K[var1] = var0.a[var1][12];
            L[var1] = var0.a[var1][13];
         }
      }
   }

   static int a(int var0, int var1, int var2) {
      byte var3 = 0;
      if (K != -1) {
         return 0;
      }

      for (int var5 = 0; var5 < bg; var5++) {
         int var4 = -1;
         if (!d[var5] && E[var5] == 2999 && var2 == 38) {
            if (var0 >= 2000 && var0 < 2999 && var0 % 2 == 1) {
               F[var5] = l(m(F[var5]) + var1);
               if (m(F[var5]) >= m(G[var5])) {
                  F[var5] = G[var5];
                  d[var5] = true;
                  var4 = var5;
               } else if (m(F[var5]) < 0) {
                  F[var5] = l(0);
               }
            }
         } else if (!d[var5] && E[var5] == 5999 && var2 == 5) {
            if (var0 >= 5000 && var0 < 5999) {
               int var10 = var0 - 5000;
               if (!e[var10]) {
                  e[var10] = true;
                  F[var5] = l(m(F[var5]) + 1);
                  if (m(F[var5]) >= m(G[var5])) {
                     F[var5] = G[var5];
                     d[var5] = true;
                     var4 = var5;
                  }
               }
            }
         } else if (!d[var5] && E[var5] == 9998 && var2 == 42) {
            if (var0 >= cG[0] && var0 <= cG[9]) {
               int var8 = var0 - cG[0];
               N[var8] = var1;
               if (N[var8] >= 4) {
                  N[var8] = 4;
                  F[var5] = l(0);

                  for (int var9 = 0; var9 < m(G[var5]); var9++) {
                     if (N[var9] >= 4) {
                        F[var5] = l(m(F[var5]) + 1);
                     }
                  }

                  if (m(F[var5]) >= m(G[var5])) {
                     F[var5] = G[var5];
                     d[var5] = true;
                     var4 = var5;
                  }
               }
            }
         } else if (d[var5] || E[var5] != 2991 || var2 != 38) {
            int var7;
            if ((var7 = a(d[var5], E[var5], var0, H[var5], var2, false)) == 1) {
               F[var5] = l(m(F[var5]) + var1);
               if (m(F[var5]) >= m(G[var5])) {
                  F[var5] = G[var5];
                  d[var5] = true;
                  var4 = var5;
               } else if (m(F[var5]) < 0) {
                  F[var5] = l(0);
               }
            } else if (var7 == 2) {
               if (var1 >= m(G[var5])) {
                  F[var5] = G[var5];
                  d[var5] = true;
                  var4 = var5;
               } else {
                  F[var5] = l(var1);
               }
            }
         } else if (var0 >= 2000 && var0 < 2999 && var0 % 2 == 1 && var1 > 0) {
            int var6 = s();
            F[var5] = l(var6);
            if (m(F[var5]) >= m(G[var5])) {
               F[var5] = G[var5];
               d[var5] = true;
               var4 = var5;
            }
         }

         if (var4 != -1) {
            if (m(G[var4]) == 0 || d[var4]) {
               af(var4);
               var3 = 1;
            }

            if (a() != 38) {
               h(true, var4);
            }
         }
      }

      return var3;
   }

   private static int s() {
      int var0 = 0;

      for (int var1 = 0; var1 < 64; var1++) {
         g[var1] = 0;
      }

      for (int var2 = 0; var2 < 64; var2++) {
         if (var2 % 2 != 0) {
            g[var2] = (short)e.a(0, 54, var2, var2);
         }
      }

      for (int var3 = 0; var3 < 64; var3++) {
         if (g[var3] > 0) {
            var0++;
         }
      }

      return var0;
   }

   private static void af(int var0) {
      if (M[var0] == -1) {
         M[var0] = B[var0];
         e[var0] = 1;
      }
   }

   private static void ag(int var0) {
      int var1 = b[0][9];
      if (e[var0] == 1) {
         if (J[var0] > 0) {
            int var2 = J[var0];
            bK += var2;
         }

         if (K[var0] > 0) {
            int var3 = K[var0];
            bL += var3;
         }

         if (L[var0] > 0) {
            int var4 = L[var0];
            bM += var4;
         }

         e[var0] = 2;
         ic();
         O(19);
      }

      em = var1;
   }

   static void a(boolean var0) {
      for (int var1 = 0; var1 < bg; var1++) {
         if (M[var1] == -1 && e[var1] != 1 && !d[var1] && H[var1] == 38) {
            int var2 = -1;
            if (E[var1] == H[29]) {
               int var3 = e.b(0, E[var1]);
               F[var1] = l(var3);
               if (m(F[var1]) >= m(G[var1])) {
                  F[var1] = G[var1];
                  var2 = var1;
               }
            } else if (E[var1] == 3999) {
               int var4 = e.c(0, 52);
               F[var1] = l(var4);
               if (m(F[var1]) >= m(G[var1])) {
                  F[var1] = G[var1];
                  var2 = var1;
               }
            } else if (E[var1] == 2999) {
               int var5 = e.a(0, 54, 0, 63);
               F[var1] = l(var5);
               if (m(F[var1]) >= m(G[var1])) {
                  F[var1] = G[var1];
                  var2 = var1;
               }
            } else if (E[var1] == 2991) {
               int var6 = s();
               F[var1] = l(var6);
               if (m(F[var1]) >= m(G[var1])) {
                  F[var1] = G[var1];
                  var2 = var1;
               }
            }

            if (var2 != -1) {
               d[var2] = true;
               af(var2);
               if (var0) {
                  h(true, var2);
               }
            }
         }
      }
   }

   protected final void pointerPressed(int var1, int var2) {
      super.pointerPressed(var1, var2);
      bi = 0;
      bh = 0;
   }

   protected final void pointerDragged(int var1, int var2) {
      super.pointerDragged(var1, var2);
      bh = bh + f.V;
      bi = bi + f.V;
   }

   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var4 > 0 && var5 > 0) {
         O[0] = -8;
         O[1] = -8;
         O[2] = O[3] = 15;
         P[0] = var2;
         P[1] = var3;
         P[2] = var4;
         P[3] = var5;
         int[] var10 = P;
         int[] var8 = O;
         var2 = O[0];
         var5 = var10[0];
         var3 = var8[0] + var8[2];
         int var6 = var10[0] + var10[2];
         var4 = var8[1];
         int var7 = var10[1];
         var0 = var8[1] + var8[3];
         var1 = var10[1] + var10[3];
         if (var0 < var7 ? false : (var4 > var1 ? false : (var3 < var5 ? false : var2 <= var6))) {
            return true;
         }
      }

      return false;
   }

   static void c(int[] var0, int[] var1) {
      int var2 = (var0[0] - 1044 << 8) / 18;
      int var3 = (var0[1] - 108 << 8) / 9;
      var1[0] = var2 + var3 >> 8;
      var1[1] = var3 - var2 >> 8;
   }

   static void d(int[] var0, int[] var1) {
      int var2 = var0[0] - var0[1] << 8 >> 1;
      int var3 = (var0[1] << 8) + var2;
      var1[0] = var2 * 18 >> 8;
      var1[1] = var3 * 9 >> 8;
      var1[0] += 1044;
      var1[1] += 108;
   }

   static void a(e var0) {
      int[] var1 = new int[2];
      int[] var2 = new int[2];
      var1[0] = var0.r;
      var1[1] = var0.s;
      c(var1, var2);
      var2[0] -= var0.w >> 1;
      var2[1] -= var0.x >> 1;

      for (int var5 = 0; var5 < var0.w; var5++) {
         for (int var3 = 0; var3 < var0.x; var3++) {
            if (j(var2[0] + var5, var2[1] + var3)) {
               int var4 = (var2[1] + var3) * 96 + var2[0] + var5;
               f[var4] = (byte)(f[var4] | 1);
            }
         }
      }
   }

   static void b(e var0) {
      int[] var1 = new int[2];
      int[] var2 = new int[2];
      var1[0] = var0.r;
      var1[1] = var0.s;
      c(var1, var2);
      var2[0] -= var0.w >> 1;
      var2[1] -= var0.x >> 1;

      for (int var5 = 0; var5 < var0.w; var5++) {
         for (int var3 = 0; var3 < var0.x; var3++) {
            if (j(var2[0] + var5, var2[1] + var3)) {
               int var4 = (var2[1] + var3) * 96 + var2[0] + var5;
               f[var4] = (byte)(f[var4] & -2);
            }
         }
      }
   }

   static boolean a(e var0) {
      int[] var1 = new int[2];
      int[] var2 = new int[2];
      var1[0] = var0.r;
      var1[1] = var0.s;
      c(var1, var2);
      var2[0] -= var0.w >> 1;
      var2[1] -= var0.x >> 1;
      boolean var5 = false;

      for (int var3 = 0; var3 < var0.w && !var5; var3++) {
         for (int var4 = 0; var4 < var0.x && !var5; var4++) {
            if (j(var2[0] + var3, var2[1] + var4)) {
               int var6 = (var2[1] + var4) * 96 + var2[0] + var3;
               var5 = (f[var6] & 1) != 0;
            } else {
               var5 = true;
            }
         }
      }

      return var5;
   }

   static boolean a(e var0, e var1) {
      int[] var2 = new int[2];
      int[] var3 = new int[2];
      var2[0] = var0.r;
      var2[1] = var0.s;
      c(var2, var3);
      var3[0] -= var0.w >> 1;
      var3[1] -= var0.x >> 1;
      var2 = new int[2];
      int[] var4 = new int[2];
      var2[0] = var1.r;
      var2[1] = var1.s;
      c(var2, var4);
      var4[0] -= var1.w >> 1;
      var4[1] -= var1.x >> 1;
      return var3[0] < var4[0] + var1.w && var3[0] + var0.w > var4[0] && var3[1] < var4[1] + var1.x && var3[1] + var0.x > var4[1];
   }

   static boolean a(int var0, int var1, int var2, int var3) {
      int[] var4;
      (var4 = new int[2])[0] = var0;
      var4[1] = var1;
      var4[0] -= var2 >> 1;
      var4[1] -= var3 >> 1;
      int var6 = 0;

      for (int var8 = 0; var8 < var2 && !var6; var8++) {
         for (int var5 = 0; var5 < var3 && !var6; var5++) {
            if (j(var4[0] + var8, var4[1] + var5)) {
               var6 = (var4[1] + var5) * 96 + var4[0] + var8;
               var6 = (f[var6] & 1) != 0;
            } else {
               var6 = 1;
            }
         }
      }

      return (boolean)var6;
   }

   private static boolean j(int var0, int var1) {
      return var0 >= 0 && var0 < 96 && var1 >= 0 && var1 < 96;
   }

   private static void d(int var0, int var1, int var2, int var3) {
      while (var0 < var2) {
         for (int var4 = var1; var4 < var3; var4++) {
            int var5 = var4 * 96 + var0;
            f[var5] = 1;
         }

         var0++;
      }
   }

   static boolean a(int var0, int var1) {
      if (j(var0, var1)) {
         var0 = var1 * 96 + var0;
         return (f[var0] & 1) == 0;
      } else {
         return false;
      }
   }

   private static void hn() {
      for (int var0 = 0; var0 < 9216; var0++) {
         f[var0] = 0;
      }

      int var2 = 0;

      for (int var1 = 48; var2 < 48; var1--) {
         d(0, var2, var1, var2 + 1);
         var2++;
      }

      d(0, 48, 48, 96);
      d(48, 0, 96, 96);
   }

   private static boolean a(e var0, int[] var1) {
      int[] var2 = new int[2];
      int[] var3 = new int[2];
      var2[0] = f.T >> 1;
      var2[1] = f.U >> 1;
      a(var2, var3);
      c(var3, var2);
      d(var2, var3);
      return a(var0, var1, var3[0], var3[1]);
   }

   private static boolean a(e var0, int[] var1, int var2, int var3) {
      int[] var4;
      (var4 = new int[2])[0] = var2;
      var4[1] = var3;
      int var5 = 0;
      int var6 = 1;
      byte var7 = 0;
      byte var8 = 0;
      boolean var9 = false;
      boolean var10 = true;

      boolean var11;
      for (var11 = false; !var11 && var6 < 96; var4[1] += var8) {
         var0.r = var4[0];
         var0.s = var4[1];
         if (!a(var0)) {
            var1[0] = var4[0];
            var1[1] = var4[1];
            var11 = true;
         }

         if (--var6 == 0) {
            if (var9 = !var9) {
               var10 = !var10;
               var5++;
            }

            var7 = (byte)(var10 != var9 ? 36 : -36);
            var8 = (byte)(var10 ? -18 : 18);
            var6 = var5;
         }

         var4[0] += var7;
      }

      if (!var11) {
         var0.r = var2;
         var0.s = var3;
      }

      return var11;
   }

   static int a(int var0, int var1) {
      if (var0 >= 0 && var0 < 48 && var1 >= 0 && var1 < 48 && var0 + var1 > 48) {
         return 0;
      } else if (var0 >= 0 && var0 < 24 && var1 >= 48 && var1 < 72) {
         return 1;
      } else if (var0 >= 24 && var0 < 48 && var1 >= 48 && var1 < 72) {
         return 2;
      } else if (var0 >= 48 && var0 < 72 && var1 >= 48 && var1 < 72) {
         return 3;
      } else if (var0 >= 48 && var0 < 72 && var1 >= 24 && var1 < 48) {
         return 4;
      } else if (var0 >= 48 && var0 < 72 && var1 >= 0 && var1 < 24) {
         return 5;
      } else if (var0 >= 0 && var0 < 24 && var1 >= 72 && var1 < 96) {
         return 6;
      } else if (var0 >= 24 && var0 < 48 && var1 >= 72 && var1 < 96) {
         return 7;
      } else if (var0 >= 48 && var0 < 72 && var1 >= 72 && var1 < 96) {
         return 8;
      } else if (var0 >= 72 && var0 < 96 && var1 >= 72 && var1 < 96) {
         return 9;
      } else if (var0 >= 72 && var0 < 96 && var1 >= 48 && var1 < 72) {
         return 10;
      } else if (var0 >= 72 && var0 < 96 && var1 >= 24 && var1 < 48) {
         return 11;
      } else {
         return var0 >= 72 && var0 < 96 && var1 >= 0 && var1 < 24 ? 12 : -1;
      }
   }

   static boolean a(int var0) {
      return var0 > -1 ? a[var0] : false;
   }

   private static void a(int var0, int[] var1) {
      switch (var0) {
         case 0:
            var1[0] = 24;
            var1[1] = 48;
            var1[2] = 24;
            var1[3] = 48;
            return;
         case 1:
            var1[0] = 0;
            var1[1] = 24;
            var1[2] = 48;
            var1[3] = 72;
            return;
         case 2:
            var1[0] = 24;
            var1[1] = 48;
            var1[2] = 48;
            var1[3] = 72;
            return;
         case 3:
            var1[0] = 48;
            var1[1] = 72;
            var1[2] = 48;
            var1[3] = 72;
            return;
         case 4:
            var1[0] = 48;
            var1[1] = 72;
            var1[2] = 24;
            var1[3] = 48;
            return;
         case 5:
            var1[0] = 48;
            var1[1] = 72;
            var1[2] = 0;
            var1[3] = 24;
            return;
         case 6:
            var1[0] = 0;
            var1[1] = 24;
            var1[2] = 72;
            var1[3] = 96;
            return;
         case 7:
            var1[0] = 24;
            var1[1] = 48;
            var1[2] = 72;
            var1[3] = 96;
            return;
         case 8:
            var1[0] = 48;
            var1[1] = 72;
            var1[2] = 72;
            var1[3] = 96;
            return;
         case 9:
            var1[0] = 72;
            var1[1] = 96;
            var1[2] = 72;
            var1[3] = 96;
            return;
         case 10:
            var1[0] = 72;
            var1[1] = 96;
            var1[2] = 48;
            var1[3] = 72;
            return;
         case 11:
            var1[0] = 72;
            var1[1] = 96;
            var1[2] = 24;
            var1[3] = 48;
            return;
         case 12:
            var1[0] = 72;
            var1[1] = 96;
            var1[2] = 0;
            var1[3] = 24;
      }
   }

   static int b(int var0, int var1) {
      byte var2 = 16;
      switch (var0) {
         case 1:
            if (var1 == 1) {
               var2 = 0;
            } else if (var1 == 2) {
               var2 = 1;
            } else if (var1 == 3) {
               var2 = 2;
            } else if (var1 == 4) {
               var2 = 3;
            }
            break;
         case 2:
            if (var1 == 1) {
               var2 = 4;
            } else if (var1 == 2) {
               var2 = 5;
            } else if (var1 == 3) {
               var2 = 6;
            } else if (var1 == 4) {
               var2 = 7;
            }
            break;
         case 3:
            if (var1 == 2) {
               var2 = 8;
            } else if (var1 == 3) {
               var2 = 9;
            } else if (var1 == 4) {
               var2 = 10;
            } else if (var1 == 5) {
               var2 = 11;
            } else if (var1 == 6) {
               var2 = 12;
            }
            break;
         case 4:
            if (var1 == 1) {
               var2 = 13;
            } else if (var1 == 2) {
               var2 = 14;
            } else if (var1 == 3) {
               var2 = 15;
            } else if (var1 == 4) {
               var2 = 16;
            } else if (var1 == 5) {
               var2 = 17;
            } else if (var1 == 6) {
               var2 = 18;
            } else if (var1 == 8) {
               var2 = 19;
            }
            break;
         case 5:
            if (var1 == 3) {
               var2 = 20;
            } else if (var1 == 4) {
               var2 = 21;
            } else if (var1 == 5) {
               var2 = 22;
            }
            break;
         case 6:
            if (var1 == 2) {
               var2 = 23;
            } else if (var1 == 6) {
               var2 = 24;
            }
         case 7:
         case 9:
         default:
            break;
         case 8:
            if (var1 == 4) {
               var2 = 25;
            } else if (var1 == 8) {
               var2 = 26;
            }
            break;
         case 10:
            if (var1 == 10) {
               var2 = 27;
            }
      }

      return var2;
   }

   private static void ho() {
      (h = new int[5][])[0] = new int[117];
      h[1] = new int[20];
      h[2] = new int[63];
      h[3] = new int[64];
      h[4] = new int[10];
      aQ = new int[100];
      dr = 0;
      (j = new int[5][])[0] = new int[117];
      j[1] = new int[20];
      j[2] = new int[63];
      j[3] = new int[64];
      j[4] = new int[10];

      for (int var0 = 0; var0 < 5; var0++) {
         byte var1 = 0;
         switch (var0) {
            case 0:
               var1 = 117;
               break;
            case 1:
               var1 = 20;
               break;
            case 2:
               var1 = 63;
               break;
            case 3:
               var1 = 64;
               break;
            case 4:
               var1 = 10;
         }

         for (int var2 = 0; var2 < var1; var2++) {
            f(var0, var2, 0);
         }
      }
   }

   private static boolean a(int var0, int var1, e var2) {
      boolean var3 = a(var0, var1, 1);
      if (var0 == 3 && var2 != null) {
         aQ[dr] = var2.J;
         dr++;
      }

      return var3;
   }

   static boolean a(int var0, int var1, int var2) {
      int var3 = b(5);
      if (var2 > 0 && var3 > b()) {
         b(471, 477);
         return false;
      }

      if (var2 < 0 && var3 < 0) {
         return false;
      }

      int var4 = var0 == 4 ? 12 : 0;
      g(var0, var1 - var4, var2);
      var4 = 0;
      if (var0 == 0) {
         var4 = c[var1];
      } else if (var0 == 4) {
         var4 = a[var1];
      } else if (var0 == 1) {
         var4 = b[var1];
      } else if (var0 == 2) {
         var4 = g.a(4).a[var1][1];
      } else if (var0 == 3) {
         var4 = G[var1];
      }

      if (var4 != 0 && var2 > 0) {
         a(var4, var2, 34, false);
      }

      dk = var3 + var2;
      return true;
   }

   private static int k(int var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < 5; var2++) {
         byte var3 = 0;
         switch (var2) {
            case 0:
               if (var0 == 5 || var0 == var2) {
                  var3 = 117;
               }
               break;
            case 1:
               if (var0 == 5 || var0 == var2) {
                  var3 = 20;
               }
               break;
            case 2:
               if (var0 == 5 || var0 == var2) {
                  var3 = 63;
               }
               break;
            case 3:
               if (var0 == 5 || var0 == var2) {
                  var3 = 64;
               }
               break;
            case 4:
               if (var0 == 5 || var0 == var2) {
                  var3 = 10;
               }
         }

         for (int var4 = 0; var4 < var3; var4++) {
            if (e(var2, var4) > 0) {
               var1++;
            }
         }
      }

      return var1;
   }

   static int b(int var0) {
      var0 = 0;

      for (int var1 = 0; var1 < 5; var1++) {
         byte var2 = 0;
         switch (var1) {
            case 0:
               var2 = 117;
               break;
            case 1:
               var2 = 20;
               break;
            case 2:
               var2 = 63;
               break;
            case 3:
               var2 = 64;
               break;
            case 4:
               var2 = 10;
         }

         for (int var3 = 0; var3 < var2; var3++) {
            var0 += e(var1, var3);
         }
      }

      return var0;
   }

   private static void c(e var0) {
      if (var0 != null) {
         byte var1 = 0;
         int var2 = var0.y;
         switch (var0.q) {
            case 20:
               var1 = 2;
               break;
            case 50:
               var1 = 1;
               break;
            case 52:
               var1 = 4;
               break;
            case 54:
               var1 = 3;
         }

         var0.G();
         if (var0.q == 54) {
            a(var1, var2, var0);
            b(var0, true);
            return;
         }

         a(var1, var2, 1);
         var0.e();
      }
   }

   private static void b(e var0, boolean var1) {
      if (var0 != null) {
         if (var1) {
            var0.j(4096);
            var0.k(8);
            var0.k(512);
            var0.b = null;
            var0.b = false;
         } else {
            var0.k(4096);
            var0.j(8);
            var0.j(512);
         }
      }
   }

   static int b() {
      int var0;
      if (N == 0) {
         var0 = dm * e.b(0, 1002);
      } else {
         var0 = bF;
      }

      return var0;
   }

   static void f(int var0) {
      s += var0;
   }

   static void c() {
      if (s > 0 && e.a(2) == 0 && u == 0) {
         s = 0;
      }

      if (g && e.a(2) == 0 && u == 0) {
         g = false;
      }
   }

   private static void f(int var0, int var1, int var2) {
      h[var0][var1] = l(var2);
      j[var0][var1] = h[var0][var1];
   }

   private static int e(int var0, int var1) {
      int var2 = m(h[var0][var1]);
      var0 = m(j[var0][var1]);
      return var2 != var0 ? var0 : var2;
   }

   private static void g(int var0, int var1, int var2) {
      var2 = e(var0, var1) + var2 < 0 ? 0 : (e(var0, var1) + var2 > 4000000 ? 4000000 : e(var0, var1) + var2);
      f(var0, var1, var2);
   }

   static int c() {
      long var0 = c(k);
      long var2 = c(l);
      return var0 != var2 ? (int)var2 : (int)var0;
   }

   static int d() {
      int var0 = m(bv);
      int var1 = m(bR);
      return var0 != var1 ? var1 : var0;
   }

   static int e() {
      int var0 = m(bs);
      int var1 = m(bP);
      return var0 != var1 ? var1 : var0;
   }

   private static int t() {
      int var0 = m(bt);
      int var1 = m(bQ);
      return var0 != var1 ? var1 : var0;
   }

   private static void ah(int var0) {
      l = k = b((long)var0);
   }

   private static void ai(int var0) {
      bR = bv = l(var0);
   }

   private static void aj(int var0) {
      bP = bs = l(var0);
   }

   private static void ak(int var0) {
      bQ = bt = l(var0);
   }

   private static void hp() {
      e[] var0 = new e[1];
      e.a(0, 50, 18, var0, 1);
      int var1 = 0;
      int var2 = 0;
      if (var0[0] != null) {
         var1 = var0[0].r;
         var2 = var0[0].s;
      }

      int[] var3 = new int[]{0, 0, 14};
      if (bK > 0) {
         e.a(47, 2, var3).a(var1 - 50, var2, 10, 1000, false, bK);
         bK = 0;
      }

      if (bL > 0) {
         e.a(47, 2, var3).a(var1, var2, 9, 1000, true, bL);
         bL = 0;
      }

      if (bM > 0) {
         e.a(47, 2, var3).a(var1 + 50, var2, 2, 1000, true, bM);
         bM = 0;
      }
   }

   private static void r(boolean var0) {
      aj(1);
      ak(0);
      if (var0) {
         ah(d[0]);
         ai(d[1]);
      }

      R = new int[99];
      S = new int[99];
      h = new short[99];
      g var2 = g.a(5);

      for (int var1 = 0; var1 < 99; var1++) {
         R[var1] = var2.a[var1][1];
         S[var1] = var2.a[var1][2];
         h[var1] = (short)var2.a[var1][3];
      }

      al(10);
      am(10);
      an(10);
      Q = new int[6];
      U = new int[6];

      for (int var3 = 0; var3 < 6; var3++) {
         k(var3, 0);
      }
   }

   static boolean b(int var0) {
      int var1 = c();
      if (var0 <= var1) {
         g(-var0);
         return true;
      } else {
         return false;
      }
   }

   static boolean c(int var0) {
      return var0 <= c();
   }

   static boolean d(int var0) {
      return var0 <= d();
   }

   static boolean b(int var0, int var1) {
      if (var0 <= c(var1)) {
         l(var1, -var0);
         return true;
      } else {
         return false;
      }
   }

   static boolean e(int var0) {
      if (var0 <= d()) {
         h(-var0);
         return true;
      } else {
         return false;
      }
   }

   static void g(int var0) {
      ah(c() + var0 < 0 ? 0 : (c() + var0 > bu ? bu : c() + var0));
      if (var0 > 0) {
         a(0, var0, 11, false);
      }
   }

   static boolean c(int var0, int var1) {
      if (v() + var0 > bx * e.b(0, 1005)) {
         D = 1;
         s(17);
         return false;
      } else {
         l(var1, var0);
         return true;
      }
   }

   static void h(int var0) {
      ai(d() + var0 < 0 ? 0 : (d() + var0 > bw ? bw : d() + var0));
   }

   static void i(int var0) {
      if ((by = by + var0 < 0 ? 0 : (by + var0 > bz ? bz : by + var0)) >= bz && !i(1, 33)) {
         a[1][33][7] = 0;
         c(1, 33, 0, -1);
      }

      if (by == bz) {
         a(0, 1, 35, false);
      }
   }

   static void j(int var0) {
      bG = bG + var0 < 0 ? 0 : (bG + var0 > bH ? bH : bG + var0);
   }

   private static void hq() {
      int var0;
      aj(var0 = e() + 1);
      if (var0 <= 50) {
         if (var0 < 50) {
            g var1 = g.a(27);

            for (int var2 = 0; var2 < var1.a; var2++) {
               if (var1.a[var2][1] == var0) {
                  int var3 = w();
                  al(var1.a[var2][2]);
                  dG = w() - var3;
                  am(var1.a[var2][3]);
                  an(var1.a[var2][4]);
                  break;
               }
            }
         } else {
            al(100);
            am(100);
            an(100);
         }

         if (q()) {
            a(true, fk, '\u0001');
         }

         if (var0 < 99) {
            int var7 = S[e() - 1];
            short var9 = h[e() - 1];
            int[] var10 = new int[2];
            int[] var4;
            (var4 = new int[2])[0] = f.T >> 1;
            var4[1] = f.U >> 1;
            a(var4, var10);
            int[] var5 = new int[]{0, 0, 14};
            if (var7 > 0) {
               e.a(47, 2, var5).a(var10[0], var10[1], 9, 1000, false, var7);
            }

            if (var9 > 0) {
               e.a(47, 2, var5).a(var10[0], var10[1], 2, 1000, true, var9);
            }
         }

         ap = true;
         a(13);
         g var6 = g.a(23);

         for (int var8 = 0; var8 < var6.a[e() - 1][6]; var8++) {
            if (m(g[var8][0]) == 0) {
               a(var8, var6);
            }
         }
      }
   }

   static void k(int var0) {
      int var1 = t();
      if (e() < 50) {
         ak(var1 + var0);
         ap = true;
         var0 = u();

         for (int var3 = t(); var0 > 0 && var3 >= var0; var0 = u()) {
            ak(var3 -= var0);
            hq();
         }
      }
   }

   private static int u() {
      int var0 = 999999;
      if (e() < 99) {
         var0 = 1 > R[e()] ? 1 : R[e()];
      }

      return var0;
   }

   private static int v() {
      int var0 = 0;

      for (int var1 = 0; var1 < 6; var1++) {
         var0 += c(var1);
      }

      return var0;
   }

   private static void k(int var0, int var1) {
      Q[var0] = l(var1);
      U[var0] = Q[var0];
   }

   static int c(int var0) {
      int var1 = m(Q[var0]);
      var0 = m(U[var0]);
      return var1 != var0 ? var0 : var1;
   }

   private static void l(int var0, int var1) {
      var1 = c(var0) + var1 < 0 ? 0 : (c(var0) + var1 > bx * e.b(0, 1005) ? bx * e.b(0, 1005) : c(var0) + var1);
      k(var0, var1);
   }

   private static void al(int var0) {
      bS = bB = l(var0);
   }

   private static int w() {
      int var0 = m(bB);
      int var1 = m(bS);
      return var0 != var1 ? var1 : var0;
   }

   private static void am(int var0) {
      bT = bC = l(var0);
   }

   private static int x() {
      int var0 = m(bC);
      int var1 = m(bT);
      return var0 != var1 ? var1 : var0;
   }

   private static void an(int var0) {
      bU = bE = l(var0);
   }

   private static int y() {
      int var0 = m(bE);
      int var1 = m(bU);
      return var0 != var1 ? var1 : var0;
   }

   private static void hr() {
      t = 0;
      u = 0;
      v = 0;
   }

   static void a(int var0, e var1) {
      if (u < 64) {
         e var2 = var1;
         boolean var3 = false;
         int var4 = 0;

         for (int var5 = t; var4 < u && !var3; var5 = ++var4 + t & 63) {
            var3 = b[var5] == var0 && a[var5] == var2;
         }

         if (!var3 && (w & 1 << var0) == 1 << var0) {
            int var6 = (u + t) % 64;
            b[var6] = var0;
            a[var6] = var1;
            u++;
            var1.e = true;
            var1.j(65536);
            var1.H();
         }
      }
   }

   private static void hs() {
      if (u < 64) {
         a[t].e = false;
         a[t].H();
         a[t].k(65536);
         b[t] = 0;
         a[t] = null;
         u--;
         t++;
         v = 0;
         if (t >= 64) {
            t = 0;
         }
      }
   }

   private static void ht() {
      if (u > 0) {
         switch (v) {
            case 0:
               if (b[t] == 0 || b[t] == 1 || N != 0 && d[N - 1][5] <= 0) {
                  v = 3;
                  return;
               }

               j.a(a[t].r - 18, a[t].s - 9);
               v = 1;
               return;
            case 1:
               if (!j.g()) {
                  j.c(2);
                  v = 2;
                  return;
               }

               return;
            case 2:
            default:
               return;
            case 3:
         }

         if (N == 0 || d[N - 1][5] > 0) {
            switch (b[t]) {
               case 0:
                  X(46);
                  a[t].l();
                  break;
               case 1:
                  if (g) {
                     hs();
                     return;
                  }

                  X(39);
                  if (a[t].q == 49) {
                     int var5 = 1 + (a[t].a(1024) ? 1 : 0);
                     if (N == 0 && b(5) + e.a(2) + var5 > b() || N == 0 && b(5) + s + var5 > b()) {
                        g = true;
                        a(false, 1, f);
                        if (b(5) < b()) {
                           String var10;
                           var10 = f.a((var10 = f.b(476)) == null ? "" : var10, "%slots", "" + f.a(var5, L, " "));
                           String var6;
                           a((var6 = f.b(475)) == null ? "" : var6, var10, 7, 0);
                        } else {
                           b(471, 477);
                        }
                     } else {
                        f(1);
                        a[t].m();
                     }
                  } else {
                     int var7 = 3 + (a[t].a(1024) ? 1 : 0);
                     if (N == 0 && b(5) + e.a(2) + var7 > b() || N == 0 && b(5) + s + var7 > b()) {
                        g = true;
                        a(false, 1, f);
                        if (b(5) < b()) {
                           String var12;
                           var12 = f.a((var12 = f.b(476)) == null ? "" : var12, "%slots", "" + f.a(var7, L, " "));
                           String var8;
                           a((var8 = f.b(475)) == null ? "" : var8, var12, 7, 0);
                        } else {
                           b(471, 477);
                        }
                     } else {
                        f(3);
                        a[t].o();
                     }
                  }
                  break;
               case 2:
                  a[t].p();
                  a(a[t].J, 1, 10, false);
               case 3:
               default:
                  break;
               case 4:
                  a[t].s();
                  break;
               case 5:
                  a[t].f(1);
                  break;
               case 6:
                  e var4;
                  (var4 = a[t]).H();
                  b(var4);
                  int[] var9 = new int[]{0, 0, 14};
                  e.a(47, 2, var9).a(var4.r, var4.s, 10, 1000, false, 1);
                  var4.D = 9;
                  var4.E = -1;
                  var4.F = -1;
                  break;
               case 7:
                  int var0 = a[t].l;
                  int var1 = a[t].m;
                  if (a[t].b) {
                     if (var0 > 0) {
                        var0++;
                     }

                     if (var1 > 0) {
                        var1++;
                     }
                  }

                  if ((N != 0 || b(5) + var0 + var1 > b()) && N == 0) {
                     if (b(5) < b()) {
                        String var2;
                        var2 = f.a((var2 = f.b(476)) == null ? "" : var2, "%slots", "" + f.a(var0 + var1, L, " "));
                        String var3;
                        a((var3 = f.b(475)) == null ? "" : var3, var2, 7, 0);
                     } else {
                        b(471, 477);
                     }
                  } else {
                     a[t].t();
                  }
            }

            if (N != 0) {
               aR(-1);
               if (N >= 1) {
                  a(cG[0] + N - 1, 1, 24, false);
               }
            }

            i(T[t]);
            hs();
            return;
         }

         while (u > 0) {
            hs();
         }

         X(55);
      }
   }

   private static void ao(int var0) {
      bN = var0;
      if (var0 == 19) {
         X(42);
      }

      a(35);
   }

   private static void hu() {
      switch (bN) {
         case 0:
         case 15:
            a(0, 100, 1, 0, 24);
            a(0, 97, 1, 0, 24);
            a(0, 81, 1, 0, 24);
            a(0, 101, 1, 0, 24);
            break;
         case 1:
         case 17:
            a(0, 86, 1, 0, 24);
            break;
         case 2:
         case 19:
            a(0, 99, 1, 0, 24);
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 16:
         case 18:
      }

      f.c("/5");
      c(0, 3);
      f.k();
      f.c("/10");
      byte[] var0 = f.a(bN);
      f.k();
      int var20 = 0;
      byte var2 = f.a(var0, 0);
      var20++;

      for (int var3 = 0; var3 < var2; var3++) {
         var20 += 2;
         byte var4 = f.a(var0, var20);
         var20++;

         for (int var5 = 0; var5 < var4; var5++) {
            int var6 = f.a(var0, var20);
            var20++;
            short var7 = 0;
            switch (var6) {
               case 0:
               case 1:
                  var20++;
                  break;
               case 2:
                  var7 = f.a(var0, ++var20);
                  var20 += 2;
            }

            bO = f.a(var0, var20);
            var20 += 2;
            if (var5 == 0) {
               c = new short[bO][];
               i = new int[bO][];
               i = new short[bO];
            }

            for (int var8 = 0; var8 < bO; var8++) {
               short var9;
               int var10000;
               label112: {
                  var9 = f.a(var0, var20);
                  var20 += 2;
                  short var10 = var9;
                  if (var9 != 0) {
                     for (int var11 = 1; var11 < i.length; var11++) {
                        if (i[var11] == var10 || i[var11] == 0) {
                           var10000 = var11;
                           break label112;
                        }

                        if (i[var11] > var10) {
                           int var12 = var11;
                           short[][] var13 = c;
                           int[][] var14 = i;
                           short[] var15 = i;
                           c = new short[var6 = var13.length + 1][];
                           i = new int[var6][];
                           i = new short[var6];

                           for (int var39 = 0; var39 < var6 - 1; var39++) {
                              if (var39 < var12) {
                                 c[var39] = var13[var39];
                                 i[var39] = var14[var39];
                                 i[var39] = var15[var39];
                              } else {
                                 c[var39 + 1] = var13[var39];
                                 i[var39 + 1] = var14[var39];
                                 i[var39 + 1] = var15[var39];
                              }
                           }

                           var10000 = var11;
                           break label112;
                        }
                     }
                  }

                  var10000 = 0;
               }

               var6 = var10000;
               i[var6] = var9;
               if (g < i[var6] + 1) {
                  g = (short)(i[var6] + 1);
               }

               byte var37 = f.a(var0, var20);
               var20++;
               if (c[var6] == null) {
                  c[var6] = new short[var37];
                  i[var6] = new int[var37 * 6];
               } else {
                  byte var42 = var37;
                  int var40 = var6;
                  short[] var44 = c[var40];
                  int[] var45 = i[var40];
                  c[var40] = new short[var42 + var44.length];
                  i[var40] = new int[(var42 + var44.length) * 6];

                  for (int var46 = 0; var46 < var44.length; var46++) {
                     c[var40][var46] = var44[var46];

                     for (int var47 = 0; var47 < 6; var47++) {
                        i[var40][var46 * 6 + var47] = var45[var46 * 6 + var47];
                     }
                  }
               }

               int var41;
               for (int var38 = (var41 = c[var6].length) - var37; var38 < var41; var38++) {
                  byte var43 = f.a(var0, var20);
                  var20++;
                  c[var6][var38] = var43;
                  switch (var43) {
                     case 11:
                        i[var6][var38 * 6] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 12:
                        i[var6][var38 * 6] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 21:
                        i[var6][var38 * 6] = var7;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 2] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 22:
                        i[var6][var38 * 6] = var7;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        i[var6][var38 * 6 + 2] = f.a(var0, ++var20);
                        var20++;
                        break;
                     case 102:
                     case 107:
                        i[var6][var38 * 6] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 103:
                     case 104:
                     case 105:
                     case 108:
                     case 109:
                        i[var6][var38 * 6] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 2] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 3] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 106:
                        i[var6][var38 * 6] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 110:
                        i[var6][var38 * 6] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 2] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 111:
                        i[var6][var38 * 6] = var7;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 2] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 112:
                        i[var6][var38 * 6] = var7;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 2] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 113:
                        i[var6][var38 * 6] = var7;
                        break;
                     case 114:
                        i[var6][var38 * 6] = var7;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 2] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 115:
                        i[var6][var38 * 6] = var7;
                        i[var6][var38 * 6 + 1] = f.a(var0, var20);
                        var20 += 2;
                        i[var6][var38 * 6 + 2] = f.a(var0, var20);
                        var20 += 2;
                        break;
                     case 116:
                        i[var6][var38 * 6] = var7;
                  }
               }
            }
         }
      }

      bO = i.length;
      u(bN + 1);
      f.c("/5");
      if (L != 7) {
         b[81] = a(81, 1, false, false, 0, -1);
      }

      f.k();
   }

   static boolean e() {
      return c != null;
   }

   private static void hv() {
      for (int var0 = 0; var0 < c[e].length; var0++) {
         switch (c[e][var0]) {
            case 11:
               c.r = i[e][var0 * 6];
               c.s = i[e][var0 * 6 + 1];
               c.A = c.r;
               c.B = c.s;
               break;
            case 12:
               c.a(i[e][var0 * 6], i[e][var0 * 6 + 1], 3000);
               break;
            case 21:
               e var20;
               (var20 = e.a(0, i[e][var0 * 6])).r = i[e][var0 * 6 + 1];
               var20.s = i[e][var0 * 6 + 2];
               var20.A = var20.r;
               var20.B = var20.s;
               break;
            case 22:
               e var19;
               if ((var19 = e.a(0, i[e][var0 * 6])).a == null) {
                  var19.a = new i(b[var19.E], var19.u, var19.v);
               }

               var19.a.b(i[e][var0 * 6 + 1], i[e][var0 * 6 + 2] == 0 ? 1 : -1);
            case 102:
            case 116:
            default:
               break;
            case 103:
               e var18;
               (var18 = a(i[e][var0 * 6], i[e][var0 * 6 + 1])).r = c.r + i[e][var0 * 6 + 2];
               var18.s = c.s + i[e][var0 * 6 + 3];
               var18.A = var18.r;
               var18.B = var18.s;
               break;
            case 104:
               e[] var17 = new e[2];
               e.a(0, i[e][var0 * 6], i[e][var0 * 6 + 1], var17, 1);
               b(var17[0], i[e][var0 * 6 + 2], i[e][var0 * 6 + 3]);
               break;
            case 105:
               e[] var16 = new e[2];
               e.a(0, i[e][var0 * 6], i[e][var0 * 6 + 1], var16, 1);
               if (var16[0].a == null) {
                  var16[0].a = new i(b[var16[0].E], var16[0].u, var16[0].v);
               }

               var16[0].a.b(i[e][var0 * 6 + 2], i[e][var0 * 6 + 3]);
               break;
            case 106:
               e[] var15 = new e[2];
               e.a(0, i[e][var0 * 6], i[e][var0 * 6 + 1], var15, 1);
               var15[0].e();
               break;
            case 107:
               switch (i[e][var0 * 6]) {
                  case 0:
                     char var11 = '\uffff';
                     a(0, 100, var11, 1, 0);
                     var11 = '\uffff';
                     a(0, 97, var11, 1, 0);
                     var11 = '\uffff';
                     a(0, 81, var11, 1, 0);
                     var11 = '\uffff';
                     a(0, 101, var11, 1, 0);
                     break;
                  case 1:
                     char var10 = '\uffff';
                     a(0, 86, var10, 1, 0);
                     break;
                  case 2:
                     char var9 = '\uffff';
                     a(0, 99, var9, 1, 0);
               }

               c(0, 3);
               break;
            case 108:
               e var8;
               (var8 = a(i[e][var0 * 6], i[e][var0 * 6 + 1])).r = i[e][var0 * 6 + 2];
               var8.s = i[e][var0 * 6 + 3];
               var8.A = var8.r;
               var8.B = var8.s;
               break;
            case 109:
               e[] var7 = new e[2];
               e.a(0, i[e][var0 * 6], i[e][var0 * 6 + 1], var7, 1);
               b(var7[0], i[e][var0 * 6 + 2], i[e][var0 * 6 + 3]);
               break;
            case 110:
               String var6;
               a((var6 = f.b(i[e][var0 * 6])) == null ? "" : var6, i[e][var0 * 6 + 1], i[e][var0 * 6 + 2]);
               break;
            case 111:
               b(e.a(0, i[e][var0 * 6]), i[e][var0 * 6 + 1], i[e][var0 * 6 + 2]);
               break;
            case 112:
               e var5 = e.a(0, i[e][var0 * 6]);
               if (i[e][var0 * 6 + 2] == 0) {
                  var5.k(1 << i[e][var0 * 6 + 1]);
               } else {
                  var5.j(1 << i[e][var0 * 6 + 1]);
               }
               break;
            case 113:
               e.a(0, i[e][var0 * 6]).e();
               break;
            case 114:
               e var4;
               (var4 = e.a(0, i[e][var0 * 6])).r = c.r + i[e][var0 * 6 + 1];
               var4.s = c.s + i[e][var0 * 6 + 2];
               var4.A = var4.r;
               var4.B = var4.s;
               if (bN == 19) {
                  X(42);
               }
               break;
            case 115:
               e var10000 = e.a(0, i[e][var0 * 6]);
               int var10001 = i[e][var0 * 6 + 1];
               int var3 = i[e][var0 * 6 + 2];
               int var2 = var10001;
               e var1 = var10000;
               switch (var10000.q) {
                  case 13:
                     var1.a(c.r + var2, c.s + var3, 3000);
                     break;
                  case 32:
                     var1.A = c.r + var2;
                     var1.B = c.s + var3;
                     break;
                  case 42:
                     var1.b(c.r + var2, c.s + var3);
                     break;
                  case 51:
                     var1.e(c.r + var2, c.s + var3);
               }
         }
      }
   }

   private static void b(e var0, int var1, int var2) {
      switch (var0.q) {
         case 13:
            var0.a(var1, var2, 3000);
         default:
            return;
         case 32:
            var0.A = var1;
            var0.B = var2;
            return;
         case 42:
            var0.b(var1, var2);
            return;
         case 51:
            if (bN == 17) {
               X(51);
            }

            var0.e(var1, var2);
      }
   }

   private static void hw() {
      if (e < bO) {
         int var0 = 0;
         if (e + 1 < bO && i[e + 1] - i[e] > 1 && c[e][0] != 116) {
            f++;
            if (i[e + 1] - i[e] <= f) {
               var0 = Integer.MAX_VALUE;
            }
         } else {
            for (int var1 = 0; var1 < c[e].length; var1++) {
               switch (c[e][var1]) {
                  case 11:
                  case 21:
                  case 102:
                  case 103:
                  case 106:
                  case 107:
                  case 108:
                  case 110:
                  case 112:
                  case 113:
                  case 114:
                     var0++;
                     break;
                  case 12:
                     if (c.r + (f.T >> 1) == c.A && c.s + (f.U >> 1) == c.B) {
                        var0++;
                     }
                     break;
                  case 22:
                     if (e.a(0, i[e][var1 * 6]).a.c() <= 0) {
                        var0++;
                     }
                     break;
                  case 104:
                  case 109:
                     e[] var5 = new e[2];
                     e.a(0, i[e][var1 * 6], i[e][var1 * 6 + 1], var5, 1);
                     switch (var5[0].q) {
                        case 13:
                           if (var5[0].r + (f.T >> 1) == var5[0].A && var5[0].s + (f.U >> 1) == var5[0].B) {
                              var0++;
                           }
                           continue;
                        default:
                           if (var5[0].r == var5[0].A && var5[0].s == var5[0].B) {
                              var0++;
                           }
                           continue;
                     }
                  case 105:
                     e[] var4 = new e[2];
                     e.a(0, i[e][var1 * 6], i[e][var1 * 6 + 1], var4, 1);
                     if (var4[0].a.c() <= 0) {
                        var0++;
                     }
                     break;
                  case 111:
                  case 115:
                     e var3;
                     if ((var3 = e.a(0, i[e][var1 * 6])).r == var3.A && var3.s == var3.B) {
                        var0++;
                     }
                     break;
                  case 116:
                     e var2;
                     if ((var2 = e.a(0, i[e][var1 * 6])).a.a()) {
                        var2.k(8);
                        var0++;
                     }
               }
            }
         }

         if (var0 >= c[e].length) {
            hx();
         }

         gL();
      }
   }

   private static void hx() {
      e++;
      f = 0;
      if (e < bO) {
         hv();
      } else {
         ag = 1;
      }
   }

   private static void hy() {
      while (e < bO) {
         for (int var0 = 0; var0 < c[e].length; var0++) {
            switch (c[e][var0]) {
               case 11:
                  c.r = i[e][var0 * 6];
                  c.s = i[e][var0 * 6 + 1];
                  break;
               case 12:
                  c.r = c.A - (f.T >> 1);
                  c.s = c.B - (f.U >> 1);
               case 21:
               case 22:
               case 102:
               case 103:
               case 105:
               case 106:
               case 107:
               case 108:
               case 110:
               case 112:
               case 113:
               default:
                  break;
               case 104:
               case 109:
                  e[] var3 = new e[2];
                  e.a(0, i[e][var0 * 6], i[e][var0 * 6 + 1], var3, 1);
                  switch (var3[0].q) {
                     case 13:
                        var3[0].c(var3[0].A - (f.T >> 1), var3[0].B - (f.U >> 1));
                        continue;
                     default:
                        var3[0].r = var3[0].A;
                        var3[0].s = var3[0].B;
                        continue;
                  }
               case 111:
               case 115:
                  e var2;
                  e var10000 = var2 = e.a(0, i[e][var0 * 6]);
                  var10000.r = var10000.A;
                  var2.s = var2.B;
                  break;
               case 114:
                  e var1;
                  (var1 = e.a(0, i[e][var0 * 6])).r = c.r + i[e][var0 * 6 + 1];
                  var1.s = c.s + i[e][var0 * 6 + 2];
            }
         }

         hx();
      }
   }

   private static int l(int var0) {
      return (var0 << bV | var0 >> 32 - bV) ^ bW;
   }

   private static int m(int var0) {
      int var1;
      return (var1 = var0 ^ bW) >> bV | var1 << 32 - bV;
   }

   private static long b(long var0) {
      return (var0 << bV | var0 >> 64 - bV) ^ bW;
   }

   private static long c(long var0) {
      long var2;
      return (var2 = var0 ^ bW) >> bV | var2 << 64 - bV;
   }

   private static void s(boolean var0) {
      dq = 0;
      aH = 0;
      v = null;
      w = null;
      x = null;
      y = null;
      aI = 0;
      aJ = 0;
      ac = false;
      e = "";
      g = 0L;
      c = 0;
      d = 0;
      ad = false;
      a = 0;
      ae = false;
      aK = 0;
      c = false;
      aL = 0;
      aM = 0;
      af = false;
      ag = false;
      d = false;
      ah = false;
      ai = false;
      aj = false;
      ak = false;
      al = false;
      am = false;
      aN = 0;
      p = 0;
      an = false;
      aO = 0;
      ao = false;
      iy();
      iz();
      iA();
      at = new int[cG];
      au = new int[cG];
      av = new int[cG];
      b = new long[cG];
      aw = new int[cG];
      ax = new int[cG];
      g = new boolean[cG];
      ay = new int[cG];
      d = new String[cG];
      h = new byte[cG];
      az = new int[cG];
      aA = new int[cG];
      c = new int[cG];
      a = new long[cG];
      aB = new int[cG];
      aC = new int[cG];
      aD = new int[cG];
      aE = new int[cG];
      e = new String[cG];
      i = new byte[cG];
      B = new int[bg];
      b = new String[bg];
      c = new String[bg];
      C = new int[bg];
      D = new int[bg];
      E = new int[bg];
      F = new int[bg];
      G = new int[bg];
      H = new int[bg];
      d = new boolean[bg];
      I = new int[bg];
      J = new int[bg];
      K = new int[bg];
      L = new int[bg];

      for (int var1 = 0; var1 < bg; var1++) {
         B[var1] = -1;
         b[var1] = "";
         c[var1] = "";
         C[var1] = 0;
         D[var1] = 0;
         E[var1] = 0;
         F[var1] = l(0);
         G[var1] = l(0);
         H[var1] = 0;
         d[var1] = false;
         I[var1] = 0;
         J[var1] = 0;
         K[var1] = 0;
         L[var1] = 0;
      }

      M = new int[bg];

      for (int var4 = 0; var4 < bg; var4++) {
         M[var4] = -1;
      }

      e = new byte[bg];

      for (int var5 = 0; var5 < bg; var5++) {
         e[var5] = 0;
      }

      e = new boolean[15];
      N = new int[10];
      g = new short[64];
      c = new long[6];

      for (int var6 = 0; var6 < 6; var6++) {
         c[var6] = 0L;
      }

      g var7 = g.a(20);
      d = new int[30];

      for (int var2 = 0; var2 < 30; var2++) {
         d[var2] = var7.a[var2][1];
      }

      g var28 = g.a(31);
      cD = new int[14];

      for (int var8 = 0; var8 < 14; var8++) {
         cD[var8] = var28.a[var8][2];
      }

      f.d = "UTF-8";
      K = 0;
      J = 100;
      k = true;
      bw = false;
      N = 0;
      fE = 0;
      b = new d[160];
      c = new d[6];
      d.a(s[s.length - 1][0]);

      for (int var9 = 0; var9 < s.length - 1; var9++) {
         d.c(s[var9][0], s[var9][1]);
      }

      a = b = new short[28][][];
      a = new String[28][];
      b = new int[10][];
      c = new int[10][];
      a = new j[250];
      d = new byte[250];

      for (int var10 = 0; var10 < 28; var10++) {
         a[var10] = null;
         b[var10] = null;
         a[var10] = null;
      }

      a = new d[123];

      for (int var11 = 0; var11 < 123; var11++) {
         a[var11] = null;
      }

      for (int var12 = 0; var12 < 10; var12++) {
         b[var12] = null;
      }

      a = new i[30];

      for (int var13 = 0; var13 < 30; var13++) {
         a[var13] = null;
      }

      (a = new d[3][])[0] = b;
      a[1] = a;
      a[2] = c;
      (i = new int[3])[0] = 160;
      i[1] = 123;
      i[2] = 6;
      (a = new byte[3][])[0] = new byte[160];
      a[1] = new byte[123];
      a[2] = new byte[6];
      (a = new short[3][])[0] = new short[160];
      a[1] = new short[123];
      a[2] = new short[6];
      (b = new short[3][])[0] = new short[160];
      b[1] = new short[123];
      b[2] = new short[6];
      V = true;
      c = new short[117];
      d = new short[117];
      e = new short[117];
      var7 = g.a(1);

      for (int var29 = 0; var29 < 117; var29++) {
         c[var29] = (short)var7.a[var29][1];
         d[var29] = (short)var7.a[var29][3];
         e[var29] = (short)var7.a[var29][4];
      }

      a = new short[22];
      cE = new int[22];
      var7 = g.a(2);

      for (int var30 = 0; var30 < 22; var30++) {
         a[var30] = (short)var7.a[var30][1];
         cE[var30] = var7.a[var30][2];
      }

      G = new short[64];
      cF = new int[64];
      var7 = g.a(0);

      for (int var31 = 0; var31 < 64; var31++) {
         G[var31] = (short)var7.a[var31][1];
         cF[var31] = var7.a[var31][2];
      }

      cG = new int[10];
      var7 = g.a(8);

      for (int var32 = 0; var32 < 10; var32++) {
         cG[var32] = var7.a[var32][1];
      }

      H = new short[63];
      var7 = g.a(4);

      for (int var33 = 0; var33 < 63; var33++) {
         H[var33] = (short)var7.a[var33][1];
      }

      K = new short[297];
      f = new short[297];
      var7 = g.a(6);

      for (int var34 = 0; var34 < 297; var34++) {
         K[var34] = (short)var7.a[var34][3];
         f[var34] = (short)var7.a[var34][1];
      }

      I = new short[83];
      var7 = g.a(7);

      for (int var35 = 0; var35 < 83; var35++) {
         I[var35] = (short)var7.a[var35][1];
      }

      J = new short[6];
      var7 = g.a(22);

      for (int var36 = 0; var36 < 6; var36++) {
         J[var36] = (short)var7.a[var36][1];
      }

      b = new short[20];
      var28 = g.a(3);

      for (int var22 = 0; var22 < 20; var22++) {
         b[var22] = (short)var28.a[var22][1];
         if (var28.a[var22][0] == 10) {
            dm = var28.a[var22][30];
         } else if (var28.a[var22][0] == 13) {
            bx = var28.a[var22][30];
         }
      }

      cH = new int[1440];
      L = new short[1440];
      var7 = g.a(29);

      for (int var38 = 0; var38 < 1440; var38++) {
         cH[var38] = var7.a[var38][1];
         L[var38] = (short)var7.a[var38][2];
      }

      cI = new int[281];
      M = new short[281];
      var28 = g.a(32);

      for (int var24 = 0; var24 < 281; var24++) {
         cI[var24] = var28.a[var24][2];
         M[var24] = (short)var28.a[var24][1];
      }

      b = new int[64];
      T = new int[64];
      a = new e[64];
      w = -1;
      hr();

      for (int var25 = 0; var25 < 64; var25++) {
         T[var25] = 1;
      }

      f = new byte[9216];
      ho();
      e.D();
      O = new int[4];
      P = new int[4];
      r(var0);
      f = new int[20][];
      g = new int[20][];
      g var3;
      A = new int[(var3 = g.a(23)).a];

      for (int var26 = 0; var26 < var3.a; var26++) {
         A[var26] = var3.a[var26][6];
      }

      for (int var27 = 0; var27 < 20; var27++) {
         g[var27] = new int[3];
         f[var27] = new int[6];
         a(var27, var3);
      }

      au = true;
      hl();
      O = 0;
      bZ = 2;
      ca = -1;
      cb = 0;
   }

   private static boolean r(int var0) {
      if (var0 == 0) {
         dV = 0;
         int[] var1 = new int[]{11, 14, 15, 16, 17};
         fn = 0;
         E = 0;
         a(0, var1, 5, 1);
         dW = 0;
         dX = 0;
         ce = 0;
         ei = -1;
         bk = -1;
         f.j();
         K(2);
         a[2][25][10] = 1;
         P(2);
         V = null;
         W = null;
         X = null;
         Y = null;
         Z = null;
         aa = null;
         ab = null;
         ac = null;
         ad = null;
         ae = null;
         af = null;
         ag = null;
         f = null;
         String var8;
         String var9 = (var8 = f.b(121)) == null ? "" : var8;
         a[2][1] = var9;
      }

      if (var0 == 1) {
         if (bZ == 0) {
            if (cb == 4) {
               m(bZ, -1);
            } else {
               ap(0);
            }
         } else {
            m(bZ, ca);
         }

         z(cb);
         bX = -1;
         bk = -1;
         ei = -1;
         bY = 0;
         bA = e.a(0, 49);
         if (K == -1 && aN == 160) {
            a(2, 9, h);
            a(2, 8, h);
         } else {
            b(2, 4, false);
            a(2, 9, false);
            a(2, 8, false);
         }

         O(2);
      }

      if (var0 == 5) {
         aq(-1);
         V = null;
         W = null;
         X = null;
         Y = null;
         Z = null;
         aa = null;
         ab = null;
         ae = null;
         af = null;
         ag = null;
         f = null;
         U(0);
         W(2);
      }

      if (var0 == 2) {
         if ((o == "" || o == null) && cz[0] != 11) {
            int[] var10 = new int[]{11, 14, 15, 16, 17};
            a(0, var10, 5, 1);
            fn = dW + dX;
         }

         if (b != fs) {
            q(b, 2);
         }

         if (K == 41) {
            bk = -1;
         }

         int var11;
         if ((var11 = f.h()) == 16 && f(2, 9)) {
            d(60);
            bk = 131081;
         }

         if (dV == 0) {
            if (dW != 0) {
               a(2, 12, true);
            } else {
               a(2, 12, false);
            }

            if (dW != 1) {
               a(2, 13, true);
            } else {
               a(2, 13, false);
            }

            a(2, 29, false);
            a(2, 30, false);
            if (K != 41 && K != 14 && ((var11 == 3 || var11 == 10) && fn != 0 || (var11 == 4 || var11 == 12) && fn != 4)) {
               s();
            }

            if (fn != ce) {
               int var2 = fn - ce;
               ce = fn;
               if (var2 == 4) {
                  dX = 3;
                  dW = 1;
               } else if (var2 == -4) {
                  dX = 0;
                  dW = 0;
               } else if (dX + var2 > 3) {
                  dW++;
               } else if (dX + var2 == -1) {
                  dX = 0;
                  dW--;
               } else {
                  dX += var2;
               }

               hz();
            }

            if (var11 == 2 || var11 == 14 || var11 == 11 || var11 == 18 || var11 == 5) {
               if (K != 14 || cb != 0) {
                  d(63);
                  dV = 1;
                  if (K == 14) {
                     a(2, 129, true);
                     a(2, 135, false);
                     fu = 1;
                  }
               }

               if (K == 41) {
                  e = false;
               }

               var11 = -1;
            }
         } else if (dV == 1) {
            if (K == 14) {
               if (ca == 1) {
                  fu = 0;
               } else {
                  fu = 1;
               }
            }

            a(2, 12, false);
            a(2, 13, false);
            if (b > 4) {
               if (E != 0) {
                  a(2, 29, true);
               } else {
                  a(2, 29, false);
               }

               if (b > E + 4) {
                  a(2, 30, true);
               } else {
                  a(2, 30, false);
               }
            } else {
               a(2, 30, false);
               a(2, 29, false);
            }

            if ((var11 == 1 || var11 == 8) && fu < 2) {
               if (K != 41 && K != 14 && K != 13) {
                  d(63);
                  bX = -1;
                  ei = -1;
                  dV = 0;
               }
            } else if (K != 41 && K != 14 && K != 13) {
               iC();
            }

            if (var11 == 5 || var11 == 11 || var11 == 18) {
               if (a[2][33 + 14 * fu][18] == 1) {
                  bk = bn << 16 | 33 + 14 * fu & 65535;
               } else {
                  d(55);
               }
            }

            if (var11 == 6 && a[2][46 + 14 * fu][10] == 1) {
               bk = bn << 16 | 46 + 14 * fu & 65535;
               d(60);
            }

            if (K != 14) {
               as(0);
            }
         }

         if (var11 == 19) {
            if (bZ == 0 && ca != -1 && a[2][122][18] == 1) {
               d(56);
               ei = -1;
               ap(0);
               z(1);
               dV = 1;
            } else if (a[2][122][18] == 1) {
               bk = bn << 16 | 122;
               d(56);
            }
         }

         if (bk != -1 && var11 != -1) {
            Q(bk);
            bk = -1;
         }

         if (dV == 0) {
            b(2, 117, 118, -1, 4);
         } else {
            b(2, 117, 118, fu, 4);
         }

         if (K > 0) {
            hd();
         }

         if (b[0] != null && !h(0, 1)) {
            if (b[0][8] < 0 && bY < b - 6) {
               as(1);
            } else if (b[0][8] > -10 && bY > 0) {
               as(-1);
            }
         }
      }

      if (var0 == 3) {
         if (dV != 0 && f(2, 45 + 14 * fu)) {
            a(2, 126, false);
         } else {
            a(2, 126, true);
         }

         M(2);
         a(f.a(c(), L, " "), 2, 5, 0, 0);
         a(f.a(d(), L, " "), 2, 10, 0, 0);
         int[] var12 = new int[4];
         a[a[2][31][5]].a(a[2][31][6], 0, var12, 0);
         int var10000 = a[2][31][2] + var12[0];
         int var10001 = a[2][31][3] + var12[1];
         int var10002 = var12[2];
         int var3 = var12[3];
         int var17 = var10002;
         int var13 = var10001;
         var0 = var10000;
         f.b(f.a, var0, var13, var17, var3);
         var0 = b - E >= 4 ? 4 : b - E;

         for (int var14 = 0; var14 < var0; var14++) {
            String var18;
            a((var18 = f.b(V[var14 + bY + E])) == null ? "" : var18, 2, 34 + var14 * 14, 0, 0);
            if (bZ != 0 || ca != -1 || cb == 4 && bZ == 0 && ca == -1) {
               if (f(2, 38 + var14 * 14)) {
                  if (aa[var14 + bY + E] > 0) {
                     a("" + aa[var14 + bY + E], 2, 37 + var14 * 14, 0, 0);
                  } else if (ab[var14 + bY + E] > 0) {
                     a("" + ab[var14 + bY + E], 2, 37 + var14 * 14, 0, 0);
                  }
               }

               if (f(2, 45 + var14 * 14)) {
                  String var19;
                  a(((var19 = f.b(447)) == null ? "" : var19) + Integer.toString(ag[var14 + bY + E]), 2, 37 + var14 * 14, 0, 0);
               }
            }
         }

         if (bX != -1) {
            a(Integer.toString(Z[bX + bY + E]), 2, 44 + 14 * bX, 0, 0);
            a(d(Y[bX + bY + E]), 2, 42 + 14 * bX, 0, 0);
            a(Integer.toString(X[bX + bY + E]), 2, 40 + 14 * bX, 0, 0);
         }

         if (dV != 0 && f(2, 46 + 14 * fu)) {
            String var6;
            a((var6 = f.b(847)) == null ? "" : var6, 2, 127, 0, 0);
         }

         if (bX != 0 && bZ == 2 && bY == 0 && E == 0 && fu == 0) {
            a(Integer.toString(bA) + "/" + w(), 2, 32, 0, 0);
         }

         int var15 = f.U;
         var0 = f.T;
         var17 = var15;
         int var16 = var0;
         f.b(f.a, 0, 0, var16, var17);
      }

      return false;
   }

   private static void m(int var0, int var1) {
      aq(-1);
      bZ = var0;
      ca = var1;
      b = 0;
      bY = 0;
      var1 = 0;
      g var2;
      int var3 = (var2 = g.a(var0)).a;
      if (dV == 0) {
         q(var3, 2);
      }

      if (var2 != null) {
         V = new int[var3];
         W = new int[var3];
         X = new int[var3];
         Y = new int[var3];
         Z = new int[var3];
         aa = new int[var3];
         ab = new int[var3];
         ac = new int[var3];
         ad = new int[var3];
         ae = new int[var3];
         af = new int[var3];
         ag = new int[var3];
         f = new boolean[var3];
      }

      int var4 = -1;

      for (int var5 = 0; var5 < var3; var5++) {
         if (bZ != 0 || ca == var2.a[var5][9]) {
            switch (bZ) {
               case 0:
                  if ((var4 = var2.a[var5][5]) > -1) {
                     W[var4] = var2.a[var5][0];
                     V[var4] = var2.a[var5][2];
                     aa[var4] = var2.a[var5][6];
                     ab[var4] = var2.a[var5][7];
                     af[var4] = var2.a[var5][1];
                     ac[var4] = var2.a[var5][3];
                     ad[var4] = var2.a[var5][4];
                     ag[var4] = var2.a[var5][8];
                     f[var4] = var2.a[var5][8] > e();
                     ae[var4] = var2.a[var5][32];
                     X[var4] = var2.a[var5][10];
                     if (var2.a[var5][34] == 1) {
                        Y[var4] = var2.a[var5][13] * 60;
                     } else {
                        Y[var4] = var2.a[var5][25] * 60;
                     }

                     Z[var4] = var2.a[var5][15];
                  }
               case 1:
               default:
                  break;
               case 2:
                  if ((var4 = var2.a[var5][5]) > -1) {
                     W[var4] = var2.a[var5][0];
                     V[var4] = var2.a[var5][2];
                     aa[var4] = var2.a[var5][6];
                     ab[var4] = var2.a[var5][7];
                     af[var4] = var2.a[var5][1];
                     ac[var4] = var2.a[var5][3];
                     ad[var4] = var2.a[var5][4];
                     ag[var4] = var2.a[var5][8];
                     f[var4] = var2.a[var5][8] > e();
                     X[var4] = var2.a[var5][16];
                     Y[var4] = var2.a[var5][11];
                     Z[var4] = var2.a[var5][12];
                  }
                  break;
               case 3:
                  if ((var4 = var2.a[var5][5]) > -1) {
                     W[var4] = var2.a[var5][0];
                     V[var4] = var2.a[var5][2];
                     if (var2.a[var5][7] > 0) {
                        int var6 = e.b(0, var2.a[var5][1]);
                        aa[var4] = var2.a[var5][6 + (var6 - 1 < 0 ? 0 : (var6 - 1 > 3 ? 3 : var6 - 1))];
                     } else {
                        aa[var4] = var2.a[var5][6];
                     }

                     ab[var4] = var2.a[var5][10];
                     af[var4] = var2.a[var5][1];
                     ac[var4] = var2.a[var5][3];
                     ad[var4] = var2.a[var5][4];
                     ag[var4] = var2.a[var5][11];
                     f[var4] = var2.a[var5][11] > e();
                  }
                  break;
               case 4:
                  if ((var4 = var2.a[var5][5]) > -1) {
                     W[var4] = var2.a[var5][0];
                     V[var4] = var2.a[var5][2];
                     aa[var4] = var2.a[var5][6];
                     ab[var4] = var2.a[var5][7];
                     af[var4] = var2.a[var5][1];
                     ac[var4] = var2.a[var5][3];
                     ad[var4] = var2.a[var5][4];
                     ag[var4] = var2.a[var5][8];
                     f[var4] = var2.a[var5][8] > e();
                  }
            }

            if (var4 >= E && var4 < 4 + E) {
               if (var4 < 6) {
                  a(var4, true, false);
                  var1++;
               }

               b++;
            } else if (var4 > -1) {
               b++;
            }
         }
      }

      for (int var8 = var1 + E; var8 < 6 + E; var8++) {
         a(var8, false, false);
      }

      if (K == 13 || K == 14) {
         b(2, 122, false);
         a(2, 122, false);
         if (var0 != 0) {
            a(2, 129, false);
            a(2, 133, false);
            a(2, 128, true);
            b(2, 33, false);
            b(2, 47, false);
            b(2, 61, false);
            b(2, 75, false);
            b(2, 89, false);
            a(2, 14, true);
            b(2, 11, false);
            b(2, 14, true);
            b(2, 15, false);
            b(2, 16, false);
            b(2, 17, false);
            b(2, 46, false);
            b(2, 60, false);
            b(2, 74, false);
            b(2, 88, false);
            b(2, 102, false);
            a(2, 46, false);
            a(2, 60, false);
            a(2, 74, false);
            a(2, 88, false);
            a(2, 102, false);
         }
      }

      P(2);
      if (K != 13 && K != 14) {
         R(0);
      } else {
         T(0);
      }
   }

   private static void ap(int var0) {
      aq(-1);
      bZ = 0;
      ca = -1;
      b = 0;
      bY = 0;
      var0 = 0;
      g var1;
      int var2 = (var1 = g.a(13)).a;
      if (dV == 0) {
         q(var2, 2);
      }

      if (var1 != null) {
         V = new int[var2];
         W = null;
         X = new int[var2];
         Y = new int[var2];
         Z = new int[var2];
         aa = null;
         ab = null;
         ac = new int[var2];
         ad = new int[var2];
         ae = new int[var2];
         af = new int[var2];
         ag = new int[var2];
         f = new boolean[var2];
      }

      for (int var3 = 0; var3 < var2; var3++) {
         ac[var3] = var1.a[var3][2];
         ad[var3] = var1.a[var3][3];
         V[var3] = var1.a[var3][1];
         if (var3 >= E && var3 < 4 + E) {
            a(var3, true, true);
            var0++;
         }

         b++;
      }

      for (int var5 = var0; var5 < 6; var5++) {
         a(var5, false, true);
      }

      if (K == 13 || K == 14) {
         K = 14;
         b(2, 122, false);
         a(2, 122, false);
         if (dV == 0) {
            a(2, 128, false);
            a(2, 129, false);
            a(2, 133, false);
            a(2, 135, true);
         } else {
            a(2, 135, false);
            a(2, 128, false);
            a(2, 129, true);
            a(2, 133, false);
         }

         b(2, 33, false);
         b(2, 47, true);
         b(2, 61, false);
         b(2, 75, false);
         b(2, 89, false);
         a(2, 14, true);
         b(2, 11, false);
         b(2, 14, true);
         b(2, 15, false);
         b(2, 16, false);
         b(2, 17, false);
         b(2, 46, false);
         b(2, 60, false);
         b(2, 74, false);
         b(2, 88, false);
         b(2, 102, false);
         a(2, 46, false);
         a(2, 60, false);
         a(2, 74, false);
         a(2, 88, false);
         a(2, 102, false);
      }

      P(2);
      if (K == 14) {
         T(0);
      }
   }

   private static void a(int var0, boolean var1, boolean var2) {
      int var3 = (var0 - E) * 14;

      int var4;
      for (int var5 = (var4 = 33 + (var0 - E) * 14) + 14; var4 < var5; var4++) {
         a(2, var4, var1);
      }

      if (var1) {
         var4 = 35 + 14 * (var0 - E);
         a[2][var4][5] = (short)ac[bY + var0];
         a[2][var4][6] = (short)ad[bY + var0];
         if (f[bY + var0]) {
            a(2, var3 + 45, true);
            a(2, var3 + 38, false);
         } else {
            a(2, var3 + 45, false);
            a(2, var3 + 38, true);
         }

         if (K == 14 && var0 != 0) {
            b(2, var3 + 33, false);
         } else {
            b(2, var3 + 33, true);
         }

         if (bZ == 0) {
            a[2][var4][8] = (short)ae[bY + var0];
            a[2][var4][9] = 1;
         } else {
            a[2][var4][9] = 0;
         }

         if (var2) {
            a[2][36 + 14 * (var0 - E)][10] = 0;
            a[2][38 + 14 * (var0 - E)][10] = 0;
            a[2][37 + 14 * (var0 - E)][10] = 0;
         } else {
            var4 = 38 + 14 * (var0 - E);
            if (aa[bY + var0] > 0) {
               a[2][var4][6] = 104;
            } else {
               a[2][var4][6] = 103;
            }
         }

         if (var2 || bZ != 2 && bZ != 0) {
            a(2, var3 + 46, false);
         }

         if (bZ == 2 && bY + var0 == 0) {
            a(2, 46, false);
         }

         bX = var0 - E;
         aq(var0 - E);
      }
   }

   private static void aq(int var0) {
      boolean var1 = bX != var0 && var0 > -1;
      if (be) {
         var1 = true;
      }

      if (bX >= 0 && bX < 6) {
         int var2 = 14 * bX;
         a(2, var2 + 35, true);
         a(2, var2 + 39, false);
         a(2, var2 + 41, false);
         a(2, var2 + 43, false);
      }

      if (var1) {
         bX = var0;
      }

      if (ei >= 0 && bX < 6) {
         int var3 = 14 * bX;
         a(2, var3 + 35, !var1);
         a(2, var3 + 39, var1);
         a(2, var3 + 41, var1);
         a(2, var3 + 43, var1);
      }

      if (!var1) {
         bX = -1;
      }

      if (K == 14) {
         a(2, 135, false);
         a(2, 129, false);
         if (ca == 1) {
            a(2, 133, false);
            a(2, 131, true);
         } else {
            a(2, 131, false);
            a(2, 133, true);
         }

         T(0);
      }
   }

   private static void ar(int var0) {
      var0 += bY;
      boolean var1 = aa[var0] == 0;
      if (!f[var0] && (!var1 && aa[var0] <= c() || var1 && ab[var0] <= d())) {
         var1 = false;
         if (aa[var0] > 0) {
            bI = aa[var0];
         } else {
            bJ = ab[var0];
         }

         switch (bZ) {
            case 2:
               if (W[var0] != 0) {
                  if (W[var0] <= 11) {
                     bJ = 0;
                     bI = 0;
                     f = h(W[var0]);
                     v = true;
                     aE = 0;
                  } else {
                     if (e.a(0, 52) >= x()) {
                        bJ = 0;
                        bI = 0;
                        X(55);
                        i(491, 492, 7);
                        return;
                     }

                     var1 = true;
                     d = 0;
                     f = a(bZ, W[var0]);
                  }
                  break;
               }

               e[] var16 = new e[50];
               int var3 = e.a(0, 49, -1, var16, 50);
               int var4 = -1;
               int var5 = Integer.MAX_VALUE;
               int var6 = 0;

               for (; var6 < var3; var6++) {
                  int var7 = var16[var6].r - c.r;
                  int var8 = var16[var6].s - c.s;
                  if ((var7 = var7 * var7 + var8 * var8) < var5) {
                     var5 = var7;
                     var4 = var6;
                  }
               }

               d = 1;
               e var18;
               if (var4 != -1) {
                  var18 = a(49, 0, var16[var4].r, var16[var4].s, true);
               } else {
                  var18 = a(49, 0, true);
               }

               var18.J = a[0];
               f = var18;
               break;
            case 4:
               var1 = true;
               d = 0;
               if (W[var0] >= 1 && W[var0] <= 4
                  || W[var0] >= 7 && W[var0] <= 12
                  || W[var0] == 40
                  || W[var0] == 41
                  || W[var0] == 45
                  || W[var0] == 47
                  || W[var0] >= 48 && W[var0] <= 50
                  || W[var0] == 54
                  || W[var0] == 55) {
                  d = 1;
               }

               f = a(bZ, W[var0]);
               break;
            default:
               if (bZ == 0 && e.a(0, 54) >= y()) {
                  bJ = 0;
                  bI = 0;
                  X(55);
                  i(489, 490, 7);
                  return;
               }

               var1 = true;
               d = 0;
               f = a(bZ, W[var0]);
               if (bZ == 0) {
                  f.d = (short)Z[var0];
               }
         }

         if (f != null && var1) {
            int[] var17 = new int[2];
            if (a(f, var17)) {
               f.r = var17[0];
               f.s = var17[1];
            }

            c.a(f.r, f.s, 1000);
         }

         s(17);
         if (bZ == 2 && W[var0] >= 1 && W[var0] <= 11) {
            X(48);
         } else {
            X(60);
         }
      } else if (f[var0]) {
         X(55);
      } else {
         X(55);
         if (var1) {
            if (ab[var0] > 0) {
               String var10;
               String var11 = (var10 = f.b(381)) == null ? "" : var10;
               String var2 = f.a(ab[var0] - d(), L, " ");
               a = f.a(var11, "%d", var2);
               D = 19;
               m = true;
               i = true;
               a(34);
            }
         } else if (aa[var0] > 0) {
            String var12;
            String var13 = (var12 = f.b(379)) == null ? "" : var12;
            String var15 = f.a(aa[var0] - c(), L, " ");
            a = f.a(var13, "%d", var15);
            D = 18;
            m = true;
            i = false;
            a(34);
         }
      }

      if (K == 14) {
         f = true;
      }
   }

   private static void as(int var0) {
      bY += var0;
      var0 = b - E >= 4 ? 4 : b % 4;

      for (int var1 = E; var1 < var0 + E; var1++) {
         a(var1, true, bZ == 0 && ca == -1 && cb != 4);
      }

      for (int var3 = var0 + E; var3 < 4 + E; var3++) {
         a(var3, false, false);
      }

      if (ei != -1 && ei - E >= 0 && ei - E < 4) {
         be = true;
         aq(ei - E);
         be = false;
      }

      P(2);
   }

   private static void hz() {
      for (int var0 = 0; var0 < 4; var0++) {
         int var1 = var0 + 23;
         a[2][var1][5] = 4;
         a[2][var1][6] = (short)(var0 + dW);
      }
   }

   private static void c(int var0, int var1, boolean var2) {
      e(-1);
      ah();
      a(false, -1);
      id();
      m(var0, -1);
      cb = var1;
      if (var2) {
         a(7);
      } else {
         r(7);
      }
   }

   private static boolean s(int var0) {
      if (var0 == 0) {
         E = 0;
         f.j();
      }

      if (var0 == 1) {
         K(3);
         x = 0;
         y = 0;
         cc = k(0);
         au(0);
         if (cc > 0) {
            ah = new int[cc];
            ai = new int[cc];
            aj = new int[cc];
            ak = new int[cc];
            j = new short[cc];
            k = new short[cc];
            l = new short[cc];
            m = new short[cc];
            n = new short[cc];
            g = new byte[cc];
         }

         cc = 0;
         hB();
         X(59);
         ap = 100;
         String var1;
         var1 = (var1 = f.b(840)) == null ? "" : var1;
         a[3][212] = var1;
         int[] var7 = new int[]{2, 5};
         a(0, var7, 2, 1);
         eh = 1;
         q(cc, 3);
         ed = 0;
         f.j();
         a[3][180][5] = 1138;
         a[3][180][6] = 12;
         a[3][184][5] = 1138;
         a[3][184][6] = 12;
         a[3][188][5] = 1138;
         a[3][188][6] = 12;
         a[3][192][5] = 1138;
         a[3][192][6] = 12;
         var1 = (var1 = f.b(460)) == null ? "" : var1;
         a[3][200] = var1;
      }

      if (var0 == 5) {
         if (x > 0) {
            int var10 = x;
            e[] var2 = new e[2];
            e.a(0, 50, 9, var2, 2);
            if (var2[0] != null) {
               a(false, x, var2[0].r, var2[0].s);
               if (y > 0) {
                  a(true, y, var2[0].r, var2[0].s);
               }
            } else {
               a(false, x, var2[0].r, var2[0].s);
               a(true, y, var2[0].r, var2[0].s);
            }

            a(0, var10, 33, false);
         }

         x(1);
         W(3);
      }

      if (var0 == 2) {
         int var11 = cc - E >= 6 ? 6 : cc % 6;

         for (int var13 = 0; var13 < var11; var13++) {
            c(var13, true);
         }

         for (int var14 = var11; var14 < 6; var14++) {
            c(var14, false);
         }

         hA();
         if (K != -1) {
            hd();
         }

         y(1);
         if (!ay) {
            if (j[cd] - m[cd] == 0) {
               a(3, 196, false);
            } else {
               a(3, 196, true);
            }

            if (m[cd] == 0) {
               a(3, 199, false);
            } else {
               a(3, 199, true);
            }
         }
      }

      if (var0 == 3) {
         if (ay) {
            a(3, 212, true);
         } else {
            a(3, 212, false);
         }

         M(3);
         String var3;
         a((var3 = f.b(404)) == null ? "" : var3, 3, 8, 0, 0);
         if (ay) {
            String var5;
            a((var5 = f.b(g[cd][2])) == null ? "" : var5, 3, 177, 0, 0);

            for (int var12 = 0; var12 < 3; var12++) {
               if (f[cd] != null && f[cd][var12 << 1] > -1) {
                  a(Integer.toString(aq[var12]) + "/" + ap[var12], 3, 179 + (var12 << 2), 0, 0);
               }
            }
         } else if (cc > 0) {
            String var4;
            a((var4 = f.b(ah[cd])) == null ? "" : var4, 3, 190, 0, 0);
            a(f.a(ak[cd], L, " "), 3, 193, 0, 0);
            a("" + m[cd], 3, 195, 0, 0);
            a(f.a(z(), L, " "), 3, 203, 0, 0);
         }

         if (a != null) {
            a.b();
         }
      }

      return false;
   }

   private static void n(int var0, int var1) {
      al[var0] = var1;
      am[var0] = 0;
      an[var0] = g[var1][0];
      ao[var0] = g[var1][1];
   }

   private static void c(int var0, boolean var1) {
      int var2 = var0 * 11;
      a(3, var2 + 11, ay && var1);
      a(3, var2 + 13, ay && var1);
      a(3, var2 + 17, ay && var1);
      a(3, var2 + 19, !ay && var1);
      if (var1) {
         a(3, var2 + 17, ay && q(var0 + E));
         b(3, var2 + 10, true);
         a(3, var2 + 10, true);
         if (!ay) {
            a[3][var2 + 19][5] = k[var0 + E];
            a[3][var2 + 19][6] = l[var0 + E];
            w(a[3][var2 + 19][5]);
            a(3, var2 + 20, g[var0 + E] == 1);
            a[3][var2 + 20][5] = 1138;
            a[3][var2 + 20][6] = 12;
            String var12 = "x " + Integer.toString(j[var0 + E] - m[var0 + E]);
            var1 = var2 + 18;
            String var6 = var12;
            a[3][var1] = var6;
            a(3, var1, true);
            a(3, var2 + 14, false);
            a(3, var2 + 12, false);
         } else {
            a(3, var2 + 17, q(al[var0 + E]));
            a(3, var2 + 18, false);
            a(3, var2 + 20, false);
            a(3, 179, true);
            a(3, 183, true);
            a(3, 187, true);
            String var13 = f.a(m(an[var0 + E]), L, " ");
            int var3 = var2 + 14;
            String var10 = var13;
            a[3][var3] = var10;
            var13 = f.a(m(ao[var0 + E]), L, " ");
            var1 = var2 + 12;
            String var7 = var13;
            a[3][var1] = var7;
            a(3, var3, true);
            a(3, var1, true);
         }

         a(3, var2 + 16, false);
      } else {
         a(3, var2 + 17, false);
         a(3, var2 + 10, !ay || var0 < 9);
         b(3, var2 + 10, false);
         a(3, var2 + 20, false);
         a(3, var2 + 16, true);
         String var4;
         String var10000 = (var4 = f.b(197)) == null ? "" : var4;
         var1 = var2 + 16;
         String var5 = var10000;
         a[3][var1] = var5;
         a(3, var2 + 18, false);
         a(3, var2 + 14, false);
         a(3, var2 + 12, false);
      }
   }

   private static void at(int var0) {
      if (K != 56 || var0 == 0) {
         cd = var0 + E;
         if (ay) {
            g var4 = g.a(1);

            for (int var1 = 0; var1 < 3; var1++) {
               int var2;
               int var3 = (var2 = var1 << 2) + 178;
               if (f[cd] != null && f[cd][var1 << 1] > -1) {
                  a[3][var3][5] = (short)var4.a[f[cd][var1 << 1]][3];
                  a[3][var3][6] = (short)var4.a[f[cd][var1 << 1]][4];
                  ap[var1] = f[cd][(var1 << 1) + 1];
                  aq[var1] = e(0, f[cd][var1 << 1]);
                  w(a[3][var3][5]);
                  a(3, var3, true);
                  a(3, var2 + 180, var4.a[f[cd][var1 << 1]][9] == 1);
                  a(3, var2 + 181, ap[var1] <= aq[var1]);
               } else {
                  a(3, var3, false);
                  a(3, var2 + 180, false);
                  a(3, var2 + 181, false);
               }
            }

            if (q(al[cd])) {
               a[3][202][6] = 69;
               d(3, 202, 1);
            } else {
               a[3][202][6] = 200;
               d(3, 202, 0);
            }
         } else if (var0 < cc) {
            a[3][191][5] = k[cd];
            a[3][191][6] = l[cd];
            a(3, 191, true);
            a(3, 194, true);
            a(3, 196, true);
            a(3, 199, true);
            a(3, 200, false);
            a(3, 192, g[cd] != 0);
         } else {
            a(3, 191, false);
            a(3, 194, false);
            a(3, 196, false);
            a(3, 199, false);
            a(3, 192, false);
            a(3, 200, true);
         }

         hA();
      }
   }

   private static void hA() {
      for (byte var0 = 15; var0 <= 169; var0 += 11) {
         a(3, var0, false);
      }

      int var1;
      if ((var1 = cd - E) >= 0 && var1 < 15 && eh != 0) {
         a(3, 15 + var1 * 11, true);
      }

      O(3);
   }

   private static void hB() {
      ay = true;
      a(3, 3, true);
      a(3, 6, false);

      for (int var0 = 190; var0 <= 200; var0++) {
         a(3, var0, false);
      }

      a(3, 205, false);
      a(3, 204, false);
      a(3, 202, true);
      b(3, 202, true);
      a(3, 201, true);
      a(3, 177, true);
      int var3 = 0;
      int var1 = 0;
      cc = 0;
      al = new int[20];
      am = new int[20];
      an = new int[20];
      ao = new int[20];
      ap = new int[3];
      aq = new int[3];

      for (int var2 = 0; var2 < 20 && f[var2][0] != -1; var2++) {
         n(var1, var2);
         var1++;
         if (var3 < 15) {
            c(var3, true);
            var3++;
         }

         cc++;
      }

      for (int var4 = var3; var4 < 15; var4++) {
         c(var4, false);
      }

      P(3);
      at(0);
      T(0);
   }

   private static void au(int var0) {
      m = n = b((long)var0);
   }

   private static int z() {
      long var0 = c(n);
      long var2 = c(m);
      return var0 != var2 ? (int)var2 : (int)var0;
   }

   private static void av(int var0) {
      au(z() + var0 < 0 ? 0 : (z() + var0 > bu ? bu : z() + var0));
   }

   private static void hC() {
      (ar = new int[3])[c] = 0;
      (as = new int[3])[c] = 0;
      g var0 = g.a(7);
      g var1 = g.a(1);
      if (var0 != null) {
         k = new int[3][];
         l = new int[3][];
         m = new int[3][];
         n = new int[3][];
         o = new int[3][];
         p = new int[3][];
         q = new int[3][];
         r = new int[3][];

         for (int var2 = 0; var2 < 3; var2++) {
            k[var2] = new int[var0.a];
            l[var2] = new int[var0.a];
            m[var2] = new int[var0.a];
            n[var2] = new int[var0.a];
            o[var2] = new int[var0.a];
            p[var2] = new int[var0.a];
            q[var2] = new int[var0.a];
            r[var2] = new int[var0.a];
         }
      }

      for (int var6 = 0; var6 < var0.a; var6++) {
         int var3;
         int var4;
         if ((var3 = var0.a[var6][4]) > 0 && (var4 = var0.a[var6][3]) > -1) {
            k[var3 - 1][var4] = var0.a[var6][2];
            l[var3 - 1][var4] = var0.a[var6][0];
            if (var0.a[var6][18] != -1 && var0.a[var6][18] < 117) {
               m[var3 - 1][var4] = var1.a[var0.a[var6][18]][7];
            } else {
               m[var3 - 1][var4] = 0;
            }

            n[var3 - 1][var4] = var0.a[var6][16];
            o[var3 - 1][var4] = var0.a[var6][14] * 60;
            int var5;
            if ((var5 = var0.a[var6][18]) != -1 && var5 < 117) {
               p[var3 - 1][var4] = var1.a[var5][3];
               q[var3 - 1][var4] = var1.a[var5][4];
               if (q[var3 - 1][var4] == -1) {
                  q[var3 - 1][var4] = 0;
               }
            } else {
               p[var3 - 1][var4] = 0;
               q[var3 - 1][var4] = 0;
            }

            r[var3 - 1][var4] = var0.a[var6][5];
            ar[var3 - 1]++;
         }
      }
   }

   private static void d(int var0, boolean var1) {
      int var2;
      for (int var3 = var2 = 108 + (var0 - ea) * 9; var3 < var2 + 9; var3++) {
         a(22, var3, var1);
      }

      if (var1) {
         int var4 = 116 + 9 * (var0 - ea);
         a[22][var4][5] = (short)p[c][as[c] + var0];
         a[22][var4][6] = (short)q[c][as[c] + var0];
         w(a[22][var4][5]);
      }

      if (var1 && e() < r[c][as[c] + var0]) {
         a(22, 115 + (var0 - ea) * 9, true);
      } else {
         a(22, 115 + (var0 - ea) * 9, false);
      }

      a(22, 114 + (var0 - ea) * 9, false);
      if (!az) {
         int var5 = 116 + var0 * 9;
         a(22, var5, false);
         a(22, var2, false);
      }
   }

   private static void aw(int var0) {
      if (b[1] != null) {
         as[c] = as[c] + var0;
         int var1 = b[1][8];
         dZ = ar[fn];
         int var2 = ar[fn] - ea >= 4 ? 4 : ar[fn] % 4;

         for (int var3 = ea; var3 < ea + var2; var3++) {
            d(var3, true);
         }

         for (int var4 = ea + var2; var4 < ea + 4; var4++) {
            d(var4, false);
         }

         b[1][8] = var1 + (a[22][117][2] - a[22][108][2]) * var0;
         R(1);
      }
   }

   private static void a(char var0) {
      c = var0;
      if (var0 == 0) {
         a(22, 165, true);
         a(22, 166, false);
         a(22, 167, false);
      } else if (var0 == 1) {
         a(22, 165, false);
         a(22, 166, true);
         a(22, 167, false);
      } else if (var0 == 2) {
         a(22, 165, false);
         a(22, 166, false);
         a(22, 167, true);
      }

      aw(0);
   }

   private static void t(boolean var0) {
      int var1 = 0;
      if (b != null && b[0] != null) {
         var1 = b[0][8];
      }

      az = var0;
      if (var0) {
         cf = 1;
         w(var0);
         a[22][172][6] = 138;
         a(22, 108, var0);
         a(22, 117, var0);
         a(22, 126, var0);
         a(22, 135, var0);
         a(22, 144, var0);
         a(22, 153, var0);
         a[22][182][10] = 1;
         a[22][183][10] = 1;
         b(22, 108, var0);
         b(22, 117, var0);
         b(22, 126, var0);
         b(22, 135, var0);
         b(22, 144, var0);
         b(22, 153, var0);
         a(22, 116, var0);
         a(22, 125, var0);
         a(22, 134, var0);
         a(22, 143, var0);
         a(22, 152, var0);
         a(22, 161, var0);

         for (int var2 = 0; var2 < 6; var2++) {
            if (e() >= r[c][as[c] + var2]) {
               a(22, 115 + var2 * 9, false);
            } else {
               a(22, 115 + var2 * 9, true);
            }
         }

         a(c);
      } else {
         cf = 2;
         w(var0);
         a(22, 165, false);
         a(22, 166, false);
         a(22, 167, false);
         a[22][182][10] = 0;
         a[22][183][10] = 0;
         a[22][172][6] = 139;
      }

      a(22, 106, true);
      a(22, 162, var0);
      b(22, 162, var0);
      a(22, 163, var0);
      b(22, 163, var0);
      a(22, 164, var0);
      b(22, 164, var0);
      a(22, 173, var0);
      a(22, 174, var0);
      a(22, 175, var0);
      a(22, 176, var0);
      a(22, 177, var0);
      a(22, 178, var0);
      hH();
      if (b != null && b[0] != null) {
         b[0][8] = var1;
      }
   }

   private static boolean t(int var0) {
      if (var0 == 0) {
         b(7, true);
         P(7);
         ap = 100;
         f = c;
         cD = 0;
      }

      if (var0 == 1) {
         hD();
         u(false);
         b(7, 48, true);
         P(7);
         cD = 0;
      }

      if (var0 == 5) {
         if (f >= 0 && f <= 2) {
            c = f;
         }

         b(7, 40, false);
         b(7, 48, false);
         b(7, 22, false);
         b(7, 44, false);
         a(7, 44, false);
         d = 0;
         cE = 0;
         P(7);
         W(7);
         cA = 0;
         aC = false;
         a(7, 46, false);
      }

      if (var0 == 2) {
         String var1;
         var1 = (var1 = f.b(846)) == null ? "" : var1;
         a[7][2] = var1;
         int var12 = f.h();
         if (ct <= cx && cu <= cy) {
            a[7][45][10] = 1;
         } else {
            a[7][45][10] = 0;
         }

         if (ct <= cx && cu <= cy && !f(7, 22)) {
            cD = -1;
         } else {
            boolean var2 = false;

            while (!var2) {
               if (!(var2 = o())) {
                  if (cD == 2) {
                     cD = 0;
                  } else {
                     cD++;
                  }
               }
            }

            var2 = false;
            int var3 = cD;
            if (var12 == 4 || var12 == 12) {
               for (; !var2; var2 = o()) {
                  if (cD == 2) {
                     cD = 0;
                  } else {
                     cD++;
                  }
               }
            }

            if (var12 == 3 || var12 == 10) {
               for (; !var2; var2 = o()) {
                  if (cD == 0) {
                     cD = 2;
                  } else {
                     cD--;
                  }
               }
            }

            if (var3 != cD) {
               X(63);
            }
         }

         b(7, 6, 7, cD, 3);
         if (var12 == 5 || var12 == 11) {
            if (cD == 0) {
               if (a[7][29][10] == 0) {
                  bk = bn << 16 | 13;
               } else {
                  bk = bn << 16 | 29;
               }
            } else if (cD == 1) {
               if (a[7][30][10] == 0) {
                  bk = bn << 16 | 18;
               } else {
                  bk = bn << 16 | 30;
               }
            } else {
               bk = bn << 16 | 22;
            }

            if (cD != -1) {
               Q(bk);
            }
         }

         if (ct <= cx && cu <= cy && var12 == 18) {
            Q(bk = bn << 16 | 40);
         }

         if (f(7, 44) && var12 == 6) {
            Q(bk = bn << 16 | 44);
         }

         if (var12 == 19) {
            Q(bk = bn << 16 | 48);
         }

         y(1);
         if (am) {
            gZ();
         }

         if (aC) {
            cB = (cA + 1) * ++cA;
            a[7][46][2] = (short)(a[7][33][2] + cB);
            a[7][46][3] = (short)(a[7][33][3] - 10 * cA);
            if (cA > 50 || a[7][46][2] > f.T) {
               cA = 0;
               aC = false;
               cB = 0;
               a(7, 46, false);
            }
         }

         if (aD) {
            cC++;
            if (e == 1 && c[0] == null) {
               e = 2;
               a(7, 53, true);
               b(7, 53, true);
               P(7);
            }

            if (e == 2) {
               a(7, 53, true);
               b(7, 53, true);
               if (cC > 50) {
                  e = 3;
                  a(7, 53, false);
                  b(7, 53, false);
               }
            }

            if (e == 3 && c[0] == null) {
               aD = false;
               cC = 0;
               e = 0;
               a(7, 53, false);
               b(7, 53, false);
               P(7);
            }
         }
      }

      if (var0 == 3) {
         if (f(7, 44)) {
            a(7, 2, true);
         } else {
            a(7, 2, false);
         }

         M(7);
         String var4;
         a((var4 = f.b(180)) == null ? "" : var4, 7, 47, 0, 0);
         String var5;
         a((var5 = f.b(cp)) == null ? "" : var5, 7, 10, 0, 0);
         a(Integer.toString(cx) + " / " + ct, 7, 12, 0, 0);
         a("+", 7, 19, 0, 0);
         String var6;
         a((var6 = f.b(cq)) == null ? "" : var6, 7, 15, 0, 0);
         a(Integer.toString(cy) + " / " + cu, 7, 17, 0, 0);
         if (f(7, 13)) {
            a(Integer.toString(cv), 7, 25, 0, 0);
         }

         if (f(7, 18)) {
            a(Integer.toString(cw), 7, 26, 0, 0);
         }

         String var7;
         a((var7 = f.b(185)) == null ? "" : var7, 7, 20, 0, 0);
         a(Integer.toString(bG), 7, 23, 0, 0);
         a("=", 7, 24, 0, 0);
         String var8;
         b((var8 = f.b(cl)) == null ? "" : var8, 7, 32, 0, 0);
         a("+" + f.a(ci, L, " "), 7, 35, 0, 0);
         a("+" + f.a(cj, L, " "), 7, 37, 0, 0);
         a(g, 7, 39, 0, 0);
         String var9;
         a((var9 = f.b(387)) == null ? "" : var9, 7, 41, 0, 0);
         if (aD) {
            String var10;
            a(((var10 = f.b(188)) == null ? "" : var10) + " " + cH + "/" + cF, 7, 54, 0, 0);
         }

         if (aB && (a[7][49][17] <= -1 || a[7][49][17] >= 30 ? false : a[a[7][49][17]] != null && a[a[7][49][17]].a())) {
            b[138].a(f.a, 11, 75, 235, 0);
         }
      }

      return false;
   }

   private static void hD() {
      g var0 = g.a(7);
      g var1 = g.a(1);
      int var2 = 0;

      for (int var3 = 0; var3 < var0.a; var3++) {
         int var4 = var0.a[var3][3];
         int var5;
         if ((var5 = var0.a[var3][4]) >= 1 && var4 == cg && var5 - 1 == c) {
            var2 = var3;
            break;
         }
      }

      co = var0.a[var2][1];
      if ((ch = var0.a[var2][18]) <= 117) {
         ci = var1.a[ch][7];
         cj = var0.a[var2][16];
         cl = var0.a[var2][2];
         cr = var0.a[var2][6];
         cp = var1.a[cr][2];
         ct = var0.a[var2][7];
         cv = var0.a[var2][8];
         cs = var0.a[var2][9];
         cq = var1.a[cs][2];
         cu = var0.a[var2][10];
         cw = var0.a[var2][11];
         cz = var0.a[var2][12];
         g = d(ck = var0.a[var2][14] * 60);
         cm = var0.a[var2][15];
         cn = (short)var1.a[ch][3];
         a[7][9][5] = (short)var1.a[cr][3];
         a[7][9][6] = (short)var1.a[cr][4];
         w(a[7][9][5]);
         a[7][14][5] = (short)var1.a[cs][3];
         a[7][14][6] = (short)var1.a[cs][4];
         w(a[7][14][5]);
         a[7][33][5] = (short)var1.a[ch][3];
         a[7][33][6] = (short)var1.a[ch][4];
         a[7][46][5] = (short)var1.a[ch][3];
         a[7][46][6] = (short)var1.a[ch][4];
         w(var1.a[ch][3]);
         hE();
      }
   }

   private static void hE() {
      cx = e(0, cr);
      cy = e(0, cs);
      if (cr == cs && ct + cu > cx) {
         if (cx <= ct) {
            cy = 0;
         } else {
            cx = ct;
            cy = cy - ct;
         }
      }

      boolean var0 = false;
      boolean var1 = false;
      if (cr >= 27) {
         var0 = true;
      }

      if (cs >= 27) {
         var1 = true;
      }

      boolean var2 = true;
      if (ct <= cx) {
         a(7, 11, true);
         a(7, 13, false);
         a(7, 27, false);
         a(7, 29, false);
      } else {
         a(7, 11, false);
         a(7, 29, var0);
         b(7, 29, var0);
         a(7, 13, !var0);
         b(7, 13, !var0);
         a(7, 27, !var0);
         var2 = false;
      }

      if (cu <= cy) {
         a(7, 16, true);
         a(7, 18, false);
         a(7, 28, false);
         a(7, 30, false);
      } else {
         byte var10000;
         byte var10001;
         boolean var10002;
         label96: {
            a(7, 16, false);
            if (cr == cs && f(7, 13)) {
               a(7, 18, false);
               b(7, 18, false);
               var10000 = 7;
               var10001 = 28;
            } else {
               a(7, 18, !var1);
               b(7, 18, !var1);
               var10000 = 7;
               var10001 = 28;
               if (!var1) {
                  var10002 = true;
                  break label96;
               }
            }

            var10002 = false;
         }

         a(var10000, var10001, var10002);
         a(7, 30, var1);
         b(7, 30, var1);
         var2 = false;
      }

      if (cz > 0 && bG > 0 && !aA) {
         a(7, 22, true);
         b(7, 22, true);
      } else {
         a(7, 22, false);
         b(7, 22, false);
      }

      if (var2) {
         a[7][40][5] = 20;
         a[7][40][6] = 48;
         b(7, 40, true);
      } else {
         a[7][40][5] = 20;
         a[7][40][6] = 49;
         b(7, 40, true);
      }

      O(7);
   }

   private static void u(boolean var0) {
      if (var0) {
         a[7][49][5] = 1138;
         a(7, 49, true);
         c(7, 49, 0, 1);
         if (aA) {
            ci = g.a(1).a[ch + 1][7];
         } else {
            ci = g.a(1).a[ch][7];
         }
      } else {
         a(7, 49, false);
         a[7][49][5] = -1;
      }

      aB = var0;
   }

   private static boolean o() {
      return cD == 0 && ct > cx || cD == 1 && (f(7, 18) || f(7, 30)) || cD == 2 && f(7, 22);
   }

   private static boolean u(int var0) {
      if (var0 == 0) {
         K(22);
         ec = 0;
         dZ = 0;
         ea = 0;
         eb = 0;
         if (cF == cG) {
            q(cF, 2);
         } else {
            q(cF + 1, 2);
         }

         int[] var1 = new int[]{162, 163, 164};
         a(0, var1, 3, 1);
         f.j();
         c = 0;
         t(false);
         aE = false;
         ap = 100;
      }

      if (var0 == 1) {
         hH();
         hC();
         if (cF == cG) {
            q(cF, 2);
         } else {
            q(cF + 1, 2);
         }

         if (az) {
            t(true);
         } else if (!aE && az) {
            t(false);
         }

         if (!aE && !az && aH) {
            t(false);
         }

         if (!az) {
            a(22, 108, false);
            a(22, 117, false);
            a(22, 126, false);
            a(22, 135, false);
            a(22, 144, false);
            a(22, 153, false);
            a(22, 116, false);
            a(22, 125, false);
            a(22, 134, false);
            a(22, 143, false);
            a(22, 152, false);
            a(22, 161, false);
            a(22, 115, false);
            a(22, 124, false);
            a(22, 133, false);
            a(22, 142, false);
            a(22, 151, false);
            a(22, 160, false);
         }

         if (az) {
            a(c);
         }

         a(22, 5, false);
         a(22, 4, false);
         a(22, 3, false);
         b(22, 5, false);
         a(22, 9, h);
         a(22, 1, h);
         a(22, 8, true);
         a(22, 7, true);
         if (K == -1 && aN == 160) {
            b(22, 9, h);
            a(22, 1, h);
         } else {
            b(22, 9, false);
            a(22, 1, false);
         }

         if (D != -1) {
            if (D == 10) {
               i(202, 203, 7);
            }

            D = -1;
         }

         P(22);
      }

      if (var0 == 5) {
         W(22);
      }

      if (var0 == 2) {
         if (eq == 0 && cA[0] != 162) {
            int[] var12 = new int[]{162, 163, 164};
            a(0, var12, 3, 1);
         }

         hH();
         if (az) {
            int var13 = dZ - ea >= 4 ? 4 : dZ % 4;

            for (int var2 = ea; var2 < ea + var13; var2++) {
               d(var2, true);
            }

            for (int var22 = ea + var13; var22 < ea + 4; var22++) {
               d(var22, false);
            }
         }

         if (am) {
            gZ();
         }

         hG();
         if (b[1] != null && !h(1, 1)) {
            if (b[1][8] < 0 && as[c] < ar[c] - 6) {
               aw(1);
            } else if (b[1][8] > -10 && as[c] > 0) {
               aw(-1);
            }
         }

         if (cf != 0 && c[0] == null) {
            if (cf == 2) {
               a(22, 108, false);
               a(22, 117, false);
               a(22, 126, false);
               a(22, 135, false);
               a(22, 144, false);
               a(22, 153, false);
               b(22, 108, false);
               b(22, 117, false);
               b(22, 126, false);
               b(22, 135, false);
               b(22, 144, false);
               b(22, 153, false);
               a(22, 116, false);
               a(22, 125, false);
               a(22, 134, false);
               a(22, 143, false);
               a(22, 152, false);
               a(22, 161, false);
               a(22, 115, false);
               a(22, 124, false);
               a(22, 133, false);
               a(22, 142, false);
               a(22, 151, false);
               a(22, 160, false);
            }

            cf = 0;
            O(22);
         }

         y(1);
      }

      if (var0 == 3) {
         if (!az && !aH) {
            b(22, 13, 28, fu, 4);
         }

         if (az || aH) {
            if (ea == 0) {
               a(22, 184, false);
            } else {
               a(22, 184, true);
            }

            if (ea + 4 < dZ) {
               a(22, 185, true);
            } else {
               a(22, 185, false);
            }
         }

         M(22);
         if (!az) {
            int var14 = 20 + 15 * fu;
            if (fu + E < cH && !f(22, var14)) {
               String var5;
               a((var5 = f.b(843)) == null ? "" : var5, 22, 92, 0, 0);
            }

            String var6;
            a((var6 = f.b(180)) == null ? "" : var6, 22, 2, 0, 0);
            a(f.a(d(), L, " "), 22, 10, 0, 0);
         }

         int var15 = a[22][101][2];
         int var7 = a[22][101][3];
         a("+" + Integer.toString(cJ), var15 + 40, var7 + 10, 0, 0, 0, 0, 2, 0, false, false);
         int[] var8 = new int[4];
         a[a[22][11][5]].a(a[22][11][6], 0, var8, 0);
         int var10000 = a[22][11][2] + var8[0];
         int var10001 = a[22][11][3] + var8[1];
         int var10002 = var8[2];
         int var4 = var8[3];
         int var3 = var10002;
         int var23 = var10001;
         var15 = var10000;
         f.b(f.a, var15, var23, var3, var4);
         if (!az) {
            hF();
         }

         var23 = f.U;
         var15 = f.T;
         f.b(f.a, 0, 0, var15, var23);
         if (az) {
            String var18;
            a((var18 = f.b(200)) == null ? "" : var18, 22, 106, 0, 0);
         }

         a[a[22][107][5]].a(a[22][107][6], 0, var8, 0);
         var10000 = a[22][107][2] + var8[0];
         var10001 = a[22][107][3] + var8[1];
         var10002 = var8[2];
         var3 = var8[3];
         var23 = var10002;
         var15 = var10001;
         var7 = var10000;
         f.b(f.a, var7, var15, var23, var3);
         if (az) {
            var7 = ar[fn] - ea >= 4 ? 4 : ar[fn] % 4;

            for (int var20 = 0; var20 < var7; var20++) {
               String var26;
               a((var26 = f.b(k[c][var20 + as[c] + ea])) == null ? "" : var26, 22, 109 + var20 * 9, 0, 0);
               a(d(o[c][var20 + as[c] + ea]), 22, 112 + var20 * 9, 0, 0);
               if (e() < r[c][var20 + as[c] + ea]) {
                  String var27;
                  a(((var27 = f.b(447)) == null ? "" : var27) + Integer.toString(r[c][var20 + as[c] + ea]), 22, 113 + var20 * 9, 0, 0);
               }
            }
         }

         var15 = f.U;
         var7 = f.T;
         f.b(f.a, 0, 0, var7, var15);
      }

      return false;
   }

   private static void hF() {
      int var0 = cF - E >= 4 ? 4 : cF % 4;

      for (int var1 = 0; var1 < var0; var1++) {
         if (var1 + E < cH && g[var1 + E]) {
            int var2 = a[22][26 + var1 * 15][2] - 50;
            int var3 = a[22][26 + var1 * 15][3] - 15;
            b[138].a(f.a, 11, var2, var3, 0);
         }
      }
   }

   private static void hG() {
      for (int var0 = 0; var0 < 4; var0++) {
         b(false, var0);
         c(false, var0);
      }

      int var7;
      if ((var7 = cH - E >= 4 ? 4 : cH - E) < 0) {
         var7 = 0;
      }

      for (int var1 = 0; var1 < var7; var1++) {
         if (var1 < cH && var1 < 5) {
            String var12;
            String var26 = (var12 = f.b(au[var1 + E])) == null ? "" : var12;
            int var22 = 15 + var1 * 15;
            var12 = var26;
            a[22][var22] = var12;
            if (!az) {
               var26 = d[var1 + E];
               var22 = 24 + var1 * 15;
               var12 = var26;
               a[22][var22] = var12;
               if (f(22, 24 + var1 * 15)) {
                  a(22, 14 + var1 * 15, false);
               } else {
                  a(22, 14 + var1 * 15, true);
               }

               var26 = (var12 = f.b(au[var1])) == null ? "" : var12;
               var22 = 14 + var1 * 15;
               var12 = var26;
               a[22][var22] = var12;
               int var17 = 16 + var1 * 15;
               if (f(22, var17)) {
                  var26 = Integer.toString(ay[var1 + E]);
                  var22 = 17 + var1 * 15;
                  var12 = var26;
                  a[22][var22] = var12;
               }
            }
         } else if (!az && var1 < cG) {
            String var2;
            String var10000 = (var2 = f.b(au[var1 + E])) == null ? "" : var2;
            int var3 = 14 + var1 * 15;
            var2 = var10000;
            a[22][var3] = var2;
         }

         long var19 = System.currentTimeMillis() / 1000L;
         int var4 = var1 + E;
         int var5 = b[0][8];
         if (var19 > b[var4] + av[var4]) {
            int var20 = 19 + var4 * 15;
            if ((!f(22, var20) || !g(22, var20)) && h[var4] != 4) {
               X(32);
            }

            b(true, var1);
            c(false, var1);
            d(false, var1);
            d[var4] = "";
            ay[var4] = 0;
            h[var4] = 4;
            if (aN == 171) {
               f = true;
            }
         } else if (var19 > b[var4] && var19 < b[var4] + av[var4]) {
            b(false, var1);
            c(true, var1);
            d(true, var1);
            int var21 = av[var4] - (int)(var19 - b[var4]);
            ay[var4] = a(var21);
            d[var4] = d(var21);
            h[var4] = 3;
         } else if (var19 < b[var4]) {
            b(false, var1);
            c(false, var1);
            d(true, var1);
            String var6;
            d[var4] = (var6 = f.b(189)) == null ? "" : var6;
            ay[var4] = aw[var4];
            h[var4] = 2;
            b[var4] = var19;
         }

         b[0][8] = var5;
      }

      if (cF - E < 4 && cF < cG && !az) {
         var7 = cF + 1;
         String var30 = Integer.toString(cD[var7 - 4]);
         int var10 = 24 + (cF - E) * 15;
         String var9 = var30;
         a[22][var10] = var9;
      }

      if (aF) {
         cI++;
         a[22][87 + z][2] = (short)(a[22][26 + z * 15][2] + 4 * cI);
         a[22][87 + z][3] = (short)(a[22][26 + z * 15][3] + cI * cI + 40);
         if (a[22][87 + z][3] > f.U) {
            aF = false;
            cI = 0;
            ay(z + E);
         }
      }
   }

   private static void hH() {
      int var0;
      if ((var0 = cF - E >= 4 ? 4 : cF % 4) < 0) {
         var0 = 0;
      }

      for (int var1 = 0; var1 < var0; var1++) {
         e(var1, true);
      }

      for (int var4 = var0; var4 < 4; var4++) {
         e(var4, false);
      }

      if (cF - E < 4 && cF < cG) {
         var0 = cF - E;
         a(22, 12 + var0 * 15, true);
         b(22, 12 + var0 * 15, true);
         a(22, 21 + var0 * 15, true);
         a(22, 22 + var0 * 15, true);
         if (!az) {
            b(22, 22 + var0 * 15, true);
            a(22, 24 + var0 * 15, true);
            int var5 = cF + 1;
            String var10000 = Integer.toString(cD[var5 - 4]);
            int var2 = 24 + var0 * 15;
            String var6 = var10000;
            a[22][var2] = var6;
         }

         a(22, 23 + var0 * 15, true);
      }

      P(22);
   }

   private static void e(int var0, boolean var1) {
      int var2 = 12 + var0 * 15;
      if (var0 + E < cH) {
         a(22, 14 + var0 * 15, false);
         a(22, var2, (boolean)var1);
         b(22, var2, (boolean)var1);
         a(22, var0 + 87, (boolean)var1);
         a(22, 26 + var0 * 15, (boolean)var1);
         a(22, 21 + var0 * 15, false);
         a(22, 22 + var0 * 15, false);
         b(22, 22 + var0 * 15, false);
         a(22, 23 + var0 * 15, false);
         a(22, 15 + var0 * 15, (boolean)var1);
         String var5;
         String var10000 = (var5 = f.b(au[var0 + E])) == null ? "" : var5;
         int var3 = 15 + var0 * 15;
         String var6 = var10000;
         a[22][var3] = var6;
         if (!az) {
            a(22, 24 + var0 * 15, (boolean)var1);
            var10000 = d[var0 + E];
            var3 = 24 + var0 * 15;
            String var7 = var10000;
            a[22][var3] = var7;
         }
      } else {
         if (var0 < cG) {
            for (int var11 = var2; var11 < var2 + 15; var11++) {
               a(22, var11, false);
            }

            a(22, var2, (boolean)var1);
            b(22, var2, (boolean)var1);
            if (cL + var0 + E < cG) {
               au[var0 + E] = 197;
               h[var0 + E] = 1;
            }
         }

         if (!az && var0 + E < cG && var0 + E < cF) {
            if (f(22, 24 + var0 * 15)) {
               a(22, 14 + var0 * 15, false);
            } else {
               a(22, 14 + var0 * 15, true);
            }

            String var8;
            String var15 = (var8 = f.b(au[var0 + E])) == null ? "" : var8;
            int var12 = 14 + var0 * 15;
            String var9 = var15;
            a[22][var12] = var9;
         }
      }

      if (var1) {
         if (var0 < 5 && var0 < cG) {
            int var13 = 26 + var0 * 15;
            var1 = var0 + 87;
            if (ax[var0 + E] > 0) {
               a[22][var13][5] = (short)ax[var0 + E];
               a[22][var1][5] = (short)ax[var0 + E];
               a[22][var13][6] = 0;
               a[22][var1][6] = 0;
            } else {
               a[22][var13][10] = 0;
               a[22][var1][10] = 0;
            }

            w(a[22][var13][5]);
         }
      } else {
         a(22, 26 + var0 * 15, false);
         a(22, var0 + 87, false);
      }

      c(false, var0);
   }

   private static void ax(int var0) {
      int var1 = a[22][26 + var0 * 15][2] - a[22][101][2];
      var0 = a[22][26 + var0 * 15][3] - a[22][101][3];
      a(22, 101, true);
      a(1441893, 1441893, var1, var0, 0, 0, 1000);
   }

   private static void ay(int var0) {
      while (var0 < cH - 1) {
         at[var0] = at[var0 + 1];
         au[var0] = au[var0 + 1];
         av[var0] = av[var0 + 1];
         b[var0] = b[var0 + 1];
         aw[var0] = aw[var0 + 1];
         ax[var0] = ax[var0 + 1];
         g[var0] = g[var0 + 1];
         ay[var0] = ay[var0 + 1];
         d[var0] = d[var0 + 1];
         h[var0] = h[var0 + 1];
         var0++;
      }

      if (cH > 0) {
         at[cH - 1] = 0;
         au[cH - 1] = 0;
         av[cH - 1] = 0;
         b[cH - 1] = 0L;
         aw[cH - 1] = 0;
         ax[cH - 1] = -1;
         g[cH - 1] = false;
         ay[cH - 1] = 0;
         d[cH - 1] = "";
         h[cH - 1] = 0;
      }

      if (--cH < 0) {
         cH = 0;
      }

      hH();
      O(22);
   }

   private static void az(int var0) {
      long var2 = System.currentTimeMillis() / 1000L;
      av[var0] = 0;
      b[var0] = var2;
   }

   private static void b(boolean var0, int var1) {
      int var2 = 20 + var1 * 15;
      int var3 = 19 + var1 * 15;
      if (var0 && var1 == 0 && aN == 171 && f(22, 99)) {
         a(22, 99, false);
         f = true;
      }

      if (f(22, var3) != var0 || g(22, var3) != var0) {
         a(22, var2, (boolean)var0);
         a(22, var3, (boolean)var0);
         b(22, var3, (boolean)var0);
         if (b[0] != null) {
            var0 = b[0][8];
            O(22);
            b[0][8] = var0;
         }
      }
   }

   private static void c(boolean var0, int var1) {
      int var2 = 16 + var1 * 15;
      int var3 = 18 + var1 * 15;
      if (f(22, var2) != var0 && b != null && b[0] != null) {
         a(22, var2, var0);
         b(22, var2, var0);
         a(22, var3, var0);
         a(22, 17 + var1 * 15, var0);
         String var10000 = Integer.toString(ay[var1 + E]);
         var1 = 17 + var1 * 15;
         String var4 = var10000;
         a[22][var1] = var4;
         O(22);
      }
   }

   private static void d(boolean var0, int var1) {
      var1 = 25 + var1 * 15;
      if (aN == 171) {
         if (f(22, var1) || g(22, var1)) {
            a(22, var1, false);
            b(22, var1, false);
            O(22);
         }
      } else {
         if (f(22, var1) != var0 || g(22, var1) != var0) {
            a(22, var1, var0);
            b(22, var1, var0);
            O(22);
         }
      }
   }

   private static void aA(int var0) {
      g var1 = g.a(7);
      int var2 = 0;

      for (int var3 = 0; var3 < 83; var3++) {
         if (at[var0] == var1.a[var3][1]) {
            var2 = var3;
            break;
         }
      }

      int var7 = var1.a[var2][6];
      int var4 = var1.a[var2][7];
      int var5 = var1.a[var2][9];
      int var6 = var1.a[var2][10];
      if (b(5) + e.a(2) + var4 + var6 > b()) {
         D = 2;
         s(17);
      } else {
         a(0, var7, var4);
         a(0, var5, var6);
         if (g[var0]) {
            j(1);
         }

         az(var0);
         ay(var0);
      }
   }

   static boolean f() {
      boolean var0 = false;
      long var1 = System.currentTimeMillis() / 1000L;

      for (int var3 = 0; var3 < b.length; var3++) {
         if (b[var3] > 0L && var1 >= b[var3] + av[var3]) {
            var0 = true;
            break;
         }
      }

      return var0;
   }

   private static boolean v(int var0) {
      if (var0 == 0) {
         if (A == cG) {
            q(A, 2);
         } else {
            q(A + 1, 2);
         }

         f.j();
         dZ = 0;
         ea = 0;
         eb = 0;
         aG = false;
         ap = 100;
         w(false);
         if (K == 23) {
            f = true;
         }
      }

      if (var0 == 1) {
         hJ();
         hK();
         if (A == cG) {
            q(A, 2);
         } else {
            q(A + 1, 2);
         }

         a(22, 5, false);
         b(22, 5, false);
         a(22, 4, false);
         a(22, 3, false);
         a(22, 9, h);
         a(22, 1, h);
         a(22, 8, true);
         a(22, 7, true);
         if (K == -1 && aN == 160) {
            b(22, 9, h);
            a(22, 1, h);
         } else {
            a(22, 1, false);
            b(22, 9, false);
         }

         if (aG && !aH) {
            v(true);
         } else if (!aG && aH) {
            v(false);
         }

         if (!aG && !aH && az) {
            v(false);
         }

         if (!aH) {
            a(22, 108, false);
            a(22, 117, false);
            a(22, 126, false);
            a(22, 135, false);
            a(22, 144, false);
            a(22, 153, false);
            a(22, 116, false);
            a(22, 125, false);
            a(22, 134, false);
            a(22, 143, false);
            a(22, 152, false);
            a(22, 161, false);
            a(22, 115, false);
            a(22, 124, false);
            a(22, 133, false);
            a(22, 142, false);
            a(22, 151, false);
            a(22, 160, false);
         }

         if (D != -1) {
            if (D == 9) {
               i(204, 205, 7);
            }

            D = -1;
         }

         P(22);
      }

      if (var0 == 5) {
         W(22);
      }

      if (var0 == 2) {
         if (K != -1) {
            hd();
         }

         hJ();
         if (aH) {
            int var1 = dZ - ea > 4 ? 4 : dZ % 4;

            for (int var2 = 0; var2 < var1; var2++) {
               g(var2, true);
            }

            for (int var20 = var1; var20 < 4; var20++) {
               g(var20, false);
            }
         }

         if (b[0] != null && !h(0, 1)) {
            if (b[0][8] < 0 && cL < A + 1 - 5 && cL + 5 < cG) {
               aB(1);
            } else if (b[0][8] > -10 && cL > 0) {
               aB(-1);
            }
         }

         hI();
         if (b[1] != null && !h(1, 1)) {
            if (b[1][8] < 0 && cN < cM - 6) {
               aE(1);
            } else if (b[1][8] > -10 && cN > 0) {
               aE(-1);
            }
         }

         if (cO != 0 && c[0] == null) {
            if (cO == 2) {
               a(22, 108, false);
               a(22, 117, false);
               a(22, 126, false);
               a(22, 135, false);
               a(22, 144, false);
               a(22, 153, false);
               b(22, 108, false);
               b(22, 117, false);
               b(22, 126, false);
               b(22, 135, false);
               b(22, 144, false);
               b(22, 153, false);
               a(22, 116, false);
               a(22, 125, false);
               a(22, 134, false);
               a(22, 143, false);
               a(22, 152, false);
               a(22, 161, false);
               a(22, 115, false);
               a(22, 124, false);
               a(22, 133, false);
               a(22, 142, false);
               a(22, 151, false);
               a(22, 160, false);
            }

            cO = 0;
            O(22);
         }

         y(1);
      }

      if (var0 == 3) {
         if (!az && !aH) {
            b(22, 13, 28, fu, 4);
         }

         if (az || aH) {
            if (ea == 0) {
               a(22, 184, false);
            } else {
               a(22, 184, true);
            }

            if (ea + 4 < dZ) {
               a(22, 185, true);
            } else {
               a(22, 185, false);
            }
         }

         if (aN == 25) {
            a(22, 186, false);
         }

         M(22);
         if (!aH) {
            var0 = 20 + 15 * fu;
            if (fu + E < cK && !f(22, var0) && !f(22, 99)) {
               String var6;
               a((var6 = f.b(843)) == null ? "" : var6, 22, 92, 0, 0);
            }

            String var7;
            a((var7 = f.b(388)) == null ? "" : var7, 22, 2, 0, 0);
            a(f.a(d(), L, " "), 22, 10, 0, 0);
         }

         int var8 = a[22][101][2];
         int var13 = a[22][101][3];
         a("+" + Integer.toString(cP), var8 + 40, var13 + 10, 0, 0, 0, 0, 2, 0, false, false);
         int[] var9 = new int[4];
         a[a[22][11][5]].a(a[22][11][6], 0, var9, 0);
         int var10000 = a[22][11][2] + var9[0];
         int var10001 = a[22][11][3] + var9[1];
         int var10002 = var9[2];
         int var4 = var9[3];
         int var3 = var10002;
         int var21 = var10001;
         var13 = var10000;
         f.b(f.a, var13, var21, var3, var4);
         var21 = f.U;
         var13 = f.T;
         f.b(f.a, 0, 0, var13, var21);
         if (aH) {
            String var16;
            b((var16 = f.b(468)) == null ? "" : var16, 22, 106, 0, 0);
         }

         a[a[22][107][5]].a(a[22][107][6], 0, var9, 0);
         var10000 = a[22][107][2] + var9[0];
         var10001 = a[22][107][3] + var9[1];
         var10002 = var9[2];
         var3 = var9[3];
         var21 = var10002;
         var13 = var10001;
         var8 = var10000;
         f.b(f.a, var8, var13, var21, var3);
         if (aH) {
            var8 = dZ - ea > 4 ? 4 : dZ % 4;

            for (int var18 = 0; var18 < var8; var18++) {
               String var24;
               a((var24 = f.b(aF[var18 + cN + ea])) == null ? "" : var24, 22, 109 + var18 * 9, 0, 0);
               if (e() < j[var18 + cN + ea]) {
                  String var25;
                  a(((var25 = f.b(447)) == null ? "" : var25) + Integer.toString(j[var18 + cN + ea]), 22, 113 + var18 * 9, 0, 0);
               } else {
                  a(d(aJ[var18 + cN + ea]), 22, 112 + var18 * 9, 0, 0);
               }
            }
         }

         var13 = f.U;
         var8 = f.T;
         f.b(f.a, 0, 0, var8, var13);
      }

      return false;
   }

   private static void hI() {
      for (int var0 = 0; var0 < 4; var0++) {
         b(false, var0);
         c(false, var0);
      }

      int var6 = 0;
      if (cK - E > 0) {
         var6 = cK - E >= 4 ? 4 : cK % 4;
      }

      for (int var1 = 0; var1 < var6; var1++) {
         if (cL + var1 + E < cK && var1 < 5) {
            if (!aH && var1 + cL < cG) {
               String var20 = e[var1 + cL + E];
               int var14 = 24 + var1 * 15;
               String var11 = var20;
               a[22][var14] = var11;
               var14 = 16 + var1 * 15;
               if (f(22, var14)) {
                  var20 = Integer.toString(aE[var1 + cL + E]);
                  var14 = 17 + var1 * 15;
                  var11 = var20;
                  a[22][var14] = var11;
               }

               a(22, 14 + var1 * 15, false);
            }
         } else if (!aH && var1 + cL < 4) {
            String var2;
            String var10000 = (var2 = f.b(aA[var1 + cL + E])) == null ? "" : var2;
            int var3 = 14 + var1 * 15;
            var2 = var10000;
            a[22][var3] = var2;
         }

         long var17 = System.currentTimeMillis() / 1000L;
         int var13 = var1 + E;
         if (var17 > a[var13] + c[var13]) {
            int var18 = 19 + var13 * 15;
            if ((!f(22, var18) || !g(22, var18)) && i[var13] == 3) {
               X(36);
            }

            e(true, var1);
            f(false, var1);
            g(false, var1);
            e[var13] = "";
            aE[var13] = 0;
            i[var13] = 4;
            if (K == 28) {
               f = true;
            }
         } else if (var17 > a[var13] && var17 < a[var13] + c[var13]) {
            e(false, var1);
            f(true, var1);
            g(true, var1);
            int var19 = c[var13] - (int)(var17 - a[var13]);
            aE[var13] = a(var19);
            e[var13] = d(var19);
            i[var13] = 3;
         } else if (var17 < a[var13]) {
            e(false, var1);
            f(false, var1);
            g(true, var1);
            String var5;
            e[var13] = (var5 = f.b(189)) == null ? "" : var5;
            aE[var13] = aB[var13];
            i[var13] = 2;
            a[var13] = var17;
         }
      }

      if (A - E < 4 && A < cG && !aH) {
         var6 = A + 1;
         String var22 = Integer.toString(cD[var6 - 4]);
         int var9 = 24 + (A - E) * 15;
         String var8 = var22;
         a[22][var9] = var8;
      }

      if (aF) {
         cI++;
         a[22][87 + z][2] = (short)(a[22][26 + z * 15][2] + 4 * cI);
         a[22][87 + z][3] = (short)(a[22][26 + z * 15][3] + cI * cI);
         if (a[22][87 + z][3] > f.U) {
            a(22, 87 + z, false);
            aF = false;
            cI = 0;
            l(z + E);
         }
      }
   }

   private static void hJ() {
      int var0;
      if (A == cG) {
         var0 = A - E >= 4 ? 4 : A % 4;
      } else {
         var0 = A + 1 - E >= 4 ? 4 : (A + 1) % 4;
      }

      for (int var1 = 0; var1 < var0; var1++) {
         f(var1, true);
      }

      for (int var5 = var0; var5 < 4; var5++) {
         f(var5, false);
      }

      if (A - E < 4 && A < cG) {
         var0 = A - E;
         a(22, 12 + var0 * 15, true);
         b(22, 12 + var0 * 15, true);
         a(22, 21 + var0 * 15, true);
         a(22, 22 + var0 * 15, true);
         if (!aH && aN == 160) {
            b(22, 22 + var0 * 15, true);
         } else {
            b(22, 22 + var0 * 15, false);
         }

         a(22, 23 + var0 * 15, true);
         if (!aH) {
            a(22, 24 + (A - cL - E) * 15, true);
            var0 = A + 1;
            String var10000 = Integer.toString(cD[var0 - 4]);
            int var6 = 24 + (A - cL - E) * 15;
            String var4 = var10000;
            a[22][var6] = var4;
         }
      }

      P(22);
   }

   private static void f(int var0, boolean var1) {
      int var2 = 12 + var0 * 15;
      a(22, var2, (boolean)var1);
      b(22, var2, (boolean)var1);
      a(22, 26 + var0 * 15, (boolean)var1);
      a(22, 21 + var0 * 15, false);
      a(22, 22 + var0 * 15, false);
      b(22, 22 + var0 * 15, false);
      a(22, 23 + var0 * 15, false);
      a(22, 14 + var0 * 15, false);
      a(22, 15 + var0 * 15, false);
      a(22, 24 + var0 * 15, false);
      if (cL + var0 + E < cK) {
         a(22, 14 + var0 * 15, false);
         a(22, 15 + var0 * 15, (boolean)var1);
         String var5;
         String var10000 = (var5 = f.b(aA[var0 + cL])) == null ? "" : var5;
         int var3 = 15 + var0 * 15;
         String var6 = var10000;
         a[22][var3] = var6;
         if (!aH) {
            a(22, 24 + var0 * 15, (boolean)var1);
            var10000 = e[var0 + cL + E];
            var3 = 24 + var0 * 15;
            String var7 = var10000;
            a[22][var3] = var7;
         }
      } else if (cL + var0 + E < cG) {
         for (int var11 = var2; var11 < var2 + 15; var11++) {
            a(22, var11, false);
         }

         a(22, var2, (boolean)var1);
         b(22, var2, (boolean)var1);
         if (cL + var0 + E < cG) {
            aA[cL + var0 + E] = 197;
            i[cL + var0 + E] = 1;
         }

         if (!aH && var0 + cL < cG && var0 + cL < A) {
            a(22, 14 + var0 * 15, (boolean)var1);
            String var8;
            String var15 = (var8 = f.b(aA[var0 + cL + E])) == null ? "" : var8;
            int var12 = 14 + var0 * 15;
            String var9 = var15;
            a[22][var12] = var9;
         }
      }

      if (var1 && var0 < 5 && cL + var0 + E < cG) {
         int var13 = 26 + var0 * 15;
         var1 = var0 + 87;
         if (aC[cL + var0] > 0) {
            a[22][var13][5] = (short)aC[cL + var0 + E];
            a[22][var1][5] = (short)aC[cL + var0 + E];
            a[22][var13][6] = (short)aD[cL + var0 + E];
            a[22][var1][6] = (short)aD[cL + var0 + E];
         } else {
            a[22][var13][10] = 0;
            a[22][var1][10] = 0;
         }

         w(a[22][var13][5]);
      }

      f(false, var0);
   }

   private static void aB(int var0) {
      cL += var0;
      int var1 = b[0][8];
      hJ();
      b[0][8] = var1 + (a[22][27][2] - a[22][12][2]) * var0;
      R(0);
   }

   static void l(int var0) {
      while (var0 < cK - 1) {
         az[var0] = az[var0 + 1];
         aA[var0] = aA[var0 + 1];
         c[var0] = c[var0 + 1];
         a[var0] = a[var0 + 1];
         aB[var0] = aB[var0 + 1];
         aC[var0] = aC[var0 + 1];
         aD[var0] = aD[var0 + 1];
         aE[var0] = aE[var0 + 1];
         e[var0] = e[var0 + 1];
         i[var0] = i[var0 + 1];
         var0++;
      }

      if (cK > 0) {
         az[cK - 1] = 0;
         aA[cK - 1] = 0;
         c[cK - 1] = 0;
         a[cK - 1] = 0L;
         aB[cK - 1] = 0;
         aC[cK - 1] = -1;
         aD[cK - 1] = 0;
         aE[cK - 1] = 0;
         e[cK - 1] = "";
         i[cK - 1] = 0;
      }

      if (--cK < 0) {
         cK = 0;
      }

      hJ();
      O(22);
   }

   private static void aC(int var0) {
      long var2 = System.currentTimeMillis() / 1000L;
      c[var0] = 0;
      a[var0] = var2;
   }

   private static void e(boolean var0, int var1) {
      int var2 = 20 + var1 * 15;
      var1 = 19 + var1 * 15;
      if (f(22, var1) != var0 || g(22, var1) != var0) {
         int var3 = b[0][8];
         a(22, var2, var0);
         a(22, var1, var0);
         b(22, var1, var0);
         b[0][8] = var3;
         O(22);
      }
   }

   private static void f(boolean var0, int var1) {
      int var2 = 16 + var1 * 15;
      int var3 = 18 + var1 * 15;
      if (f(22, var2) != var0 && b != null && b[0] != null) {
         int var4 = b[0][8];
         a(22, var2, var0);
         b(22, var2, var0);
         a(22, var3, var0);
         a(22, 17 + var1 * 15, var0);
         String var10000 = Integer.toString(aE[var1 + cL + E]);
         var1 = 17 + var1 * 15;
         String var5 = var10000;
         a[22][var1] = var5;
         O(22);
         b[0][8] = var4;
      }
   }

   private static void g(boolean var0, int var1) {
      var1 = 25 + var1 * 15;
      if (K == 28) {
         if (f(22, var1) || g(22, var1)) {
            a(22, var1, false);
            b(22, var1, false);
            O(22);
         }
      } else {
         if (f(22, var1) != var0 || g(22, var1) != var0) {
            a(22, var1, var0);
            b(22, var1, var0);
            O(22);
         }
      }
   }

   private static void aD(int var0) {
      g var1 = g.a(22);
      int var2 = 0;

      for (int var3 = 0; var3 < 6; var3++) {
         if (az[var0] == var1.a[var3][1]) {
            var2 = var3;
            break;
         }
      }

      int var7 = var1.a[var2][5];
      int var4 = var1.a[var2][6];
      int var5 = var1.a[var2][8];
      int var6 = var1.a[var2][9];
      if (b(5) + e.a(2) + var4 + var6 >= b()) {
         D = 2;
         s(17);
      } else {
         a(0, var7, var4);
         a(0, var5, var6);
         aC(var0);
         l(var0);
      }
   }

   private static void hK() {
      cM = 0;
      cN = 0;
      g var0 = g.a(22);
      g var1 = g.a(1);
      if (var0 != null) {
         aF = new int[var0.a];
         aG = new int[var0.a];
         aH = new int[var0.a];
         aI = new int[var0.a];
         aJ = new int[var0.a];
         aK = new int[var0.a];
         aL = new int[var0.a];
         j = new byte[var0.a];
      }

      for (int var2 = 0; var2 < var0.a; var2++) {
         int var3;
         if ((var3 = var0.a[var2][3]) > -1) {
            aF[var3] = var0.a[var2][2];
            aG[var3] = var0.a[var2][0];
            if (var0.a[var2][15] != -1 && var0.a[var2][15] < 117) {
               aH[var3] = var1.a[var0.a[var2][15]][7];
            } else {
               aH[var3] = 0;
            }

            aI[var3] = var0.a[var2][13];
            aJ[var3] = var0.a[var2][11] * 60;
            int var4;
            if ((var4 = var0.a[var2][15]) != -1 && var4 < 117) {
               aK[var3] = var1.a[var4][3];
               aL[var3] = var1.a[var4][4];
               if (aL[var3] == -1) {
                  aL[var3] = 0;
               }
            } else {
               aK[var3] = 0;
               aL[var3] = 0;
            }

            j[var3] = (byte)var0.a[var2][4];
            cM++;
         }
      }
   }

   private static void g(int var0, boolean var1) {
      int var2;
      for (int var3 = var2 = 108 + var0 * 9; var3 < var2 + 9; var3++) {
         a(22, var3, var1);
      }

      if (var1) {
         int var4 = 116 + var0 * 9;
         a[22][var4][5] = (short)aK[cN + var0 + ea];
         a[22][var4][6] = (short)aL[cN + var0 + ea];
         w(a[22][var4][5]);
      }

      if (var1 && e() < j[cN + var0 + ea]) {
         a(22, 115 + var0 * 9, true);
      } else {
         a(22, 115 + var0 * 9, false);
      }

      a(22, 114 + var0 * 9, false);
   }

   private static void aE(int var0) {
      if (b[1] != null) {
         cN += var0;
         int var1 = b[1][8];

         for (int var2 = 0; var2 < 6; var2++) {
            g(var2, true);
         }

         b[1][8] = var1 + (a[22][117][2] - a[22][108][2]) * var0;
         R(1);
      }
   }

   private static void v(boolean var0) {
      int var1 = 0;
      if (b != null && b[0] != null) {
         var1 = b[0][8];
      }

      if (var0 && K == 24) {
         f = true;
      }

      aH = var0;
      if (var0) {
         cO = 1;
         w(var0);
         if (b[0] != null) {
            T(0);
         }

         a(22, 182, false);
         a(22, 183, false);
         a[22][172][6] = 138;
         a(22, 108, var0);
         a(22, 117, var0);
         a(22, 126, var0);
         a(22, 135, var0);
         a(22, 144, var0);
         a(22, 153, var0);
         b(22, 108, var0);
         b(22, 117, var0);
         b(22, 126, var0);
         b(22, 135, var0);
         b(22, 144, var0);
         b(22, 153, var0);
         a(22, 116, var0);
         a(22, 125, var0);
         a(22, 134, var0);
         a(22, 143, var0);
         a(22, 152, var0);
         a(22, 161, var0);

         for (int var2 = 0; var2 < 6; var2++) {
            if (e() >= j[cN + var2]) {
               a(22, 115 + var2 * 9, false);
            } else {
               a(22, 115 + var2 * 9, true);
            }
         }
      } else {
         cO = 2;
         w(var0);
         if (b[0] != null) {
            U(0);
         }

         a(22, 182, false);
         a(22, 183, false);
         a[22][172][6] = 139;
      }

      a(22, 106, true);
      a(22, 162, false);
      b(22, 162, false);
      a(22, 163, false);
      b(22, 163, false);
      a(22, 164, false);
      b(22, 164, false);
      a(22, 165, false);
      a(22, 166, false);
      a(22, 167, false);
      a(22, 173, false);
      a(22, 174, false);
      a(22, 175, false);
      a(22, 176, false);
      a(22, 177, false);
      a(22, 178, false);
      hJ();
      if (b != null && b[0] != null) {
         b[0][8] = var1;
      }
   }

   private static void w(boolean var0) {
      int var1 = var0 ? 1 : 0;

      for (int var2 = 102; var2 <= 186; var2++) {
         if ((var2 == 114 || var2 == 123 || var2 == 132 || var2 == 141) && var0) {
            a[22][var2][10] = 0;
         } else {
            a[22][var2][10] = (short)var1;
         }
      }
   }

   static boolean g() {
      boolean var0 = false;

      for (int var1 = 0; var1 < cG; var1++) {
         long var2 = System.currentTimeMillis() / 1000L;
         if (a[var1] > 0L && var2 > a[var1] + c[var1]) {
            var0 = true;
            break;
         }
      }

      return var0;
   }

   private static boolean w(int var0) {
      if (var0 == 0) {
         dY = 0;
      }

      if (var0 == 1) {
         dY = 0;
         ap = 100;
         g var1 = g.a(22);
         g var2 = g.a(1);
         int var3 = 0;

         for (int var4 = 0; var4 < var1.a; var4++) {
            if (var1.a[var4][3] == cQ) {
               var3 = var4;
               break;
            }
         }

         cY = var1.a[var3][1];
         if ((cR = var1.a[var3][15]) <= 117) {
            cS = var1.a[var3][13];
            cU = var1.a[var3][2];
            db = var1.a[var3][5];
            cZ = var2.a[db][2];
            dd = var1.a[var3][6];
            df = var1.a[var3][7];
            dc = var1.a[var3][8];
            da = var2.a[dc][2];
            de = var1.a[var3][9];
            dg = var1.a[var3][10];
            h = d(cT = var1.a[var3][11] * 60);
            cV = var1.a[var3][12];
            cW = (short)var2.a[cR][3];
            cX = (short)var2.a[cR][4];
            a[6][6][5] = (short)var2.a[db][3];
            a[6][6][6] = (short)var2.a[db][4];
            w(a[6][6][5]);
            a[6][11][5] = (short)var2.a[dc][3];
            a[6][11][6] = (short)var2.a[dc][4];
            w(a[6][11][5]);
            a[6][24][5] = (short)var2.a[cR][3];
            a[6][24][6] = (short)var2.a[cR][4];
            a[6][41][5] = (short)var2.a[cR][3];
            a[6][41][6] = (short)var2.a[cR][4];
            w(var2.a[cR][3]);
            hL();
         }

         P(6);
      }

      if (var0 == 5) {
         P(6);
         W(6);
         cA = 0;
         aC = false;
         a(6, 41, false);
      }

      if (var0 == 2) {
         if (K != 27 && de <= di && dd <= dh) {
            a[6][40][10] = 1;
         } else {
            a[6][40][10] = 0;
         }

         y(1);
         if (K != -1) {
            hd();
         }

         if (aC) {
            cB = (cA + 1) * ++cA;
            a[6][41][2] = (short)(a[6][24][2] + cB);
            a[6][41][3] = (short)(a[6][24][3] - 10 * cA);
            if (cA > 50 || a[6][41][2] > f.T) {
               cA = 0;
               aC = false;
               cB = 0;
               a(6, 41, false);
            }
         }

         if (aI) {
            dj++;
            if (g == 1 && c[0] == null) {
               g = 2;
               a(6, 42, true);
               b(6, 42, true);
               P(6);
            }

            if (g == 2) {
               a(6, 42, true);
               b(6, 42, true);
               if (dj > 50) {
                  g = 3;
                  a(6, 42, false);
                  b(6, 42, false);
               }
            }

            if (g == 3 && c[0] == null) {
               aI = false;
               dj = 0;
               g = 0;
               a(6, 42, false);
               b(6, 42, false);
               P(6);
            }
         }
      }

      if (var0 == 3) {
         M(6);
         String var5;
         a((var5 = f.b(388)) == null ? "" : var5, 6, 38, 0, 0);
         String var6;
         a((var6 = f.b(cZ)) == null ? "" : var6, 6, 7, 0, 0);
         a(Integer.toString(dh) + " / " + dd, 6, 9, 0, 0);
         a("+", 6, 16, 0, 0);
         String var7;
         b((var7 = f.b(da)) == null ? "" : var7, 6, 12, 0, 0);
         a(Integer.toString(di) + " / " + de, 6, 14, 0, 0);
         if (f(6, 10)) {
            a(Integer.toString(df), 6, 18, 0, 0);
         }

         if (f(6, 15)) {
            a(Integer.toString(dg), 6, 19, 0, 0);
         }

         a("=", 6, 17, 0, 0);
         String var8;
         b((var8 = f.b(cU)) == null ? "" : var8, 6, 23, 0, 0);
         a("+" + cS, 6, 30, 0, 0);
         a(h, 6, 33, 0, 0);
         String var9;
         a((var9 = f.b(387)) == null ? "" : var9, 6, 35, 0, 0);
         if (aI) {
            String var10;
            a(((var10 = f.b(188)) == null ? "" : var10) + " " + cK + "/" + A, 6, 43, 0, 0);
         }
      }

      return false;
   }

   private static void hL() {
      dh = e(0, db);
      di = e(0, dc);
      if (db == dc && dd + de > dh) {
         if (dh <= dd) {
            di = 0;
         } else {
            dh = dd;
            di = di - dd;
         }
      }

      boolean var0 = true;
      if (dd <= dh) {
         a(6, 8, true);
         a(6, 10, false);
         a(6, 20, false);
      } else {
         a(6, 8, false);
         a(6, 10, true);
         b(6, 10, true);
         a(6, 20, true);
         var0 = false;
      }

      if (de <= di) {
         a(6, 13, true);
         a(6, 15, false);
         a(6, 21, false);
      } else {
         a(6, 13, false);
         if (db == dc && f(6, 10)) {
            a(6, 15, false);
            b(6, 15, false);
            a(6, 21, false);
         } else {
            a(6, 15, true);
            b(6, 15, true);
            a(6, 21, true);
         }

         var0 = false;
      }

      if (var0) {
         a[6][34][5] = 20;
         a[6][34][6] = 48;
      } else {
         a[6][34][5] = 20;
         a[6][34][6] = 49;
      }

      b(6, 34, true);
      P(6);
   }

   private static boolean x(int var0) {
      if (var0 == 0) {
         int[] var1 = new int[]{3, 4, 5};
         fn = 0;
         bk = -1;
         dU = 0;
         a(0, var1, 3, 1);
         q(dn, 2);
         if (K == 50) {
            fn = 2;
            dq = 2;
         } else {
            fn = 0;
            dq = 0;
         }

         f.j();
      }

      if (var0 == 1) {
         int[] var14 = new int[]{3, 4, 5};
         a(0, var14, 3, 1);
         q(dn, 2);
         bk = -1;
         dU = 0;
         K(10);
         do = 0;
         if (dq == 0) {
            a(new int[]{0, 4});
         } else if (dq == 1) {
            a(new int[]{3});
         } else if (dq == 2) {
            a(new int[]{1, 2});
         }

         G(dq);
         String var2 = "";
         a[10][76] = var2;
         P(10);
         ap = 100;
         dk = b(5);
         X(50);
         dl = l(b());
         aJ = false;
         dp = -1;
         a[10][20][5] = 1138;
         a[10][20][6] = 12;
         a[10][28][5] = 1138;
         a[10][28][6] = 12;
         a[10][36][5] = 1138;
         a[10][36][6] = 12;
         a[10][44][5] = 1138;
         a[10][44][6] = 12;
         a[10][52][5] = 1138;
         a[10][52][6] = 12;
         a[10][60][5] = 1138;
         a[10][60][6] = 12;
      }

      if (var0 == 5) {
         if (dp != -1) {
            int var15 = dp;
            d = 4;
            int var28 = aN[var15];
            int var3 = aO[var15];
            var15 = aP[var15];
            boolean var4 = false;
            a(var28, var3, -1);
            if (var15 == 0) {
               short var17 = G[var3];
               var3 = 0;

               for (int var29 = dr; var29 >= 0; var29--) {
                  if (aQ[var29] == var17) {
                     var3 = var29;
                     break;
                  }
               }

               for (int var30 = var3; var30 < dr - 1; var30++) {
                  aQ[var30] = aQ[var30 + 1];
               }

               aQ[dr - 1] = 0;
               dr--;
               e[] var31 = new e[1];
               e.b(0, 54, var17, var31);
               if (var31[0] != null) {
                  b(var31[0], false);
                  var4 = true;
                  d = 4;
                  f = var31[0];
               }
            } else {
               var4 = true;
               d = 4;
               f = a(var15, var3);
            }

            if (f != null && var4) {
               int[] var18 = new int[2];
               if (a(f, var18)) {
                  f.r = var18[0];
                  f.s = var18[1];
               }

               c.a(f.r, f.s, 1000);
            }

            f(false);
            g(true);
            X(50);
         }

         aM = null;
         aP = null;
         p = null;
         q = null;
         r = null;
         s = null;
         t = null;
         o = null;
         k = null;
         x(1);
         W(10);
      }

      if (var0 == 2) {
         if (dU == 0) {
            if (dn != 0) {
               a(10, 65, true);
            } else {
               a(10, 65, false);
            }

            a(10, 62, false);
            a(10, 63, false);
         } else {
            if (f(10, 18 + 8 * fu)) {
               a(10, 65, true);
            } else {
               a(10, 65, false);
            }

            if (E == 0) {
               a(10, 62, false);
            } else {
               a(10, 62, true);
            }

            if (E + 4 >= dn) {
               a(10, 63, false);
            } else {
               a(10, 63, true);
            }
         }

         int var19 = dn - E >= 4 ? 4 : dn % 4;

         for (int var32 = E; var32 < E + var19; var32++) {
            h(var32, true);
         }

         for (int var33 = E + var19; var33 < E + 4; var33++) {
            h(var33, false);
         }

         if (K > 0) {
            hd();
         }

         if (b[0] != null && !h(0, 1)) {
            if (b[0][8] < 0 && do < dn - 6) {
               aF(1);
            } else if (b[0][8] > -10 && do > 0) {
               aF(-1);
            }
         }

         y(1);
         short var39 = a[10][71][2];
         int var20 = a[10][72][2];
         var20 = var39 + (var20 - var39) * dk / m(dl);
         a[10][70][2] = (short)var20;
         a(10, 70, true);
      }

      if (var0 == 3) {
         if (dU == 0) {
            b(10, 14, 22, -1, 4);
         } else {
            b(10, 14, 22, fu, 4);
         }

         if (!aJ) {
            M(10);
            String var5;
            a((var5 = f.b(456)) == null ? "" : var5, 10, 1, 0, 0);
            String var6;
            a((var6 = f.b(483)) == null ? "" : var6, 10, 75, 0, 0);
            f(10, 70);
            if (g(10, 73)) {
               String var7;
               a((var7 = f.b(484)) == null ? "" : var7, 10, 74, 0, 0);
            }

            a("" + dk + " / " + m(dl), 10, 2, 0, 0);
            int[] var22 = new int[4];
            a[a[10][12][5]].a(a[10][12][6], 0, var22, 0);
            int var10000 = a[10][12][2] + var22[0];
            int var10001 = a[10][12][3] + var22[1];
            int var10002 = var22[2];
            int var40 = var22[3];
            int var34 = var10002;
            int var23 = var10001;
            var0 = var10000;
            f.b(f.a, var0, var23, var34, var40);
            int var24 = dn - E >= 4 ? 4 : dn % 4;

            for (var40 = 0; var40 < var24; var40++) {
               String var9;
               a((var9 = f.b(o[do + var40 + E])) == null ? "" : var9, 10, 15 + (var40 << 3), 0, 0);
               var34 = 17 + (var40 << 3);
               a("x" + p[do + var40 + E], 10, var34, 0, 0);
            }

            for (int var25 = var40; var25 < 6; var25++) {
               var34 = 16 + (var25 << 3);
               String var10;
               a((var10 = f.b(197)) == null ? "" : var10, 10, var34, 0, 0);
            }

            if (f(10, 18 + 8 * fu) && dU != 0) {
               String var12;
               a((var12 = f.b(842)) == null ? "" : var12, 10, 77, 0, 0);
            } else {
               String var11;
               a((var11 = f.b(841)) == null ? "" : var11, 10, 77, 0, 0);
            }

            int var26 = f.U;
            var0 = f.T;
            var34 = var26;
            int var27 = var0;
            f.b(f.a, 0, 0, var27, var34);
         }
      }

      return false;
   }

   private static void a(int[] var0) {
      int var1 = 0;
      int var2 = 0;
      byte var3 = 0;
      byte var4 = 0;
      do = 0;
      dn = 0;

      for (int var5 = 0; var5 < var0.length; var5++) {
         dn = dn + k(var0[var5]);
      }

      if (dn > 0) {
         aM = new int[dn];
         aN = new int[dn];
         aO = new int[dn];
         aP = new int[dn];
         p = new short[dn];
         q = new short[dn];
         r = new short[dn];
         s = new short[dn];
         t = new short[dn];
         o = new short[dn];
         k = new byte[dn];
         byte var6 = 0;

         for (int var7 = 0; var7 < var0.length; var7++) {
            switch (var0[var7]) {
               case 0:
                  var3 = 1;
                  var4 = 117;
                  break;
               case 1:
                  var3 = 3;
                  var4 = 20;
                  break;
               case 2:
                  var3 = 4;
                  var4 = 63;
                  break;
               case 3:
                  var3 = 0;
                  var4 = 64;
                  break;
               case 4:
                  var3 = 2;
                  var6 = 12;
                  var4 = 10;
            }

            g var9 = g.a(var3);

            for (int var8 = 0; var8 < var4; var8++) {
               if (e(var0[var7], var8) > 0) {
                  aM[var2] = var8;
                  aN[var2] = var0[var7];
                  aO[var2] = (short)var9.a[var8 + var6][0];
                  aP[var2] = var3;
                  p[var2] = (short)e(var0[var7], var8);
                  q[var2] = (short)var9.a[var8 + var6][3];
                  r[var2] = (short)var9.a[var8 + var6][4];
                  s[var2] = 0;
                  if (var0[var7] == 3 && var9.a[var8][32] > 0) {
                     s[var2] = (short)var9.a[var8][32];
                  }

                  t[var2] = (short)var9.a[var8 + var6][1];
                  o[var2] = (short)var9.a[var8 + var6][2];
                  if (var0[var7] == 0) {
                     k[var2] = (byte)var9.a[var8][9];
                  }

                  var2++;
                  if (var1 < 6) {
                     h(var1, true);
                     var1++;
                  }
               }
            }
         }
      }

      q(dn, 2);

      for (int var10 = var1; var10 < 6; var10++) {
         h(var10, false);
         a(10, 18 + (var10 << 3), false);
      }

      P(10);
   }

   private static void h(int var0, boolean var1) {
      int var2;
      int var3;
      int var4 = (var3 = (var2 = var0 - E << 3) + 13) + 8;

      for (int var5 = var3; var5 < var4; var5++) {
         a(10, var5, var1);
      }

      int var7 = var2 + 19;
      var4 = var2 + 18;
      if (!var1) {
         a(10, var3, true);
         b(10, var3, false);
         a(10, var4, false);
         a(10, var2 + 20, false);
      } else {
         label24: {
            byte var10000;
            int var10001;
            boolean var10002;
            label23: {
               switch (aN[do + var0]) {
                  case 0:
                     a[10][var7][8] = 0;
                     a(10, var4, false);
                     b(10, var3, false);
                     var10000 = 10;
                     var10001 = var2 + 20;
                     if (k[do + var0] > 0) {
                        var10002 = true;
                        break label23;
                     }
                     break;
                  case 1:
                  case 2:
                  case 4:
                     a[10][var7][8] = 0;
                     a(10, var4, true);
                     b(10, var3, true);
                     var10000 = 10;
                     var10001 = var2 + 20;
                     break;
                  case 3:
                     a[10][var7][8] = s[do + var0];
                     a(10, var4, true);
                     b(10, var3, true);
                     var10000 = 10;
                     var10001 = var2 + 20;
                     break;
                  default:
                     break label24;
               }

               var10002 = false;
            }

            a(var10000, var10001, var10002);
         }

         a[10][var7][5] = q[do + var0];
         a[10][var7][6] = r[do + var0];
         w(a[10][var7][5]);
      }
   }

   private static void aF(int var0) {
      do += var0;
      int var1 = b[0][8];
      int var2 = dn - do >= 6 ? 6 : dn - do;

      int var3;
      for (var3 = 0; var3 < var2; var3++) {
         h(var3, true);
      }

      while (var3 < 6) {
         h(var3, false);
         var3++;
      }

      P(10);
      b[0][8] = var1 + (a[10][21][2] - a[10][13][2]) * var0;
      R(0);
   }

   private static boolean y(int var0) {
      if (var0 == 0) {
         iF();
         e.d(100);
         a(false, false, false);
         a(13, 49, false);
         a(13, 46, false);
         b(13, 46, false);
         d(59);
         eg = 0;
         bk = 851975;
      }

      if (var0 == 1) {
         hM();
         if (aN != 161 && aN != 163) {
            a(13, 45, false);
            b(13, 43, true);
            a(13, 43, true);
         } else {
            a(13, 45, true);
            b(13, 43, false);
            a(13, 43, false);
         }

         P(13);
         bD = e.e(0, 54);
         bA = e.a(0, 49);
         hN();
      }

      if (var0 == 5) {
         c = null;
         iG();
         if (aQ) {
            h = 0;
            O++;
            e[] var1 = new e[2];
            e.a(0, 50, 18, var1, 2);
            e.j();
            c.a(var1[0].r, var1[0].s, 1000);
            d var2;
            short var3 = (var2 = b[128]).a[5];
            if (j != null) {
               j.r = var1[0].r + var2.b(var3);
               j.s = var1[0].s + var2.c(var3);
            }

            am = true;
            if (dw > 0) {
               var1 = new e[2];
               e.a(0, 50, 18, var1, 2);
               a(true, dw, var1[0].r, var1[0].s);
            }

            aQ = false;
         }

         W(13);
      }

      if (var0 == 2) {
         if (aQ) {
            return false;
         }

         if (h == 3) {
            a[13][7 + O][5] = 36;
            a[13][7 + O][6] = 12;
            int var19 = bj & 65535;
            if ((bj >> 16 & 65535) == 13 && var19 == 7 + O && !b.a()) {
               aK = true;
            } else if (aK) {
               aK = false;
            }

            if (aK) {
               a(13, 7 + O, true);
            } else {
               a(13, 7 + O, false);
            }

            if (b != null) {
               b.c(f.V);
            }
         } else if (h == 2) {
            a[13][7 + O][6] = 8;
            aK = true;
            long var17 = System.currentTimeMillis() / 1000L;
            if (p + q - var17 < 0L) {
               h = 3;
               short var18 = a[13][7 + O][2];
               short var28 = a[13][7 + O][3];
               b.a(a[36]);
               b.a(5, -1, true);
               b.a(var18, var28);
               if (b != null) {
                  b.c(f.V);
               }
            }
         } else if (h == 1 && aO) {
            if (b.a()) {
               short var33 = a[13][7 + O][2];
               short var16 = a[13][7 + O][3];
               b.a(a[36]);
               b.a(1, -1, true);
               b.a(var33, var16);
            }

            int var34 = bj & 65535;
            if ((bj >> 16 & 65535) == 13 && var34 == 7 + O && !b.a()) {
               aK = true;
            } else if (aK) {
               aK = false;
            }

            if (b != null) {
               b.c(f.V);
            }
         }

         for (int var20 = 0; var20 < (O - 3 < 6 ? O - 3 : 6); var20++) {
            if (c[var20].a()) {
               if (c[var20] < System.currentTimeMillis()) {
                  short var29 = a[13][var20 + 10][2];
                  short var35 = a[13][var20 + 10][3];
                  c[var20].a(4, -1, true);
                  c[var20].a(var29, var35);
                  c[var20].a();
                  h[var20] = false;
                  a[13][var20 + 50][10] = 0;
                  a[13][var20 + 10][6] = 10;
               } else {
                  h[var20] = true;
                  a[13][var20 + 10][6] = 9;
               }
            } else if (!c[var20].a()) {
               if (c[var20] < System.currentTimeMillis()) {
                  a[13][var20 + 10][6] = 10;
                  int var30 = bj & 65535;
                  if ((bj >> 16 & 65535) == 13 && var30 == var20 + 10 && !c[var20].a()) {
                     h[var20] = true;
                  } else if (h[var20]) {
                     h[var20] = false;
                  }
               } else {
                  h[var20] = true;
                  a[13][var20 + 10][6] = 9;
               }
            }

            if (c[var20] != null) {
               c[var20].c(f.V);
            }
         }

         aL = f();

         for (int var21 = 0; var21 < 3; var21++) {
            int var31 = bj & 65535;
            if ((bj >> 16 & 65535) == 13 && var31 == var21 + 7) {
               if (!i[var21]) {
                  i[var21] = true;
               }

               if (var21 == 0 && O >= 1) {
                  if (aL) {
                     a[13][7][6] = 6;
                  } else {
                     a[13][7][6] = 2;
                  }
               } else if (var21 == 1 && O >= 2) {
                  if (aM) {
                     a[13][8][6] = 7;
                  } else {
                     a[13][8][6] = 3;
                  }
               } else if (var21 == 2 && O >= 3) {
                  if (aN) {
                     a[13][9][6] = 4;
                  } else {
                     a[13][9][6] = 0;
                  }
               }
            } else if (var21 == 0 && O >= 1 && aL && i[var21]) {
               i[var21] = false;
            } else if (var21 == 1 && O >= 2 && aM && i[var21]) {
               i[var21] = false;
            } else if (var21 == 2 && O >= 3 && aN && i[var21]) {
               i[var21] = false;
            }

            if (d[var21] != null) {
               d[var21].c(f.V);
            }
         }

         for (int var22 = 0; var22 < 6; var22++) {
            if (a[13][var22 + 64][10] == 1 && a[13][var22 + 64][3] < -50) {
               a[13][var22 + 64][10] = 0;
               short var32 = a[13][var22 + 10][2];
               int var36 = a[13][var22 + 10][3] + 50;
               a[13][var22 + 64][2] = (short)var32;
               a[13][var22 + 64][3] = (short)var36;
            }
         }

         for (int var23 = 0; var23 < 6; var23++) {
            if (c[var23] != null) {
               if (c[var23].n > c[var23].o) {
                  c[var23] = null;
               } else {
                  c[var23].w();
                  c[var23].f();
               }
            }
         }

         a(13, 56, false);
         a(13, 63, false);
         if (am) {
            gZ();
         }
      }

      if (var0 == 3) {
         M(13);
         if (b != null && !b.a() && !aK) {
            b.b();
         }

         for (int var24 = 0; var24 < (O - 3 < 6 ? O - 3 : 6); var24++) {
            if (c[var24] != null && !c[var24].a() && !h[var24]) {
               c[var24].b();
            }
         }

         a("" + (eg + 1) + ".", 13, 25, 0, 0);
         String var4;
         a((var4 = f.b(301)) == null ? "" : var4, 13, 6, 0, 0);
         switch (eg) {
            case 0:
               String var13;
               a("" + (eg + 1) + "." + ((var13 = f.b(302)) == null ? "" : var13), 13, 26, 0, 0);
               break;
            case 1:
               String var12;
               a("" + (eg + 1) + "." + ((var12 = f.b(303)) == null ? "" : var12), 13, 26, 0, 0);
               break;
            case 2:
               String var11;
               a("" + (eg + 1) + "." + ((var11 = f.b(304)) == null ? "" : var11), 13, 26, 0, 0);
               break;
            case 3:
               String var10;
               a("" + (eg + 1) + "." + ((var10 = f.b(305)) == null ? "" : var10), 13, 26, 0, 0);
               break;
            case 4:
               String var9;
               a("" + (eg + 1) + "." + ((var9 = f.b(306)) == null ? "" : var9), 13, 26, 0, 0);
               break;
            case 5:
               String var8;
               a("" + (eg + 1) + "." + ((var8 = f.b(307)) == null ? "" : var8), 13, 26, 0, 0);
               break;
            case 6:
               String var7;
               a("" + (eg + 1) + "." + ((var7 = f.b(308)) == null ? "" : var7), 13, 26, 0, 0);
               break;
            case 7:
               String var6;
               a("" + (eg + 1) + "." + ((var6 = f.b(309)) == null ? "" : var6), 13, 26, 0, 0);
               break;
            default:
               String var5;
               a("" + (eg + 1) + "." + ((var5 = f.b(310)) == null ? "" : var5), 13, 26, 0, 0);
         }

         String var14;
         a((var14 = f.b(845)) == null ? "" : var14, 13, 3, 0, 0);

         for (int var25 = 0; var25 < 6; var25++) {
            if (a[13][var25 + 50][10] == 1) {
               a(c((int)((c[var25] - System.currentTimeMillis()) / 1000L)), 13, var25 + 57, 0, 0);
            }
         }

         for (int var26 = 0; var26 < 6; var26++) {
            if (c[var26] != null) {
               c[var26].x();
               c[var26].y();
            }
         }

         int var27 = 73 + 1 * eg;
         a[36].a(f.a, 14, a[13][var27][2], a[13][var27][3], 0);
      }

      return false;
   }

   private static void hM() {
      aQ = false;
      h = new boolean[6];

      for (int var0 = 0; var0 < 6; var0++) {
         h[var0] = true;
      }

      for (int var4 = 0; var4 < (O - 3 < 6 ? O - 3 : 6); var4++) {
         if (c[var4] < System.currentTimeMillis()) {
            short var1 = a[13][var4 + 10][2];
            short var2 = a[13][var4 + 10][3];
            c[var4].a(4, -1, true);
            c[var4].a(var1, var2);
            c[var4].a();
            c[var4].b();
            a[13][var4 + 50][10] = 0;
         }
      }

      i = new boolean[3];

      for (int var5 = 0; var5 < 3; var5++) {
         short var15 = a[13][var5 + 7][2];
         short var20 = a[13][var5 + 7][3];
         if (var5 == 0) {
            d[0].a(2, -1, true);
         } else if (var5 == 1) {
            d[1].a(3, -1, true);
         } else {
            d[2].a(0, -1, true);
         }

         d[var5].a(var15, var20);
         d[var5].a();
         i[var5] = true;
      }

      for (int var6 = 0; var6 < 6; var6++) {
         a[13][var6 + 64][10] = 0;
         short var16 = a[13][var6 + 10][2];
         int var21 = a[13][var6 + 10][3] + 50;
         a[13][var6 + 64][2] = (short)var16;
         a[13][var6 + 64][3] = (short)var21;
      }

      for (int var7 = 0; var7 < 9; var7++) {
         a(13, var7 + 7, false);
         b(13, var7 + 7, false);
      }

      for (int var8 = 0; var8 <= (O < 3 ? O : 2); var8++) {
         a(13, var8 + 7, true);
         b(13, var8 + 7, true);
         a[13][var8 + 7][5] = 36;
         byte var17 = 0;
         switch (var8) {
            case 0:
               var17 = 2;
               break;
            case 1:
               var17 = 3;
               break;
            case 2:
               var17 = 0;
         }

         a[13][var8 + 7][6] = var17;
      }

      if (O < 9) {
         byte var18 = 11;
         switch (h) {
            case 0:
               if (!g(n(O))) {
                  break;
               }

               var18 = 1;
               boolean var26 = B(O);
               short var12 = p();
               if (aO = var26 && var12) {
                  a((short)1);
                  var18 = 5;
                  var12 = a[13][7 + O][2];
                  short var24 = a[13][7 + O][3];
                  b.a(a[36]);
                  b.a(1, -1, true);
                  b.a(var12, var24);
               }
               break;
            case 1:
               var18 = 1;
               boolean var3 = B(O);
               short var10 = p();
               if (aO = var3 && var10) {
                  var18 = 5;
                  var10 = a[13][7 + O][2];
                  short var23 = a[13][7 + O][3];
                  b.a(a[36]);
                  b.a(1, -1, true);
                  b.a(var10, var23);
               }
               break;
            case 2:
               var18 = 8;
               break;
            case 3:
               var18 = 12;
               short var9 = a[13][7 + O][2];
               short var22 = a[13][7 + O][3];
               b.a(a[36]);
               b.a(5, -1, true);
               b.a(var9, var22);
         }

         a[13][7 + O][5] = 36;
         a[13][7 + O][6] = var18;
         a(13, 7 + O, true);
         b(13, 7 + O, true);
      }

      for (int var14 = 3; var14 < (O < 9 ? O : 9); var14++) {
         a(13, var14 + 7, true);
         b(13, var14 + 7, true);
         a[13][var14 + 7][5] = 36;
         a[13][var14 + 7][6] = 9;
         int var19 = var14 - 3;
         if (c[var19] != null && c[var19].a() && c[var19] < System.currentTimeMillis()) {
            short var25 = a[13][var19 + 10][2];
            short var27 = a[13][var19 + 10][3];
            c[var19].a(4, -1, true);
            c[var19].a(var25, var27);
            c[var19].a();
            h[var19] = false;
         }
      }

      c = new e[6];
   }

   private static boolean z(int var0) {
      short var1 = 0;
      if (c[var0].a() && c[var0] >= System.currentTimeMillis()) {
         for (int var11 = 0; var11 < 6; var11++) {
            if (var11 != var0) {
               a[13][var11 + 50][10] = 0;
            }
         }

         if (a[13][var0 + 50][10] == 1) {
            a[13][var0 + 50][10] = 0;
         } else {
            a[13][var0 + 50][10] = 1;
         }

         X(55);
      } else if (!c[var0].a() && c[var0] < System.currentTimeMillis()) {
         switch (var0) {
            case 2:
            case 3:
               if (b(5) + e.a(2) >= b()) {
                  X(55);
                  D = 2;
                  s(17);
                  return false;
               }
               break;
            case 4:
               if (v() >= bx * e.b(0, 1005)) {
                  X(55);
                  D = 1;
                  s(17);
                  return false;
               }
         }

         X(60);
         c[var0] = System.currentTimeMillis() + 86400000L;
         c[var0].b(-1, 1);
         var1 = a[13][var0 + 10][2];
         int var2 = a[13][var0 + 10][3] + 50;
         byte var3 = 9;
         int var4 = 0;
         int[] var6 = new int[]{0, 0, 14};
         switch (var0) {
            case 0:
            case 1:
            case 5:
               byte var21 = 9;
               switch (var0) {
                  case 0:
                     var21 = 9;
                     if (h) {
                        break;
                     }
                  case 5:
                     var21 = 2;
                     break;
                  case 1:
                     var21 = 29;
               }

               var3 = var21;
               g var17 = g.a(3);

               for (var4 = 0; var4 < var17.a; var4++) {
                  int var10000 = var17.a[var4][0];
                  var21 = 9;
                  switch (var0) {
                     case 0:
                        var21 = 1;
                        break;
                     case 1:
                        var21 = 4;
                        break;
                     case 5:
                        var21 = 8;
                  }

                  if (var10000 == var21) {
                     break;
                  }
               }

               int var18 = var17.a[var4][13];
               if (var0 == 1) {
                  var4 = 5 | var18 << 16;
               } else {
                  var4 = var18;
               }
               break;
            case 2:
            case 3:
            case 4:
               var3 = 29;
               g var5 = g.a(1);
               var4 = 0;
               int[] var7 = new int[99];

               for (int var8 = 0; var8 < var5.a; var8++) {
                  if (var5.a[var8][16] != 0) {
                     byte var9 = 1;
                     switch (var0) {
                        case 2:
                           var9 = 1;
                           break;
                        case 3:
                           var9 = 2;
                           break;
                        case 4:
                           var9 = 3;
                     }

                     if (var9 == var5.a[var8][16]) {
                        var7[var4] = var8;
                        var4++;
                     }
                  }
               }

               int var19 = f.c(0, var4 - 1);
               int var20 = var5.a[var7[var19]][3];
               var4 = var5.a[var7[var19]][1] - 4000;
               int var15 = var5.a[var7[var19]][17];
               var4 |= var15 << 16;
               int var16 = var20;
               a(1, var16, 1, 0, 24);
               f.c("/7");
               c(1, 3);
               f.k();
         }

         c[var0] = e.a(47, 2, var6);
         c[var0].a(c.r + var1, c.s + var2, var3, 1000, true, var4);
         var1 = 1;
         if (var0 == 1) {
            a(b[4], 1, 7, false);
         } else if (var0 == 0) {
            a(b[1], 1, 7);
         }

         a[13][var0 + 10][6] = 9;
      }

      return (boolean)var1;
   }

   private static void hN() {
      aL = false;
      if (O >= 1) {
         if (aL = f()) {
            a[13][7][6] = 6;
            i[0] = false;
         } else {
            a[13][7][6] = 2;
            i[0] = true;
         }
      }

      aM = false;
      if (O >= 2) {
         for (int var0 = 0; var0 < 15 && !aM; var0++) {
            aM = m(be[var0 << 2]) > 0 && m(be[(var0 << 2) + 1]) > 0 && m(be[(var0 << 2) + 2]) > 0 && m(be[(var0 << 2) + 3]) > 0;
         }

         if (aM) {
            a[13][8][6] = 7;
            i[1] = false;
         } else {
            a[13][8][6] = 3;
            i[1] = true;
         }
      }

      aN = false;
      if (O >= 3) {
         for (int var1 = 0; var1 < bg && !aN; var1++) {
            aN = e[var1] == 1;
         }

         if (aN) {
            a[13][9][6] = 4;
            i[2] = false;
            return;
         }

         a[13][9][6] = 0;
         i[2] = true;
      }
   }

   private static void hO() {
      if (p != 1 && p != 2) {
         if ((f(f[0]) || g(0)) && u == 0) {
            a(29);
            return;
         }
      } else {
         X(55);
      }
   }

   private static void hP() {
      f = new String[]{
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         ""
      };
      String[] var10000 = new String[]{
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         ""
      };
      j[] var0 = new j[]{
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null
      };
      aR = new int[]{
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         -1
      };
      p = 0L;
   }

   private static boolean A(int var0) {
      if (var0 == 0) {
         K(14);
         P(14);
         ap = 100;
      }

      if (var0 == 1) {
         if (O == 0) {
            String var1;
            k = (var1 = f.b(243)) == null ? "" : var1;
         } else if (O == 1) {
            String var5;
            k = (var5 = f.b(244)) == null ? "" : var5;
         } else if (O == 2) {
            String var6;
            k = (var6 = f.b(245)) == null ? "" : var6;
         } else if (O == 3) {
            String var7;
            j = (var7 = f.b(251)) == null ? "" : var7;
         } else if (O == 4) {
            String var8;
            j = (var8 = f.b(252)) == null ? "" : var8;
         } else if (O == 5) {
            String var9;
            j = (var9 = f.b(253)) == null ? "" : var9;
         } else if (O == 6) {
            String var10;
            j = (var10 = f.b(254)) == null ? "" : var10;
         } else if (O == 7) {
            String var11;
            j = (var11 = f.b(255)) == null ? "" : var11;
         } else if (O == 8) {
            String var12;
            j = (var12 = f.b(256)) == null ? "" : var12;
         }

         int var13 = g(O + 1);
         g var2;
         dw = (var2 = g.a(3)).a[var13][12];
         dx = var2.a[var13][22];
         dy = var2.a[var13][21] * 60;
         if (h == 0 || h == 1) {
            h = 1;
            a((short)1);
            hQ();
            if (O == 0) {
               a(14, 76, true);
            } else {
               a(14, 76, false);
            }

            boolean var3 = B(du);
            boolean var4 = p();
            a(14, 7, var3);
            if (aO = var3 && var4) {
               a[14][10][5] = 20;
               a[14][10][6] = 78;
               a[14][10][20] = 1;
               a[14][11][8] = 2;
               b(14, 10, true);
            } else {
               a[14][10][5] = 20;
               a[14][10][6] = 211;
               a[14][10][20] = -1;
               a[14][11][8] = 3;
               b(14, 10, true);
            }

            a(14, 67, true);
            b(14, 67, true);
            String var14 = l;
            a[14][4] = var14;
            O(14);
            x(false);
            if (aO && O == 0) {
               a(14, 52, false);
               b(14, 52, false);
            } else {
               a(14, 52, true);
               b(14, 52, true);
            }

            O(14);
         } else if (h == 2 || h == 3) {
            a(h);
            hQ();
         }
      }

      if (var0 == 5) {
         x(1);
         W(14);
      }

      if (var0 == 2) {
         if (am) {
            gZ();
         }

         switch (h) {
            case 2:
               long var15 = System.currentTimeMillis() / 1000L;
               long var27 = 0L;
               if (dx > 0) {
                  long var10000 = p + q;
                  int var28 = 0;

                  for (int var29 = 0; var29 < f.length; var29++) {
                     if (aR[var29] == 1) {
                        var28++;
                     }
                  }

                  var27 = var10000 - var28 * q / dx - var15;
               }

               if (var27 > 0L) {
                  i = d((int)var27);
                  dv = a((int)var27);
               } else {
                  i = "00:00:00";
                  a(14, 18, false);
                  b(14, 18, false);
                  a(14, 19, false);
                  if (!f(14, 47)) {
                     a(14, 47, true);
                     b(14, 47, true);
                  }

                  O(14);
                  dv = a(0);
               }
               break;
            case 3:
               i = "00:00:00";
               a(14, 18, false);
               b(14, 18, false);
               a(14, 19, false);
               if (!f(14, 47)) {
                  a(14, 47, true);
                  b(14, 47, true);
                  O(14);
               }
         }

         y(1);
         int var16;
         if ((var16 = f.h()) != 5 && var16 != 11) {
            if (var16 == 19 && f(14, 52)) {
               bk = 917556;
               Q(917556);
               bk = 851975;
            }
         } else {
            if (h == 1) {
               bk = 917514;
            } else if (f(14, 18)) {
               bk = 917522;
            } else if (f(14, 47)) {
               bk = 917551;
            }

            Q(bk);
         }
      }

      if (var0 == 3) {
         if (h == 1) {
            x(true);
            a[14][77][10] = 0;
            a(14, 4, true);
            a(14, 5, true);
         } else {
            if (a[14][77][10] == 0 && h == 2 && O == 0) {
               a(14, 77, true);
            }

            if (O != 0 || h != 2) {
               a[14][77][10] = 0;
            }

            a(14, 4, false);
            a(14, 5, false);
         }

         if (h == 1) {
            a(14, 4, true);
            a(14, 5, true);
         } else {
            a(14, 4, false);
            a(14, 5, false);
         }

         M(14);
         switch (h) {
            case 1:
               String var24;
               b((var24 = f.b(284)) == null ? "" : var24, 14, 1, 0, 0);
               a((var24 = f.b(ds)) == null ? "" : var24, 14, 2, 0, 0);
               a(f.a(dt, L, " "), 14, 12, 0, 0);
               b((var24 = f.b(285)) == null ? "" : var24, 14, 11, 0, 0);
               if (f(14, 66)) {
                  a(f.a(dw, L, " "), 14, 72, 0, 0);
                  if (O < 3) {
                     a(k, 14, 75, 0, 0);
                  } else {
                     b(j, 14, 71, 0, 0);
                  }

                  if (dy > 0) {
                     a(d(dy), 14, 73, 0, 0);
                  }
               }
               break;
            case 2:
               String var20;
               b((var20 = f.b(284)) == null ? "" : var20, 14, 1, 0, 0);
               a((var20 = f.b(279)) == null ? "" : var20, 14, 16, 0, 0);
               a(i, 14, 17, 0, 0);
               if (f(14, 18)) {
                  a("" + dv, 14, 20, 0, 0);
               }

               if (f(14, 47)) {
                  a((var20 = f.b(250)) == null ? "" : var20, 14, 48, 0, 0);
               }

               if (f(14, 18)) {
                  a((var20 = f.b(848)) == null ? "" : var20, 14, 49, 0, 0);
               }
               break;
            case 3:
               String var17;
               b((var17 = f.b(284)) == null ? "" : var17, 14, 1, 0, 0);
               a((var17 = f.b(279)) == null ? "" : var17, 14, 16, 0, 0);
               a(i, 14, 17, 0, 0);
               if (f(14, 47)) {
                  a((var17 = f.b(250)) == null ? "" : var17, 14, 48, 0, 0);
               }
         }
      }

      if (var0 == 6) {
         a(h);
      }

      return false;
   }

   private static boolean B(int var0) {
      g var1 = g.a(3);
      byte var2 = 0;
      if (var0 == 0) {
         var2 = 2;
      } else if (var0 == 1) {
         var2 = 0;
      } else if (var0 == 2) {
         var2 = 3;
      } else if (var0 == 3) {
         var2 = 1;
      } else if (var0 == 4) {
         var2 = 4;
      } else if (var0 == 5) {
         var2 = 5;
      } else if (var0 == 6) {
         var2 = 6;
      } else if (var0 == 7) {
         var2 = 7;
      } else if (var0 == 8) {
         var2 = 8;
      }

      dt = var1.a[var2][6];
      ds = var1.a[var2][2];
      var0 = var1.a[var2][34];
      String var4;
      l = (var4 = f.b(268 + O)) == null ? "" : var4;
      return a[var0];
   }

   private static boolean p() {
      return dt <= c();
   }

   private static int n(int var0) {
      byte var1 = 0;
      if (var0 == 0) {
         var1 = 0;
      } else if (var0 == 1) {
         var1 = 4;
      } else if (var0 == 2) {
         var1 = 5;
      } else if (var0 == 3) {
         var1 = 6;
      } else if (var0 == 4) {
         var1 = 7;
      } else if (var0 == 5) {
         var1 = 8;
      } else if (var0 == 6) {
         var1 = 9;
      } else if (var0 == 7) {
         var1 = 10;
      } else if (var0 == 8) {
         var1 = 11;
      }

      return var1;
   }

   private static void hQ() {
      for (e var0 = e.a[0]; var0 != null; var0 = var0.a) {
         if (var0.q == 50) {
            int var1 = O + 1;
            switch (var0.y) {
               case 0:
                  if (var1 < 2) {
                     a(14, 60, false);
                  } else {
                     a(14, 60, true);
                  }
                  break;
               case 1:
                  if (var1 < 4) {
                     a[14][61][5] = 1128;
                     a[14][61][6] = 2;
                  } else {
                     a[14][61][5] = 1130;
                     a[14][61][6] = 0;
                  }
                  break;
               case 2:
                  if (var1 < 1) {
                     a(14, 62, false);
                  } else {
                     a(14, 62, true);
                  }
                  break;
               case 3:
                  if (var1 < 3) {
                     a(14, 65, false);
                  } else {
                     a(14, 65, true);
                  }
                  break;
               case 4:
                  if (var1 < 5) {
                     a(14, 63, false);
                  } else {
                     a(14, 63, true);
                  }
                  break;
               case 5:
                  if (var1 < 6) {
                     a(14, 59, false);
                  } else {
                     a(14, 59, true);
                  }
                  break;
               case 6:
                  if (var1 < 7) {
                     a(14, 64, false);
                  } else {
                     a(14, 64, true);
                  }
                  break;
               case 7:
                  if (var1 < 8) {
                     a[14][57][5] = 1128;
                     a[14][57][6] = 1;
                  } else {
                     a[14][57][5] = 1136;
                     a[14][57][6] = 0;
                  }
                  break;
               case 8:
                  if (var1 < 9) {
                     a(14, 58, false);
                  } else {
                     a(14, 58, true);
                  }
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
            }
         }
      }
   }

   private static void a(short var0) {
      h = var0;
      if (var0 == 1) {
         a(14, 3, true);
         a(14, 6, true);
         a(14, 8, false);
         a(14, 10, true);
         a(14, 13, true);
         a(14, 14, false);
         a(14, 15, false);
         a(14, 18, false);
         b(14, 18, false);
         a(14, 47, false);
         b(14, 47, false);
      } else if (var0 == 2) {
         a(14, 3, false);
         a(14, 6, false);
         a(14, 7, false);
         a(14, 8, false);
         a(14, 9, false);
         a(14, 10, false);
         b(14, 10, false);
         a(14, 13, false);
         a(14, 14, true);
         a(14, 15, true);
         a(14, 18, true);
         b(14, 18, true);
         a(14, 47, false);
         b(14, 47, false);
         a(14, 19, true);
         a(14, 76, false);
         x(false);
         a(14, 67, false);
         b(14, 67, false);
      } else if (var0 == 3) {
         a(14, 3, false);
         a(14, 6, false);
         a(14, 7, false);
         a(14, 8, false);
         a(14, 9, false);
         a(14, 10, false);
         b(14, 10, false);
         a(14, 13, false);
         a(14, 14, true);
         a(14, 15, true);
         a(14, 18, true);
         b(14, 18, true);
         a(14, 47, false);
         b(14, 47, false);
         a(14, 19, true);
         a(14, 76, false);
         x(false);
         a(14, 67, false);
         b(14, 67, false);
      }

      if (var0 == 2 || var0 == 3) {
         a(14, 22, false);
         b(14, 22, false);

         for (int var1 = 0; var1 < 6; var1++) {
            a(14, 23 + (var1 << 2), false);
            b(14, 23 + (var1 << 2), false);
         }
      }

      P(14);
   }

   private static void x(boolean var0) {
      a(14, 68, var0);
      a(14, 69, var0);
      a(14, 66, var0);
      aP = var0;
      a(14, 67, true);
      b(14, 67, true);
      if (O < 3) {
         a(14, 68, false);
      }

      if (dy > 0) {
         a(14, 70, var0);
      } else {
         a(14, 70, false);
      }
   }

   private static boolean C(int var0) {
      if (var0 == 0) {
         b(11, true);
         q(2, 2);
      }

      if (var0 == 1) {
         ap = 100;
         hf();
         P(11);
         X(59);
      }

      if (var0 == 5) {
         aT = -1;
         e = null;
         x(1);
         if (aR) {
            k(true);
            f(true);
            if (as) {
               a(1, 41, true);
               b(1, 41, true);
            }

            if (at) {
               a(1, 32, true);
               b(1, 32, true);
               a(1, 33, true);
            }
         }

         if (aS) {
            i(493, 494, 26);
         } else if (aT) {
            i(493, 495, 26);
         }

         aS = false;
         aT = false;
         W(11);
      }

      if (var0 == 2) {
         int var1 = f.h();
         if (!f(11, 25) || !f(11, 26)) {
            iC();
         }

         if ((var1 == 5 || var1 == 11) && a[11][7][10] == 1) {
            Q(bk = bn << 16 | 7);
         }

         if (var1 == 19) {
            Q(bk = bn << 16 | 2);
         }

         if (f(11, 25) && f(11, 26) && f(11, 27) && f(11, 28)) {
            b(11, 10, 12, -1, 4);
         } else {
            b(11, 10, 12, fu, 4);
         }

         if (var1 == 5 || var1 == 11) {
            if (fu == 0 && a[11][29][10] == 1) {
               Q(bk = bn << 16 | 29);
            } else if (fu == 1 && a[11][30][10] == 1) {
               Q(bk = bn << 16 | 30);
            }

            bk = -1;
         }

         if (aT == 0) {
            y(1);
         } else if (aT == 1) {
            if (!e.a()) {
               if (c.D != 0) {
                  gW();
               } else {
                  e.c(f.V);
                  int[] var11 = new int[2];
                  int[] var2 = new int[2];
                  int[] var3 = new int[2];
                  var2[0] = aU + aW >> 1;
                  var2[1] = aV + aX >> 1;
                  d(var2, var11);
                  var3[0] = var11[0] - i.d();
                  var3[1] = var11[1] - i.e();
                  e.a(var3[0], var3[1]);
               }
            } else {
               ag = 1;
            }
         }
      }

      if (var0 == 3) {
         switch (aT) {
            case 0:
               M(11);
               String var4;
               a((var4 = f.b(298)) == null ? "" : var4, 11, 4, 0, 0);
               String var5;
               b((var5 = f.b(312 + (r - 1))) == null ? "" : var5, 11, 5, 0, 0);
               if (!b[r]) {
                  int var12 = m(aZ) > m(aY) ? m(aY) : m(aZ);
                  b("" + var12 + " / " + m(aY), 11, 17, 0, 0);
               }

               if (!c[r]) {
                  int var13 = m(bb) > m(ba) ? m(ba) : m(bb);
                  b("" + var13 + " / " + m(ba), 11, 18, 0, 0);
               }

               String var6;
               a((var6 = f.b(be)) == null ? "" : var6, 11, 20, 0, 0);
               String var7;
               a((var7 = f.b(bf)) == null ? "" : var7, 11, 21, 0, 0);
               String var8;
               b((var8 = f.b(312 + (r - 1) - 1)) == null ? "" : var8, 11, 19, 0, 0);
               b("" + f.a(c(i), L, " ") + " / " + f.a(c(h), L, " "), 11, 38, 0, 0);
               if (!n()) {
                  String var9;
                  a((var9 = f.b(324 + r - 1)) == null ? "" : var9, 11, 41, 0, 0);
               } else {
                  if (!b[r] && m(aZ) < m(aY)) {
                     b("" + m(bc), 11, 31, 0, 0);
                  }

                  if (!c[r] && m(bb) < m(ba)) {
                     b("" + m(bd), 11, 32, 0, 0);
                  }
               }

               if (ar) {
                  String var10;
                  a((var10 = f.b(297)) == null ? "" : var10, 11, 8, 0, 0);
               }
               break;
            case 1:
               gV();
               p(false);
         }
      }

      return false;
   }

   private static boolean D(int var0) {
      if (var0 == 0) {
         K(10);
         a(10, 73, false);
         a(10, 3, false);
         a(10, 6, false);
         a(10, 9, false);
         a(10, 4, false);
         a(10, 7, false);
         a(10, 10, false);
         a(10, 5, false);
         a(10, 8, false);
         a(10, 11, false);
         a(10, 67, false);
         a(10, 68, false);
         a(10, 69, false);
         a(10, 70, false);
         a(10, 71, false);
         a(10, 72, false);
         a(10, 73, false);
         String var1;
         var1 = (var1 = f.b(175)) == null ? "" : var1;
         a[10][76] = var1;
         P(10);
         aS = new int[117];
         aT = new int[117];
         aU = new int[117];
         u = new short[117];
         v = new short[117];
         w = new short[117];
         x = new short[117];
         y = new short[117];
         l = new byte[117];
         ap = 100;
         aG(1);
         if (a[10][5][10] == 1) {
            int[] var9 = new int[]{2, 3, 4};
            a(0, var9, var9.length, 1);
         } else if (a[10][4][10] == 1) {
            int[] var10 = new int[]{2, 3};
            a(0, var10, var10.length, 1);
         } else {
            int[] var11 = new int[]{2};
            a(0, var11, var11.length, 1);
         }

         fn = 0;
         bk = -1;
         dU = 0;
         fu = 0;
         q(dA, 2);
         f.j();
         a[10][20][5] = 1138;
         a[10][20][6] = 12;
         a[10][28][5] = 1138;
         a[10][28][6] = 12;
         a[10][36][5] = 1138;
         a[10][36][6] = 12;
         a[10][44][5] = 1138;
         a[10][44][6] = 12;
         a[10][52][5] = 1138;
         a[10][52][6] = 12;
         a[10][60][5] = 1138;
         a[10][60][6] = 12;
         dl = l(b());
         dk = b(5);
         aU = false;
      }

      if (var0 == 5) {
         aS = null;
         aT = null;
         aU = null;
         u = null;
         v = null;
         w = null;
         x = null;
         y = null;
         l = null;
         x(1);
         if (aU) {
            a(756 + ew, bn[ew], bo[ew]);
         }

         W(10);
      }

      if (var0 == 2) {
         int var12 = dA - E >= 4 ? 4 : dA % 4;

         for (int var2 = 0; var2 < var12; var2++) {
            i(var2, true);
         }

         for (int var18 = var12; var18 < 4; var18++) {
            i(var18, false);
         }

         if (E == 0) {
            a(10, 62, false);
         } else {
            a(10, 62, true);
         }

         if (E + 4 >= dA) {
            a(10, 63, false);
         } else {
            a(10, 63, true);
         }

         if (dA == 0) {
            b(10, 14, 22, -1, 4);
         } else {
            b(10, 14, 22, fu, 4);
         }

         if (b[0] != null && !h(0, 1)) {
            if (b[0][8] < 0 && dz < dA - 6) {
               aH(1);
            } else if (b[0][8] > -10 && dz > 0) {
               aH(-1);
            }
         }

         y(1);
      }

      if (var0 == 3) {
         M(10);
         String var4;
         a((var4 = f.b(171)) == null ? "" : var4, 10, 1, 0, 0);
         int[] var13 = new int[4];
         a[a[10][12][5]].a(a[10][12][6], 0, var13, 0);
         int var10000 = a[10][12][2] + var13[0];
         int var10001 = a[10][12][3] + var13[1];
         int var10002 = var13[2];
         int var3 = var13[3];
         int var19 = var10002;
         int var14 = var10001;
         var0 = var10000;
         f.b(f.a, var0, var14, var19, var3);
         var19 = dA - E >= 4 ? 4 : dA % 4;

         for (int var6 = 0; var6 < var19; var6++) {
            String var15;
            a((var15 = f.b(aS[dz + var6 + E])) == null ? "" : var15, 10, 15 + (var6 << 3), 0, 0);
            a("x" + x[dz + var6 + E], 10, 17 + (var6 << 3), 0, 0);
         }

         int var16 = f.U;
         var0 = f.T;
         var19 = var16;
         int var17 = var0;
         f.b(f.a, 0, 0, var17, var19);
      }

      return false;
   }

   private static void aG(int var0) {
      int var1 = 0;
      dz = 0;
      dA = 0;

      for (int var2 = 0; var2 < 5; var2++) {
         if ((var0 >> var2 & 1) != 0) {
            int var3 = var2;
            g var4 = null;
            switch (var3) {
               case 0:
                  var4 = g.a(1);
                  break;
               case 1:
                  var4 = g.a(3);
            }

            for (int var5 = 0; var5 < var4.a; var5++) {
               if (e(var3, var5) > 0) {
                  aT[dA] = var5;
                  aU[dA] = var3;
                  aS[dA] = var4.a[var5][2];
                  u[dA] = (short)var4.a[var5][3];
                  v[dA] = (short)var4.a[var5][4];
                  w[dA] = (short)var4.a[var5][11];
                  y[dA] = (short)var4.a[var5][1];
                  x[dA] = (short)e(var3, var5);
                  l[dA] = (byte)var4.a[var5][9];
                  dA++;
                  if (var1 < 6) {
                     i(var1, true);
                     var1++;
                  }
               }
            }
         }
      }

      q(dA, 2);

      for (int var6 = var1; var6 < 6; var6++) {
         i(var6, false);
      }

      P(10);
   }

   private static void i(int var0, boolean var1) {
      int var2;
      int var3;
      int var4 = (var3 = (var2 = var0 << 3) + 13) + 8;

      for (int var5 = var3; var5 < var4; var5++) {
         a(10, var5, var1);
      }

      a(10, var2 + 18, false);
      if (var1) {
         int var6 = var2 + 19;
         a[10][var6][5] = u[dz + var0 + E];
         a[10][var6][6] = v[dz + var0 + E];
         w(a[10][var6][5]);
         a[10][var3][18] = 1;
         a(10, var2 + 20, l[dz + var0 + E] > 0);
      } else {
         a(10, var3, false);
         b(10, var3, false);
         a(10, var2 + 20, false);
      }
   }

   private static void aH(int var0) {
      dz += var0;
      int var1 = b[0][8];
      int var2 = dA - E >= 4 ? 4 : dA % 4;

      int var3;
      for (var3 = 0; var3 < var2; var3++) {
         i(var3, true);
      }

      while (var3 < 6) {
         i(var3, false);
         var3++;
      }

      b[0][8] = var1 + (a[10][21][2] - a[10][13][2]) * var0;
      R(0);
   }

   private static void aI(int var0) {
      X(47);
      switch (aU[var0 + dz]) {
         case 0:
         case 1:
            g(aU[var0 + dz], aT[var0 + dz], -1);
         default:
            a[ew][4] = System.currentTimeMillis() / 1000L;
            d[ew][2] = d[ew][2] | 1;
            g var1 = g.a(24);
            int var2 = d[ew][1] / d[25];
            j(ew, w[var0 + dz] * var1.a[var2][3] / e());
            int var3;
            a(var3 = cG[0] + ew, 1, 28, false);
            a(y[var0 + dz], 1, 26, false);
            a(var3, 1, 28);
            a(756 + ew, bn[ew], bo[ew]);
            aU = true;
            ag = 1;
      }
   }

   private static boolean E(int var0) {
      if (var0 == 0) {
         K(10);
         a(10, 73, false);
         a(10, 3, false);
         a(10, 6, false);
         a(10, 9, false);
         a(10, 4, false);
         a(10, 7, false);
         a(10, 10, false);
         a(10, 5, false);
         a(10, 8, false);
         a(10, 11, false);
         a(10, 67, false);
         a(10, 68, false);
         a(10, 69, false);
         a(10, 70, false);
         a(10, 71, false);
         a(10, 72, false);
         a(10, 73, false);
         String var1 = "";
         a[10][76] = var1;
         P(10);
         aV = new int[117];
         aW = new int[117];
         aX = new int[117];
         z = new short[117];
         A = new short[117];
         B = new short[117];
         C = new short[117];
         a[10][20][5] = 1138;
         a[10][20][6] = 12;
         a[10][28][5] = 1138;
         a[10][28][6] = 12;
         a[10][36][5] = 1138;
         a[10][36][6] = 12;
         a[10][44][5] = 1138;
         a[10][44][6] = 12;
         a[10][52][5] = 1138;
         a[10][52][6] = 12;
         a[10][60][5] = 1138;
         a[10][60][6] = 12;
         a(10, 20, false);
         a(10, 28, false);
         a(10, 36, false);
         a(10, 44, false);
         a(10, 52, false);
         a(10, 60, false);
         ap = 100;
         aJ(1);
         int[] var8 = new int[]{3};
         fn = 0;
         bk = -1;
         a(0, var8, 1, 1);
         q(dC, 2);
         f.j();
         aV = false;
      }

      if (var0 == 5) {
         aV = null;
         aW = null;
         aX = null;
         z = null;
         A = null;
         B = null;
         C = null;
         x(1);
         if (aV) {
            a(166, 7, 0);
         }

         W(10);
      }

      if (var0 == 2) {
         int var9 = dC - E >= 4 ? 4 : dC % 4;

         for (int var2 = 0; var2 < var9; var2++) {
            j(var2, true);
         }

         for (int var15 = var9; var15 < 4; var15++) {
            j(var15, false);
         }

         if (E == 0) {
            a(10, 62, false);
         } else {
            a(10, 62, true);
         }

         if (E + 4 >= dC) {
            a(10, 63, false);
         } else {
            a(10, 63, true);
         }

         b(10, 14, 22, fu, 4);
         if (b[0] != null && !h(0, 1)) {
            if (b[0][8] < 0 && dB < dC - 6) {
               aK(1);
            } else if (b[0][8] > -10 && dB > 0) {
               aK(-1);
            }
         }

         y(1);
      }

      if (var0 == 3) {
         M(10);
         String var4;
         b((var4 = f.b(162)) == null ? "" : var4, 10, 1, 0, 0);
         int[] var10 = new int[4];
         a[a[10][12][5]].a(a[10][12][6], 0, var10, 0);
         int var10000 = a[10][12][2] + var10[0];
         int var10001 = a[10][12][3] + var10[1];
         int var10002 = var10[2];
         int var3 = var10[3];
         int var16 = var10002;
         int var11 = var10001;
         var0 = var10000;
         f.b(f.a, var0, var11, var16, var3);
         var16 = dC - E >= 4 ? 4 : dC % 4;

         for (int var6 = 0; var6 < var16; var6++) {
            String var12;
            a((var12 = f.b(aV[dB + var6 + E])) == null ? "" : var12, 10, 15 + (var6 << 3), 0, 0);
         }

         int var13 = f.U;
         var0 = f.T;
         var16 = var13;
         int var14 = var0;
         f.b(f.a, 0, 0, var14, var16);
      }

      return false;
   }

   private static void aJ(int var0) {
      int var1 = 0;
      dB = 0;
      dC = 0;
      if ((var0 & 1) != 0) {
         g var3 = g.a(1);

         for (int var2 = 0; var2 < 117; var2++) {
            if (var3.a[var2][14] > 0 && var3.a[var2][11] <= e()) {
               aW[dC] = var2;
               aX[dC] = 0;
               aV[dC] = var3.a[var2][2];
               z[dC] = (short)var3.a[var2][3];
               A[dC] = (short)var3.a[var2][4];
               B[dC] = (short)var3.a[var2][11];
               C[dC] = (short)var3.a[var2][1];
               dC++;
               if (var1 < 6) {
                  j(var1, true);
                  var1++;
               }
            }
         }
      }

      for (int var4 = var1; var4 < 6; var4++) {
         j(var4, false);
      }

      P(10);
   }

   private static void j(int var0, boolean var1) {
      int var2;
      int var3;
      int var4 = (var3 = (var2 = var0 << 3) + 13) + 8;

      for (int var5 = var3; var5 < var4; var5++) {
         a(10, var5, var1);
      }

      a(10, var2 + 20, false);
      if (var1) {
         int var6 = var2 + 19;
         a[10][var6][5] = z[dB + var0 + E];
         a[10][var6][6] = A[dB + var0 + E];
         a[10][var3][10] = 1;
         w(a[10][var6][5]);
         a[10][var3][18] = 1;
      } else {
         a[10][var3][10] = 0;
         a[10][var3][18] = 0;
      }
   }

   private static void aK(int var0) {
      dB += var0;
      int var1 = b[0][8];
      int var2 = dC - dB >= 6 ? 6 : dC - dB;

      int var3;
      for (var3 = 0; var3 < var2; var3++) {
         j(var3, true);
      }

      while (var3 < 6) {
         j(var3, false);
         var3++;
      }

      b[0][8] = var1 + (a[10][21][2] - a[10][13][2]) * var0;
      R(0);
   }

   private static void aL(int var0) {
      X(47);
      if (bp[ew] * d[ew][1] / d[24] >= f.c(0, 100)) {
         switch (aX[var0 + dB]) {
            case 0:
               d[ew][4] = aW[var0 + dB];
         }
      } else {
         D = 11;
      }

      a[ew][1] = System.currentTimeMillis() / 1000L;
      aV = true;
      ag = 1;
   }

   private static boolean F(int var0) {
      if (var0 == 0) {
         b(12, true);
         gN();

         try {
            Thread.sleep(200L);
         } catch (Exception var10) {
         }

         X(62);
      }

      if (var0 == 1) {
         ap = 100;
         dE = 0;
         aY = new int[100];
         aZ = new int[100];
         ba = new int[100];
         dD = 0;
         g var1;
         int var2 = (var1 = g.a(10)).a;
         int var8 = 0;
         if (dG > 0) {
            aY[0] = 9;
            aZ[0] = 0;
            ba[0] = 0;
            var8++;
         }

         for (int var9 = 0; var9 < var2; var9++) {
            int var3 = var1.a[var9][1];
            int var4 = var1.a[var9][2];
            short var5 = (short)var1.a[var9][3];
            short var6 = (short)var1.a[var9][4];
            short var7 = (short)var1.a[var9][5];
            if (var4 == e() && var8 < 100 && var3 != 3 && var3 != 7) {
               aY[var8] = var5;
               aZ[var8] = var6;
               ba[var8] = var7;
               var8++;
            }
         }

         dF = var8;

         for (int var24 = 0; var24 < 4; var24++) {
            a[12][14 + (var24 << 1)][19] = 0;
            a[12][13 + (var24 << 1)][19] = 0;
            a[12][14 + (var24 << 1)][10] = 1;
            a[12][13 + (var24 << 1)][10] = 1;
         }

         for (int var25 = var8; var25 < 4; var25++) {
            a[12][14 + (var25 << 1)][19] = -1;
            a[12][13 + (var25 << 1)][19] = -1;
            a[12][14 + (var25 << 1)][10] = 0;
            a[12][13 + (var25 << 1)][10] = 0;
         }

         hR();
         if (K == -1) {
            a(12, 38, false);
         } else {
            a(12, 38, true);
         }

         P(12);
         g = e.b(4);
         ib();
      }

      if (var0 == 5) {
         x(1);
         aY = null;
         aZ = null;
         ba = null;
         g = null;
         dF = 0;
         dE = 0;
         e.b(2);
         W(12);
      }

      if (var0 == 2) {
         y(1);
         g.A();
         if (g.a != null) {
            g.a.c(f.V);
         }

         dD = dD + f.V;
         if (dE == 0) {
            a(12, 26, false);
         } else {
            a(12, 26, true);
         }

         if (dE != dF - 4 && dF > 4) {
            a(12, 27, true);
         } else {
            a(12, 27, false);
         }
      }

      if (var0 == 3) {
         M(12);
         String var11;
         a((var11 = f.b(45)) == null ? "" : var11, 12, 10, 0, 0);
         String var12;
         String var13;
         String var14 = ((var12 = f.b(518)) == null ? "" : var12) + " " + e() + ((var13 = f.b(517)) == null ? "" : var13);
         if (L == 11) {
            String var15;
            String var16;
            var14 = e() + ((var15 = f.b(518)) == null ? "" : var15) + ((var16 = f.b(517)) == null ? "" : var16);
         }

         a(var14, 12, 28, 0, 0);
         String var17;
         a((var17 = f.b(519)) == null ? "" : var17, 12, 29, 0, 0);
         String var18;
         b((var18 = f.b(522)) == null ? "" : var18, 12, 31, 0, 0);
         String var19;
         b((var19 = f.b(516)) == null ? "" : var19, 12, 30, 0, 0);
         String var20;
         b((var20 = f.b(523 + (e() - 2))) == null ? "" : var20, 12, 32, 0, 0);
         if (dE == 0 && dG > 0) {
            int[] var21 = new int[4];
            a[a[12][11][5]].a(a[12][11][6], 0, var21, 0);
            int var10000 = a[12][11][2] + var21[0];
            int var10001 = a[12][11][3] + var21[1];
            int var10002 = var21[2];
            int var30 = var21[3];
            int var28 = var10002;
            int var26 = var10001;
            var0 = var10000;
            int var32 = var30;
            var30 = var28;
            f.b(f.a, var0, var26, var30, var32);
            a("+" + dG, 12, 12, 0, 0);
            var26 = f.U;
            var0 = f.T;
            var28 = var26;
            f.b(f.a, 0, 0, var0, var28);
         }

         g.z();
      }

      return false;
   }

   private static void hR() {
      for (int var0 = 0; var0 < 4; var0++) {
         a[12][14 + (var0 << 1)][5] = 20;
         a[12][14 + (var0 << 1)][6] = 123;
      }

      for (int var4 = 0; var4 < 4; var4++) {
         short var1 = (short)aY[dE + var4];
         short var2 = (short)aZ[dE + var4];
         short var3 = (short)ba[dE + var4];
         if (var1 > 0) {
            if (var1 < 127 || var1 > 137) {
               w(var1);
            }

            a[12][14 + (var4 << 1)][5] = var1;
            a[12][14 + (var4 << 1)][6] = var2;
            a[12][14 + (var4 << 1)][8] = var3;
         }
      }
   }

   private static boolean G(int var0) {
      if (var0 == 0) {
         gM();
         X(59);
         String var1;
         aX = (var1 = GloftGF2M.a.getAppProperty("Has-Push-Notification")) != null && var1.indexOf("0") == -1;
         aW = aW && aX;
         K(15);
         fL();
         fN();
         fQ();
         N = true;
         fR();
         fK();
         if (M) {
            j(0, bd.length, 5);
         }

         dS = 0;
         dT = 0;
         b(15, 153, 154, 0, 5);
         b(15, 158, 158, -1, 5);
      }

      if (var0 == 1) {
         dM = 1;
         P(15);
         if (O) {
            bd = false;
         }
      }

      if (var0 == 5) {
         W(15);
         fL();
         fN();
         fQ();
         fR();
      }

      if (var0 == 8 && !L && K && ba) {
         short var7 = a[15][59][2];
         short var2 = a[15][59][3];
         short var3 = a[15][59][5];
         short var4 = a[15][59][6];
         if (a(-1, -1, var7, var2, var3, var4)) {
            if (!ba) {
               dJ = -1;
            }

            ba = true;
            if (dO >= var4) {
               boolean var8 = (dN = dN + (-1 - dJ)) > dO / 2 - var4 / 2;
               boolean var10 = dN < -dO / 2;
               if (var8) {
                  dN = dO / 2 - var4 / 2;
               } else if (var10) {
                  dN = -dO / 2;
               }
            }

            dJ = -1;
         }
      }

      if (var0 == 2) {
         if (I && l() && p(aw)) {
            gM();
         }

         if (J && aZ) {
            if (a[12] == null) {
               try {
                  f.c("/3");
                  byte[] var9;
                  if ((var9 = f.a(12)).length > 0) {
                     if (var9[0] == 77) {
                        a[12] = "audio/midi";
                     } else if (var9[0] == -1) {
                        a[12] = "audio/mpeg";
                     } else if (var9[0] == 82) {
                        a[12] = "audio/x-wav";
                     } else if (var9[0] == 35) {
                        a[12] = "audio/amr";
                     }

                     a[12] = new ByteArrayInputStream(var9);
                  }

                  f.k();
               } catch (Exception var6) {
               }
            }

            try {
               Thread.sleep(500L);
            } catch (Exception var5) {
            }

            X(12);
         }

         aZ = false;
         if (dS != 4) {
            a(15, 148, false);
            a(15, 149, false);
         } else {
            a(15, 148, true);
            a(15, 149, true);
         }

         if (dS == 0) {
            a[15][146][10] = 1;
            if (a[15][2][10] == 1) {
               b(15, 153, 154, fn - fo, 5);
            } else {
               b(15, 153, 154, -1, 5);
            }

            b(15, 158, 159, -1, 5);
         } else if (dS == 1) {
            a[15][146][10] = 1;
            b(15, 153, 154, -1, 5);
            if (a[15][24][10] == 1) {
               b(15, 158, 159, fn, 5);
            } else {
               b(15, 158, 159, -1, 5);
            }
         } else {
            a[15][146][10] = 0;
            b(15, 153, 154, -1, 5);
            b(15, 158, 159, -1, 5);
         }

         a(15, 163, false);
         a(15, 164, false);
         if (O) {
            a[15][146][10] = 1;
            if (bd) {
               a(15, 163, true);
            } else {
               a(15, 164, true);
            }
         }

         if (N) {
            b(15, 165, 166, fn, 18);
         } else {
            b(15, 165, 166, -1, 18);
         }

         if (J) {
            dK--;
            if (b[0] != null && !h(0, 1)) {
               if (b[0][9] < -60) {
                  aM(1);
               } else if (b[0][9] > -10) {
                  aM(-1);
               }
            }

            if (dK < -dQ) {
               dK = dP;
            } else if (dK > dQ + 60) {
               dK = dQ + 60;
            }
         }

         if (J && f.g() == 19) {
            gM();
         }
      }

      if (var0 == 3 && ag != 1) {
         hV();
      }

      return false;
   }

   private static void hS() {
      String var0 = f.b();
      GloftGF2M.a.destroyApp(false);

      try {
         f.a(var0);
      } catch (Exception var1) {
      }
   }

   private static void hT() {
      aZ = true;
      n = "";
      a[15][21][3] = 107;

      for (int var0 = 0; var0 < 278; var0++) {
         if (var0 + 11264 == 11534) {
            for (int var2 = 0; var2 < 77; var2++) {
               String var1;
               n = n + ((var1 = f.b(var2 + 11547)) == null ? "" : var1) + '\n';
            }
         }

         StringBuffer var10000;
         String var10001;
         if (var0 + 11264 == 11265) {
            String var5;
            var10000 = new StringBuffer().append(n).append((var5 = f.b(11265)) == null ? "" : var5).append(" ");
            var10001 = GloftGF2M.a.getAppProperty("MIDlet-Version");
         } else {
            var10000 = new StringBuffer().append(n);
            String var6;
            var10001 = (var6 = f.b(var0 + 11264)) == null ? "" : var6;
         }

         n = var10000.append(var10001).append('\n').toString();
      }

      short var3 = a[15][21][5];
      short var7 = a[15][21][7];
      short[] var9 = c[j(var7)].a(n, var3, false);
      d var10 = c[j(var7)];
      var7 = var9[0];
      d var4 = var10;
      dP = (dL = var7 * var4.e() + (var7 - 1) * var4.c()) / 2;
      dQ = dL / 2 + (f.U >> 1);
      dK = dP;
   }

   private static void hU() {
      int var0;
      if ((var0 = 10241 + (dM - 1 << 1)) == 10273) {
         var0 = 10275;
      }

      if (var0 == 10245) {
         var0 = 10273;
      }

      String var3;
      String var4 = (var3 = f.b(var0)) == null ? "" : var3;
      short var1 = a[15][59][5];
      short var2 = a[15][59][7];
      short[] var5 = c[j(var2)].a(var4, var1, false);
      d var10000 = c[j(var2)];
      var1 = var5[0];
      d var6 = var10000;
      dN = (dO = var1 * var6.e() + (var1 - 1) * var6.c()) / 2 - a[15][59][6] / 2;
   }

   private static void hV() {
      M(15);
      if (I) {
         String var0;
         b((var0 = f.b(63)) == null ? "" : var0, 15, 1, 0, 0);

         for (int var1 = 0; var1 < fp; var1++) {
            a((var0 = f.b(bb[fo + var1])) == null ? "" : var0, 15, 3 + (var1 << 1), 0, 0);
         }
      }

      if (K) {
         int var6;
         if ((var6 = 10240 + (dM - 1 << 1)) == 10272) {
            var6 = 10274;
         }

         if (var6 == 10244) {
            var6 = 10272;
         }

         int var38;
         if ((var38 = 10241 + (dM - 1 << 1)) == 10273) {
            var38 = 10275;
         }

         if (var38 == 10245) {
            var38 = 10273;
         }

         String var2;
         b((var2 = f.b(80)) == null ? "" : var2, 15, 50, 0, 0);
         b((var2 = f.b(35)) == null ? "" : var2, 15, 49, 0, 0);
         String var7;
         b((var7 = f.b(var6)) == null ? "" : var7, 15, 56, 0, 0);
         String var8;
         b((var8 = f.b(454)) == null ? "" : var8, 15, 57, 0, 0);
         String var9;
         b((var9 = f.b(455)) == null ? "" : var9, 15, 58, 0, 0);
         f.b(f.a, 15, 113, 209, 155);
         short var10000 = a[15][59][2];
         short var10001 = a[15][59][3];
         short var10002 = a[15][59][5];
         short var4 = a[15][59][6];
         short var3 = var10002;
         short var45 = var10001;
         int var10 = var10000;
         short var11 = var4;
         var4 = var3;
         f.b(f.a, var10, var45, var4, var11);
         String var12;
         b((var12 = f.b(var38)) == null ? "" : var12, 15, 59, 0, dN);
         var38 = f.U;
         var10 = f.T;
         int var46 = var38;
         var38 = var10;
         f.b(f.a, 0, 0, var38, var46);
      }

      if (J) {
         String var14;
         b((var14 = f.b(75)) == null ? "" : var14, 15, 19, 0, 0);
         short var50 = a[15][20][2];
         short var52 = a[15][20][3];
         int var53 = a[15][21][5] + 50;
         short var48 = a[15][21][6];
         int var47 = var53;
         int var41 = var52;
         short var15 = var50;
         f.b(f.a, var15, var41, var47, var48);
         b(n, 15, 21, 0, dK);
         var41 = f.U;
         int var16 = f.T;
         f.b(f.a, 0, 0, var16, var41);
      }

      if (M) {
         String var17;
         b((var17 = f.b(65)) == null ? "" : var17, 15, 23, 0, 0);

         for (int var43 = 0; var43 < bd.length; var43++) {
            String var19;
            String var20;
            String var21;
            String var22;
            String var23;
            String var24;
            String var25;
            String var26;
            b(
               bd[var43 + fo] == 78
                  ? (
                     W
                        ? ((var17 = f.b(78)) == null ? "" : var17) + ((var19 = f.b(82)) == null ? "" : var19)
                        : ((var20 = f.b(78)) == null ? "" : var20) + ((var21 = f.b(83)) == null ? "" : var21)
                  )
                  : (
                     bd[var43 + fo] == 79
                        ? (
                           X
                              ? ((var22 = f.b(79)) == null ? "" : var22) + ((var23 = f.b(82)) == null ? "" : var23)
                              : ((var24 = f.b(79)) == null ? "" : var24) + ((var25 = f.b(83)) == null ? "" : var25)
                        )
                        : ((var26 = f.b(bd[var43 + fo])) == null ? "" : var26)
                  ),
               15,
               25 + (var43 << 1),
               0,
               0
            );
         }
      }

      if (L) {
         String var27;
         b((var27 = f.b(66)) == null ? "" : var27, 15, 39, 0, 0);
         b((var27 = f.b(75)) == null ? "" : var27, 15, 47, 0, 0);
         a((var27 = f.b(78)) == null ? "" : var27, 15, 41, 0, 0);
         a((var27 = f.b(79)) == null ? "" : var27, 15, 44, 0, 0);
         String var32;
         a(W ? ((var27 = f.b(82)) == null ? "" : var27) : ((var32 = f.b(83)) == null ? "" : var32), 15, 42, 0, 0);
         String var34;
         a(X ? ((var27 = f.b(82)) == null ? "" : var27) : ((var34 = f.b(83)) == null ? "" : var34), 15, 45, 0, 0);
      }

      if (N) {
         b("L.50", 15, 89, 0, 0);
         b("= 0", 15, 81, 0, 0);
         b("= 0", 15, 75, 0, 0);
         b("= 0", 15, 69, 0, 0);
         b(Integer.toString(t()), 15, 77, 0, 0);
         b(Integer.toString(d()), 15, 71, 0, 0);
         b(Integer.toString(c()), 15, 64, 0, 0);
         b(Integer.toString(bG), 15, 83, 0, 0);
         b(Integer.toString(dH), 15, 96, 0, 0);
         b(m, 15, 97, 0, 0);
         b("start quest", 15, 98, 0, 0);
         b("PARTY", 15, 106, 0, 0);
         b("EXPAN", 15, 108, 0, 0);
         b("MANOR", 15, 110, 0, 0);
         b(Integer.toString(c(0)), 15, 122, 0, 0);
         b(Integer.toString(c(1)), 15, 125, 0, 0);
         b(Integer.toString(c(2)), 15, 128, 0, 0);
         b(Integer.toString(c(3)), 15, 131, 0, 0);
         b(Integer.toString(c(4)), 15, 134, 0, 0);
         b(Integer.toString(c(5)), 15, 137, 0, 0);
      }

      if (O) {
         String var35;
         b((var35 = f.b(74)) == null ? "" : var35, 15, 139, 0, 0);
         b((var35 = f.b(30)) == null ? "" : var35, 15, 141, 0, 0);
         b((var35 = f.b(31)) == null ? "" : var35, 15, 143, 0, 0);
      }
   }

   private static void aM(int var0) {
      int var1 = b[0][9];
      P(15);
      b[0][9] = var1 + 40 * var0;
      var0 *= -40;
      dK += var0;
      R(0);
   }

   private static int A() {
      int var0 = f.h();
      int var1 = -1;
      switch (bn) {
         case 1:
            if (a != -1 && a[a] != 19) {
               if (var0 == 6 && a[1][41][10] == 1) {
                  K = false;
                  var1 = bn << 16 | 41;
               }

               if (!t && !u && e == null && a == null) {
                  if (var0 == 18) {
                     bq = 0;
                     bo = 0;
                     if (a[1][52][18] == 1) {
                        var1 = bn << 16 | 52;
                     }

                     if (a[1][37][10] == 1) {
                        var1 = bn << 16 | 37;
                     }
                  }

                  if (var0 == 17 && a[1][66][10] == 1) {
                     var1 = 65602;
                  }

                  if (var0 == 19 && a[1][67][18] == 1) {
                     var1 = 65603;
                  }

                  if (var0 == 16) {
                     if (a[1][20][10] == 1) {
                        d(60);
                        var1 = 65556;
                     }

                     if (a[1][14][10] == 1) {
                        d(60);
                        var1 = 65550;
                     }
                  }
               }

               if (a[1][42][10] == 1) {
                  if (var0 == 2 || var0 == 14) {
                     if (++bo >= bp) {
                        bo = 0;
                     }

                     if (bp > 1) {
                        d(63);
                     }
                  }

                  if (var0 == 1 || var0 == 8) {
                     if (--bo < 0) {
                        bo = bp - 1;
                     }

                     if (bp > 1) {
                        d(63);
                     }
                  }

                  if (var0 == 5 || var0 == 11) {
                     var1 = bn << 16 | 43 + bo & 65535;
                     j[0] = k[bo];
                     j[1] = l[bo];
                     j[2] = m[bo];
                     bl = var1;
                     bk = -1;
                     bm = -1;
                     bv = false;
                  }

                  b(1, 47, 48, bo, 4);
               } else {
                  b(1, 47, 48, -1, 4);
               }
            }
         case 2:
         case 4:
         case 7:
         case 11:
         case 14:
         case 18:
         case 21:
         default:
            break;
         case 3:
            if (a != null && a.a()) {
               if (ay) {
                  var1 = bn << 16 | 202;
               } else {
                  var1 = bn << 16 | 204;
               }

               a = null;
            }

            if ((eh != 1 || !ay || q(cd)) && (eh != 0 || cc != 0) && (eh != 1 || ay || j[cd] != 0) && (eh != 2 || ay || m[cd] != 0)) {
               a(3, 211, true);
            } else {
               a(3, 211, false);
            }

            if (eh == 2) {
               a(3, 176, true);
            } else {
               a(3, 176, false);
            }

            if (eh == 1) {
               if (E == 0) {
                  a(3, 208, false);
               } else {
                  a(3, 208, true);
               }

               if (E + 6 >= fs) {
                  a(3, 209, false);
               } else {
                  a(3, 209, true);
               }
            } else {
               a(3, 208, false);
               a(3, 209, false);
            }

            if ((var0 == 18 || var0 == 5 || var0 == 11) && (eh == 1 || eh == 2 || K == 56)) {
               if (ay) {
                  if (q(cd)) {
                     (a = new i(a[3], f.T >> 1, f.U >> 1)).b(6, 1);
                  }
               } else if (eh == 2 && m[cd] > 0) {
                  (a = new i(a[3], f.T >> 1, f.U >> 1)).b(6, 1);
               } else if (j[cd] > 0) {
                  eh = 2;
                  d(60);
               }
            }

            if (eh == 2 && !ay) {
               if (var0 == 10 || var0 == 3) {
                  var1 = bn << 16 | 199;
               } else if (var0 == 12 || var0 == 4) {
                  var1 = bn << 16 | 196;
               } else if (var0 == 1 || var0 == 8) {
                  d(63);
                  eh = 1;
               }
            } else if (K != 56) {
               if (eh == 0) {
                  if ((var0 == 2 || var0 == 14 || var0 == 11 || var0 == 18 || var0 == 5) && cc != 0) {
                     d(60);
                     eh = 1;
                  } else if (var0 == 10 || var0 == 12 || var0 == 3 || var0 == 4) {
                     E = 0;
                     fu = 0;
                     if (ay) {
                        var1 = bn << 16 | 5;
                     } else {
                        var1 = bn << 16 | 2;
                     }
                  }
               } else {
                  if ((var0 == 1 || var0 == 8) && fu < 3) {
                     d(63);
                     eh = 0;
                  }

                  if (eh != 0) {
                     iC();
                  }

                  if (ed != fu) {
                     ed = fu;
                     var1 = bn << 16 | 10 + fu * 11 & 65535;
                  }
               }
            }

            if (eh == 1 && var0 == 17 && ay && K != 56) {
               var1 = bn << 16 | 201;
            }

            if (var0 == 19 && K != 56) {
               if (eh == 2 && !ay) {
                  d(63);
                  eh = 1;
               } else {
                  var1 = bn << 16 | 210;
               }
            }
            break;
         case 5:
            while (f(5, 10 + bq * 9)) {
               if (++bq >= br) {
                  bq = 0;
               }
            }

            if (a[5][57][10] == 1) {
               if (var0 == 5 || var0 == 11) {
                  var1 = bn << 16 | 57;
               }
            } else {
               if ((var0 == 2 || var0 == 14) && !f(5, 63)) {
                  int var8 = bq;
                  if (++bq >= br) {
                     bq = 0;
                  }

                  while (f(5, 10 + bq * 9)) {
                     if (++bq >= br) {
                        bq = 0;
                     }
                  }

                  if (bq >= br) {
                     bq = 0;
                  }

                  if (var8 != bq) {
                     d(63);
                  }
               }

               if ((var0 == 1 || var0 == 8) && !f(5, 63)) {
                  int var9 = bq;
                  if (--bq < 0) {
                     bq = br - 1;
                  }

                  while (f(5, 10 + bq * 9)) {
                     if (--bq < 0) {
                        bq = br - 1;
                     }
                  }

                  if (bq < 0) {
                     bq = br - 1;
                  }

                  if (var9 != bq) {
                     d(63);
                  }
               }

               fj = bq;
               a[5][7][10] = 0;
               a[5][16][10] = 0;
               a[5][25][10] = 0;
               a[5][7 + bq * 9][10] = 1;
               if (var0 == 6 && a[5][11 + fj * 9][10] == 1) {
                  var1 = 327680 | 11 + fj * 9 & 65535;
                  if (++bq >= br) {
                     bq = 0;
                  }

                  while (f(5, 10 + bq * 9)) {
                     if (++bq >= br) {
                        bq = 0;
                     }
                  }

                  if (bq >= br) {
                     bq = 0;
                  }
               }

               if (var0 == 18 || var0 == 5 || var0 == 11) {
                  var1 = bn << 16 | 5 + bq * 9 & 65535;
               }

               if (f(bn, 61) && var0 == 19) {
                  var1 = bn << 16 | 61;
               }
            }
            break;
         case 6:
            if (a[6][10][10] == 0 && a[6][15][10] == 0 && (K != 27 || cK == 0) && (var0 == 18 || var0 == 11 || var0 == 5)) {
               var1 = bn << 16 | 34;
            }

            if (a[6][10][10] == 1 && a[6][15][10] == 1) {
               if (var0 == 4 || var0 == 12 || var0 == 3 || var0 == 10) {
                  d(63);
                  dY = dY == 0 ? 1 : 0;
               } else if (dY == -1) {
                  dY = 0;
               }
            } else if (a[6][10][10] == 1) {
               dY = 0;
            } else if (a[6][15][10] == 1) {
               dY = 1;
            } else {
               dY = -1;
            }

            b(6, 3, 5, dY, 2);
            if (var0 == 5 || var0 == 11) {
               if (dY == 0) {
                  var1 = bn << 16 | 10;
               } else if (dY == 1) {
                  var1 = bn << 16 | 15;
               }
            }

            if (var0 == 19 && a[6][39][10] == 1) {
               var1 = bn << 16 | 39;
            }
            break;
         case 8:
            if (fs != eL && x && eJ != -1) {
               q(eL, 2);
            }

            a(bn, 209, false);
            switch (eJ) {
               case -1:
                  if (ee == 0) {
                     ee = 1;
                     q(eM, 2);
                  } else {
                     if (!f(8, 209) && ee != 0 || !h) {
                        a(bn, 209, true);
                     }

                     iC();
                     b(8, 219, 220, fu, 4);
                     if (var0 == 5 || var0 == 11 || var0 == 18) {
                        var1 = bn << 16 | 120 + 6 * (fu + E) & 65535;
                     }
                  }
                  break;
               case 0:
                  if (C) {
                     b(8, 219, 220, -1, 4);
                     if (var0 == 11 || var0 == 5) {
                        d(60);
                        var1 = bn << 16 | 213;
                     }
                  } else {
                     var1 = D();
                  }
                  break;
               case 1:
               case 7:
               case 9:
               case 11:
               case 12:
                  b(8, 219, 220, -1, 4);
                  b(8, 223, 224, -1, 2);
                  if (eJ == 7 && B && (var0 == 11 || var0 == 5)) {
                     d(60);
                     var1 = bn << 16 | 202;
                  }
                  break;
               case 2:
               case 8:
                  if (ar == 4) {
                     var1 = C();
                  } else if (ar == 3) {
                     var1 = B();
                     if (eI >= 5) {
                        a(bn, 209, true);
                     }
                  } else if (ar == 6) {
                     b(8, 219, 220, -1, 4);
                     if (var0 == 11 || var0 == 5) {
                        d(60);
                        var1 = bn << 16 | 213;
                     }
                  } else if (ar == 2) {
                     if (eL > 0 && x) {
                        var1 = D();
                     }
                  } else if (B) {
                     b(8, 219, 220, -1, 4);
                     b(8, 223, 224, -1, 2);
                     if (var0 == 11 || var0 == 5) {
                        d(60);
                        var1 = bn << 16 | 202;
                     }
                  }
                  break;
               case 3:
                  b(8, 219, 220, -1, 4);
                  if (var0 == 11 || var0 == 5) {
                     d(60);
                     var1 = bn << 16 | 213;
                  }
                  break;
               case 4:
               case 5:
               default:
                  b(8, 219, 220, -1, 4);
                  b(8, 223, 224, -1, 2);
                  break;
               case 6:
               case 10:
                  if (w) {
                     b(8, 219, 220, -1, 4);
                     b(8, 223, 224, -1, 2);
                     if (var0 == 11 || var0 == 5) {
                        d(60);
                        return bn << 16 | 210;
                     }
                  } else if (B) {
                     b(8, 219, 220, -1, 4);
                     b(8, 223, 224, -1, 2);
                     if (var0 == 11 || var0 == 5) {
                        d(60);
                        var1 = bn << 16 | 202;
                     }
                  } else {
                     var1 = D();
                  }

                  if (!B && ee == 1 && !w) {
                     a(bn, 209, true);
                  }
            }

            if (var0 == 19 && eJ != 1 && !w) {
               d(56);
               var1 = bn << 16 | 208;
            }
            break;
         case 9:
            if (e() < bm[0 + fu + E]) {
               a(9, 148, false);
            } else {
               a(9, 148, true);
            }

            if (var0 == 5 || var0 == 11 || var0 == 18) {
               aU(fu);
            }

            if (var0 == 6 && f(bn, 14 + 11 * fu)) {
               var1 = bn << 16 | 14 + 11 * fu & 65535;
            }

            if (var0 == 17 && f(bn, 15 + 11 * fu)) {
               var1 = bn << 16 | 15 + 11 * fu & 65535;
            }

            if (var0 == 19) {
               var1 = bn << 16 | 149;
            }
            break;
         case 10:
            if (a[a] == 28) {
               if (dU == 0) {
                  if (K != 50 && K != 51) {
                     s();
                  }

                  if ((var0 == 2 || var0 == 14 || var0 == 11 || var0 == 18 || var0 == 5) && dn > 0) {
                     d(63);
                     dU = 1;
                     if (K == 50) {
                        f = true;
                     }
                  }

                  if (var0 == 4 || var0 == 3 || var0 == 10 || var0 == 12) {
                     E = 0;
                     fu = 0;
                     var1 = bk;
                  }
               } else if (dU == 1) {
                  if (K != 51) {
                     if (var0 != 1 && var0 != 8 || fu != 0 && fu != 1) {
                        iC();
                     } else {
                        d(63);
                        dU = 0;
                     }
                  }

                  if ((var0 == 5 || var0 == 11 || var0 == 18) && a[10][13 + 8 * fu][18] == 1) {
                     var1 = bn << 16 | 13 + 8 * fu & 65535;
                  }
               }
            }

            if (a[a] == 15) {
               if (var0 != 1 && var0 != 8 || fu != 0 && fu != 1) {
                  iC();
               }

               if ((var0 == 5 || var0 == 11 || var0 == 18) && a[10][13 + 8 * fu][18] == 1) {
                  var1 = bn << 16 | 13 + 8 * fu & 65535;
               }
            }

            if (a[a] == 16) {
               if (dA == 0) {
                  a(10, 65, false);
               } else {
                  a(10, 65, true);
               }

               if (var0 != 1 && var0 != 8 || fu != 0 && fu != 1) {
                  iC();
               }

               if ((var0 == 5 || var0 == 11 || var0 == 18) && a[10][13 + 8 * fu][18] == 1) {
                  var1 = bn << 16 | 13 + 8 * fu & 65535;
               }

               if (var0 == 19) {
                  var1 = bn << 16 | 46;
               }
            }

            if (var0 == 19 && K != 50 && K != 51 && K < 1) {
               var1 = bn << 16 | 64;
            }

            if (var0 == 6 && K != 50 && K != 51) {
               var1 = bn << 16 | 73;
            }
            break;
         case 12:
            if (var0 != 3 && var0 != 10) {
               if (var0 == 4 || var0 == 12) {
                  int var7 = dE;
                  if (++dE > dF - 4 && (dE = dF - 4) < 0) {
                     dE = 0;
                  }

                  hR();
                  if (var7 != dE && !b()) {
                     d(63);
                  }
               }
            } else {
               int var6 = dE;
               if (--dE < 0) {
                  dE = 0;
               }

               hR();
               if (var6 != dE && !b()) {
                  d(63);
               }
            }

            if (var0 == 5 || var0 == 11) {
               bk = 786438;
               Q(786438);
            }
            break;
         case 13:
            if (var0 != 3 && var0 != 10) {
               if (var0 != 4 && var0 != 12) {
                  if (var0 == 19) {
                     var1 = bn << 16 | 43;
                  } else if (var0 == 11 || var0 == 5) {
                     var1 = bn << 16 | 7 + 1 * eg & 65535;
                  }
               } else if (eg > 0) {
                  eg--;
                  d(63);
               }
            } else if (eg < O && eg < 8) {
               eg++;
               d(63);
            }
            break;
         case 15:
            if (a[a] == 14) {
               if (I) {
                  dS = 0;
                  a(15, 147, true);
               } else if (K) {
                  dS = 2;
               } else if (M) {
                  dS = 1;
               } else if (N) {
                  dS = 3;
               } else if (J) {
                  dS = 4;
               } else if (O) {
                  dS = 5;
               }

               if (dS != dT) {
                  dT = dS;
                  switch (dS) {
                     case 0:
                     case 2:
                     default:
                        break;
                     case 1:
                        j(0, bd.length, 5);
                        break;
                     case 3:
                        int[] var5 = new int[]{72, 65, 78, 88, 90, 91, 92, 93, 94, 95, 112, 113, 114, 115, 74, 68, 107, 109};
                        a(0, var5, 10, 0);
                  }

                  fn = 0;
               }

               switch (dS) {
                  case 0:
                     s();
                     if (var0 == 18) {
                        hX();
                        d(60);
                     }

                     if (var0 == 5 || var0 == 11) {
                        aN(fn);
                     }
                     break;
                  case 1:
                     s();
                     if (var0 == 5 || var0 == 11 || var0 == 18) {
                        aO(fn);
                     }
                     break;
                  case 2:
                     if (var0 == 4 || var0 == 12) {
                        var1 = bn << 16 | 55;
                     }

                     if (var0 == 3 || var0 == 10) {
                        var1 = bn << 16 | 54;
                     }

                     if (f.h(14) || f.h(2)) {
                        var1 = bn << 16 | 53;
                        if (f.i(14) || f.i(2)) {
                           d(63);
                        }
                     }

                     if (f.h(8) || f.h(1)) {
                        var1 = bn << 16 | 52;
                        if (f.i(8) || f.i(1)) {
                           d(63);
                        }
                     }
                     break;
                  case 3:
                     s();
                     if (var0 == 5 || var0 == 11 || var0 == 18) {
                        var1 = bk;
                     }
                     break;
                  case 4:
                     if (f.h(14) || f.h(2)) {
                        dK -= 5;
                        if (f.i(14) || f.i(2)) {
                           d(63);
                        }
                     }

                     if (!f.h(8) && !f.h(1)) {
                        break;
                     }

                     dK += 5;
                     if (f.i(8) || f.i(1)) {
                        d(63);
                     }
                     break;
                  case 5:
                     if (var0 == 1 || var0 == 14 || var0 == 8 || var0 == 2) {
                        bd = !bd;
                        d(63);
                     }

                     if (var0 == 5 || var0 == 11 || var0 == 18) {
                        if (bd) {
                           var1 = bn << 16 | 140;
                        } else {
                           var1 = bn << 16 | 142;
                        }
                     }
               }

               if (var0 == 19) {
                  if (K) {
                     var1 = bn << 16 | 48;
                  } else if (J) {
                     b();
                     d(56);
                     fN();
                     fK();
                  } else if (!M) {
                     if (!O) {
                        var1 = bn << 16 | 147;
                     }
                  } else {
                     var1 = bn << 16 | 151;
                  }
               }
            }
            break;
         case 16:
            if (ek == 0) {
               a(16, 98, false);
            } else {
               a(16, 98, true);
            }

            if (ek == 12) {
               a(16, 99, false);
            } else {
               a(16, 99, true);
            }

            if (a[16][63 + fn * 6][6] == 48) {
               a(16, 95, true);
            } else {
               a(16, 95, false);
            }

            if (var0 == 1 || var0 == 8) {
               if (--fn < 0) {
                  fn = 0;
                  if (--ek < 0) {
                     ek = 0;
                  } else {
                     d(63);
                  }
               } else {
                  d(63);
               }

               hZ();
            } else if (var0 == 2 || var0 == 14) {
               if (++fn >= 3) {
                  ek++;
                  fn = 2;
                  if (ek > 12) {
                     ek = 12;
                  } else {
                     d(63);
                  }
               } else {
                  d(63);
               }

               hZ();
            } else if (var0 == 18 || var0 == 5 || var0 == 11) {
               if (a[16][63 + fn * 6][18] == 1) {
                  Q(bk = 1048576 | 63 + fn * 6 & 65535);
               }
            } else if (var0 == 19) {
               bk = 1048672;
               Q(1048672);
            }

            b(16, 4, 8, fn, 3);
            break;
         case 17:
            if (cz[0] != 3 || cz.length != 3) {
               int[] var4 = new int[]{3, 5, 8};
               a(0, var4, 3, 1);
            }

            if (dR == 0) {
               if (f(17, 62)) {
                  fn = 1;
               } else {
                  s();
               }

               a(17, 58, true);
               if (fn == 2) {
                  if (System.currentTimeMillis() / 1000L - a[ew][1] < 86400L) {
                     a(17, 58, false);
                  }
               } else if (fn == 0 && System.currentTimeMillis() / 1000L - a[ew][4] < 86400L) {
                  a(17, 58, false);
               }

               if ((var0 == 14 || var0 == 2) && f(17, 48)) {
                  dR = 1;
               } else if (var0 == 18 || var0 == 11 || var0 == 5) {
                  if (f(17, 62)) {
                     var1 = 1114117;
                  } else if (bk != -1) {
                     var1 = bk;
                  }
               }

               b(17, 51, 52, -1, 2);
               b(17, 53, 54, -1, 2);
            } else if (dR == 1) {
               b(17, 53, 54, -1, 2);
               if ((var0 == 8 || var0 == 1) && bb) {
                  bb = false;
               } else if (var0 != 8 && var0 != 1) {
                  if ((var0 == 14 || var0 == 2) && !bb) {
                     bb = true;
                     if (e[ew][3] == 0) {
                        dR = 2;
                     }
                  } else if ((var0 == 14 || var0 == 2) && bb) {
                     dR = 2;
                  } else if (var0 == 18 || var0 == 11 || var0 == 5) {
                     if (bb && f(17, 36)) {
                        var1 = bn << 16 | 36;
                     } else if (f(17, 30) && !bb) {
                        var1 = bn << 16 | 30;
                     }
                  }
               } else {
                  dR = 0;
               }

               if (!bb) {
                  b(17, 51, 52, 0, 2);
               } else {
                  b(17, 51, 52, 1, 2);
               }
            } else {
               if (var0 == 10 || var0 == 12 || var0 == 3 || var0 == 4) {
                  bc = !bc;
               }

               if (var0 == 8 || var0 == 1) {
                  dR = 1;
               } else if (var0 == 18 || var0 == 11 || var0 == 5) {
                  if (bc && a[17][48][18] == 1) {
                     var1 = bn << 16 | 48;
                     dR = 0;
                  } else if (!bc) {
                     var1 = bn << 16 | 47;
                     dR = 0;
                  }
               }

               b(17, 51, 52, -1, 2);
               if (!bc) {
                  b(17, 53, 54, 0, 2);
               } else {
                  b(17, 53, 54, 1, 2);
               }
            }

            if (var0 == 19) {
               E = 0;
               var1 = bn << 16 | 61;
            }
            break;
         case 19:
            s();
            b(19, 72, 73, fn - fo, 3);
            if (a[19][14 + 14 * (fn - fo)][18] == 0 && (var0 == 18 || var0 == 11 || var0 == 5)) {
               d(55);
            }

            if (a[19][14 + 14 * (fn - fo)][18] == 1) {
               a(19, 78, true);
               if (var0 == 18 || var0 == 11 || var0 == 5) {
                  d(60);
                  ag(fn);
               }
            } else {
               a(19, 78, false);
            }

            if (var0 == 19) {
               var1 = 1245261;
            }
            break;
         case 20:
            if (var0 == 5 || var0 == 11) {
               var1 = bn << 16 | 4;
               a(24, 27, true);
            }
            break;
         case 22:
            if (E == 0) {
               a(22, 94, false);
            } else {
               a(22, 94, true);
            }

            if (E + 4 >= fs) {
               a(22, 95, false);
            } else {
               a(22, 95, true);
            }

            if (!az && !aH) {
               if (var0 == 16 && a[22][1][10] == 1) {
                  d(60);
                  var1 = 1441801;
               }

               if (var0 == 17) {
                  int var2 = 25 + 15 * fu;
                  if (f(22, var2) && g(22, var2)) {
                     var1 = bn << 16 | var2 & 65535;
                  }
               }

               if (K < 24 || K > 34) {
                  iC();
               }

               b(22, 13, 28, fu, 4);
               b(22, 187, 188, -1, 4);
            } else {
               if (ec == 0 && a() != 27) {
                  s();
                  if (var0 == 4 || var0 == 3 || var0 == 10 || var0 == 12) {
                     ea = 0;
                     eb = 0;
                     var1 = bk;
                  }

                  if (var0 == 14 || var0 == 2) {
                     d(63);
                     ec = 1;
                  }

                  b(22, 187, 188, -1, 4);
               } else {
                  if (eb < 2 && (var0 == 8 || var0 == 1)) {
                     d(63);
                     ec = 0;
                  }

                  if (K < 24 || K > 34) {
                     hW();
                  }

                  b(22, 187, 188, eb, 4);
               }

               b(22, 13, 28, -1, 4);
            }

            if (var0 == 5 || var0 == 11) {
               if (!az && !aH) {
                  if (a[22][20 + fu * 15][10] == 1) {
                     int var3;
                     if ((var3 = a()) == 27 && i[fu + E] == 4 || var3 == 11 && h[fu + E] == 4) {
                        e(fu + E, var3);
                     }
                  } else if (a[22][16 + fu * 15][10] == 1) {
                     if (aN == 171 || aN == 28) {
                        f = true;
                     }

                     if (a() == 27) {
                        C(E + fu);
                     } else {
                        D(E + fu);
                     }
                  } else if (a[22][22 + fu * 15][10] == 1) {
                     var1 = bn << 16 | 22 + 15 * fu & 65535;
                  } else {
                     d(60);
                     if ((a() != 27 || i[fu + E] != 4) && (a() != 11 || h[fu + E] != 4)) {
                        E(fu + E);
                        if (aN == 24) {
                           f = true;
                        }
                     } else {
                        e(fu + E, a());
                     }
                  }
               } else if (ec != 0 || a() == 27) {
                  var1 = bn << 16 | 108 + 9 * eb & 65535;
               }
            }

            if (var0 == 19) {
               if (!az && !aH) {
                  if (f(22, 96)) {
                     var1 = bn << 16 | 96;
                  }
               } else if (aN != 25) {
                  d(56);
                  if (a() == 27) {
                     v(false);
                  } else {
                     t(false);
                  }

                  aG = false;
               }
            }
            break;
         case 23:
            iC();
            ie();
            if (var0 == 6) {
               var1 = 1507357;
            }

            if (var0 == 11 || var0 == 5) {
               var1 = 1507328 | 2 + (fu << 2) & 65535;
            }

            if (var0 == 19) {
               var1 = 1507356;
            }
            break;
         case 24:
            if (fF == 0) {
               s();
               if (var0 == 11 || var0 == 5 || var0 == 18) {
                  Q(bk = 1572864 | cA[fn] & 65535);
               }

               if (var0 == 19) {
                  bk = 1572877;
                  Q(1572877);
               }
            } else {
               b(24, 34, 35, -1, 3);
            }
      }

      return var1;
   }

   private static void b(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var1;

      for (int var5 = 0; var5 < var4; var5++) {
         a[var0][var1 + var2 * var5][10] = 0;
      }

      if (var3 > -1) {
         a[var0][var1 + var2 * var3][10] = 1;
      }
   }

   private static int B() {
      int var0 = f.h();
      b(8, 219, 220, -1, 4);
      b(8, 223, 224, -1, 2);
      int var1 = -1;
      switch (var0) {
         case 6:
            X(60);
            var1 = 524474;
            break;
         case 7:
            X(60);
            var1 = 524456;
            break;
         case 8:
            X(60);
            var1 = 524458;
            break;
         case 9:
            X(60);
            var1 = 524460;
            break;
         case 10:
            X(60);
            var1 = 524462;
            break;
         case 11:
            X(60);
            var1 = 524464;
            break;
         case 12:
            X(60);
            var1 = 524466;
            break;
         case 13:
            X(60);
            var1 = 524468;
            break;
         case 14:
            X(60);
            var1 = 524470;
            break;
         case 15:
            X(60);
            var1 = 524472;
            break;
         case 16:
            X(60);
            var1 = 524482;
            break;
         case 17:
            X(60);
            var1 = 524478;
            break;
         case 18:
            if (eI >= 5) {
               X(60);
               var1 = 524480;
            }
            break;
         case 19:
            X(56);
            var1 = 524496;
      }

      return var1;
   }

   private static int C() {
      int var0 = f.h();
      int var1 = -1;
      if (ee == 0) {
         b(8, 219, 220, -1, 4);
         b(8, 223, 224, -1, 2);
         if (var0 == 4 || var0 == 3 || var0 == 10 || var0 == 12) {
            X(63);
            ef = ef == 0 ? 1 : 0;
            var1 = bn << 16 | (ef == 0 ? 11 : 14);
            if (ef == 1) {
               q(eM, 2);
            }
         }

         if (var0 == 2 || var0 == 14) {
            X(63);
            ee = 1;
         }
      } else {
         if (cA[0] != 164) {
            int[] var2 = new int[]{164, 166};
            a(0, var2, 2, 0);
         }

         if (ee != 0) {
            s();
            b(8, 219, 220, -1, 4);
            b(8, 223, 224, fn, 2);
            if (var0 == 5 || var0 == 11) {
               X(60);
               var1 = bk;
            }
         }
      }

      return var1;
   }

   private static int D() {
      if (!f(8, 209) && ee != 0 || !h) {
         a(bn, 209, true);
      }

      b(8, 223, 224, -1, 2);
      int var0 = f.h();
      int var1 = -1;
      if (ee == 0) {
         b(8, 219, 220, -1, 4);
         if (var0 == 4 || var0 == 3 || var0 == 10 || var0 == 12) {
            X(63);
            ef = ef == 0 ? 1 : 0;
            var1 = bn << 16 | (ef == 0 ? 11 : 14);
            if (ef == 0) {
               q(eL, 2);
               i = true;
            } else {
               q(eM, 2);
               i = false;
            }
         }

         if (var0 == 2 || var0 == 14) {
            X(63);
            ee = 1;
         }
      } else {
         if ((var0 == 1 || var0 == 8) && (fu == 0 || fu == 1)) {
            X(63);
            ee = 0;
            fu = 0;
         }

         iC();
         b(8, 219, 220, fu, 4);
         if (var0 == 5 || var0 == 11 || var0 == 18) {
            if (!E) {
               X(60);
               var1 = bn << 16 | 27 + 15 * (fu + E) & 65535;
            } else {
               var1 = bn << 16 | 120 + 6 * (fu + E) & 65535;
            }
         }
      }

      if (var0 == 6 && !E) {
         X(60);
         var1 = bn << 16 | 210;
      }

      return var1;
   }

   private static void hW() {
      int var0;
      if (((var0 = f.h()) == 1 || var0 == 8) && eb - 2 >= 0) {
         X(63);
         eb -= 2;
      }

      if ((var0 == 2 || var0 == 14) && ea + eb + 2 < dZ && eb + 2 < 4) {
         X(63);
         eb += 2;
      }

      if (var0 == 4 || var0 == 12) {
         if (eb % 2 == 1) {
            if (ea + 4 + eb - 1 < dZ) {
               X(63);
               ea += 4;
               eb--;
            } else if (ea + 4 < dZ) {
               X(63);
               ea += 4;
               eb = 0;
            }
         } else if (ea + eb < dZ - 1) {
            X(63);
            eb++;
         }
      }

      if (var0 == 3 || var0 == 10) {
         if (eb % 2 == 0) {
            if (ea >= 4) {
               X(63);
               eb++;
               ea -= 4;
            }
         } else {
            X(63);
            eb--;
         }

         if (eb < 0) {
            eb = 0;
         }
      }
   }

   private static void aN(int var0) {
      if (bb[var0] == 64) {
         X(60);
         hS();
      } else if (bb[var0] == 69) {
         X(60);
         fL();
         fN();
         fQ();
         fR();
         ag = 1;
      } else if (bb[var0] == 65) {
         X(60);
         fL();
         fP();
      } else if (bb[var0] == 68) {
         X(60);
         fL();
         fM();
      } else if (bb[var0] == 839) {
         X(60);
         a(44);
      } else {
         if (bb[var0] == 72) {
            GloftGF2M.a.destroyApp(true);
         }
      }
   }

   private static void aO(int var0) {
      if (bd[var0] == 80) {
         X(60);
         fQ();
         fO();
      } else if (bd[var0] == 68) {
         X(60);
         fQ();
         fM();
      } else if (bd[var0] == 79) {
         if (X) {
            X = false;
         } else {
            X = true;
            gN();

            try {
               Thread.sleep(200L);
            } catch (Exception var1) {
            }

            X(60);
         }
      } else if (bd[var0] == 78) {
         if (W = !W) {
            X(0);
         } else {
            gM();
         }
      } else {
         if (bd[var0] == 70) {
            X(60);
            aW(12);
         }
      }
   }

   private static void hX() {
      bd = false;
      fL();
      fQ();
      if (!O) {
         a(15, 140, true);
         b(15, 140, true);
         a(15, 142, true);
         b(15, 142, true);
         a(15, 151, false);
         a(15, 48, false);
         P(15);
         O = true;
      }
   }

   private static boolean H(int var0) {
      if (var0 == 0) {
         K(16);
         if (ek > 13) {
            ek = 10;
            hY();
            hZ();
            P(16);
            b[0][9] = -247;
            R(0);
         } else {
            hY();
            hZ();
            P(16);
         }

         fn = 0;
      }

      if (var0 == 5) {
         x(1);

         for (int var1 = 0; var1 < 3; var1++) {
            a[16][3 + (var1 << 2)][10] = 0;
            a[16][6 + (var1 << 2)][10] = 0;
            a[16][23 + (var1 << 3)][10] = 0;
            a[16][25 + (var1 << 3)][10] = 0;
            a[16][27 + (var1 << 3)][10] = 0;
            a[16][29 + (var1 << 3)][10] = 0;
            a[16][63 + var1 * 6][10] = 0;
            a[16][68 + var1 * 6][10] = 0;
            a[16][66 + var1 * 6][10] = 0;
         }

         if (C > 0) {
            e[] var11 = new e[2];
            e.a(0, 50, 18, var11, 2);
            int[] var2 = new int[]{0, 0, 14};
            if (var11[0] != null) {
               c.a(var11[0].r, var11[0].s, 1000);
               e.a(47, 2, var2).a(var11[0].r, var11[0].s, 10, 1000, false, C);
               e.a(47, 2, var2).a(var11[0].r, var11[0].s, 9, 1000, true, B);
            }
         }

         W(16);
      }

      if (var0 == 2) {
         y(1);
      }

      if (var0 == 3) {
         M(16);
         String var4;
         a((var4 = f.b(219)) == null ? "" : var4, 16, 97, 0, 0);
         int[] var5 = new int[4];
         a[a[16][2][5]].a(a[16][2][6], 0, var5, 0);
         int var10000 = a[16][2][2] + var5[0];
         int var10001 = a[16][2][3] + var5[1];
         int var10002 = var5[2];
         int var3 = var5[3];
         int var16 = var10002;
         int var12 = var10001;
         var0 = var10000;
         f.b(f.a, var0, var12, var16, var3);

         for (int var13 = 0; var13 < 3; var13++) {
            short var7;
            if (a[16][63 + var13 * 6][6] == 48) {
               var7 = 220;
            } else {
               var7 = 227;
            }

            String var8;
            a((var8 = f.b(var7)) == null ? "" : var8, 16, 64 + var13 * 6, 0, 0);
            a(f.a(bf[ek + var13], L, " "), 16, 65 + var13 * 6, 0, 0);
            a(f.a(bg[ek + var13], L, " "), 16, 67 + var13 * 6, 0, 0);
            String var9;
            a((var9 = f.b(8512 + ek + var13)) == null ? "" : var9, 16, 5 + (var13 << 2), 0, 0);
         }

         for (int var14 = 0; var14 < 12; var14++) {
            a("" + m(be[(ek << 2) + var14]), 16, 24 + (var14 << 1), 0, 0);
         }

         var12 = f.U;
         var0 = f.T;
         var16 = var12;
         f.b(f.a, 0, 0, var0, var16);
      }

      return false;
   }

   private static void hY() {
      B = 0;
      C = 0;

      for (int var0 = 0; var0 < 3; var0++) {
         a[16][3 + (var0 << 2)][10] = 1;
         a[16][6 + (var0 << 2)][10] = 1;
         a[16][23 + (var0 << 3)][10] = 1;
         a[16][25 + (var0 << 3)][10] = 1;
         a[16][27 + (var0 << 3)][10] = 1;
         a[16][29 + (var0 << 3)][10] = 1;
         a[16][63 + var0 * 6][10] = 1;
         a[16][66 + var0 * 6][10] = 1;
         a[16][68 + var0 * 6][10] = 1;
         a[16][63 + var0 * 6][6] = 49;
      }

      ap = 100;
   }

   private static void hZ() {
      for (int var0 = 0; var0 < 3; var0++) {
         a[16][23 + (var0 << 3)][5] = 20;
         a[16][23 + (var0 << 3)][6] = 130;
         a[16][25 + (var0 << 3)][5] = 20;
         a[16][25 + (var0 << 3)][6] = 130;
         a[16][27 + (var0 << 3)][5] = 20;
         a[16][27 + (var0 << 3)][6] = 130;
         a[16][29 + (var0 << 3)][5] = 20;
         a[16][29 + (var0 << 3)][6] = 130;
      }

      for (int var4 = 0; var4 < 3; var4++) {
         int var1 = 0;
         int var2 = ek + var4 << 2;
         short var3;
         w(var3 = (short)(107 + ek + var4));
         if (m(be[var2]) > 0) {
            a[16][23 + (var4 << 3)][5] = var3;
            a[16][23 + (var4 << 3)][6] = 0;
            var1++;
         }

         if (m(be[var2 + 1]) > 0) {
            a[16][25 + (var4 << 3)][5] = var3;
            a[16][25 + (var4 << 3)][6] = 1;
            var1++;
         }

         if (m(be[var2 + 2]) > 0) {
            a[16][27 + (var4 << 3)][5] = var3;
            a[16][27 + (var4 << 3)][6] = 2;
            var1++;
         }

         if (m(be[var2 + 3]) > 0) {
            a[16][29 + (var4 << 3)][5] = var3;
            a[16][29 + (var4 << 3)][6] = 3;
            var1++;
         }

         if (var1 == 4) {
            a[16][63 + var4 * 6][6] = 48;
            a[16][63 + var4 * 6][18] = 1;
         } else {
            a[16][63 + var4 * 6][6] = 49;
            a[16][63 + var4 * 6][18] = 1;
         }
      }
   }

   static void a(boolean var0, int var1) {
      var0 = (boolean)var0;
      ej = 0;
      if (var0) {
         a[1][94][10] = 1;
         i = a[1][94][2];
         O(1);
         a[1][96][10] = 1;
         a[1][98][10] = 1;
         a[1][100][10] = 1;
         a[1][102][10] = 1;
         var0 = var1 >> 2;
         o(var1, var0);
         a[1][96][5] = 20;
         a[1][96][6] = 130;
         a[1][98][5] = 20;
         a[1][98][6] = 130;
         a[1][100][5] = 20;
         a[1][100][6] = 130;
         a[1][102][5] = 20;
         a[1][102][6] = 130;
         short var5 = (short)(var0 + 107);

         for (int var2 = 0; var2 < 4; var2++) {
            if (m(be[(var0 << 2) + var2]) > 0) {
               a[1][96 + (var2 << 1)][5] = var5;
               a[1][96 + (var2 << 1)][6] = (short)var2;
            }

            bh[var2] = m(be[(var0 << 2) + var2]);
         }

         ek = var0;
      } else {
         if (a[1][94][10] == 1) {
            a[1][94][10] = 0;
            a[1][96][10] = 0;
            a[1][98][10] = 0;
            a[1][100][10] = 0;
            a[1][102][10] = 0;
            O(1);
         }
      }
   }

   private static void o(int var0, int var1) {
      int var2 = 255;
      if (255 > m(be[var1 << 2])) {
         var2 = m(be[var1 << 2]);
      }

      if (var2 > m(be[(var1 << 2) + 1])) {
         var2 = m(be[(var1 << 2) + 1]);
      }

      if (var2 > m(be[(var1 << 2) + 2])) {
         var2 = m(be[(var1 << 2) + 2]);
      }

      if (var2 > m(be[(var1 << 2) + 3])) {
         var2 = m(be[(var1 << 2) + 3]);
      }

      be[var0] = l(m(be[var0]) + 1);
      var0 = 255;
      if (255 > m(be[var1 << 2])) {
         var0 = m(be[var1 << 2]);
      }

      if (var0 > m(be[(var1 << 2) + 1])) {
         var0 = m(be[(var1 << 2) + 1]);
      }

      if (var0 > m(be[(var1 << 2) + 2])) {
         var0 = m(be[(var1 << 2) + 2]);
      }

      if (var0 > m(be[(var1 << 2) + 3])) {
         var0 = m(be[(var1 << 2) + 3]);
      }

      if (var2 + 1 == var0) {
         a(D[var1], 1, 4, false);
      }
   }

   private static void ia() {
      be = new int[60];

      for (int var1 = 0; var1 < 60; var1++) {
         be[var1] = l(0);
      }

      bh = new int[4];

      for (int var0 = 0; var0 < 4; var0++) {
         bh[var0] = 0;
      }

      D = new short[15];
      a = new byte[15];
      bf = new int[15];
      bg = new int[15];
      m = new byte[60];
      g var4 = g.a(16);

      for (int var2 = 0; var2 < 15; var2++) {
         D[var2] = (short)var4.a[var2][1];
         a[var2] = (byte)var4.a[var2][4];
         bf[var2] = var4.a[var2][5];
         bg[var2] = var4.a[var2][6];
      }

      var4 = g.a(17);

      for (int var3 = 0; var3 < 60; var3++) {
         m[var3] = (byte)var4.a[var3][3];
      }
   }

   static int f() {
      int var0 = 0;
      int var1 = 0;

      int var2;
      for (var2 = 0; var2 < 15 && e() >= a[var2]; var2++) {
         var1 = var1 + m[var2 << 2] + m[(var2 << 2) + 1] + m[(var2 << 2) + 2] + m[(var2 << 2) + 3];
      }

      byte var3 = 0;
      var2 <<= 2;
      if (var1 > 0) {
         var1 = f.c(0, var1);

         for (int var4 = 0; var4 < var2; var4++) {
            var3 += m[var4];
            if (var1 < var3) {
               var0 = var4;
               break;
            }
         }
      }

      return var0;
   }

   private static void aP(int var0) {
      a[16][101][10] = 1;
      a[16][100][10] = 1;
      var0 = ek + var0 - 1;
      B = B + bf[var0];
      C = C + bg[var0];
      int var1 = var0 << 2;

      for (int var2 = 0; var2 < 4; var2++) {
         if (m(be[var1 + var2]) > 0) {
            be[var1 + var2] = l(m(be[var1 + var2]) - 1);
         }
      }

      hZ();
      O(16);
      a(D[var0], 1, 5, false);
      a(D[var0], 1, 5);
   }

   private static void ib() {
      f.c("/7");

      int var0;
      for (var0 = 0; var0 < 15 && a[var0] <= e(); var0++) {
         int var1 = var0 + 107;
         a(1, var1, 1, 0, 24);
      }

      if (var0 > 0) {
         c(1, 3);
      }

      f.k();
   }

   private static boolean I(int var0) {
      if (var0 == 0) {
         a(false);
         el = 0;

         for (int var1 = 0; var1 < 5; var1++) {
            a(19, 2 + var1 * 14, true);
            a(19, 15 + var1 * 14, true);
            a(19, 8 + var1 * 14, true);
            a(19, 11 + var1 * 14, true);
            a(19, 12 + var1 * 14, true);
            a(19, 13 + var1 * 14, true);
            a(19, 14 + var1 * 14, true);
         }

         bi = new int[bg];

         for (int var7 = 0; var7 < bg; var7++) {
            if (E[var7] == 5999) {
               if (m(G[var7]) > 0) {
                  bi[var7] = 135 * m(F[var7]) / 15;
               } else {
                  bi[var7] = 135;
               }
            } else if (m(G[var7]) > 0) {
               bi[var7] = 135 * m(F[var7]) / m(G[var7]);
            } else {
               bi[var7] = 135;
            }
         }

         ap = 100;
      }

      if (var0 == 1) {
         ic();
         P(19);
         X(59);
         j(0, bg, 3);
         b[0][9] = em;
      }

      if (var0 == 5) {
         x(1);

         for (int var8 = 0; var8 < 5; var8++) {
            a(19, 2 + var8 * 14, false);
            a(19, 15 + var8 * 14, false);
            a(19, 8 + var8 * 14, false);
            a(19, 11 + var8 * 14, false);
            a(19, 12 + var8 * 14, false);
            a(19, 13 + var8 * 14, false);
            a(19, 14 + var8 * 14, false);
         }

         bi = null;
         W(19);
      }

      if (var0 == 2) {
         ic();
         y(1);
         if (b[0] != null && !h(0, 1)) {
            if (b[0][9] < 0 && el < bg - 5) {
               aQ(1);
            } else if (b[0][9] > -10 && el > 0) {
               aQ(-1);
            }
         }

         String var9;
         var9 = (var9 = f.b(457)) == null ? "" : var9;
         a[19][81] = var9;

         for (int var11 = 0; var11 < 3; var11++) {
            String var10000 = b[el + var11 + fo];
            int var3 = 3 + var11 * 14;
            String var2 = var10000;
            a[19][var3] = var2;
            var10000 = c[el + var11 + fo];
            var3 = 4 + var11 * 14;
            var2 = var10000;
            a[19][var3] = var2;
            var10000 = Integer.toString(m(F[el + var11 + fo])) + "/" + m(G[el + var11 + fo]);
            var3 = 10 + var11 * 14;
            var2 = var10000;
            a[19][var3] = var2;
            if (G[el + var11 + fo] != 0) {
               a[19][9 + var11 * 14][2] = (short)(a[19][8 + var11 * 14][2] + 6);
               a[19][9 + var11 * 14][3] = (short)(a[19][8 + var11 * 14][3] + 3);
               a[19][9 + var11 * 14][5] = (short)bi[el + var11 + fo];
               a[19][9 + var11 * 14][6] = 9;
            }

            if (L[el + var11 + fo] > 0) {
               var10000 = Integer.toString(L[el + var11 + fo]);
               var3 = 5 + var11 * 14;
               var2 = var10000;
               a[19][var3] = var2;
            }

            if (K[el + var11 + fo] > 0) {
               var10000 = Integer.toString(K[el + var11 + fo]);
               var3 = 6 + var11 * 14;
               var2 = var10000;
               a[19][var3] = var2;
            }

            if (J[el + var11 + fo] > 0) {
               var10000 = Integer.toString(J[el + var11 + fo]);
               var3 = 7 + var11 * 14;
               var2 = var10000;
               a[19][var3] = var2;
            }
         }
      }

      if (var0 == 3) {
         M(19);
         int[] var4 = new int[4];
         a[a[19][1][5]].a(a[19][1][6], 0, var4, 0);
         int var31 = a[19][1][2] + var4[0];
         int var10001 = a[19][1][3] + var4[1];
         int var10002 = var4[2];
         int var25 = var4[3];
         int var19 = var10002;
         int var12 = var10001;
         var0 = var31;
         f.b(f.a, var0, var12, var19, var25);
         var12 = f.U;
         var0 = f.T;
         f.b(f.a, 0, 0, var0, var12);
      }

      return false;
   }

   private static void aQ(int var0) {
      el += var0;
      int var1 = b[0][9];
      ic();
      P(19);
      b[0][9] = var1 + (b[19][16][3] - b[19][2][3]) * var0;
      R(0);
   }

   private static void ic() {
      for (int var0 = 0; var0 < 3; var0++) {
         if (e[el + var0 + fo] == 0) {
            a(19, 15 + var0 * 14, false);
            a(19, 14 + var0 * 14, true);
            b(19, 14 + var0 * 14, false);
            a[19][14 + var0 * 14][6] = 99;
         } else if (e[el + var0 + fo] == 1) {
            a(19, 15 + var0 * 14, true);
            a[19][15 + var0 * 14][6] = 131;
            a(19, 14 + var0 * 14, true);
            b(19, 14 + var0 * 14, true);
            a[19][14 + var0 * 14][6] = 100;
         } else if (e[el + var0 + fo] == 2) {
            a(19, 15 + var0 * 14, true);
            a[19][15 + var0 * 14][6] = 143;
            a(19, 14 + var0 * 14, false);
            b(19, 14 + var0 * 14, false);
         }

         if (L[el + var0 + fo] > 0) {
            a(19, 11 + var0 * 14, true);
            a(19, 5 + var0 * 14, true);
         } else {
            a(19, 11 + var0 * 14, false);
            a(19, 5 + var0 * 14, false);
         }

         if (K[el + var0 + fo] > 0) {
            a(19, 12 + var0 * 14, true);
            a(19, 6 + var0 * 14, true);
         } else {
            a(19, 12 + var0 * 14, false);
            a(19, 6 + var0 * 14, false);
         }

         if (J[el + var0 + fo] > 0) {
            a(19, 13 + var0 * 14, true);
            a(19, 7 + var0 * 14, true);
         } else {
            a(19, 13 + var0 * 14, false);
            a(19, 7 + var0 * 14, false);
         }
      }
   }

   private static void h(boolean var0, int var1) {
      if (a() == 29 && var0) {
         an = true;
         aO = var1;
      } else {
         var1 = var0 ? 1 : 0;
         r = System.currentTimeMillis();
         if (var0) {
            a = 1;
            a(1, 103, var0);
            if (f(f[5])) {
               b(1, 103, var0);
            } else {
               b(1, 103, false);
            }

            P(1);
            a(1, 105, var0);
            a[1][105][5] = 20;
            a[1][105][6] = 143;
         } else {
            if (!var0 && f(1, 103)) {
               a = 2;
               a[1][103][10] = (short)var1;
               a[1][105][10] = (short)var1;
            }
         }
      }
   }

   private static void id() {
      a = 0;
      r = 0L;
      bf = false;
      a(1, 103, false);
      a(1, 105, false);
      b(1, 103, false);
      P(1);
   }

   private static boolean J(int var0) {
      if (var0 == 0) {
         q(6, 2);
         fn = 0;
         ie();
      }

      if (var0 == 1) {
         en = l(bx * e.b(0, 1005));
         P(23);
         q(6, 2);
         ie();
         bD = e.e(0, 54);
         a(23, 28, true);
         b(23, 28, true);
         a(23, 2, true);
         a(23, 6, true);
         a(23, 10, true);
         a(23, 14, true);
         a(23, 18, true);
         a(23, 22, true);
         b(23, 2, true);
         b(23, 6, true);
         b(23, 10, true);
         b(23, 14, true);
         b(23, 18, true);
         b(23, 22, true);
         P(23);
      }

      if (var0 == 5) {
         W(23);
      }

      if (var0 == 2) {
         int var1 = a[23][34][2];
         short var2 = a[23][35][2];
         var1 += (var2 - var1) * v() / m(en);
         a[23][33][2] = (short)var1;
         a(23, 33, true);
      }

      if (var0 == 3) {
         M(23);
         b(23, 44, 45, fu, 4);
         if (E == 0) {
            a(23, 42, false);
         } else {
            a(23, 42, true);
         }

         if (E == 4) {
            a(23, 43, false);
         } else {
            a(23, 43, true);
         }

         String var3;
         b((var3 = f.b(482)) == null ? "" : var3, 23, 1, 0, 0);
         String var4;
         a((var4 = f.b(483)) == null ? "" : var4, 23, 40, 0, 0);
         f(23, 33);
         String var5;
         a((var5 = f.b(484)) == null ? "" : var5, 23, 39, 0, 0);
         a(Integer.toString(v()) + "/" + m(en), 23, 36, 0, 0);
         String var6;
         a((var6 = f.b(459)) == null ? "" : var6, 23, 37, 0, 0);
         a(Integer.toString(bD) + "/" + y(), 23, 38, 0, 0);
         if (E == 0) {
            String var7;
            a((var7 = f.b(8263)) == null ? "" : var7, 23, 4, 0, 0);
            a(Integer.toString(c(0)), 23, 5, 0, 0);
            String var8;
            a((var8 = f.b(8264)) == null ? "" : var8, 23, 8, 0, 0);
            a(Integer.toString(c(1)), 23, 9, 0, 0);
            String var9;
            a((var9 = f.b(8265)) == null ? "" : var9, 23, 12, 0, 0);
            a(Integer.toString(c(2)), 23, 13, 0, 0);
            String var10;
            a((var10 = f.b(8266)) == null ? "" : var10, 23, 16, 0, 0);
            a(Integer.toString(c(3)), 23, 17, 0, 0);
         }

         if (E >= 4) {
            String var11;
            a((var11 = f.b(8267)) == null ? "" : var11, 23, 4, 0, 0);
            a(Integer.toString(c(4)), 23, 5, 0, 0);
            String var12;
            a((var12 = f.b(8268)) == null ? "" : var12, 23, 8, 0, 0);
            a(Integer.toString(c(5)), 23, 9, 0, 0);
         }

         String var13;
         a((var13 = f.b(841)) == null ? "" : var13, 23, 26, 0, 0);
      }

      return false;
   }

   private static void ie() {
      for (int var0 = 2; var0 <= 17; var0++) {
         a[23][var0][10] = 0;
      }

      int var3 = 2;

      for (int var1 = E; var1 < 6; var1++) {
         for (int var2 = 0; var2 < 4; var2++) {
            a[23][var3++][10] = 1;
         }
      }

      for (int var4 = E; var4 < 6; var4++) {
         a[23][3 + (var4 - E << 2)][5] = 34;
         a[23][3 + (var4 - E << 2)][6] = (short)var4;
      }
   }

   private static boolean K(int var0) {
      if (var0 == 0) {
         bj = new int[16];

         for (int var1 = 0; var1 <= 7; var1++) {
            bj[var1 << 1] = a[1][var1][2] - a[1][0][2] + -75;
            bj[(var1 << 1) + 1] = a[1][var1][3] - a[1][0][3] + -50;
         }

         if (K == -1 && bg) {
            bg = false;
         }

         a(true, false, false);
         a(false, 0, f);
         f(true);
         a(false, null);
         hh();
         hk();
         k(0);
         t = false;
         u = false;
         e(-1);
         ib();
         x(1);
         i(0);
      }

      if (var0 == 1) {
         x(1);
         if (a[a] == 17 && R) {
            p = bq;
            gJ();
            gI();
            R = false;
         }

         if (a[a] == 17 && P && !Q) {
            x();
            c.i();
            P = false;
         }

         if (f != null) {
            a(f, false);
         }

         if (a != null) {
            if (a.q != 54 && d != 3) {
               g(true);
            }

            if ((g(23) || f(f[23])) && by >= bz) {
               c(1, 33, 0, -1);
            }
         } else {
            a(true, false, false);
            if (!v) {
               t = false;
               u = false;
               e(-1);
            }

            if (e != null) {
               e = null;
               b(false, e);
               if (ab) {
                  a(false, null);
               }

               ab = false;
            }

            f(true);
            g(false);
         }

         if (r()) {
            a(1, 52, false);
            b(1, 52, false);
         }

         P(1);
         if (K == -1 && fm == -1 & q()) {
            a(true, fk, '\u0001');
         }

         ag();
         if (bw) {
            bw = false;
         }

         if (D != -1) {
            if (D == 1) {
               b(472, 478);
            } else if (D == 2) {
               b(471, 477);
            } else if (D == 3) {
               i(489, 490, 7);
            } else if (D == 4) {
               i(500, 501, 15);
            } else if (D == 5) {
               i(502, 503, 26);
            } else if (D == 6) {
               i(504, 505, 7);
            } else if (D == 7) {
               i(295, 296, 7);
            } else if (D == 8) {
               i(623, 624, 7);
            } else if (D == 11) {
               i(163, 164, 7);
            } else if (D == 12) {
               i(637, 638, 7);
            } else if (D == 14) {
               i(621, 622, 7);
            } else if (D == 15) {
               i(633, 634, 7);
            } else if (D == 16) {
               i(637, 638, 7);
            } else if (D == 17) {
               if (r() > 0) {
                  b(300, 230 + (r() - 1), 7);
               }
            } else if (D == 20) {
               i(491, 492, 7);
            }

            D = -1;
         }

         if (an) {
            an = false;
            h(true, aO);
            aO = 0;
         }

         if (!f(1, 41) && e() >= 3) {
            ai();
            k(true);
            O(1);
         }

         if (!g(1, 14) && e() >= 3) {
            b(1, 14, !h);
            b(1, 20, h);
            a(1, 19, h);
            a(1, 15, !h);
            O(1);
         }

         if (N != 0) {
            a(1, 68, false);
            b(1, 68, false);
         } else if ((!f(1, 68) || !g(1, 68)) && (g(2) || f(f[2]))) {
            a(1, 68, true);
            b(1, 68, true);
            O(1);
         }

         if (aE != -1) {
            e(aE);
         }

         if (p() != 7 && p() != 29 && p() != 28 && p() != 26 && p() != 19 && p() != 20 && p() != 35 && p() != 27 && p() != 8 && p() != 12) {
            a();
         }

         if (K == 0) {
            ao(15);
            hb();
            K = 1;
         } else if (K != -1) {
            a(18);
            hb();
         }

         hp();
      }

      if (var0 == 8) {
         int var10 = f.h();
         if (d != null && (var10 == 11 || var10 == 5) && aN != 35 && aN != 18 && !ab) {
            a(false, null);
         }

         if (e != null) {
            if (var10 == 10 || var10 == 3) {
               aF = --aF % aG;
               gQ();
               d(63);
            }

            if (var10 == 12 || var10 == 4) {
               aF = ++aF % aG;
               gQ();
               d(63);
            }

            if (var10 == 11 || var10 == 5) {
               gR();
            }

            if (var10 == 19) {
               e = null;
               f(true);
               b(false, e);
               A(true);
               a(true, false, false);
               if (ab) {
                  a(false, null);
               }

               ab = false;
               P(1);
               d(56);
            }

            return true;
         }

         if (a != null) {
            m();
            return true;
         }

         if (t) {
            if (var10 == 10 || var10 == 3) {
               aH = --aH % aI;
               af();
               d(63);
            }

            if (var10 == 12 || var10 == 4) {
               aH = ++aH % aI;
               af();
               d(63);
            }

            if (var10 == 11 || var10 == 5) {
               t = false;
               u = true;
               bk = 65613;
               Q(65613);
               A(true);
               if (e == 0) {
                  a(false, 0, f);
               } else if (e == 1) {
                  a(false, 1, f);
               }
            }

            if (var10 == 19) {
               t = false;
               u = false;
               A(true);
               e(-1);
               k = null;
               d(56);
            }

            return true;
         }

         if (u && u == 0 && (var10 == 11 || var10 == 5 || var10 == 19)) {
            u = false;
            A(true);
            e(-1);
            k = null;
            d(56);
         }

         if (k != null) {
            if (k == a) {
               return true;
            }

            switch (k.q) {
               case 19:
                  if (k.D == 8) {
                     a(6, k);
                     return true;
                  }
                  break;
               case 22:
                  if (k.D == 1) {
                     String var8;
                     String var13 = k.p == -1 ? "%RETRIEVE ITEM NAME ERROR%" + k.p : ((var8 = f.b(k.p)) == null ? "" : var8);
                     String var9;
                     a(((var9 = f.b(154)) == null ? "" : var9) + var13, k);
                     return true;
                  }
                  break;
               case 48:
                  if ((g(12) || f(f[12])) && p != 1) {
                     a(2, k);
                     return true;
                  }
                  break;
               case 49:
                  if (!t && !u) {
                     k.c();
                  }

                  if (u) {
                     k.b();
                  }
                  break;
               case 50:
                  if (ak) {
                     return true;
                  }

                  if (K == 23 && k.y != 14) {
                     return false;
                  }

                  if (p == 1) {
                     return false;
                  }

                  if (k.y == 9) {
                     a(8);
                     return true;
                  }

                  if (k.y == 18) {
                     hO();
                     return true;
                  }

                  if (k.y == 14) {
                     d(36);
                     a(27);
                     return true;
                  }

                  if (k.y == 10) {
                     dq = 0;
                     a(28);
                     return true;
                  }

                  if (k.y == 15) {
                     if (g(2) || f(f[2])) {
                        d(59);
                        a(38);
                        f(false);
                        return true;
                     }

                     d(55);
                  } else if (k.y != 12 && k.y != 11) {
                     if (k.y == 13) {
                        if (f(f[1])) {
                           d(59);
                           a(39);
                           return true;
                        }
                     } else if (k.y == 17 && k.a(512)) {
                        k.G();
                        String var6;
                        String var7;
                        c((var6 = f.b(627)) == null ? "" : var6, (var7 = f.b(628)) == null ? "" : var7, 7, 0);
                        return true;
                     }
                  } else if (k.a) {
                     var10 = 0;
                     byte var2 = 0;
                     if (k.y == 11) {
                        d(15);
                        var2 = 1;
                        var10 = 0 + e.a(0, 54, 5, 15);
                     } else if (k.y == 12) {
                        d(16);
                        var2 = 2;
                        var10 = 0 + e.a(0, 54, 17, 27) + e.a(0, 54, 41, 51) + e.a(0, 54, 53, 63);
                     }

                     int var3 = 1 + var10 / 3;
                     if (b(5) + e.a(2) + var3 > b()) {
                        if (b(5) < b()) {
                           String var4;
                           String var16 = f.a((var4 = f.b(476)) == null ? "" : var4, "%slots", "" + var3);
                           String var5;
                           a((var5 = f.b(475)) == null ? "" : var5, var16, 7, 0);
                        } else {
                           b(471, 477);
                        }

                        return true;
                     }

                     int[] var14 = new int[]{0, 0, 14};
                     e.a(47, 2, var14);
                     e var15 = e.a(47, 2, var14);
                     b(b[k.y], 1, 7);
                     var10 = 1 + f.c(0, 2) * (var10 / 3) << 16;
                     var15.a(k.r, k.s, 29, 1000, true, var2 | var10);
                     k.a = false;
                     k.a = System.currentTimeMillis() / 1000L;
                     k.G();
                  } else {
                     d(55);
                     a(true, k);
                  }
                  break;
               case 52:
                  k.e();
                  k.d();
                  break;
               case 54:
                  if (k.f()) {
                     return true;
                  }
            }
         }

         if (l == null && j != null && j.a()) {
            return true;
         }

         if (c) {
            return true;
         }

         c.g();
      }

      if (var0 == 2) {
         gW();
         if (am) {
            gZ();
         }
      }

      if (var0 == 3) {
         if (K == 1 && af == 35) {
            return false;
         }

         gV();
         if (i.a() != null) {
            p(false);
         }

         if (!a) {
            gX();
         }
      }

      if (var0 == 4) {
         a(false, 0, f);
      }

      if (var0 == 5) {
         hr();
         e.d();
         c = null;
         e.c();
         i(1, 33);
      }

      return false;
   }

   private static boolean L(int var0) {
      if (var0 == 0) {
         if (K == 1) {
            K = 1;
            e = false;
            f = false;
         }

         Y = false;
      }

      if (var0 == 1) {
         p = bq;
         if (R) {
            R = false;
            gJ();
            gI();
         }

         if (P) {
            P = false;
            x();
         }

         if (aE != -1) {
            e(aE);
         } else if (f != null) {
            a(f, false);
         }

         P(1);
      }

      if (var0 == 8) {
         int var1 = f.h();
         if (e != null) {
            if (var1 == 10 || var1 == 3) {
               aF = --aF % aG;
               gQ();
               X(63);
            }

            if (var1 == 12 || var1 == 4) {
               aF = ++aF % aG;
               gQ();
               X(63);
            }

            if (var1 == 11 || var1 == 5) {
               gR();
            }

            if (var1 == 19) {
               e = null;
               f(true);
               b(false, e);
               bu = true;
               a(true, false, false);
               if (ab) {
                  a(false, null);
               }

               ab = false;
               P(1);
               X(56);
            }

            return true;
         }

         if (a != null) {
            m();
            return true;
         }

         if (t) {
            if (K != 45 && K != 7) {
               if (var1 == 10 || var1 == 3) {
                  aH = --aH % aI;
                  af();
                  X(63);
               }

               if (var1 == 12 || var1 == 4) {
                  aH = ++aH % aI;
                  af();
                  X(63);
               }
            }

            if (var1 == 11 || var1 == 5) {
               t = false;
               u = true;
               bk = 65613;
               Q(65613);
               bu = true;
               if (e == 0) {
                  a(false, 0, f);
               } else if (e == 1) {
                  a(false, 1, f);
               }
            }

            if (var1 == 19 && K != 7) {
               t = false;
               u = false;
               bu = true;
               e(-1);
               k = null;
               X(56);
            }

            return true;
         }

         if (u && K != 8 && u == 0 && (var1 == 11 || var1 == 5 || var1 == 19)) {
            u = false;
            bu = true;
            e(-1);
            k = null;
            X(56);
         }

         if (k != null) {
            switch (k.q) {
               case 47:
                  k.d = true;
                  return true;
               case 48:
               case 51:
               case 52:
               case 53:
               default:
                  break;
               case 49:
                  if (!t && !u) {
                     k.c();
                  }

                  if (u) {
                     k.b();
                  }
                  break;
               case 50:
                  if (K == 54 && k.y == 9) {
                     f = true;
                     X(59);
                     a(8);
                     return true;
                  }

                  if (K == 49 && k.y == 10 && k.a(512)) {
                     f = true;
                     X(50);
                     a(28);
                     return true;
                  }

                  if (k.y == 17) {
                     if (k.a(512)) {
                        a(25);
                        return true;
                     }
                  } else if (k.y == 14 && k.a(512) && K == 23) {
                     X(36);
                     a(27);
                     return true;
                  }
                  break;
               case 54:
                  if (K == 34 && k.y == 17) {
                     f = true;
                  } else if (K == 17 && k.y == 16) {
                     f = true;
                  } else if (K == 32 && k.y == 17) {
                     f = true;
                  }

                  if (k.f()) {
                     return true;
                  }
            }
         }

         if (j != null && !j.a()) {
            c.g();
         }
      }

      if (var0 == 2) {
         gW();
         if (b != null || aP != -1) {
            if (d != null) {
               d.a(F, G);
            }

            ha();
         }

         gL();
         hd();
      }

      if (var0 == 3 && !a) {
         e.b();
         hi();
         gT();
         M(1);
         p(false);
         gX();
         if (c) {
            a[aL].a(f.a, aM, 0, 0, 0);
         }

         iD();
      }

      if (var0 == 4) {
         a(false, 0, f);
      }

      return false;
   }

   private static boolean M(int var0) {
      if (var0 == 1) {
         ap = 100;
         er = 0;
         P(4);
         eo = 0;
         int var1 = 11;
         if (o == "") {
            var1 = 3;
         }

         if (a[4][var1][5] > -1 && a[a[4][var1][5]] == null) {
            var1 = a[4][var1][5];
            a(1, var1, 1, 0, 24);
            f.c("/7");
            c(1, 3);
            f.k();
         }

         switch (eq) {
            case 0:
               if (bN == 15 && e == 2) {
                  X(59);
                  break;
               }

               X(57);
               break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
               X(57);
            case 5:
         }

         int[] var4 = new int[]{16, 17};
         a(0, var4, 2, 1);
         fn = 1;
         u = false;
         d = null;
         e(-1);
         var1 = o();
         a(4, 0, var1 != 17 && var1 != 17 && var1 != 18 && var1 != 35 && var1 != 36);
         a(1, 53, false);
         a(1, 54, false);
      }

      if (var0 == 5) {
         bi = false;
         if();
         c = false;
         o = "";
         p = "";
         q = "";
         h = null;
         if (by) {
            by = false;
            if (f(8, 208)) {
               b(8, 208, true);
            }

            if (f(8, 213)) {
               b(8, 213, true);
            }
         }

         if (er == 34) {
            a(34);
         } else if (ep != -1) {
            a(ep);
            ep = -1;
         } else if (eq == 6) {
            P = true;
            a = true;
            Q = true;
            i.e(0);
            i.e(1);
            a(25);
         }

         eq = 0;
      }

      if (var0 == 2) {
         int var6 = f.h();
         if (cA[0] != 16 && (eq == 2 || eq == 4)) {
            int[] var2 = new int[]{16, 17};
            a(0, var2, 2, 1);
            fn = 1;
            u = false;
            d = null;
            e(-1);
         }

         if (cA[0] != 22 && eq == 5) {
            int[] var12 = new int[]{22, 24, 26};
            a(0, var12, 3, 1);
            fn = 0;
            u = false;
            d = null;
            e(-1);
         }

         switch (eq) {
            case 0:
            case 1:
            case 6:
               b(4, 28, 29, -1, 3);
               b(4, 20, 21, -1, 2);
               if (var6 != 5 && var6 != 11) {
                  break;
               }

               if (a[4][4][10] == 1) {
                  bk = 262148;
               }

               if (a[4][12][10] == 1) {
                  bk = 262156;
               }

               Q(bk);
               break;
            case 2:
            case 3:
            case 4:
               s();
               b(4, 28, 29, -1, 3);
               b(4, 20, 21, fn, 2);
               if (var6 == 5 || var6 == 11) {
                  Q(bk);
               }
               break;
            case 5:
               s();
               b(4, 20, 21, -1, 2);
               b(4, 28, 29, fn, 3);
               if (var6 == 5 || var6 == 11) {
                  Q(bk);
               }
         }

         if (var6 == 19 && e() && bN != 17) {
            Q(262148);
            bk = true;
         }

         eo = eo + f.V;
         y(1);
      }

      if (var0 == 3) {
         M(4);
         if (o != "" && o != null) {
            b(o, 4, 8, 0, 0);
            if (!f(4, 14)) {
               b(p, 4, 9, 0, 0);
            } else {
               b(p, 4, 10, 0, 0);
            }
         } else {
            b(p, 4, 2, 0, 0);
         }

         if (q != "") {
            a(q, 4, 15, 0, 0);
         }

         if (a[4][16][10] == 1) {
            switch (eq) {
               case 2:
                  String var9;
                  a((var9 = f.b(45)) == null ? "" : var9, 4, 18, 0, 0);
                  a((var9 = f.b(40)) == null ? "" : var9, 4, 19, 0, 0);
                  break;
               case 3:
                  String var7;
                  a((var7 = f.b(32)) == null ? "" : var7, 4, 18, 0, 0);
                  a((var7 = f.b(33)) == null ? "" : var7, 4, 19, 0, 0);
            }
         }

         if (a[4][36][10] == 1) {
            String var11;
            a((var11 = f.b(481)) == null ? "" : var11, 4, 37, 0, 0);
         }
      }

      if (var0 == 6) {
         switch (eq) {
            case 2:
            case 4:
               fn = 1;
            case 3:
            default:
               break;
            case 5:
               fn = 1;
         }
      }

      return false;
   }

   private static void a(String var0, e var1) {
      i = var1;
      a(var0, 7, 0);
   }

   static void a(int var0, int var1, int var2) {
      String var3;
      a((var3 = f.b(var0)) == null ? "" : var3, var1, var2);
   }

   private static void h(int var0, int var1, int var2) {
      if (a[4][var2][5] > -1 && a[4][var2][5] != var0) {
         if (a[4][var2][5] >= 1000) {
            int var10000 = a[4][var2][5] - 1000;
            char var4 = '\uffff';
            int var3 = var10000;
            a(0, var3, var4, 1, 0);
         } else if (a[4][var2][5] != 44) {
            short var7 = a[4][var2][5];
            char var6 = '\uffff';
            short var5 = var7;
            a(1, var5, var6, 1, 0);
         }
      }

      if (var0 == -1) {
         a(4, var2, false);
      } else {
         a(4, var2, true);
         a[4][var2][5] = (short)var0;
         a[4][var2][6] = (short)var1;
      }
   }

   private static void a(String var0, int var1, int var2) {
      eq = 0;
      p = var0;
      a(4, 1, true);
      a(4, 7, false);
      h(var1, var2, 3);
      var1 = j(a[4][2][7]);
      short[] var3;
      int var4 = ((var3 = c[var1].a(var0, a[4][2][5], false))[0] + (var3[0] >> 1)) * c[var1].d();
      b(4, 1, a[4][2][5] + 20, var4 + 20);
      a(4, 4, true);
      b(4, 4, true);
      if (var4 > 105) {
         var4 = 105;
      }

      a[4][4][3] = (short)(var4 + a[4][2][3] + 8);
      a(19);
   }

   static void b(int var0, int var1, int var2) {
      String var3;
      String var10000 = (var3 = f.b(var0)) == null ? "" : var3;
      String var4;
      String var6 = (var4 = f.b(var1)) == null ? "" : var4;
      String var5 = var10000;
      bi = true;
      a(var5, var6, var2, 0, bi);
   }

   private static void i(int var0, int var1, int var2) {
      String var3;
      String var4;
      a((var3 = f.b(var0)) == null ? "" : var3, (var4 = f.b(var1)) == null ? "" : var4, var2, 0, false);
   }

   private static void a(String var0, String var1, int var2) {
      a(var0, var1, var2, 0, false);
   }

   private static void a(String var0, String var1, int var2, int var3, boolean var4) {
      bi = var4;
      eq = 1;
      if();
      a(4, 5, true);
      a(4, 6, true);
      a(4, 7, true);
      a(4, 12, true);
      b(4, 12, true);
      h(var2, 0, 11);
      o = var0;
      p = var1;
      int var5 = j(a[4][9][7]);
      short[] var8;
      int var6 = ((var8 = c[var5].a(var1, a[4][9][5], false))[0] + (var8[0] >> 1)) * c[var5].d();
      int var7 = var6 + 40;
      if (var7 > 160) {
         var7 = 160;
      }

      if (var7 < 100) {
         var7 = 100;
      }

      b(4, 5, 185, var7);
      a[4][9][3] = (short)(a[4][5][3] + 20);
      a[4][12][3] = (short)(a[4][5][3] + var7 - 4);
      if (a[4][11][5] > -1 && a[a[4][11][5]] == null) {
         short var9 = a[4][11][5];
         a(1, var9, 1, 0, 24);
         f.c("/7");
         c(1, 3);
         f.k();
      }

      a[4][11][3] = (short)(a[4][5][3] + var7 - 44);
      a(19);
   }

   private static void b(String var0, String var1, int var2, int var3) {
      eq = 3;
      a(4, 5, true);
      a(4, 6, true);
      a(4, 7, true);
      h(7, 0, 11);
      o = var0;
      p = var1;
      a(4, 14, false);
      a(4, 16, true);
      a(4, 17, true);
      int var4 = j(a[4][9][7]);
      short[] var7;
      int var5 = ((var7 = c[var4].a(var1, a[4][9][5], false))[0] + (var7[0] >> 1)) * c[var4].d();
      int var6 = var5 + 40;
      if (var6 > 160) {
         var6 = 160;
      }

      if (var6 < 105) {
         var6 = 105;
      }

      b(4, 5, 185, var6);
      a[4][9][3] = (short)(a[4][5][3] + 20);
      a[4][12][3] = (short)(a[4][5][3] + var6 - 4);
      if (a[4][11][5] > -1 && a[a[4][11][5]] == null) {
         short var8 = a[4][11][5];
         a(1, var8, 1, 0, 24);
         f.c("/7");
         c(1, 3);
         f.k();
      }

      a[4][11][3] = (short)(a[4][5][3] + var6 - 44);
      a(19);
   }

   static void d() {
      i(469, 470, 7);
   }

   static void b(int var0, int var1) {
      String var2;
      String var3;
      a((var2 = f.b(var0)) == null ? "" : var2, (var3 = f.b(var1)) == null ? "" : var3, 7, 0);
   }

   static void a(String var0, String var1, int var2, int var3) {
      if();
      if (N == 0) {
         a(4, 36, true);
      }

      eq = 1;
      a(4, 5, true);
      a(4, 6, true);
      a(4, 7, true);
      a(4, 12, true);
      b(4, 12, true);
      h(7, 0, 11);
      o = var0;
      p = var1;
      int var4 = j(a[4][9][7]);
      short[] var7;
      int var5 = ((var7 = c[var4].a(var1, a[4][9][5], false))[0] + (var7[0] >> 1)) * c[var4].d();
      int var6 = var5 + 40;
      if (var6 > 160) {
         var6 = 160;
      }

      if (var6 < 105) {
         var6 = 105;
      }

      b(4, 5, 185, var6);
      a[4][9][3] = (short)(a[4][5][3] + 20);
      a[4][12][3] = (short)(a[4][5][3] + var6 - 4);
      if (a[4][11][5] > -1 && a[a[4][11][5]] == null) {
         short var8 = a[4][11][5];
         a(1, var8, 1, 0, 24);
         f.c("/7");
         c(1, 3);
         f.k();
      }

      a[4][11][3] = (short)(a[4][5][3] + var6 - 44);
      a(19);
   }

   private static void c(String var0, String var1, int var2, int var3) {
      eq = 6;
      a(4, 5, true);
      a(4, 6, true);
      a(4, 7, true);
      a(4, 12, true);
      b(4, 12, true);
      h(7, 0, 11);
      o = var0;
      p = var1;
      int var4 = j(a[4][9][7]);
      short[] var7;
      int var5 = ((var7 = c[var4].a(var1, a[4][9][5], false))[0] + (var7[0] >> 1)) * c[var4].d();
      int var6 = var5 + 40;
      if (var6 > 160) {
         var6 = 160;
      }

      if (var6 < 105) {
         var6 = 105;
      }

      b(4, 5, 185, var6);
      a[4][9][3] = (short)(a[4][5][3] + 20);
      a[4][12][3] = (short)(a[4][5][3] + var6 - 4);
      if (a[4][11][5] > -1 && a[a[4][11][5]] == null) {
         short var8 = a[4][11][5];
         a(1, var8, 1, 0, 24);
         f.c("/7");
         c(1, 3);
         f.k();
      }

      a[4][11][3] = (short)(a[4][5][3] + var6 - 44);
      a(19);
   }

   private static void if() {
      a(4, 1, false);
      a(4, 3, false);
      a(4, 4, false);
      b(4, 4, false);
      a(4, 5, false);
      a(4, 6, false);
      a(4, 7, false);
      a(4, 11, false);
      a(4, 12, false);
      b(4, 12, false);
      a(4, 13, false);
      a(4, 14, false);
      a(4, 16, false);
      a(4, 17, false);
      a(4, 36, false);
   }

   private static boolean N(int var0) {
      if (var0 == 0) {
         p = bq;
         gJ();
         gI();
         x();
         X(13);
         if (N > 0 && N <= 10 && a[N - 1][5] == 0L) {
            a[N - 1][5] = System.currentTimeMillis() / 1000L;
         }

         if (N > 0 && N <= 10) {
            a(true, true, false);
            f(true);
         } else {
            a(true, true, true);
         }

         a(false, null);
         a(1, 68, false);
         b(1, 68, false);
         k(0);
         aR(0);
         hh();
         hk();
         w &= -2;
         e[] var1 = new e[50];
         int var2 = e.a(0, 54, 0, 63, var1, 50);

         for (int var3 = 0; var3 < var2; var3++) {
            if (var1[var3] != null) {
               var1[var3].i(16);
            }
         }
      }

      if (var0 == 1) {
         P(1);
         if (a != null) {
            if (a.q != 54) {
               g(true);
            }
         } else {
            if (N > 0 && N <= 10) {
               a(true, true, false);
               t = false;
               u = false;
               e(-1);
               f(false);
            } else {
               a(true, true, true);
               f(false);
            }

            g(false);
         }
      }

      if (var0 == 8) {
         int var4 = f.h();
         if (u && u == 0 && (var4 == 11 || var4 == 5 || var4 == 19)) {
            u = false;
            bu = true;
            e(-1);
            k = null;
            X(56);
         }

         if (N > 0 && N <= 10 && k != null) {
            switch (k.q) {
               case 48:
                  if (g(12) || f(f[12])) {
                     a(2, k);
                     return true;
                  }
                  break;
               case 49:
                  if (!t && !u) {
                     k.c();
                  }

                  if (u) {
                     k.b();
                  }
               case 50:
               case 51:
               case 53:
               default:
                  break;
               case 52:
                  k.e();
                  k.d();
                  break;
               case 54:
                  if (k.f()) {
                     return true;
                  }
            }
         }

         if (l == null && j != null && j.a()) {
            return true;
         }

         c.g();
      }

      if (var0 == 2) {
         gW();
         ht();
         gY();
         if (N <= 10 && d[N - 1][5] < 5 && System.currentTimeMillis() / 1000L - a[N - 1][0] >= 86400L) {
            aR(5);
         }

         if (am) {
            gZ();
         }
      }

      if (var0 == 3) {
         if (aN == 169) {
            if ((p == null || p == "") && f(1, 37)) {
               if (a[1][10][10] == 0) {
                  a[1][10][10] = 1;
               }
            } else {
               a[1][10][10] = 0;
            }
         }

         gV();
         p(true);
         gX();
      }

      if (var0 == 5) {
         hr();
         w |= 1;
         e.d(100);
         e.d();
         e.c();
         bw = true;
         U = true;
         c = null;
      }

      return false;
   }

   private static void aR(int var0) {
      if (N <= 10) {
         if (d[N - 1][5] == 5) {
            a[N - 1][0] = System.currentTimeMillis() / 1000L;
         }

         d[N - 1][5] = d[N - 1][5] + var0 < 0 ? 0 : (d[N - 1][5] + var0 > 5 ? 5 : d[N - 1][5] + var0);
         a[1][38][6] = (short)d[N - 1][5];
         if (d[N - 1][5] == 0) {
            a[N - 1][3] = System.currentTimeMillis() / 1000L;
            d[N - 1][2] = d[N - 1][2] | 16;
            g var2 = g.a(24);
            int var1 = d[N - 1][1] / d[25];
            j(N - 1, var2.a[var1][4]);
            if (g(2)) {
               am = true;
               aN = 169;
               f = false;
               e = false;
            }
         }
      }
   }

   private static boolean O(int var0) {
      if (var0 == 0) {
         K(9);
         if (ev != 4 && ev != 3) {
            bk = null;
            bl = null;
            bm = null;
            bn = null;
            bo = null;
            bp = null;
            es = 0;
            g var1 = g.a(8);
            es = 10;
            if (var1 != null) {
               bk = new int[es];
               bl = new int[es];
               bm = new int[es];
               bn = new int[es];
               bo = new int[es];
               bp = new int[es];

               for (int var2 = 0; var2 < es; var2++) {
                  bk[var2] = var1.a[var2][0];
                  bl[var2] = var1.a[var2][2];
                  bm[var2] = var1.a[var2][6];
                  bn[var2] = var1.a[var2][4];
                  bo[var2] = var1.a[var2][5];
                  bp[var2] = var1.a[var2][9];
               }
            }
         } else {
            a(9, 7, false);
            a(9, 3, false);
            b(9, 3, false);
         }

         f.j();
         q(es, 2);
         E = 0;
         bj = false;
         et = 0;
         eu = 0;
         if (aN == 168) {
            f = true;
         }
      }

      if (var0 == 1) {
         bj = false;
         et = 0;
         eu = 0;
         a(9, 67, false);
         if (ev != 4 && ev != 3) {
            m(true);
            l(true);
         } else {
            if (!H) {
               a(9, 10, true);
               P(9);
               H = true;
            }

            b(9, 11, false);
            a(9, 12, false);
            b(9, 12, false);
            a(9, 13, false);
            a(9, 16, false);
            a(9, 17, false);
            a(9, 18, false);
            a(9, 19, false);
            a(9, 20, false);
            a(9, 22, false);
            a(9, 14, false);
            b(9, 14, false);
            a(9, 15, false);
            b(9, 15, false);
            a(9, 23, false);
            a(9, 24, false);
            a(9, 27, false);
            a(9, 28, false);
            a(9, 29, false);
            a(9, 30, false);
            a(9, 31, false);
            a(9, 33, false);
            a(9, 25, false);
            b(9, 25, false);
            a(9, 26, false);
            b(9, 26, false);
            a(9, 34, false);
            a(9, 35, false);
            a(9, 38, false);
            a(9, 39, false);
            a(9, 40, false);
            a(9, 41, false);
            a(9, 42, false);
            a(9, 44, false);
            a(9, 36, false);
            b(9, 36, false);
            a(9, 37, false);
            b(9, 37, false);
            a(9, 45, false);
            a(9, 46, false);
            a(9, 49, false);
            a(9, 50, false);
            a(9, 51, false);
            a(9, 52, false);
            a(9, 53, false);
            a(9, 55, false);
            a(9, 47, false);
            b(9, 47, false);
            a(9, 48, false);
            b(9, 48, false);
            a(9, 56, false);
            a(9, 57, false);
            a(9, 60, false);
            a(9, 61, false);
            a(9, 62, false);
            a(9, 63, false);
            a(9, 64, false);
            a(9, 66, false);
            a(9, 58, false);
            b(9, 58, false);
            a(9, 59, false);
            b(9, 59, false);
            F = false;
            a(9, 5, false);
            a(9, 6, true);
            b(9, 68, true);
            a(9, 69, true);
            b(9, 69, true);
            a(9, 70, true);
            a(9, 84, true);
            b(9, 84, true);
            a(9, 85, true);
            a(9, 99, true);
            b(9, 99, true);
            a(9, 100, true);
            a(9, 114, true);
            b(9, 114, true);
            a(9, 115, true);
            a(9, 129, true);
            b(9, 129, true);
            a(9, 130, true);
            P(9);
            G = true;
         }

         if (fx != es) {
            f.j();
            q(es, 2);
            E = 0;
         }

         if (F) {
            l(true);
         }

         P(9);
      }

      if (var0 == 5) {
         bj = false;
         et = 0;
         eu = 0;
         a(9, 67, false);
         ev = 1;
         bk = null;
         bl = null;
         bm = null;
         bn = null;
         bo = null;
         bp = null;
         es = 0;
         F = false;
         x(1);
         W(9);
      }

      if (var0 == 2) {
         iC();
         if (E == 0) {
            a(9, 145, false);
         } else {
            a(9, 145, true);
         }

         if (E + 4 > es) {
            a(9, 146, false);
         } else {
            a(9, 146, true);
         }

         b(9, 150, 151, fu, 4);
         int var8 = es - E > 4 ? 4 : es % 4;

         for (int var14 = 0; var14 < var8; var14++) {
            k(var14, true);
         }

         for (int var15 = var8; var15 < 4; var15++) {
            k(var15, false);
         }

         if (F && bj) {
            et++;
            a[9][67][2] = (short)(a[9][eu][2] + 4 * et);
            a[9][67][3] = (short)(a[9][eu][3] + et * (et >> 2));
            if (a[9][67][3] > f.U) {
               bj = false;
               et = 0;
               U(0);
            }
         }

         y(1);
      }

      if (var0 == 3) {
         M(9);
         if (F) {
            String var4;
            a((var4 = f.b(157)) == null ? "" : var4, 9, 1, 0, 0);
            int[] var9 = new int[4];
            a[a[9][11][5]].a(a[9][11][6], 0, var9, 0);
            int var10000 = a[9][11][2] + var9[0];
            int var10001 = a[9][11][3] + var9[1];
            int var10002 = var9[2];
            int var3 = var9[3];
            int var16 = var10002;
            int var10 = var10001;
            var0 = var10000;
            f.b(f.a, var0, var10, var16, var3);
            var16 = es - E > 4 ? 4 : es % 4;

            for (int var6 = 0; var6 < var16; var6++) {
               String var11;
               a((var11 = f.b(bl[var6 + E])) == null ? "" : var11, 9, 13 + var6 * 11, 0, 0);
            }

            int var12 = f.U;
            var0 = f.T;
            var16 = var12;
            int var13 = var0;
            f.b(f.a, 0, 0, var13, var16);
         }
      }

      return false;
   }

   private static void k(int var0, boolean var1) {
      int var2;
      int var3 = (var2 = var0 * 11) + 21;
      int var4 = var2 + 16;
      if (var1) {
         a(9, var2 + 12, true);
         a(9, var2 + 17, true);
         a(9, var2 + 18, true);
         a(9, var2 + 19, true);
         a(9, var2 + 20, true);
         a(9, var4, true);
         a[9][var4][5] = (short)bn[var0 + E];
         a[9][var4][6] = (short)bo[var0 + E];
         var1 = e() < bm[var0 + E];
         int var5 = var2 + 17;
         int var6 = var2 + 20;

         for (int var7 = var5; var7 <= var6; var7++) {
            a(9, var7, !var1);
         }

         if (var1) {
            a(9, var3, true);
            a(9, var2 + 22, true);
            String var9;
            String var10000 = ((var9 = f.b(447)) == null ? "" : var9) + Integer.toString(bm[var0 + E]);
            var3 = var2 + 22;
            String var10 = var10000;
            a[9][var3] = var10;
            a[9][var4][8] = 1;
            a[9][var4][9] = 1;
            b(9, var2 + 12, true);
         } else {
            a(9, var3, false);
            a(9, var2 + 22, false);
            a[9][var4][8] = 0;
            a[9][var4][9] = 1;
            b(9, var2 + 12, true);
         }

         a(9, var2 + 15, d[var0 + E][3] != -1);
         a(9, var0 + 154, d[var0 + E][3] != -1);
         a[9][var2 + 15][5] = 28;
         a[9][var2 + 15][6] = 1;
         a(9, var2 + 14, d[var0 + E][4] != -1);
         a(9, var0 + 158, d[var0 + E][4] != -1);
         if (f(9, var2 + 14)) {
            g var14 = g.a(1);
            a[9][var2 + 14][5] = (short)var14.a[d[var0 + E][4]][3];
            a[9][var2 + 14][6] = (short)var14.a[d[var0 + E][4]][4];
            if (a[9][var2 + 14][5] < 1000) {
               w(a[9][var2 + 14][5]);
            }
         }

         var1 = var0 + E;
         var2 = d[var1][1] / d[25] / 3;
         a(cG[0] + var1, var2, 29, false);
         a(cG[0] + var1, var2, 29);
         a(cG[0] + var1, var2, 42);
         e(9, var5, d[var0 + E][1]);
      } else {
         a(9, var2 + 12, false);
         a(9, var2 + 17, false);
         a(9, var2 + 18, false);
         a(9, var2 + 19, false);
         a(9, var2 + 20, false);
         a(9, var4, false);
         a(9, var2 + 22, false);
         a(9, var2 + 14, false);
         a(9, var2 + 15, false);
         a(9, var0 + 158, false);
         a(9, var0 + 154, false);
         a(9, var3, false);
         a(9, var2 + 22, false);
         a[9][var4][8] = 0;
         a[9][var4][9] = 1;
      }
   }

   private static void aS(int var0) {
      if (b(5) + e.a(2) + 1 > b()) {
         b(471, 477);
      } else {
         if (a(0, d[var0 + E][3], 1)) {
            d(15 + var0 * 11, d[var0 + E][3], true);
            X(47);
            d[var0 + E][3] = -1;
            a[var0 + E][5] = System.currentTimeMillis() / 1000L;
            a(cG[0] + var0 + E, 1, 37, false);
            g var1 = g.a(24);
            int var2 = d[var0 + E][1] / d[25];
            j(var0 + E, var1.a[var2][5]);
         }
      }
   }

   private static void aT(int var0) {
      if (b(5) + e.a(2) + 1 > b()) {
         b(471, 477);
      } else {
         if (a(0, d[var0 + E][4], 1)) {
            d(14 + var0 * 11, d[var0 + E][4], false);
            d(14 + var0 * 11, d[var0 + E][4], false);
            X(47);
            d[var0 + E][4] = -1;
            a(var0 = cG[0] + ew, 1, 30, false);
            a(var0, 1, 31);
         }
      }
   }

   private static void d(int var0, int var1, boolean var2) {
      g var3 = g.a(1);
      eu = var0;
      a[9][67][5] = (short)var3.a[var1][3];
      a[9][67][6] = (short)var3.a[var1][4];
      a(9, 67, true);
      a(9, var0, false);
      T(0);
      bj = true;
      et = 0;
      a[9][67][2] = a[9][eu][2];
      a[9][67][3] = a[9][eu][3];
      if (var2) {
         a(9, var0, true);
         a[9][var0][5] = 1013;
         a[9][var0][6] = 0;
         c(9, var0, 1, 1);
      }
   }

   private static void aU(int var0) {
      if (e() < bm[var0 + E]) {
         X(55);
      } else {
         X(60);
         a(37);
         ew = var0 + E;
      }
   }

   private static boolean P(int var0) {
      if (var0 == 0) {
         K(17);
         ig();
         int[] var1 = new int[]{3, 5, 8};
         dR = 0;
         bb = false;
         bc = false;
         a(0, var1, 3, 1);
         fn = 0;
         f.j();
         if (a[ew][2] == 0L) {
            int var13 = ew;
            if (e[var13][0] == 0) {
               ae(ew);
            }
         }

         P(17);
         ii();
      }

      if (var0 == 1) {
         ih();
         O(17);
         fn = 0;
      }

      if (var0 == 5) {
         W(17);
      }

      if (var0 == 2) {
         ii();
         y(0);
         b(17, 10, 11, fn, 3);
      }

      if (var0 == 3) {
         M(17);
         String var2;
         a((var2 = f.b(157)) == null ? "" : var2, 17, 2, 0, 0);
         String var3;
         a((var3 = f.b(bl[ew])) == null ? "" : var3, 17, 14, 0, 0);
         var0 = ew;
         if (e[var0][0] != 0) {
            if (dR == 0) {
               String var5;
               a((var5 = f.b(852)) == null ? "" : var5, 17, 55, 0, 0);
            }

            String var6;
            b((var6 = f.b(746 + ew)) == null ? "" : var6, 17, 20, 0, 0);
            a(Integer.toString(ey), 17, 21, 0, 0);
            a(Integer.toString(ez), 17, 23, 0, 0);
            if (e[ew][0] != 0) {
               String var7;
               a(((var7 = f.b(eA)) == null ? "" : var7) + " x" + e[ew][2], 17, 27, 0, 0);
               a(Integer.toString(eB) + "/" + e[ew][2], 17, 28, 0, 0);
               if (a[17][30][10] >= 1) {
                  a(Integer.toString(eC), 17, 31, 0, 0);
               }
            }

            if (e[ew][3] != 0) {
               String var8;
               a(((var8 = f.b(eD)) == null ? "" : var8) + " x" + e[ew][5], 17, 33, 0, 0);
               a(Integer.toString(eE) + "/" + e[ew][5], 17, 34, 0, 0);
               if (a[17][36][10] >= 1) {
                  a(Integer.toString(eF), 17, 37, 0, 0);
               }
            }

            String var9;
            a((var9 = f.b(173)) == null ? "" : var9, 17, 49, 0, 0);
            String var10;
            a((var10 = f.b(161)) == null ? "" : var10, 17, 50, 0, 0);
         } else {
            String var11;
            b((var11 = f.b(ex)) == null ? "" : var11, 17, 20, 0, 0);
            String var12;
            b((var12 = f.b(159)) == null ? "" : var12, 17, 45, 0, 0);
         }
      }

      return false;
   }

   private static void ig() {
      eA = 0;
      eB = 0;
      eC = 0;
      eD = 0;
      eE = 0;
      eF = 0;
      int var0 = ew;
      if (e[var0][0] != 0) {
         g var1;
         ey = (var1 = g.a(18)).a[e() - 1][17];
         ez = var1.a[e() - 1][16];
         a(17, 22, true);
         a(17, 24, true);
         if (e[ew][0] != 0) {
            eA = f(e[ew][0], e[ew][1]);
            eB = g(e[ew][0], e[ew][1]);
            var0 = e[ew][2];
            if (eB >= var0) {
               a(17, 29, true);
               a(17, 30, false);
               b(17, 30, false);
               a(17, 32, false);
               eC = 0;
            } else {
               a(17, 29, false);
               a(17, 30, true);
               b(17, 30, true);
               a(17, 32, true);
               eC = (var0 - eB) * h(e[ew][0], e[ew][1]);
            }
         } else {
            a(17, 29, false);
            a(17, 30, false);
            b(17, 30, false);
            a(17, 32, false);
         }

         if (e[ew][3] != 0) {
            eD = f(e[ew][3], e[ew][4]);
            eE = g(e[ew][3], e[ew][4]);
            var0 = e[ew][5];
            if (eE >= var0) {
               a(17, 35, true);
               a(17, 36, false);
               b(17, 36, false);
               a(17, 38, false);
               eF = 0;
            } else {
               a(17, 35, false);
               a(17, 36, true);
               b(17, 36, true);
               a(17, 38, true);
               eF = (var0 - eE) * h(e[ew][3], e[ew][4]);
            }
         } else {
            a(17, 35, false);
            a(17, 36, false);
            b(17, 36, false);
            a(17, 38, false);
         }

         a(17, 47, true);
         b(17, 47, true);
         a(17, 48, true);
         if (eB >= e[ew][2] && eE >= e[ew][5]) {
            a[17][48][6] = 48;
            b(17, 48, true);
         } else {
            a[17][48][6] = 49;
            b(17, 48, false);
         }
      } else {
         a(17, 22, false);
         a(17, 24, false);
         a(17, 29, false);
         a(17, 30, false);
         b(17, 30, false);
         a(17, 32, false);
         a(17, 35, false);
         a(17, 36, false);
         b(17, 36, false);
         a(17, 38, false);
         a(17, 47, false);
         a(17, 48, false);
      }

      if (g(2) && ew == 0) {
         a(17, 62, true);
         b(17, 3, false);
         b(17, 8, false);
      } else {
         a(17, 62, false);
         b(17, 3, true);
         b(17, 8, true);
      }

      a[17][25][5] = (short)bn[ew];
      a[17][25][6] = (short)bo[ew];
      ih();
      P(17);
   }

   private static void ih() {
      e(17, 15, d[ew][1]);
      int var0 = d[ew][1] / d[25] / 3 < 0 ? 0 : (d[ew][1] / d[25] / 3 > 4 ? 4 : d[ew][1] / d[25] / 3);
      ex = 4 - var0 + 696 + 5 * ew;
   }

   private static int f(int var0, int var1) {
      int var2 = 0;
      switch (var0) {
         case 1:
            var2 = g.a(1).a[var1][2];
            break;
         case 2:
            var2 = g.a(4).a[var1][2];
            break;
         case 3:
            var2 = g.a(17).a[var1][2];
      }

      return var2;
   }

   private static int g(int var0, int var1) {
      int var2 = 0;
      switch (var0) {
         case 1:
            var2 = e(0, var1);
            break;
         case 2:
            var2 = e(2, var1);
            break;
         case 3:
            var2 = m(be[var1]);
      }

      return var2;
   }

   private static int h(int var0, int var1) {
      int var2 = 0;
      switch (var0) {
         case 1:
            var2 = g.a(1).a[var1][15];
         default:
            return var2;
      }
   }

   private static int o(int var0) {
      int var1 = e[ew][var0 * 3];
      int var2 = e[ew][var0 * 3 + 1];
      switch (var1) {
         case 1:
            int var4 = e(0, var2);
            a(0, var2, e[ew][var0 * 3 + 2] - var4);
            break;
         case 2:
            int var3 = e(2, var2);
            a(2, var2, e[ew][var0 * 3 + 2] - var3);
            break;
         case 3:
            be[var2] = l(m(be[var2]) + 1);
      }

      ig();
      return var1;
   }

   private static void aV(int var0) {
      int var1 = e[ew][var0 * 3 + 1];
      a(0, var1, -e[ew][var0 * 3 + 2]);
   }

   private static void ii() {
      long var0 = System.currentTimeMillis() / 1000L;
      long var2;
      if ((var2 = a[ew][4] + 86400L - var0) <= 0L) {
         a[17][3][6] = 1;
         a(17, 4, false);
         d(17, 3, 1);
         a[ew][4] = 0L;
      } else {
         a[17][3][6] = 4;
         String var6 = c((int)(var2 < 0L ? 0L : (var2 > 2147483647L ? 2147483647L : var2)));
         a[17][4] = var6;
         a(17, 4, true);
         d(17, 3, 0);
      }

      var2 = a[ew][0] + 86400L - var0;
      if (d[ew][5] > 0) {
         a(17, 7, false);
         a(17, 6, true);
      } else {
         a(17, 6, false);
         String var4 = c((int)(var2 < 0L ? 0L : (var2 > 2147483647L ? 2147483647L : var2)));
         a[17][7] = var4;
         a(17, 7, true);
         if (var2 <= 0L) {
            d[ew][5] = 5;
         }
      }

      if ((var2 = a[ew][1] + 86400L - var0) <= 0L) {
         a[17][8][6] = 0;
         a(17, 9, false);
         d(17, 8, 1);
      } else {
         a[17][8][6] = 3;
         String var5 = c((int)(var2 < 0L ? 0L : (var2 > 2147483647L ? 2147483647L : var2)));
         a[17][9] = var5;
         a(17, 9, true);
         d(17, 8, 0);
      }
   }

   private static int p(int var0) {
      for (int var2 = 0; var2 < t.length; var2++) {
         if (t[var2][1] == var0) {
            int var1 = t[var2][0];
            if (f.c.equals("/" + var1)) {
               return t[var2][2];
            }
         }
      }

      return -1;
   }

   private static String f(int var0) {
      String var1;
      var1 = (var1 = f.b(eN == 3 ? 797 : (eN == 4 ? 800 : (eN == 10 ? 853 : (eN == 11 ? 858 : (eN == 2 ? 798 : (eN == 6 ? 867 : (eN != 0 ? 799 : 796))))))))
            == null
         ? ""
         : var1;
      if (eN == 3) {
         var1 = f.a(var1, "%num", g[var0]);
      } else {
         if (eN != 10) {
            if (eN == 11) {
               var1 = f.a(var1, "%amount", f.a(d[var0], L, " "));
            } else {
               if (eN == 6) {
                  int var2;
                  if (bI[var0] == -1) {
                     var2 = f.a(var0, "Cash");
                     bI[var0] = var2;
                  } else {
                     var2 = bI[var0];
                  }

                  if (var2 == 1) {
                     String var3;
                     var1 = f.a(var1, "%price", a(g[var0])) + " " + ((var3 = f.b(865)) == null ? "" : var3);
                  } else {
                     String var4;
                     var1 = f.a(var1, "%price", a(g[var0])) + " " + ((var4 = f.b(785)) == null ? "" : var4);
                  }

                  return var1;
               }

               if (eN == 0) {
                  return var1;
               }

               if (eN == 2) {
                  var1 = f.a(var1, "%num", "1");
               }
            }
         }

         var1 = f.a(var1, "%price", a(g[var0]));
      }

      return var1;
   }

   private static boolean Q(int var0) {
      if (var0 == 0) {
         a(27, 7, false);
         b(27, 7, false);
         a(27, 9, false);
         b(27, 9, false);
         a(27, 11, false);
         a(27, 12, false);
         bl = false;
         boolean var1 = true;
         boolean var2 = false;
         boolean var3 = false;
         if (o() == 42) {
            r();
         } else {
            switch (eG) {
               case 0:
               case 19:
               default:
                  String var54;
                  t = (var54 = f.b(446)) == null ? "" : var54;
                  break;
               case 1:
                  String var49;
                  t = (var49 = f.b(74)) == null ? "" : var49;
                  var3 = true;
                  break;
               case 2:
                  String var48;
                  t = (var48 = f.b(777)) == null ? "" : var48;
                  var3 = true;
                  break;
               case 3:
                  t = f(0);
                  var3 = true;
                  bl = true;
                  cA[0] = -1;
                  break;
               case 4:
                  t = f(1);
                  var3 = true;
                  bl = true;
                  cA[0] = -1;
                  break;
               case 5:
                  t = f(2);
                  var3 = true;
                  bl = true;
                  cA[0] = -1;
                  break;
               case 6:
                  t = f(3);
                  var3 = true;
                  bl = true;
                  cA[0] = -1;
                  break;
               case 7:
                  t = f(4);
                  var3 = true;
                  bl = true;
                  cA[0] = -1;
                  break;
               case 8:
                  t = f(5);
                  var3 = true;
                  bl = true;
                  cA[0] = -1;
                  break;
               case 9:
                  String var11;
                  t = (var11 = f.b(772)) == null ? "" : var11;
                  var1 = false;
                  var2 = true;
                  var3 = true;
                  break;
               case 10:
                  String var10;
                  t = (var10 = f.b(773)) == null ? "" : var10;
                  var1 = false;
                  var2 = true;
                  var3 = true;
                  break;
               case 11:
                  String var47;
                  t = (var47 = f.b(795)) == null ? "" : var47;
                  var3 = true;
                  break;
               case 12:
                  String var46;
                  t = (var46 = f.b(444)) == null ? "" : var46;
                  var3 = true;
                  break;
               case 13:
                  if (o() == 4) {
                     String var4;
                     t = (var4 = f.b(514)) == null ? "" : var4;
                  } else {
                     var1 = false;
                     var2 = true;
                     var3 = true;
                  }
                  break;
               case 14:
                  String var45;
                  t = (var45 = f.b(513)) == null ? "" : var45;
                  var3 = true;
                  break;
               case 15:
                  String var9;
                  t = f.a((var9 = f.b(508)) == null ? "" : var9, "%d", "" + 0);
                  var1 = false;
                  var2 = true;
                  var3 = true;
                  break;
               case 16:
                  String var8;
                  t = f.a((var8 = f.b(507)) == null ? "" : var8, "%d", "" + 0);
                  var1 = false;
                  var2 = true;
                  var3 = true;
                  break;
               case 17:
                  String var7;
                  t = (var7 = f.b(509)) == null ? "" : var7;
                  var1 = false;
                  var2 = true;
                  var3 = true;
                  break;
               case 18:
                  String var6;
                  t = (var6 = f.b(510)) == null ? "" : var6;
                  var1 = false;
                  var2 = true;
                  var3 = true;
                  break;
               case 20:
                  String var5;
                  t = (var5 = f.b(802)) == null ? "" : var5;
                  var1 = true;
                  var2 = false;
                  var3 = true;
                  break;
               case 21:
                  String var44;
                  t = (var44 = f.b(850)) == null ? "" : var44;
                  var3 = true;
            }

            K(27);
            if (eG == 21) {
               a(27, 0, true);
               a(27, 1, true);
            }

            a(27, 2, var3);
            if (bl) {
               String var51 = t;
               a[27][6] = var51;
               a(27, 3, false);
               a(27, 4, false);
               a(27, 5, true);
               a(27, 6, true);
               a(27, 17, true);
               b(27, 17, true);
               if (eN != 11) {
                  a(27, 18, true);
                  String var52;
                  String var53 = (var52 = f.b(863)) == null ? "" : var52;
                  a[27][18] = var53;
               }

               if (eN == 4) {
                  a(27, 13, true);
                  b(27, 13, true);
                  a(27, 14, true);
                  String var16;
                  String var17 = (var16 = f.b(838)) == null ? "" : var16;
                  a[27][14] = var17;
                  var1 = false;
                  var2 = false;
               } else if (eN == 2 || eN == 5) {
                  a(27, 13, true);
                  b(27, 13, true);
                  a(27, 14, true);
                  String var12;
                  String var13 = (var12 = f.b(127)) == null ? "" : var12;
                  a[27][14] = var13;
                  a(27, 15, true);
                  b(27, 15, true);
                  a(27, 16, true);
                  String var14;
                  String var15 = (var14 = f.b(767)) == null ? "" : var14;
                  a[27][16] = var15;
                  var1 = false;
                  var2 = false;
               }
            } else {
               String var50 = t;
               a[27][4] = var50;
               a(27, 5, false);
               a(27, 6, false);
               a(27, 3, true);
               a(27, 4, true);
               a(27, 17, false);
               b(27, 17, false);
               a(27, 13, false);
               b(27, 13, true);
               a(27, 14, false);
               a(27, 15, false);
               b(27, 15, false);
               a(27, 16, false);
               a(27, 18, false);
            }

            if (var1) {
               switch (eG) {
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                     if (eN == 11) {
                        String var22;
                        String var23 = (var22 = f.b(860)) == null ? "" : var22;
                        a[27][8] = var23;
                        String var24;
                        String var25 = (var24 = f.b(859)) == null ? "" : var24;
                        a[27][10] = var25;
                     } else if (eN == 10) {
                        String var26;
                        String var27 = (var26 = f.b(855)) == null ? "" : var26;
                        a[27][8] = var27;
                        String var28;
                        String var29 = (var28 = f.b(854)) == null ? "" : var28;
                        a[27][10] = var29;
                     } else if (eN == 6) {
                        String var30;
                        String var31 = (var30 = f.b(857)) == null ? "" : var30;
                        a[27][8] = var31;
                        String var32;
                        String var33 = (var32 = f.b(856)) == null ? "" : var32;
                        a[27][10] = var33;
                     } else {
                        String var34;
                        String var35 = (var34 = f.b(862)) == null ? "" : var34;
                        a[27][8] = var35;
                        String var36;
                        String var37 = (var36 = f.b(861)) == null ? "" : var36;
                        a[27][10] = var37;
                     }
                     break;
                  default:
                     String var18;
                     String var19 = (var18 = f.b(31)) == null ? "" : var18;
                     a[27][8] = var19;
                     String var20;
                     String var21 = (var20 = f.b(30)) == null ? "" : var20;
                     a[27][10] = var21;
               }

               a(27, 7, true);
               b(27, 7, true);
               a(27, 8, true);
               a(27, 9, true);
               b(27, 9, true);
               a(27, 10, true);
               a(27, 11, false);
               b(27, 11, false);
               a(27, 12, false);
               if (eG == 11) {
                  fn = 0;
               }
            } else if (var2) {
               String var38;
               String var39 = (var38 = f.b(45)) == null ? "" : var38;
               a[27][12] = var39;
               a(27, 7, false);
               b(27, 7, false);
               a(27, 8, false);
               a(27, 9, false);
               b(27, 9, false);
               a(27, 10, false);
               a(27, 11, true);
               b(27, 11, true);
               a(27, 12, true);
            }
         }
      }

      if (var0 == 1) {
         P(27);
      }

      if (var0 == 2) {
         if (f(27, 9) && cA[0] != 7) {
            int[] var40 = new int[]{7, 9};
            a(0, var40, 2, 1);
            fn = 1;
            if (eG == 11) {
               fn = 0;
            }
         }

         if (f(27, 13) && cA[0] != 13) {
            if (!f(27, 15)) {
               int[] var41 = new int[]{13};
               a(0, var41, 2, 0);
            } else {
               int[] var42 = new int[]{13, 15};
               a(0, var42, 2, 0);
            }

            fn = 0;
         }

         int var43 = f.h();
         if (f(27, 9)) {
            s();
            b(27, 21, 22, -1, 2);
            b(27, 19, 20, fn, 2);
         } else {
            b(27, 19, 20, -1, 2);
            if (f(27, 13)) {
               s();
               b(27, 21, 22, fn, 2);
            } else {
               b(27, 21, 22, -1, 2);
            }
         }

         if (var43 == 5 || var43 == 11) {
            if (f(27, 11)) {
               gD();
            } else {
               Q(bk);
            }
         }

         if (f(27, 13)) {
            a(27, 17, true);
         } else {
            a(27, 17, false);
         }

         if (var43 == 19 && f(27, 17)) {
            Q(1769489);
         }
      }

      if (var0 == 3) {
         M(27);
      }

      if (var0 == 6 && f(27, 9)) {
         if (eG == 1) {
            if (fn == 1) {
               fn = 0;
            }
         } else if (eG == 21) {
            fn = 1;
         }
      }

      return false;
   }

   private static void ij() {
      t = "";
      switch (eG) {
         case 1:
            f.S = -1;
            return;
         case 2:
            ag = 1;
            f.p();
            dr();
            dn();
            return;
         case 3:
            ag = 1;
            f.a(bH[0 + E], "Cash");
            A = false;
            return;
         case 4:
            ag = 1;
            f.a(bH[1 + E], "Cash");
            A = false;
            return;
         case 5:
            ag = 1;
            f.a(bH[2], "Cash");
            A = false;
            return;
         case 6:
            ag = 1;
            f.a(bH[3], "Cash");
            A = false;
            return;
         case 7:
            ag = 1;
            f.a(bH[4], "Cash");
            A = false;
            return;
         case 8:
            ag = 1;
            f.a(bH[5], "Cash");
            A = false;
            return;
         case 11:
            s(eH);
            aq = 2;
            return;
         case 12:
            a = null;
            c = null;
            aI = false;
            dj = 0;
            g = 0;
            A = 3;
            cK = 0;
            cL = 0;
            az = null;
            aA = null;
            c = null;
            a = null;
            aB = null;
            aC = null;
            aD = null;
            i = null;
            aE = null;
            e = null;
            aG = false;
            cM = 0;
            cN = 0;
            aF = null;
            aG = null;
            aH = null;
            aI = null;
            aJ = null;
            aK = null;
            aL = null;
            j = null;
            aH = true;
            cO = 0;
            cF = 3;
            cH = 0;
            at = null;
            au = null;
            av = null;
            b = null;
            aw = null;
            ax = null;
            h = null;
            ay = null;
            d = null;
            aE = false;
            ar = null;
            as = null;
            az = false;
            cf = 0;
            aD = false;
            cC = 0;
            e = 0;
            aK = false;
            dt = 0;
            du = 0;
            p = 0L;
            q = 0L;
            i = "";
            dv = 0;
            aP = false;
            dw = 0;
            dx = 0;
            dy = 0;
            j = "";
            k = "";
            aQ = false;
            l = "";
            iy();
            r = 0;
            aU = 0;
            aV = 0;
            aW = 0;
            aX = 0;
            h = b(0L);
            i = b(0L);
            aY = l(0);
            aZ = l(0);
            ba = l(0);
            bb = l(0);
            bc = l(0);
            bd = l(0);
            ar = false;
            be = 0;
            bf = 0;
            as = false;
            at = false;
            j = 0L;
            r = 0L;
            el = 0;
            a = 0;
            em = 0;
            bf = false;
            B = 0;
            C = 0;

            for (int var0 = 0; var0 < 60; var0++) {
               be[var0] = l(0);
            }

            for (int var2 = 0; var2 < 4; var2++) {
               bh[var2] = 0;
            }

            ej = 0;
            ek = 0;
            bf = false;
            h = null;
            s = 0;
            g = false;
            gP();
            t = 0L;
            bG = 0;
            ah(5000);
            ai(50);
            s(false);
            h = e;
            t();
            q(17);
            c(true);
            bg = true;
            s = true;

            for (int var3 = 0; var3 <= 10; var3++) {
               try {
                  RecordStore.deleteRecordStore("save_farm" + var3);
               } catch (RecordStoreException var1) {
               }
            }

            return;
         case 13:
            ag = 1;
            return;
         case 14:
            return;
         case 20:
            f.q();
            im();
            dk();
            df();
            do();
            dp();
            dr();
            dv();
            dt();
            dg();
            x = false;
            di();
         case 0:
         case 9:
         case 10:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         default:
            ag = 1;
            return;
         case 21:
            X = true;
            W = true;
            q(17);
      }
   }

   private static void ik() {
      t = "";
      switch (eG) {
         case 0:
         case 9:
         case 10:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         default:
            break;
         case 1:
            ag = 1;
            return;
         case 2:
            ag = 1;
            dp();
            dq();
            return;
         case 3:
            i = true;
            break;
         case 4:
            i = true;
            break;
         case 5:
            i = true;
            break;
         case 6:
            i = true;
            break;
         case 7:
            i = true;
            break;
         case 8:
            i = true;
            break;
         case 11:
            ag = 1;
            return;
         case 12:
            j(0, bd.length, 5);
            break;
         case 13:
            ag = 1;
            return;
         case 14:
            ag = 1;
            return;
         case 20:
            ag = 1;
            return;
         case 21:
            X = false;
            W = false;
            q(17);
            return;
      }

      ag = 1;
   }

   private static void aW(int var0) {
      eG = var0;
      a(42);
   }

   private static boolean R(int var0) {
      if (var0 == 0) {
         gM();
         k.a("");
      }

      if (var0 == 2) {
         int var1 = f.h();
         byte var2 = 0;
         switch (var1) {
            case 1:
            case 8:
               var2 = 21;
               break;
            case 2:
            case 14:
               var2 = 32;
               break;
            case 3:
            case 10:
               var2 = 23;
               break;
            case 4:
            case 12:
               var2 = 24;
               break;
            case 5:
            case 11:
               var2 = 25;
               GloftGF2M.a.destroyApp(false);
            case 6:
            case 7:
            case 9:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
               break;
            case 19:
               var2 = 26;
         }

         if (k.a(var2)) {
            ag = 1;
         }
      }

      if (var0 == 3) {
         k.a(f.a);
      }

      if (var0 == 6) {
         k.a(false);
      }

      if (var0 == 7) {
         k.a(true);
      }

      return false;
   }

   private static void il() {
      u = f.a();
      short var0 = a[8][158][5];
      short var1 = a[8][158][6];
      short var2 = a[8][158][7];
      short[] var5 = c[j(var2)].a(u, var0, false);
      d var10000 = c[j(var2)];
      short var4 = var5[0];
      d var3 = var10000;
      if ((eR = var4 * var3.e() + (var4 - 1) * var3.c() - var1 + 24) < 0) {
         eR = 0;
      }

      eQ = 0;
      var10000 = c[j(var2)];
      var1 = var5[0];
      d var6 = var10000;
      eQ = (eR = var1 * var6.e() + (var1 - 1) * var6.c()) / 2;
   }

   private static boolean S(int var0) {
      if (var0 == 0) {
         E = 0;
         if (!h && D == 19) {
            String var1;
            var1 = (var1 = f.b(864)) == null ? "" : var1;
            String var2 = a;
            int var3 = 0;

            for (int var4 = 0; var4 < var2.length(); var4++) {
               char var5;
               if (!Character.isDigit(var5 = var2.charAt(var4))) {
                  if (var3 != 0) {
                     break;
                  }
               } else {
                  var3 = var3 * 10 + Character.digit(var5, 10);
               }
            }

            int var54 = var3;
            var1 = f.a(var1, "%d", f.a(var54, L, " "));
            a((var2 = f.b(380)) == null ? "" : var2, var1, 7);
            D = -1;
            i = false;
         }

         bn = false;
         K(8);
         if (h) {
            if (aq == 2) {
               aq = 1;
            }

            for (int var8 = 0; var8 < 6; var8++) {
               bI[var8] = -1;
            }
         } else {
            a(8, 13, false);
            b(8, 11, false);
            a(8, 12, false);
            a(8, 10, false);
         }

         if (e() < 3) {
            i(473, 474, 7);
            r(19);
         }

         g var9 = g.a(30);

         for (int var56 = 0; var56 < 6; var56++) {
            bG[var56] = var9.a[var56][1];
            bA[var56] = var9.a[var56][2];
         }

         y(false);
         dv();
         String var10;
         String var11 = (var10 = f.b(766)) == null ? "" : var10;
         a[8][1] = var11;
         String var12 = f.a(d(), L, " ");
         a[8][7] = var12;
         String var13 = f.a(c(), L, " ");
         a[8][4] = var13;
         String var14 = "0";
         a[8][187] = var14;
         String var15 = "1";
         a[8][169] = var15;
         String var16 = "2";
         a[8][171] = var16;
         String var17 = "3";
         a[8][173] = var17;
         String var18 = "4";
         a[8][175] = var18;
         String var19 = "5";
         a[8][177] = var19;
         String var20 = "6";
         a[8][179] = var20;
         String var21 = "7";
         a[8][181] = var21;
         String var22 = "8";
         a[8][183] = var22;
         String var23 = "9";
         a[8][185] = var23;
         String var24 = "#";
         a[8][189] = var24;
         String var25 = "*";
         a[8][191] = var25;
         String var26;
         String var27 = (var26 = f.b(776)) == null ? "" : var26;
         a[8][193] = var27;
         String var28;
         String var29 = (var28 = f.b(775)) == null ? "" : var28;
         a[8][195] = var29;
         String var30;
         String var31 = (var30 = f.b(70)) == null ? "" : var30;
         a[8][197] = var31;
         String var32;
         String var33 = (var32 = f.b(851)) == null ? "" : var32;
         a[8][200] = var33;
         String var34;
         String var35 = (var34 = f.b(774)) == null ? "" : var34;
         a[8][199] = var35;
         String var36;
         String var37 = (var36 = f.b(768)) == null ? "" : var36;
         a[8][165] = var37;
         String var38;
         String var39 = (var38 = f.b(866)) == null ? "" : var38;
         a[8][167] = var39;
         String var40;
         String var41 = (var40 = f.b(813)) == null ? "" : var40;
         a[8][163] = var41;
         String var42;
         String var43 = (var42 = f.b(45)) == null ? "" : var42;
         a[8][203] = var43;
         String var44;
         String var45 = (var44 = f.b(809)) == null ? "" : var44;
         a[8][201] = var45;
         String var46;
         String var47 = (var46 = f.b(807)) == null ? "" : var46;
         a[8][214] = var47;
         String var48;
         String var49 = (var48 = f.b(788)) == null ? "" : var48;
         a[8][18] = var49;
         a(8, 18, false);
         eO = -1;
         if (f.i()) {
            i = true;
         }
      }

      if (var0 == 1) {
         E = 0;
         if (f.i()) {
            i = true;
         }

         if (!i) {
            dk();
            df();
            do();
            dp();
            dr();
            dv();
            dt();
            dh();
            E = false;
            dl();
         } else if (f.i()) {
            dk();
            df();
            do();
            dp();
            dr();
            dv();
            dt();
            dm();
            dg();
            ar = 3;
            as = 3;
         } else {
            dk();
            df();
            do();
            dp();
            dr();
            dv();
            dt();
            dm();
            dg();
            h = true;
         }

         if (i) {
            q(eL, 2);
            E = 0;
            fu = 0;
            ef = 0;
         } else {
            q(eM, 2);
            E = 0;
            fu = 0;
            ef = 1;
         }

         w = false;
         x = false;
         y = false;
         B = false;
         C = false;
         D = i;
         a(8, 208, true);
         b(8, 208, true);
         P(8);
         if (h && D == 19) {
            String var51;
            a((var51 = f.b(380)) == null ? "" : var51, a, 7);
            D = -1;
            i = true;
         } else if (D == 18) {
            String var50;
            a((var50 = f.b(378)) == null ? "" : var50, a, 7);
            D = -1;
            i = false;
         }

         if (bq) {
            x = true;
            E = true;
            h = true;
            dm();
            dg();
            h = true;
            w = false;
            dw();
            bq = false;
         }
      }

      if (var0 == 2) {
         if (ft != E) {
            ft = E;
            if (E) {
               E = false;
               dl();
            } else if (x) {
               x = false;
               di();
            }

            is();
         }

         for (int var57 = 0; var57 < 6; var57++) {
            if (bB[var57] > 0) {
               if (bD[var57] <= 0) {
                  if (bC[var57] >= bB[var57]) {
                     bC[var57] = 0;
                     bD[var57] = 1000;
                     bF[var57] = 0;
                  } else {
                     bF[var57] = bF[var57] + f.V;
                     int var52 = bF[var57] * bB[var57] / bE[var57];
                     bC[var57] = var52 < 0 ? 0 : (var52 > bB[var57] ? bB[var57] : var52);
                     if (bC[var57] >= bB[var57]) {
                        bD[var57] = 1000;
                        bF[var57] = 0;
                     }
                  }
               } else {
                  bD[var57] = bD[var57] - f.V;
               }
            }
         }

         if (h) {
            in();
         }
      }

      if (var0 == 8 && w) {
         if (ba) {
            short var53 = a[8][158][2];
            short var58 = a[8][158][3];
            short var59 = a[8][158][5];
            short var60 = a[8][158][6];
            if (a(-1, -1, var53, var58, var59, var60)) {
               if (!bp) {
                  eS = -1;
               }

               bp = true;
               if ((eQ = eQ + (-1 - eS)) > 0) {
                  eQ = 0;
               } else if (eQ < -eR) {
                  eQ = -eR;
               }

               eS = -1;
            }
         }

         if (-1 < a[8][158][3] || -1 > a[8][158][3] + a[8][158][6]) {
            bp = false;
         }
      }

      if (var0 == 3) {
         io();
      }

      if (var0 == 5) {
         eU = 0;
         E = 0;
         if (eK == 2) {
            m = false;
         }
      }

      return false;
   }

   private static String a(String var0) {
      if (var0 == null) {
         return "";
      }

      int var1;
      if ((var1 = var0.indexOf(43)) >= 0) {
         return var0.substring(0, var1).trim();
      }

      String var2;
      String var3;
      return var0.toLowerCase().startsWith("bs ") && (var1 = (var2 = var0.substring(3).trim()).indexOf(32)) >= 0
         ? var0.substring(0, 3) + var2.substring(0, var1) + " " + ((var3 = f.b(770)) == null ? "" : var3)
         : var0.trim();
   }

   private static String g(int var0) {
      String var1 = h[var0];
      String var2 = "SMS";
      if (var1.toLowerCase().indexOf(var2.toLowerCase()) >= 0) {
         String var3;
         var1 = f.a(var1, var2, (var3 = f.b(792)) == null ? "" : var3);
      } else {
         StringBuffer var10000 = new StringBuffer().append(a(var1));
         var1 = "Cash";
         var0 = var0;
         String var10001;
         if (eN != 2 && eN != 5 && eN != 4) {
            if (eN == 6) {
               int var13;
               if (bI[var0] == -1) {
                  var13 = f.a(var0, var1);
                  bI[var0] = var13;
               } else {
                  var13 = bI[var0];
               }

               String var8;
               String var9;
               var10001 = var13 == 1 ? " + 2 " + ((var8 = f.b(792)) == null ? "" : var8) : " + 1 " + ((var9 = f.b(792)) == null ? "" : var9);
            } else {
               String var7;
               var10001 = eN != 9 && eN != 1 ? "" : " " + ((var7 = f.b(771)) == null ? "" : var7);
            }
         } else {
            String var5;
            String var6;
            var10001 = L != 1 && eN != 4 ? " " + ((var5 = f.b(785)) == null ? "" : var5) : " " + ((var6 = f.b(784)) == null ? "" : var6);
         }

         var1 = var10000.append(var10001).toString();
      }

      if (var1.trim().equals("")) {
         String var10;
         var1 = (var10 = f.b(127)) == null ? "" : var10;
      }

      return var1;
   }

   private static void y(boolean var0) {
      if (eI > 0) {
         im();
      } else {
         if (var0) {
            eG = 9;
            a(42);
         }
      }
   }

   private static void im() {
      for (int var0 = 0; var0 < 5; var0++) {
         bJ[var0] = -1;
      }

      eI = 0;
   }

   private static void aX(int var0) {
      if (eI < 5) {
         bJ[eI] = var0;
         eI++;
      }
   }

   private static void in() {
      int var0 = eJ;
      if (!bn) {
         eJ = f.k();
      }

      if (var0 != eJ) {
         switch (eJ) {
            case 3:
            case 11:
               bn = true;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 6:
            case 10:
               il();
         }
      }

      if (D) {
         switch (eJ) {
            case 0:
               if (!C) {
                  f.d(f.a(L));
                  return;
               }
               break;
            case 1:
            case 9:
               return;
            case 2:
            case 8:
               return;
            case 3:
            case 11:
               return;
            case 4:
            case 5:
            default:
               break;
            case 6:
            case 10:
               if (!B && !bm) {
                  eL = 0;
                  eN = f.n();

                  for (int var1 = 0; var1 < f.a("Cash"); var1++) {
                     h[var1] = f.a(var1, "Cash");
                     String var5 = g(var1);
                     long var2 = f.a(200L, var1, "Cash");
                     if (var5 != null && !var5.trim().equals("")) {
                        bH[var1] = var1;
                        g[var1] = var5;
                        d[var1] = var2;
                     } else {
                        g[var1] = null;
                        bH[var1] = -1;
                     }

                     eL++;
                  }

                  y(false);
                  bm = true;
                  eN = f.n();
                  bo = true;
                  x = false;
                  di();
                  f.a(200L);
                  return;
               }

               if (bm) {
                  return;
               }
               break;
            case 7:
               h((int)f.a(200L));
               String var4 = Integer.toString(d());
               a[8][7] = var4;
               f.q();
               ds();
               break;
            case 12:
               return;
         }
      }
   }

   private static void io() {
      a(8, 207, false);
      a(8, 206, false);
      if (E || x) {
         if (E + 4 < eL && x || E + 4 < eM && E) {
            a(8, 206, true);
         }

         if (E > 0) {
            a(8, 207, true);
         }
      }

      M(8);
      if (D) {
         switch (eJ) {
            case 0:
               dk();
               if (C) {
                  aY(eP);
                  return;
               }

               dn();
               iq();
               return;
            case 1:
               dr();
               x = true;
               dk();
               dn();
               iq();
               ir();
               return;
            case 3:
            case 11:
               int var9;
               eP = var9 = f.m();
               do();
               dr();
               dk();
               as = 8;
               du();
               aY(var9);
               return;
            case 6:
            case 10:
               do();
               if (w) {
                  if (u != null) {
                     eQ--;
                     if ((f.h(14) || f.h(2)) && a[a] == 34) {
                        eQ -= 5;
                        if (f.i(14) || f.i(2)) {
                           X(63);
                        }
                     }

                     if ((f.h(8) || f.h(1)) && a[a] == 34) {
                        eQ += 5;
                        if (f.i(8) || f.i(1)) {
                           X(63);
                        }
                     }

                     if (eQ < -(eR / 2)) {
                        eQ = eR / 2;
                     }

                     if (eQ > (eR + f.U) / 2) {
                        eQ = (eR + f.U) / 2;
                     }

                     short var10000 = a[8][158][2];
                     short var10001 = a[8][158][3];
                     short var10002 = a[8][158][5];
                     short var3 = a[8][158][6];
                     short var2 = var10002;
                     int var11 = var10001;
                     int var5 = var10000;
                     f.b(f.a, var5, var11, var2, var3);
                     b(u, 8, 158, 0, eQ);
                     var11 = f.U;
                     var5 = f.T;
                     f.b(f.a, 0, 0, var5, var11);
                     return;
                  }
               } else if (!B) {
                  di();
                  if (D) {
                     if (eL > 0 && x) {
                        int var8 = eL - E >= 4 ? 4 : eL - E;

                        for (int var13 = 0; var13 < var8; var13++) {
                           if (g[var13 + E] != null) {
                              a(f.a(d[var13 + E], L, " "), 8, 24 + var13 * 15, 0, 0);
                              a(g[var13 + E], 8, 29 + var13 * 15, 0, 0);
                              if (200 > a[8][29 + var13 * 15][5] && --bL[var13] < -100) {
                                 bL[var13] = 100;
                              }
                           }
                        }

                        return;
                     }

                     String var7;
                     b((var7 = f.b(827)) == null ? "" : var7, 8, 204, 0, 0);
                  }
               }

               return;
            case 7:
               do();
               ds();
            case 4:
            case 5:
            default:
               return;
            case 8:
               eP = f.m();
               do();
               dr();
               dk();
               at = 0;
               ar = 6;
               as = 6;
               du();
            case 2:
               do();
               if (at == 4) {
                  dk();
                  a(8, 164, true);
                  b(8, 164, true);
                  a(8, 165, true);
                  a(8, 166, true);
                  b(8, 166, true);
                  a(8, 167, true);
                  String var10;
                  String var4 = (var10 = f.b(813)) == null ? "" : var10;
                  a[8][163] = var4;
                  a(8, 163, true);
                  P(8);
                  z = true;
                  ar = 4;
                  eK = 2;
                  at = 0;
                  return;
               } else {
                  if (at == 3) {
                     ar = 3;
                     as = 3;
                     A = false;
                     dq();
                  }

                  if (as == 0) {
                     ar = 3;
                     as = 3;
                     A = false;
                     dq();
                     at = 3;
                     return;
                  } else {
                     if (as == 3) {
                        dk();
                        at = 0;
                        if (!B) {
                           dq();
                        }

                        String var0 = "";

                        for (int var1 = 0; var1 < 5; var1++) {
                           if (bJ[var1] == -1) {
                              var0 = var0 + "+";
                           } else {
                              var0 = var0 + Integer.toString(bJ[var1]);
                           }
                        }

                        a(var0, 8, 198, 0, 0);
                        return;
                     }

                     if (ar == 6) {
                        dk();
                        aY(eP);
                     }

                     return;
                  }
               }
            case 9:
               dr();
               dk();
               dn();
               iq();
               return;
            case 12:
               dr();
               dk();
               dn();
               iq();
               ir();
         }
      } else {
         if (E) {
            dl();
            ip();
         }
      }
   }

   private static void ip() {
      if (E) {
         int var0 = eM - E >= 4 ? 4 : eM - E;

         for (int var1 = 0; var1 < var0; var1++) {
            b(f.a(bG[var1 + E], L, " "), 8, 118 + var1 * 6, 0, 0);
            short var10000 = a[8][121 + var1 * 6][2];
            short var10001 = a[8][121 + var1 * 6][3];
            short var10002 = a[8][121 + var1 * 6][5];
            short var5 = a[8][121 + var1 * 6][6];
            int var4 = var10002;
            int var3 = var10001;
            int var2 = var10000;
            short var6 = var5;
            var5 = (short)var4;
            f.b(f.a, var2, var3, var5, var6);
            String var7;
            a(bA[var1 + E] + " " + ((var7 = f.b(812)) == null ? "" : var7), 8, 121 + var1 * 6, bL[var1], 0);
            if (200 > a[8][121 + var1 * 6][5] && --bL[var1] < -100) {
               bL[var1] = 100;
            }

            var3 = f.U;
            var2 = f.T;
            var4 = var3;
            var3 = var2;
            f.b(f.a, 0, 0, var3, var4);
         }
      }
   }

   private static void iq() {
      if ((System.currentTimeMillis() & 512L) != 0L) {
         String var0;
         b((var0 = f.b(791)) == null ? "" : var0, 8, 161, 0, 0);
      }
   }

   private static void ir() {
      String var0;
      b((var0 = f.b(794)) == null ? "" : var0, 8, 162, 0, 0);
   }

   private static void aY(int var0) {
      eP = var0;
      if (var0 < 0 && var0 >= -10) {
         String var3;
         b((var3 = f.b(bK[-var0])) == null ? "" : var3, 8, 204, 0, 0);
      } else if (var0 > 10 && var0 < 12) {
         String var2;
         b((var2 = f.b(bK[var0])) == null ? "" : var2, 8, 204, 0, 0);
      } else {
         String var1;
         b((var1 = f.b(bK[12])) == null ? "" : var1, 8, 204, 0, 0);
      }
   }

   private static void is() {
      int var0;
      if (E) {
         var0 = eM;
      } else {
         var0 = eL;
      }

      byte var1 = 23;
      byte var2 = 15;
      if (E) {
         var1 = 117;
         var2 = 6;
      }

      if (E == 0) {
         for (int var6 = 0; var6 < 4; var6++) {
            int var5 = var1 + var2 * var6;
            if (E) {
               a[8][var5][6] = (short)var6;
            } else {
               a[8][var5][6] = (short)bz[var6];
            }
         }
      } else {
         for (int var4 = 0; var4 < var0 - 4; var4++) {
            int var3 = var1 + var2 * var4;
            if (E) {
               a[8][var3][6] = (short)(var4 + E);
            } else {
               a[8][var3][6] = (short)bz[var4 + E];
            }
         }
      }
   }

   private static void z(boolean var0) {
      byte var1 = 121;
      byte var2 = 6;
      if (var0) {
         var1 = 29;
         var2 = 15;
         eN = f.n();
      }

      int var3 = j(a[8][var1][7]);

      for (int var4 = 0; var4 < 6; var4++) {
         String var5;
         if (var0) {
            if (var4 < eL) {
               var5 = g(var4);
            } else {
               var5 = "";
            }
         } else {
            var5 = bA[var4] + " " + ((var5 = f.b(812)) == null ? "" : var5);
         }

         g[var4] = var5;
         a[2][var3].a(var5, null);
         bB[var4] = d.d;
         bB[var4] = bB[var4] - a[8][var1][5] < 0 ? 0 : (bB[var4] - a[8][var1][5] > bB[var4] ? bB[var4] : bB[var4] - a[8][var1][5]);
         bC[var4] = 0;
         bD[var4] = 1000;
         bF[var4] = 0;
         bE[var4] = bB[var4] * 1000 / 20;
         if (bB[var4] == 0) {
            a[8][var1 + var2 * var4][9] = 1;
         } else {
            a[8][var1 + var2 * var4][9] = 0;
         }
      }
   }

   private static boolean T(int var0) {
      if (var0 == 0) {
         b(24, true);
         b(20, true);
         Q = false;
         gM();
         X(10);
         g var1;
         if ((var1 = g.a(33)) != null) {
            fh = var1.a[1][2];
            fi = var1.a[1][3];
         }

         if (fh < 0) {
            fh = 30;
         }

         if (fi < 0) {
            fi = 50;
         }

         a(0, new int[]{20, 22, 24}, 3, 1);
      }

      if (var0 == 1) {
         if (cz[0] != 20) {
            a(0, new int[]{20, 22, 24}, 3, 1);
         }

         X(10);
         if (fF == 1) {
            P(24);

            for (eY = 0; eY < 3; eY++) {
               b[eY].a(0, -1, true);
               b[eY].a(bM[eY], bN[eY]);
               b[eY].a();
            }

            for (int var9 = 0; var9 < eZ; var9++) {
               b[bU[var9]].b(-1, 1);
            }
         } else if (fF == 2) {
            iv();
         } else {
            it();
         }
      }

      int var10;
      if (var0 == 8 && fF == 1 && (var10 = f.h()) >= 7 && var10 <= 15) {
         for (int var2 = 0; var2 < eY; var2++) {
            if (b[var2].a() == 0 && eZ < 5 && bO[var2] == var10 - 7 + 1) {
               X(60);
               aZ(var2);
            }
         }
      }

      if (var0 == 5) {
         gM();

         try {
            Thread.sleep(400L);
         } catch (Exception var7) {
         }

         X(56);
         eX = 0;
         eY = 0;
         eZ = 0;
         fb = 0;
         bM = null;
         bN = null;
         bO = null;
         bP = null;
         bQ = null;
         bR = null;
         bS = null;

         for (int var11 = 0; var11 < 3; var11++) {
            a[20][var11 + 10][10] = 0;
         }

         fe = 0;
         ff = 0;
         fg = 0;
         W(24);
         x(1);
      }

      if (var0 == 2) {
         if (!b()) {
            X(10);
         }

         if (fF == 0) {
            if (a[24][20][10] != 0) {
               b(24, 34, 35, fn, 3);
            } else {
               b(24, 34, 35, -1, 3);
            }

            for (int var19 = 0; var19 < 3; var19++) {
               b[var19].c(f.V);
            }

            if ((s = System.currentTimeMillis()) > t) {
               if (a[24][20][6] != 8) {
                  a[24][20][6] = 8;
               }

               if (f(24, 32)) {
                  a(24, 32, false);
                  P(24);
               }
            } else if (s <= t && a[24][20][6] != 9) {
               a[24][20][6] = 9;
            }
         } else if (fF == 1) {
            if (--eX < 0 && eZ < 5) {
               for (eY = 0; eY < 3; eY++) {
                  bM[eY] = f.c(100, 200);
                  bN[eY] = f.c(85, 160);
                  b[eY].a(0, -1, true);
                  b[eY].a(bM[eY], bN[eY]);
                  b[eY].a();
                  b[eY].b();
               }

               eX = 40;
               var10 = 0;

               while (var10 < 3) {
                  bO[var10] = f.c(1, 10);
                  boolean var20 = true;

                  for (int var3 = 0; var3 < var10; var3++) {
                     if (bO[var3] == bO[var10]) {
                        var20 = false;
                     }
                  }

                  if (var20) {
                     var10++;
                  }
               }
            }

            int var21 = 0;

            for (int var23 = 0; var23 < fb; var23++) {
               short var13 = a[24][var23 + 29][2];
               short var4 = a[24][var23 + 29][3];
               if (fa == 0) {
                  short var5 = a[24][14][2];
                  short var6 = a[24][14][3];
                  if (var13 > var5 - 40 && var13 < var5 + 40 && var4 > var6 - 40 && var4 < var6 + 40) {
                     var21++;
                  }
               } else if (fa == 1) {
                  short var30 = a[24][17][2];
                  short var32 = a[24][17][3];
                  if (var13 > var30 - 40 && var13 < var30 + 40 && var4 > var32 - 40 && var4 < var32 + 40) {
                     var21++;
                  }
               } else if (fa == 2) {
                  short var31 = a[24][15][2];
                  short var33 = a[24][15][3];
                  if (var13 > var31 - 40 && var13 < var31 + 40 && var4 > var33 - 40 && var4 < var33 + 40) {
                     var21++;
                  }
               }
            }

            for (int var24 = 0; var24 < 3; var24++) {
               if (b[var24].a() == 0 || b[var24].a() == 2) {
                  b[var24].c(f.V);
               }

               if (b[var24].a() == 2 || b[var24].a() == 1) {
                  if (eZ >= 5 && var21 == fb && b[eZ - 1].a()) {
                     X(37);
                     iv();
                  } else {
                     b[var24].c(f.V);
                  }
               }
            }

            y(1);
         }
      }

      if (var0 == 3) {
         if (fF == 1) {
            b(24, 34, 35, -1, 3);
         }

         M(24);
         if (fF == 0) {
            for (int var14 = 0; var14 < 3; var14++) {
               b[var14].b();
            }

            String var8;
            a((var8 = f.b(397)) == null ? "" : var8, 24, 21, 0, 0);
            a(Integer.toString(fi), 24, 23, 0, 0);
            a(Integer.toString(fh), 24, 25, 0, 0);
            if (f(24, 32)) {
               int var22 = (var10 = (int)((t - s) / 1000L)) / 3600;
               int var16;
               int var25 = (var16 = var10 % 3600) / 60;
               var10 = var16 % 60;
               String var28;
               if (var22 > 0) {
                  var28 = "" + var22 + " : ";
                  if (var25 < 10) {
                     var28 = var28 + "0" + var25 + " : ";
                  } else {
                     var28 = var28 + var25 + " : ";
                  }

                  if (var10 < 10) {
                     var28 = var28 + "0" + var10;
                  } else {
                     var28 = var28 + var10;
                  }
               } else if (var25 > 0) {
                  var28 = "" + var25 + " : ";
                  if (var10 < 10) {
                     var28 = var28 + "0" + var10;
                  } else {
                     var28 = var28 + var10;
                  }
               } else {
                  var28 = "" + var10;
               }

               a(var28, 24, 33, 0, 0);
            }
         } else if (fF == 1) {
            for (int var18 = 0; var18 < 3; var18++) {
               b[var18].b();
               if (b[var18].a() == 0) {
                  a("" + bO[var18], 24, 26, bM[var18] - a[24][26][2] - (a[24][26][5] >> 1), bN[var18] - a[24][26][3] - (a[24][26][6] >> 1));
               }
            }

            switch (fa) {
               case 0:
                  f(24, 8);
                  break;
               case 1:
                  f(24, 12);
                  break;
               case 2:
                  f(24, 10);
            }
         } else if (fF == 2) {
            iu();
         }
      }

      return false;
   }

   private static void it() {
      eZ = 0;
      fF = 0;
      bT = new int[5];
      bU = new int[5];
      a(24, 19, true);
      a(24, 14, true);
      a(24, 16, true);
      a(24, 18, true);
      a(24, 20, true);
      a(24, 22, true);
      a(24, 24, true);
      a(24, 8, true);
      a(24, 10, true);
      a(24, 12, true);
      a(24, 15, true);
      a(24, 17, true);
      b(24, 22, true);
      b(24, 24, true);
      a(24, 28, true);
      a(24, 7, true);
      a(24, 9, true);
      a(24, 11, true);
      a(24, 13, true);
      b(24, 13, true);
      a(24, 29, false);
      a(24, 30, false);
      a(24, 31, false);
      b[0].b(3, -1);
      b[1].b(4, -1);
      b[2].b(5, -1);
      s = System.currentTimeMillis();
      b(24, 20, true);
      if (s > t) {
         a[24][20][6] = 8;
      } else {
         a[24][20][6] = 9;
      }

      a(24, 32, false);
      a(20, 18, false);
      a(20, 17, false);
      a(20, 16, false);
      b(20, 16, false);
      P(24);
      fe = 0;
      ff = 0;
      fg = 0;
      eY = 0;
      eZ = 0;
      fb = 0;
      bM = new int[3];
      bN = new int[3];
      eX = 30;
   }

   private static boolean U(int var0) {
      if (b(5) + e.a(2) > b() - 15) {
         if (var0 == 1) {
            h(fh);
         } else if (var0 == 2) {
            h(fi);
         }

         a(4, 36, true);
         eq = 1;
         a(4, 5, true);
         a(4, 6, true);
         a(4, 12, true);
         b(4, 12, true);
         h(7, 0, 11);
         String var7;
         o = (var7 = f.b(401)) == null ? "" : var7;
         String var8;
         p = (var8 = f.b(402)) == null ? "" : var8;
         r(19);
         return false;
      } else {
         a(24, 19, false);
         a(24, 14, false);
         a(24, 16, false);
         a(24, 18, false);
         a(24, 20, false);
         a(24, 22, false);
         a(24, 24, false);
         a(24, 8, false);
         a(24, 10, false);
         a(24, 12, false);
         a(24, 15, false);
         a(24, 17, false);
         a(24, 32, false);
         b(24, 20, false);
         b(24, 22, false);
         b(24, 24, false);
         switch (var0) {
            case 0:
               fa = 0;
               a(24, 14, true);
               a(24, 8, true);
               g var4;
               if ((var4 = g.a(33)) != null) {
                  long var2;
                  if ((var2 = var4.a[0][1] * 1000) == 0L) {
                     var2 = 86400000L;
                  }

                  t = System.currentTimeMillis() + var2;
               }
               break;
            case 1:
               fa = 1;
               a(24, 17, true);
               a(24, 12, true);
               break;
            case 2:
               fa = 2;
               a(24, 15, true);
               a(24, 10, true);
         }

         for (int var5 = 0; var5 < 3; var5++) {
            b[var5].b(-1, 1);
         }

         a(24, 7, false);
         a(24, 9, false);
         a(24, 11, false);
         a(24, 13, false);
         b(24, 13, false);
         eY = 0;
         eZ = 0;
         fb = 0;
         bM = new int[3];
         bN = new int[3];
         bO = new int[3];
         a(24, 28, false);
         a(24, 27, false);
         eX = 0;
         bV = new int[50];
         bW = new int[50];
         bX = new int[50];
         bY = new int[50];
         fF = 1;
         bP = new int[50];
         bQ = new int[50];
         bR = new int[50];
         bS = new int[50];
         var0 = 0;
         int var9 = 0;
         g var3 = g.a(19);

         for (int var1 = 0; var1 < var3.a; var1++) {
            switch (fa) {
               case 0:
                  if (var3.a[var1][6] > 0) {
                     bQ[var0] = var3.a[var1][4];
                     bR[var0] = var3.a[var1][3];
                     bS[var0] = var3.a[var1][5];
                     bP[var0] = var3.a[var1][6];
                     var9 += bP[var0];
                     var0++;
                  }
                  break;
               case 1:
                  if (var3.a[var1][7] > 0) {
                     bQ[var0] = var3.a[var1][4];
                     bR[var0] = var3.a[var1][3];
                     bS[var0] = var3.a[var1][5];
                     bP[var0] = var3.a[var1][7];
                     var9 += bP[var0];
                     var0++;
                  }
                  break;
               case 2:
                  if (var3.a[var1][8] > 0) {
                     bQ[var0] = var3.a[var1][4];
                     bR[var0] = var3.a[var1][3];
                     bS[var0] = var3.a[var1][5];
                     bP[var0] = var3.a[var1][8];
                     var9 += bP[var0];
                     var0++;
                  }
            }
         }

         fd = var9;
         fc = var0;
         P(24);
         return true;
      }
   }

   private static void aZ(int var0) {
      String var1 = "";
      int var2 = f.c(0, fd);
      int var3 = 0;

      int var4;
      for (var4 = 0; var4 < fc; var4++) {
         var3 += bP[var4];
         if (var2 < var3) {
            break;
         }
      }

      if (fb < 3 && bQ[var4] != 0) {
         X(45);
         b[var0].b(1, 1);
         int var16 = 0;
         int var18 = 0;
         if (fa == 0) {
            var16 = a[24][14][2];
            var18 = a[24][14][3];
         } else if (fa == 1) {
            var16 = a[24][17][2];
            var18 = a[24][17][3];
         } else if (fa == 2) {
            var16 = a[24][15][2];
            var18 = a[24][15][3];
         }

         a[24][29 + fb][2] = (short)bM[var0];
         a[24][29 + fb][3] = (short)(bN[var0] - 50);
         a(1572864 | 29 + fb & 65535, 1572864 | 29 + fb & 65535, bM[var0], bN[var0] - 50, var16 - 50, var18 + 50, 500);
         bT[fb] = var4;
         var16 = 0;
         var18 = 0;
         int var5 = 0;
         switch (bQ[var4]) {
            case 1:
               g var22 = g.a(1);

               for (int var25 = 0; var25 < var22.a; var25++) {
                  if (var22.a[var25][1] == bR[var4]) {
                     var16 = var22.a[var25][3];
                     var18 = var22.a[var25][4];
                     var1 = (var1 = f.b(var22.a[var25][2])) == null ? "" : var1;
                     if (var25 == 110) {
                        j(bS[var4]);
                        a(bR[var4], bS[var4], 34);
                        int var8;
                        a(bR[var4], var8 = bS[var4], 34, false);
                     } else if (var25 == 5) {
                        i(bS[var4]);
                     } else if (var25 >= 111 && var25 <= 116) {
                        c(bS[var4], var25 - 111);
                     } else {
                        a(0, var25, bS[var4]);
                     }
                  }
               }
               break;
            case 2:
               var16 = 1;
               var18 = 9;
               var1 = (var1 = f.b(385)) == null ? "" : var1;
               g(bS[var4]);
               ff = ff + bS[var4];
               break;
            case 3:
               var16 = 1;
               var18 = 10;
               var1 = (var1 = f.b(386)) == null ? "" : var1;
               k(bS[var4]);
               fg = fg + bS[var4];
               break;
            case 4:
               var16 = 1;
               var18 = 2;
               var1 = (var1 = f.b(256)) == null ? "" : var1;
               h(bS[var4]);
               fe = fe + bS[var4];
               break;
            case 5:
               g var21 = g.a(4);

               for (int var24 = 0; var24 < var21.a; var24++) {
                  if (var21.a[var24][1] == bR[var4]) {
                     var16 = var21.a[var24][3];
                     var18 = var21.a[var24][4];
                     var1 = (var1 = f.b(var21.a[var24][2])) == null ? "" : var1;
                     a(2, var24, bS[var4]);
                  }
               }
               break;
            case 6:
               g var20 = g.a(0);

               for (int var23 = 0; var23 < var20.a; var23++) {
                  if (var20.a[var23][1] == bR[var4]) {
                     var16 = var20.a[var23][3];
                     var18 = var20.a[var23][4];
                     var5 = var20.a[var23][32];
                     var1 = (var1 = f.b(var20.a[var23][2])) == null ? "" : var1;
                     c(a(0, var23));
                  }
               }
               break;
            case 7:
               g var6 = g.a(2);

               for (int var7 = 0; var7 < var6.a; var7++) {
                  if (var6.a[var7][1] == bR[var4]) {
                     var16 = var6.a[var7][3];
                     var18 = var6.a[var7][4];
                     var1 = (var1 = f.b(var6.a[var7][2])) == null ? "" : var1;
                     a(4, var7, bS[var4]);
                  }
               }
         }

         a(24, 29 + fb, true);
         a[24][29 + fb][5] = (short)var16;
         a[24][29 + fb][6] = (short)var18;
         a[24][29 + fb][8] = (short)var5;
         bV[fb] = var16;
         bW[fb] = var18;
         bX[fb] = var5;
         bY[fb] = bS[var4];
         i[fb] = var1;
         w(var16);
         fb++;
      } else {
         X(45);
         b[var0].b(2, 1);
      }

      bU[eZ] = var0;
      eZ++;
   }

   private static void iu() {
      String var0;
      var0 = (var0 = f.b(403)) == null ? "" : var0;
      M(20);
      String var1;
      a((var1 = f.b(399)) == null ? "" : var1, 20, 5, 0, 0);
      b(var0, 20, 7, 0, 0);
      if (f(20, 4)) {
         a((var0 = f.b(398)) == null ? "" : var0, 20, 6, 0, 0);
      }

      for (int var4 = 0; var4 < fb; var4++) {
         if (bY[var4] > 0) {
            a(f.a(bY[var4], L, " "), 20, var4 + 13, 0, 0);
         }
      }
   }

   private static void iv() {
      int var0;
      for (var0 = 0; var0 < fb; var0++) {
         a[20][var0 + 10][10] = 1;
         a[20][var0 + 10][5] = (short)bV[var0];
         a[20][var0 + 10][6] = (short)bW[var0];
         a[20][var0 + 10][8] = (short)bX[var0];
      }

      while (var0 < 3) {
         a[20][var0 + 10][10] = 0;
         var0++;
      }

      a(20, 4, true);
      b(20, 4, true);
      P(20);
      fF = 2;
   }

   private static boolean V(int var0) {
      if (var0 == 0) {
         K(5);
         P(5);
         br = true;
      }

      if (var0 == 5) {
         iw();
         W(5);
      }

      if (var0 == 2) {
         if (a[5][57][10] == 1) {
            b(5, 6, 15, -1, 3);
         } else {
            b(5, 6, 15, bq, 3);
         }

         int var1;
         if ((var1 = f.h()) == 18 || var1 == 5 || var1 == 11 || var1 == 19) {
            bq = 0;
         }
      }

      if (var0 == 3) {
         if (!br) {
            return true;
         }

         switch (cx[fk]) {
            case 2:
               M(5);
               if (f(5, 0)) {
                  String var5;
                  b((var5 = f.b(145)) == null ? "" : var5, 5, 1, 0, 0);
                  a(j[fk], 5, 3, 0, 0);
                  b(l[fk], 5, 4, 0, 0);
                  if (m[fk] != "") {
                     b(m[fk], 5, 8, 0, 0);
                     a("" + f.a(m(ce[fk]), L, " ") + "/" + f.a(m(cf[fk]), L, " "), 5, 9, 0, 0);
                     if (a[5][11][10] == 1) {
                        a("" + ci[fk], 5, 13, 0, 0);
                     }
                  }

                  if (n[fk] != "") {
                     b(n[fk], 5, 17, 0, 0);
                     a("" + f.a(m(cj[fk]), L, " ") + "/" + f.a(m(ck[fk]), L, " "), 5, 18, 0, 0);
                     if (f(5, 20)) {
                        a("" + cn[fk], 5, 22, 0, 0);
                     }
                  }

                  if (o[fk] != "") {
                     b(o[fk], 5, 26, 0, 0);
                     a("" + f.a(m(co[fk]), L, " ") + "/" + f.a(m(cp[fk]), L, " "), 5, 27, 0, 0);
                     if (f(5, 29)) {
                        a("" + cs[fk], 5, 31, 0, 0);
                     }
                  }
               }

               if (a[5][11 + fj * 9][10] == 1) {
                  String var6;
                  a((var6 = f.b(844)) == null ? "" : var6, 5, 32, 0, 0);
               }
               break;
            case 3:
               M(5);
               String var2;
               b((var2 = f.b(155)) == null ? "" : var2, 5, 34, 0, 0);
               a(j[fk], 5, 37, 0, 0);
               b(p[fk], 5, 38, 0, 0);
               a((var2 = f.b(156)) == null ? "" : var2, 5, 39, 0, 0);
               a(f.a(m(cu[fk]), L, " "), 5, 50, 0, 0);
               if (m(cv[fk]) > 0) {
                  a(f.a(m(cv[fk]), L, " "), 5, 52, 0, 0);
               }

               if (m(cw[fk]) > 0 && !h) {
                  a(f.a(m(cw[fk]), L, " "), 5, 54, 0, 0);
               }

               a((var2 = f.b(45)) == null ? "" : var2, 5, 58, 0, 0);
         }
      }

      if (var0 == 1) {
         if (cx[fk] == 1) {
            cx[fk] = 2;
         }

         P(5);
         ix();
         br = true;
      }

      return false;
   }

   private static void iw() {
      a(5, 61, false);
      a(5, 2, false);
      a(5, 60, false);
      a(5, 5, false);
      a(5, 14, false);
      a(5, 23, false);
      a(5, 10, false);
      a(5, 19, false);
      a(5, 28, false);
      a(5, 11, false);
      a(5, 20, false);
      a(5, 29, false);
      a(5, 12, false);
      a(5, 21, false);
      a(5, 30, false);
      a(5, 7, false);
      a(5, 16, false);
      a(5, 25, false);
      a(5, 33, false);
      a(5, 35, false);
      a(5, 36, false);
      a(5, 60, false);
      a(5, 49, false);
      a(5, 51, false);
      a(5, 57, false);
      a(5, 53, false);
   }

   private static void ix() {
      iw();
      if (K == 11) {
         f = true;
      }

      byte var0;
      label151: {
         if (cc[fk] != 1) {
            if (cc[fk] == 6) {
               var0 = 8;
               break label151;
            }

            if (cc[fk] == 2) {
               var0 = 15;
               break label151;
            }

            if (cc[fk] == 5) {
               var0 = 24;
               break label151;
            }

            if (cc[fk] == 3) {
               var0 = 25;
               break label151;
            }

            if (cc[fk] == 4) {
               var0 = 26;
               break label151;
            }
         }

         var0 = 7;
      }

      var0 = var0;
      if (a[var0] == null) {
         if (a[5][60][5] > -1 && a[5][60][5] != var0) {
            short var10000 = a[5][60][5];
            char var2 = '\uffff';
            short var1 = var10000;
            a(1, var1, var2, 1, 0);
         }

         short var5 = var0;
         a(1, var5, 1, 0, 24);
         f.c("/7");
         c(1, 3);
         f.k();
      }

      if (cx[fk] == 1) {
         a(j[fk], k[fk], var0);
      } else if (cx[fk] == 2) {
         if (bZ[fk] != f[0] && bZ[fk] != f[1]) {
            a(5, 63, false);
            a(5, 61, true);
            b(5, 61, true);
            b(5, 14, true);
            b(5, 23, true);
         } else if (!k[fk]) {
            if (bZ[fk] == f[0]) {
               if (bs) {
                  a(5, 63, true);
                  bs = false;
               } else {
                  a(5, 63, false);
               }
            } else if (bZ[fk] == f[1]) {
               if (bt) {
                  a(5, 63, true);
                  bt = false;
               } else {
                  a(5, 63, false);
               }
            }

            a(5, 61, false);
            b(5, 61, false);
            b(5, 14, false);
            b(5, 23, false);
         } else {
            a(5, 63, false);
            a(5, 61, true);
            b(5, 61, true);
            b(5, 14, true);
            b(5, 23, true);
         }

         a[5][62][10] = 1;
         a(5, 2, true);
         a(5, 60, true);
         a[5][60][5] = var0;
         a[5][60][6] = 1;
         a(5, 5, true);
         a(5, 14, true);
         a(5, 23, true);
         if (m(cf[fk]) > 0 && k[fk]) {
            a(5, 10, true);
         } else {
            a(5, 10, false);
         }

         if (m(ck[fk]) > 0 && l[fk]) {
            a(5, 19, true);
         } else {
            a(5, 19, false);
         }

         if (m(cp[fk]) > 0 && m[fk]) {
            a(5, 28, true);
         } else {
            a(5, 28, false);
         }

         br = 0;
         if (m(ce[fk]) < m(cf[fk])) {
            if (ci[fk] > 0) {
               a(5, 11, true);
               b(5, 11, true);
               a(5, 12, true);
            }

            br = 1;
            a(5, 7, true);
            b(5, 5, true);
         } else {
            a(5, 11, false);
            b(5, 11, false);
            a(5, 12, false);
            a(5, 7, false);
            b(5, 5, false);
         }

         if (m(cj[fk]) < m(ck[fk])) {
            if (cn[fk] > 0) {
               a(5, 20, true);
               b(5, 20, true);
               a(5, 21, true);
            }

            br = 2;
            a(5, 16, true);
         } else {
            a(5, 20, false);
            b(5, 20, false);
            a(5, 21, false);
            a(5, 16, false);
            b(5, 14, false);
         }

         if (m(co[fk]) < m(cp[fk])) {
            if (cs[fk] > 0) {
               a(5, 29, true);
               b(5, 29, true);
               a(5, 30, true);
            }

            br = 3;
            a(5, 25, true);
         } else {
            a(5, 29, false);
            b(5, 29, false);
            a(5, 30, false);
            a(5, 25, false);
            b(5, 23, false);
         }
      } else if (cx[fk] == 3) {
         a(5, 63, false);
         a(5, 35, true);
         a(5, 36, true);
         a(5, 60, true);
         a[5][60][5] = var0;
         a[5][60][6] = 1;
         a(5, 49, true);
         if (m(cv[fk]) > 0) {
            a(5, 51, true);
         } else {
            a(5, 51, false);
         }

         if (m(cw[fk]) > 0 && !h) {
            a(5, 53, true);
         } else {
            a(5, 53, false);
         }

         a(5, 57, true);
         a[5][62][10] = 0;

         try {
            Thread.sleep(700L);
         } catch (Exception var3) {
         }

         X(44);
      }

      P(5);
   }

   private static void iy() {
      E = null;
      n = null;
      j = 0;
      br = false;
      fm = -1;
   }

   private static void iz() {
      bs = true;
      bt = true;
   }

   private static void iA() {
      bZ = new int[h];
      ca = new int[h];
      cb = new int[h];
      j = new String[h];
      k = new String[h];
      l = new String[h];
      cd = new int[h];
      cc = new int[h];
      m = new String[h];
      n = new String[h];
      o = new String[h];
      ce = new int[h];
      cf = new int[h];
      k = new boolean[h];
      cg = new int[h];
      ch = new int[h];
      ci = new int[h];
      cj = new int[h];
      ck = new int[h];
      l = new boolean[h];
      cl = new int[h];
      cm = new int[h];
      cn = new int[h];
      co = new int[h];
      cp = new int[h];
      m = new boolean[h];
      cq = new int[h];
      cr = new int[h];
      cs = new int[h];
      ct = new int[h];
      p = new String[h];
      cu = new int[h];
      cv = new int[h];
      cw = new int[h];
      cx = new int[h];

      for (int var0 = 0; var0 < h; var0++) {
         bZ[var0] = -1;
         ca[var0] = -1;
         cb[var0] = 0;
         j[var0] = "";
         k[var0] = "";
         l[var0] = "";
         cd[var0] = 0;
         cc[var0] = 0;
         m[var0] = "";
         n[var0] = "";
         o[var0] = "";
         ce[var0] = l(0);
         cf[var0] = l(0);
         k[var0] = false;
         cg[var0] = 0;
         ch[var0] = 0;
         ci[var0] = 0;
         cj[var0] = 0;
         ck[var0] = 0;
         l[var0] = false;
         cl[var0] = 0;
         cm[var0] = 0;
         cn[var0] = 0;
         co[var0] = 0;
         cp[var0] = 0;
         m[var0] = false;
         cq[var0] = 0;
         cr[var0] = 0;
         cs[var0] = 0;
         ct[var0] = 0;
         p[var0] = "";
         cu[var0] = l(0);
         cv[var0] = l(0);
         cx[var0] = 0;
      }

      fk = 0;
      cy = new int[fl];

      for (int var1 = 0; var1 < fl; var1++) {
         cy[var1] = -1;
      }

      n = new boolean[22];

      for (int var2 = 0; var2 < 22; var2++) {
         n[var2] = false;
      }

      g var3 = g.a(6);
      (E = new short[22])[0] = (short)var3.a[18][1];
      E[1] = (short)var3.a[44][1];
      E[2] = (short)var3.a[49][1];
      E[3] = (short)var3.a[62][1];
      E[4] = (short)var3.a[68][1];
      E[5] = (short)var3.a[85][1];
      E[6] = (short)var3.a[112][1];
      E[7] = (short)var3.a[124][1];
      E[8] = (short)var3.a[131][1];
      E[9] = (short)var3.a[164][1];
      E[10] = (short)var3.a[165][1];
      E[11] = (short)var3.a[170][1];
      E[12] = (short)var3.a[180][1];
      E[13] = (short)var3.a[181][1];
      E[14] = (short)var3.a[205][1];
      E[15] = (short)var3.a[229][1];
      E[16] = (short)var3.a[233][1];
      E[17] = (short)var3.a[239][1];
      E[18] = (short)var3.a[267][1];
      E[19] = (short)var3.a[270][1];
      E[20] = (short)var3.a[291][1];
      E[21] = (short)var3.a[292][1];
   }

   private static void iB() {
      if (q()) {
         a(true, fk, '\u0001');
      }

      fk = 0;
   }

   private static boolean q() {
      boolean var0 = false;
      if (K != -1 && K != 10) {
         return false;
      }

      g var1 = g.a(6);
      int var2 = 0;

      for (int var3 = 0; var3 < h; var3++) {
         if (!W(var3)) {
            for (int var4 = var2; var4 < fl; var4++) {
               int var5;
               int var6 = var5 = var1.a[var4][1];
               int var7 = 0;

               for (int var8 = 0; var8 < h && bZ[var8] != -1; var8++) {
                  if (bZ[var8] == var6) {
                     var7 = 1;
                     break;
                  }
               }

               if (!var7 && !f(var5)) {
                  var5 = var1.a[var4][14];
                  if (e() >= var5) {
                     var5 = var1.a[var4][15];
                     var6 = var1.a[var4][16];
                     var7 = var1.a[var4][17];
                     boolean var13 = true;
                     if (var5 != -1 && !f(var1.a[var5][1])) {
                        var13 = false;
                     }

                     if (var6 != -1 && !f(var1.a[var6][1])) {
                        var13 = false;
                     }

                     if (var7 != -1 && !f(var1.a[var7][1])) {
                        var13 = false;
                     }

                     if (var13) {
                        e(var4, var3, true);
                        var0 = true;
                        fk = var3;
                        var2 = var4;
                        break;
                     }
                  }
               }
            }
         }
      }

      return var0;
   }

   private static void p(int var0, int var1) {
      if (bZ[var0] != -1 && cx[var0] != 3) {
         if (var1 == 0) {
            ce[var0] = cf[var0];
            k[var0] = true;
         } else if (var1 == 1) {
            cj[var0] = ck[var0];
            l[var0] = true;
         } else if (var1 == 2) {
            co[var0] = cp[var0];
            m[var0] = true;
         }

         if ((m(cf[var0]) == 0 || k[var0]) && (m(ck[var0]) == 0 || l[var0]) && (m(cp[var0]) == 0 || m[var0])) {
            l(var0, false);
         }
      }
   }

   private static int a(boolean var0, int var1, int var2, int var3, int var4, boolean var5) {
      short var6 = G[3];
      short var7 = G[4];
      short var8 = G[15];
      short var9 = G[16];
      short var10 = G[27];
      short var11 = G[28];
      short var12 = G[39];
      short var13 = G[40];
      short var14 = G[51];
      short var15 = G[52];
      short var16 = G[63];
      short var17 = a[12];
      short var18 = a[21];
      int var19 = cG[0];
      int var20 = cG[9];
      short var21 = G[0];
      short var22 = G[61];
      if (!var0 && var1 == 2990 && var2 >= var21 && var2 <= var22 && var3 == var4 && var5) {
         return 3;
      } else if (!var0 && (var1 == var2 || var1 == 9999 && var2 >= var19 && var2 <= var20) && var3 == var4 && var3 == 29) {
         return 2;
      } else {
         return !var0
               && (
                  var1 == var2
                     || var1 == 2999 && var2 >= 2000 && var2 < 2999
                     || var1 == 2993 && var2 >= 2000 && var2 <= var6
                     || var1 == 2998 && var2 >= var7 && var2 <= var8
                     || var1 == 2997 && var2 >= var9 && var2 <= var10
                     || var1 == 2996 && var2 >= var11 && var2 <= var12
                     || var1 == 2995 && var2 >= var13 && var2 <= var14
                     || var1 == 2994 && var2 >= var15 && var2 <= var16
                     || var1 == 3999 && var2 >= var17 && var2 <= var18
                     || var1 == 9999 && var2 >= var19 && var2 <= var20
               )
               && var3 == var4
            ? 1
            : 0;
      }
   }

   static int a(int var0, int var1, int var2, boolean var3) {
      byte var4 = 0;

      for (int var5 = 0; var5 < h; var5++) {
         if (cx[var5] == 2) {
            int var6 = -1;
            int var7;
            if ((var7 = a(k[var5], cg[var5], var0, ch[var5], var2, var3)) == 3 || var7 == 1) {
               ce[var5] = l(m(ce[var5]) + var1);
               if (m(ce[var5]) >= m(cf[var5])) {
                  ce[var5] = cf[var5];
                  k[var5] = true;
                  var6 = var5;
               }

               if (m(ce[var5]) < 0) {
                  ce[var5] = 0;
               }
            } else if (var7 == 2) {
               if (var1 >= m(cf[var5])) {
                  ce[var5] = cf[var5];
                  k[var5] = true;
                  var6 = var5;
               } else {
                  ce[var5] = l(var1);
               }
            }

            if ((var7 = a(l[var5], cl[var5], var0, cm[var5], var2, var3)) == 3 || var7 == 1) {
               cj[var5] = l(m(cj[var5]) + var1);
               if (m(cj[var5]) >= m(ck[var5])) {
                  cj[var5] = ck[var5];
                  l[var5] = true;
                  var6 = var5;
               }

               if (m(cj[var5]) < 0) {
                  cj[var5] = l(0);
               }
            } else if (var7 == 2) {
               if (var1 >= m(ck[var5])) {
                  cj[var5] = ck[var5];
                  l[var5] = true;
                  var6 = var5;
               } else {
                  cj[var5] = l(var1);
               }
            }

            if ((var7 = a(m[var5], cq[var5], var0, cr[var5], var2, var3)) == 3 || var7 == 1) {
               co[var5] = l(m(co[var5]) + var1);
               if (m(co[var5]) >= m(cp[var5])) {
                  co[var5] = cp[var5];
                  m[var5] = true;
                  var6 = var5;
               }

               if (m(co[var5]) < 0) {
                  co[var5] = l(0);
               }
            } else if (var7 == 2) {
               if (var1 >= m(cp[var5])) {
                  co[var5] = cp[var5];
                  m[var5] = true;
                  var6 = var5;
               } else {
                  co[var5] = l(var1);
               }
            }

            if (var6 != -1) {
               fm = var6;
               if (K == -1) {
                  try {
                     Thread.sleep(700L);
                  } catch (Exception var8) {
                  }
               }

               X(38);
               if ((m(cf[var6]) == 0 || k[var6]) && (m(ck[var6]) == 0 || l[var6]) && (m(cp[var6]) == 0 || m[var6])) {
                  l(var6, false);
                  var4 = 1;
               }

               if (var2 != 8) {
                  a(true, var6, '\u0002');
               } else {
                  ad = true;
                  a = 2;
               }
            }
         }
      }

      return var4;
   }

   static int b(int var0, int var1, int var2) {
      return a(var0, var1, var2, false);
   }

   private static void e(int var0, int var1, boolean var2) {
      g var3 = g.a(6);
      bZ[var1] = var3.a[var0][1];
      ca[var1] = var0;
      b(1, 52, true);
      cb[var1] = var3.a[var0][14];
      int var4;
      if (!f.j(q(var4 = var3.a[var0][3]))) {
         bb(var4);
      }

      String[] var10000;
      int var10001;
      String var10002;
      if (var4 < 0) {
         var10000 = j;
         var10001 = var1;
         var10002 = "%TITLE TEXT ERROR%";
      } else {
         var10000 = j;
         var10001 = var1;
         String var5;
         var10002 = (var5 = f.b(var4)) == null ? "" : var5;
      }

      var10000[var10001] = var10002;
      if ((var4 = var3.a[var0][5]) < 0) {
         var10000 = k;
         var10001 = var1;
         var10002 = "%INTRO TEXT ERROR%";
      } else {
         var10000 = k;
         var10001 = var1;
         String var7;
         var10002 = (var7 = f.b(var4)) == null ? "" : var7;
      }

      var10000[var10001] = var10002;
      if ((var4 = var3.a[var0][6]) < 0) {
         var10000 = l;
         var10001 = var1;
         var10002 = "%DESC TEXT ERROR%";
      } else {
         var10000 = l;
         var10001 = var1;
         String var9;
         var10002 = (var9 = f.b(var4)) == null ? "" : var9;
      }

      var10000[var10001] = var10002;
      cd[var1] = var3.a[var0][7];
      cc[var1] = var3.a[var0][4];
      if ((var4 = var3.a[var0][18]) < 0) {
         var10000 = m;
         var10001 = var1;
         var10002 = "%OBJ1 TEXT ERROR%";
      } else {
         var10000 = m;
         var10001 = var1;
         String var11;
         var10002 = (var11 = f.b(var4)) == null ? "" : var11;
      }

      var10000[var10001] = var10002;
      if ((var4 = var3.a[var0][23]) < 0) {
         var10000 = n;
         var10001 = var1;
         var10002 = "%OBJ2 TEXT ERROR%";
      } else if (var4 == 0) {
         var10000 = n;
         var10001 = var1;
         var10002 = "";
      } else {
         var10000 = n;
         var10001 = var1;
         String var13;
         var10002 = (var13 = f.b(var4)) == null ? "" : var13;
      }

      var10000[var10001] = var10002;
      if ((var4 = var3.a[var0][28]) < 0) {
         var10000 = o;
         var10001 = var1;
         var10002 = "%%OBJ3 TEXT ERROR";
      } else if (var4 == 0) {
         var10000 = o;
         var10001 = var1;
         var10002 = "";
      } else {
         var10000 = o;
         var10001 = var1;
         String var15;
         var10002 = (var15 = f.b(var4)) == null ? "" : var15;
      }

      var10000[var10001] = var10002;
      cf[var1] = l(var3.a[var0][20]);
      cg[var1] = var3.a[var0][19];
      ch[var1] = var3.a[var0][21];
      ci[var1] = var3.a[var0][22];
      ck[var1] = l(var3.a[var0][25]);
      cl[var1] = var3.a[var0][24];
      cm[var1] = var3.a[var0][26];
      cn[var1] = var3.a[var0][27];
      cp[var1] = l(var3.a[var0][30]);
      cq[var1] = var3.a[var0][29];
      cr[var1] = var3.a[var0][31];
      cs[var1] = var3.a[var0][32];
      if ((var4 = var3.a[var0][13]) < 0) {
         var10000 = p;
         var10001 = var1;
         var10002 = "%OUTRO TEXT ERROR%";
      } else {
         var10000 = p;
         var10001 = var1;
         String var17;
         var10002 = (var17 = f.b(var4)) == null ? "" : var17;
      }

      var10000[var10001] = var10002;
      cu[var1] = l(var3.a[var0][8]);
      cv[var1] = l(var3.a[var0][10]);
      cw[var1] = l(var3.a[var0][12]);
      if (var2) {
         cx[var1] = 1;
         ce[var1] = l(0);
         k[var1] = false;
         cj[var1] = l(0);
         l[var1] = false;
         co[var1] = l(0);
         m[var1] = false;
         e(true);
      }
   }

   private static void ba(int var0) {
      if (cx[var0] == 3) {
         bZ[var0] = -1;
         ca[var0] = -1;
         cb[var0] = 0;
         j[var0] = "";
         k[var0] = "";
         l[var0] = "";
         cd[var0] = 0;
         cc[var0] = 0;
         m[var0] = "";
         n[var0] = "";
         o[var0] = "";
         ce[var0] = l(0);
         cf[var0] = l(0);
         k[var0] = false;
         cg[var0] = 0;
         ch[var0] = 0;
         ci[var0] = 0;
         cj[var0] = l(0);
         ck[var0] = l(0);
         l[var0] = false;
         cl[var0] = 0;
         cm[var0] = 0;
         cn[var0] = 0;
         co[var0] = l(0);
         cp[var0] = l(0);
         m[var0] = false;
         cq[var0] = 0;
         cr[var0] = 0;
         cs[var0] = 0;
         ct[var0] = 0;
         p[var0] = "";
         cu[var0] = l(0);
         cv[var0] = l(0);
         cw[var0] = l(0);
         cx[var0] = 0;
         int var1 = var0 + 1;

         for (int var2 = var0; var2 < h - 1 && bZ[var2 + 1] != -1; var2++) {
            var1 = var2 + 1;
            bZ[var2] = bZ[var2 + 1];
            ca[var2] = ca[var2 + 1];
            cb[var2] = cb[var2 + 1];
            j[var2] = j[var2 + 1];
            k[var2] = k[var2 + 1];
            l[var2] = l[var2 + 1];
            cd[var2] = cd[var2 + 1];
            cc[var2] = cc[var2 + 1];
            m[var2] = m[var2 + 1];
            n[var2] = n[var2 + 1];
            o[var2] = o[var2 + 1];
            ce[var2] = ce[var2 + 1];
            cf[var2] = cf[var2 + 1];
            k[var2] = k[var2 + 1];
            cg[var2] = cg[var2 + 1];
            ch[var2] = ch[var2 + 1];
            ci[var2] = ci[var2 + 1];
            cj[var2] = cj[var2 + 1];
            ck[var2] = ck[var2 + 1];
            l[var2] = l[var2 + 1];
            cl[var2] = cl[var2 + 1];
            cm[var2] = cm[var2 + 1];
            cn[var2] = cn[var2 + 1];
            co[var2] = co[var2 + 1];
            cp[var2] = cp[var2 + 1];
            m[var2] = m[var2 + 1];
            cq[var2] = cq[var2 + 1];
            cr[var2] = cr[var2 + 1];
            cs[var2] = cs[var2 + 1];
            ct[var2] = ct[var2 + 1];
            p[var2] = p[var2 + 1];
            cu[var2] = cu[var2 + 1];
            cv[var2] = cv[var2 + 1];
            cw[var2] = cw[var2 + 1];
            cx[var2] = cx[var2 + 1];
         }

         if (var1 < h) {
            bZ[var1] = -1;
            ca[var1] = -1;
            cb[var1] = 0;
            j[var1] = "";
            k[var1] = "";
            l[var1] = "";
            cd[var1] = 0;
            cc[var1] = 0;
            m[var1] = "";
            n[var1] = "";
            o[var1] = "";
            ce[var1] = l(0);
            cf[var1] = l(0);
            k[var1] = false;
            cg[var1] = 0;
            ch[var1] = 0;
            ci[var1] = 0;
            cj[var1] = l(0);
            ck[var1] = l(0);
            l[var1] = false;
            cl[var1] = 0;
            cm[var1] = 0;
            cn[var1] = 0;
            co[var1] = l(0);
            cp[var1] = l(0);
            m[var1] = false;
            cq[var1] = 0;
            cr[var1] = 0;
            cs[var1] = 0;
            ct[var1] = 0;
            p[var1] = "";
            cu[var1] = l(0);
            cv[var1] = l(0);
            cw[var1] = l(0);
            cx[var1] = 0;
         }

         fk = var0;
         if (var0 >= 1 && bZ[var0] == -1) {
            fk--;
         }
      }
   }

   private static boolean W(int var0) {
      boolean var1 = false;
      if (bZ[var0] != -1) {
         var1 = true;
      }

      if (ca[var0] != -1) {
         var1 = true;
      }

      return var1;
   }

   private static void l(int var0, boolean var1) {
      cx[var0] = 3;
      fk = var0;
      int var2 = ca[var0];
      if (!var1) {
         cy[var2] = bZ[var0];
      }

      if (a() == 17) {
         d(false);
      }

      if (ch[var0] == 1) {
         e[] var3 = new e[30];
         var1 = e.a(0, 22, var3, 30);

         for (int var5 = 0; var5 < var1; var5++) {
            var3[var5].B();
         }
      }
   }

   static boolean f(int var0) {
      boolean var1 = false;

      for (int var2 = 0; var2 < fl; var2++) {
         if (cy[var2] == var0) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   static boolean g(int var0) {
      boolean var1 = false;

      for (int var2 = 0; var2 < h && bZ[var2] != -1; var2++) {
         if (cx[var2] >= 2 && bZ[var2] == f[var0]) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   private static void bb(int var0) {
      f.n(1);
      f.n(2);
      f.n(3);
      f.n(4);
      f.n(5);
      f.n(6);
      f.n(7);
      String var1 = "/" + f.a(0);
      var0 = q(var0);
      f.a(var1, var0);
   }

   private static int q(int var0) {
      if (var0 <= 1226) {
         return 1;
      } else if (var0 >= 2048 && var0 <= 2369) {
         return 2;
      } else if (var0 >= 3072 && var0 <= 3386) {
         return 3;
      } else if (var0 >= 4096 && var0 <= 4431) {
         return 4;
      } else if (var0 >= 5120 && var0 <= 5497) {
         return 5;
      } else if (var0 >= 6144 && var0 <= 6472) {
         return 6;
      } else {
         return var0 >= 7168 && var0 <= 7363 ? 7 : -1;
      }
   }

   private static boolean r() {
      boolean var0 = true;

      for (int var1 = 0; var1 < fl; var1++) {
         if (cy[var1] == -1) {
            var0 = false;
            break;
         }
      }

      return var0;
   }

   private static int E() {
      int var0 = 0;

      for (int var1 = 0; var1 < h; var1++) {
         if (W(var1)) {
            var0++;
         }
      }

      return var0;
   }

   static void m(int var0) {
      for (int var1 = 0; var1 < h; var1++) {
         if (cx[var1] == 2) {
            if (!k[var1] && ch[var1] == 38) {
               int var4 = -1;
               if (cg[var1] == 2998) {
                  int var3 = e.a(0, 54, 4, 15);
                  ce[var1] = l(var3);
                  if (m(ce[var1]) >= m(cf[var1])) {
                     ce[var1] = cf[var1];
                     var4 = var1;
                  }
               } else if (cg[var1] == 2997) {
                  int var5 = e.a(0, 54, 16, 27);
                  ce[var1] = l(var5);
                  if (m(ce[var1]) >= m(cf[var1])) {
                     ce[var1] = cf[var1];
                     var4 = var1;
                  }
               } else if (cg[var1] == 2996) {
                  int var6 = e.a(0, 54, 28, 39);
                  ce[var1] = l(var6);
                  if (m(ce[var1]) >= m(cf[var1])) {
                     ce[var1] = cf[var1];
                     var4 = var1;
                  }
               } else if (cg[var1] == 2995) {
                  int var7 = e.a(0, 54, 40, 51);
                  ce[var1] = l(var7);
                  if (m(ce[var1]) >= m(cf[var1])) {
                     ce[var1] = cf[var1];
                     var4 = var1;
                  }
               } else if (cg[var1] == 2994) {
                  int var8 = e.a(0, 54, 52, 63);
                  ce[var1] = l(var8);
                  if (m(ce[var1]) >= m(cf[var1])) {
                     ce[var1] = cf[var1];
                     var4 = var1;
                  }
               } else if (cg[var1] == 2999) {
                  int var9 = e.a(0, 54, 0, 63);
                  ce[var1] = l(var9);
                  if (m(ce[var1]) >= m(cf[var1])) {
                     ce[var1] = cf[var1];
                     var4 = var1;
                  }
               } else if (var0 == cg[var1]) {
                  int var10 = e.b(0, var0);
                  ce[var1] = l(var10);
                  if (m(ce[var1]) >= m(cf[var1])) {
                     ce[var1] = cf[var1];
                     var4 = var1;
                  }
               }

               if (var4 != -1) {
                  k[var4] = true;
                  if ((m(cf[var4]) == 0 || k[var4]) && (m(ck[var4]) == 0 || l[var4]) && (m(cp[var4]) == 0 || m[var4])) {
                     l(var4, false);
                  }

                  a(true, var4, '\u0002');
               }
            } else if (!k[var1] && ch[var1] == 32) {
               int var2 = e.d(0, 54);
               ce[var1] = l(var2);
               if (m(ce[var1]) >= m(cf[var1])) {
                  ce[var1] = cf[var1];
                  k[var1] = true;
                  if ((m(cf[var1]) == 0 || k[var1]) && (m(ck[var1]) == 0 || l[var1]) && (m(cp[var1]) == 0 || m[var1])) {
                     l(var1, false);
                  }

                  a(true, var1, '\u0002');
               }
            }
         }
      }
   }

   private static void a(int var0, int[] var1, int var2, int var3) {
      cz = var1;
      fp = var1.length;
      fr = var3;

      for (int var4 = 0; var4 < fp; var4++) {
         cA[var4] = var1[var4];
      }

      bc(var2);
   }

   private static void j(int var0, int var1, int var2) {
      cz = null;
      fp = var1;
      fr = 0;

      for (int var3 = 0; var3 < fp; var3++) {
         cA[var3] = 0;
      }

      bc(var2);
   }

   private static void bc(int var0) {
      fo = 0;
      fq = var0;
      fn = 0;
      if (0 > fp) {
         fn = 0;
      }

      if (fn > fq - 1) {
         fo = fn - (fq - 1);
      }
   }

   private static boolean s() {
      boolean var0 = false;
      int var1;
      if (((var1 = f.h()) == 1 || var1 == 8) && fr == 0 || (var1 == 3 || var1 == 10) && fr == 1) {
         X(63);

         do {
            if (--fn < fo) {
               fo--;
            }

            if (fn < 0) {
               fn = fp - 1;
               fo = 0 > fp - fq ? 0 : fp - fq;
            }
         } while ((cA[fn] & -2147483648) == Integer.MIN_VALUE);

         var0 = true;
      }

      if ((var1 == 2 || var1 == 14) && fr == 0 || (var1 == 4 || var1 == 12) && fr == 1) {
         X(63);

         do {
            if (++fn > fo + fq - 1) {
               fo++;
            }

            if (fn == fp) {
               fn = 0;
               fo = 0;
            }
         } while ((cA[fn] & -2147483648) == Integer.MIN_VALUE);

         var0 = true;
      }

      if (var1 != -1) {
         if (a[a] != 19) {
            bk = bn << 16 | cA[fn] & 65535;
         } else {
            bk = 262144 | cA[fn] & 65535;
         }
      }

      return var0;
   }

   private static void q(int var0, int var1) {
      fs = var0;
      E = 0;
      ft = 0;
      fu = 0;
      fv = var1;
      fw = 2;
      fx = fv * fw;
   }

   private static void iC() {
      int var0 = f.h();
      int var1 = fu;
      if ((var0 == 1 || var0 == 8) && fu - fv >= 0) {
         fu = fu - fv;
         if (var1 != fu) {
            X(63);
         }
      }

      if (var0 == 2 || var0 == 14) {
         if (E + fu + fv < fs && fu + fv < fx) {
            fu = fu + fv;
            if (var1 != fu) {
               X(63);
            }
         } else if (fu == fv - 1 && E + fu < fs - 1) {
            fu = fv;
         }
      }

      if (var0 == 4 || var0 == 12) {
         if (fu % fv == fv - 1) {
            if (E + fx < fs) {
               fu++;
               E = E + fx;
               fu = (fu + fv * (fx / fv - 1)) % fx;
               if (E + fu >= fs) {
                  fu = 0;
               }
            } else if (E + fx > fs && E + fu < fs - 1) {
               fu++;
            }
         } else {
            fu++;
            if (E + fu >= fs) {
               fu--;
            }
         }

         if (var1 != fu) {
            X(63);
         }
      }

      if (var0 == 3 || var0 == 10) {
         if (fu % fv == 0) {
            if (E >= fx) {
               fu = (--fu - fv * (fx / fv - 1) + fx) % fx;
               E = E - fx;
            }
         } else {
            fu--;
         }

         if (fu < 0) {
            fu = 0;
         }

         if (var1 != fu) {
            X(63);
         }
      }
   }

   private static void iD() {
      if (bu) {
         int var1 = f.U;
         int var0 = f.T;
         f.b(f.a, 0, 0, var0, var1);
         if (e == 1) {
            if (d != null) {
               d.a(F, G);
               if (!d.a()) {
                  d.b();
               } else {
                  b[159].a(f.a, 1, F, G, 0);
               }
            } else {
               b[159].a(f.a, 0, F, G, 0);
            }
         } else {
            d = null;
            if (e == 0 && u) {
               d var2;
               if (fB < 1000) {
                  var2 = a[fB];
               } else {
                  var2 = b[fB - 1000];
               }

               var2.a(f.a, fA, F, G, 0);
            } else {
               b[159].a(f.a, 0, F, G, 0);
            }
         }

         if (K == 5 || K == 8) {
            a[1][12][2] = (short)F;
            a[1][12][3] = (short)G;
         }
      }
   }

   private static void A(boolean var0) {
      bu = var0;
   }

   private static int a(int[] var0, int var1, int var2) {
      while (var2 < var0.length) {
         if (var1 == var0[var2 + 1]) {
            return var2;
         }

         var2 += 5;
      }

      return -1;
   }

   private static boolean a(int var0, d var1) {
      int var2 = 0;
      boolean var3 = false;
      int var8 = var1.a;

      do {
         if ((var2 = a(cC, var0, var2)) >= 0) {
            int var4 = cC[var2];
            int var5 = cC[var2 + 2];
            int var6 = cC[var2 + 3];
            int var7 = cC[var2 + 4];
            var2 += 5;
            if (f.c.equals("/" + var4)) {
               if (var7 < 0) {
                  for (int var9 = 0; var9 < var8; var9++) {
                     var1.b(var9, var5, var6);
                  }
               } else {
                  var1.b(var7, var5, var6);
               }

               var3 = true;
            }
         }
      } while (var2 >= 0);

      return var3;
   }

   a(Object var1, Object var2) {
      super(var1, var2);
      f.b(false, 50, 8);
      f.b(false, 52, 10);
      f.b(false, 54, 12);
      f.b(false, 56, 14);
      f.b(false, 53, 11);
      a = -1;
      ag = -1;
      af = -1;
      ah = 0;
      ai = 0;
      a = new int[15];
      b = new byte[6];

      for (int var5 = 0; var5 < 45; var5++) {
         a(var5, true);
      }

      a(19, false);
      a(42, false);
      a(1);
      k = null;
      l = null;
      fD = 0;
      long var3 = f.a * f.W;
      if (f.a == null) {
         f.a = new Random(var3);
      } else {
         f.a.setSeed(var3);
      }
   }

   final void e() {
      if (ay > 0 && !l()) {
         try {
            Thread.sleep(10L);
         } catch (Exception var13) {
         }

         int var5 = -1;
         if (ay == 1) {
            var5 = q[0];
            ay = 0;
            q[0] = -1;
            q[1] = -1;
         }

         if (ay == 2) {
            var5 = q[0];
            q[0] = q[1];
            q[1] = -1;
            ay = 1;
         }

         X(var5);
      }

      long var1 = System.currentTimeMillis();
      long var3 = System.currentTimeMillis();
      if (ag != -1) {
         if (ag == 0) {
            ag = -1;
            if (a > -1) {
               d(4, a);
            }

            a++;
            a[a] = af;
            af = -1;
            if (a[a] != 1) {
               I(a[a]);
            }

            d(0, a);
            d(1, a);
         } else if (ag == 1) {
            ag = -1;
            d(4, a);
            d(5, a);
            J(a[a]);
            if (--a > -1) {
               I(a[a]);
               d(1, a);
            }
         } else if (ag == 2) {
            for (ag = -1; a >= 0; a--) {
               d(5, a);
               J(a[a]);
            }

            a++;
            aj = af;
            a[a] = 4;
            I(a[a]);
            d(0, a);
            d(1, a);
         } else if (ag == 3) {
            ag = -1;
            d(4, a);
            d(5, a);
            J(a[a]);
            a[a] = af;
            af = -1;
            I(a[a]);
            d(0, a);
            d(1, a);
         } else if (ag == 4) {
            ag = -1;
            d(4, a);

            while (a >= 0 && a[a] != af) {
               d(5, a);
               J(a[a]);
               a--;
            }

            a[a] = af;
            af = -1;
            if (a > -1) {
               I(a[a]);
               d(1, a);
            }
         }

         if (ag != 2 && a != -1) {
            if (a[a] != 17 && a[a] != 18 && a[a] != 36) {
               bu = false;
            } else if (a[1][51][10] == 0) {
               if (!v) {
                  bu = true;
               }

               v = false;
            }
         }

         iE();
      }

      label219:
      if (ag == -1) {
         k = null;
         int var14 = bm;
         if (bm > -1 && bm == -1) {
            int var6 = var14 & 65535;
            var14 = var14 >> 16 & 65535;
            short var16;
            if ((var16 = a[var14][var6][19]) >= 0 && var16 < 10 && b[var16] != null && h(var16, 2)) {
               if (bl > -1) {
                  g(var16, var6);
               } else {
                  var6 = b[var16][0] >> 16 & 65535;
                  int var7 = b[var16][0] & 65535;
                  int var8 = b[var16][1] & 65535;
                  int var9 = Integer.MAX_VALUE;
                  int var10 = 0;

                  for (int var11 = var7 + 1; var11 <= var8; var11++) {
                     int var12;
                     if (a[var6][var11][10] == 1
                        && (
                              var12 = (a[var6][var11][2] - b[var16][10]) * (a[var6][var11][2] - b[var16][10])
                                 + (a[var6][var11][3] - b[var16][11]) * (a[var6][var11][3] - b[var16][11])
                           )
                           < var9) {
                        var10 = var11;
                        var9 = var12;
                     }
                  }

                  var10 = var10 < var7 + 1 ? var7 + 1 : (var10 > var8 ? var8 : var10);
                  g(var16, var10);
                  bl = var6 << 16 | var10 & 65535;
               }
            }

            c = false;
         }

         if (a != null) {
            a.c(f.V);
         }

         if (d != null) {
            d.c(f.V);
         }

         if ((bl = A()) > 1) {
            bv = false;
         }

         if (bl > -1) {
            var14 = bl;
            bl = -1;
            if (var14 > -1) {
               Q(var14);
            }
         } else if (bm <= -1) {
            e var18 = null;
            int var20;
            if ((var20 = f.g()) == 11 || var20 == 5) {
               bv = true;
            }

            if ((var20 = f.h()) == 11 || var20 == 5) {
               bv = false;
            }

            if (bu && (var20 == 11 || var20 == 5 || u || bv)) {
               var18 = e.a(0);
               if (d != null && d == var18 && (var20 == 11 || var20 == 5) && d.q != 49) {
                  Q(65539);
                  var18 = null;
               }
            }

            if (var18 != null) {
               if (bv) {
                  if (N == 0 && K == -1 && var18.a(1) && ++fD > 15) {
                     if (aN != 15 && K != 52 && K != 42 && var18.q != 49) {
                        f(false);
                        e = var18;
                        b(true, e);
                        aa(-1);
                        bu = false;
                        P(1);
                        bv = false;
                        f.j();
                        X(59);
                     }

                     fD = 0;
                  }
                  break label219;
               }

               l = var18;
               k = var18;
               if (u && var18.q != 49) {
                  u = false;
                  e(-1);
                  k = null;
               }
            }

            d(8, a);
            if (e != 0 && e != 1) {
               e(-1);
            }
         }

         l = null;
         if (f.h() != -1) {
            fD = 0;
         }
      }

      gH();
      d(2, a);
      ah++;
      ai = ai + f.V;
      au = au + f.V;
      new StringBuffer().append("G_DT : ").append(f.V).append(" ms");
      new StringBuffer().append("G_Update : ").append(System.currentTimeMillis() - var3).append(" ms");
      s();
      new StringBuffer().append("G_Paint : ").append(System.currentTimeMillis() - var1).append(" ms");
   }

   public final void hideNotify() {
      super.hideNotify();
      if (a != -1) {
         d(7, a);
         int var1;
         if ((var1 = a()) != 2 && var1 != true) {
            Z = true;
            gM();

            try {
               Thread.sleep(200L);
               return;
            } catch (Exception var2) {
            }
         }
      }
   }

   public final void showNotify() {
      super.showNotify();
      if (a != -1) {
         Z = false;
         if (O) {
            bd = false;
         }

         d(6, a);
      }
   }

   protected final void f() {
      super.f();
      b = null;
      c = null;
      f.a = null;
      f.a = null;
      f.l();
      f.k();
      d.a = null;

      for (int var1 = 0; var1 < 99; var1++) {
         int var2 = var1;

         try {
            if (a[var2] != null) {
               a[var2].close();
               a[var2] = null;
            }
         } catch (Exception var3) {
         }
      }

      GloftGF2M.a = null;
      bZ = null;
      ca = null;
      cb = null;
      j = null;
      k = null;
      l = null;
      cd = null;
      cc = null;
      m = null;
      n = null;
      o = null;
      ce = null;
      cf = null;
      k = null;
      cg = null;
      ch = null;
      ci = null;
      cj = null;
      ck = null;
      l = null;
      cl = null;
      cm = null;
      cn = null;
      co = null;
      cp = null;
      m = null;
      cq = null;
      cr = null;
      cs = null;
      ct = null;
      p = null;
      cu = null;
      cv = null;
      cw = null;
      cx = null;
      n = null;
      E = null;
      at = null;
      au = null;
      av = null;
      b = null;
      aw = null;
      ax = null;
      g = null;
      ay = null;
      d = null;
      az = null;
      aA = null;
      c = null;
      a = null;
      aB = null;
      aC = null;
      aD = null;
      aE = null;
      e = null;
      i = null;
      B = null;
      b = null;
      c = null;
      C = null;
      D = null;
      E = null;
      F = null;
      G = null;
      H = null;
      d = null;
      I = null;
      J = null;
      K = null;
      L = null;
      M = null;
      e = null;
      e = null;
      N = null;
      g = null;
   }

   private static void iE() {
      if (c[0] != null) {
         c[0].c();
      }

      if (c[1] != null) {
         c[1].c();
      }

      if (c[2] != null) {
         c[2].c();
      }

      if (c[3] != null) {
         c[3].c();
      }

      if (c[4] != null) {
         c[4].c();
      }
   }

   private static void iF() {
      fC = J;
   }

   private static void iG() {
      J = fC;
   }

   protected final void g() {
      super.g();
   }

   public static void h() {
      e[] var0 = new e[10];
      int var1 = e.a(2, 47, var0, 10);

      for (int var2 = 0; var2 < var1; var2++) {
         var0[var2].n = var0[var2].o + 20;
         var0[var2].d = true;
         var0[var2].w();
      }
   }

   static {
      int[] var10000 = new int[]{22, 21, 20};
      a = new ByteArrayInputStream[av];
      String[] var0 = new String[]{
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         ""
      };
      j[] var1 = new j[]{
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null,
         null
      };
      var10000 = new int[]{7, 7, 9, 13, 15, 7};
   }
}
