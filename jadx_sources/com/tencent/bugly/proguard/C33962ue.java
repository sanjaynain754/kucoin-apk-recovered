package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ue */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33962ue {
    /* JADX INFO: renamed from: a */
    public static C33944tg m75182a(UserInfoBean userInfoBean, C33765l2 c33765l2) {
        if (userInfoBean == null) {
            return null;
        }
        C33944tg c33944tg = new C33944tg();
        c33944tg.f72113q = userInfoBean.f68543f;
        c33944tg.f72117u = userInfoBean.f68548k;
        c33944tg.f72116t = userInfoBean.f68541d;
        c33944tg.f72115s = userInfoBean.f68542e;
        c33944tg.f72120x = userInfoBean.f68553p == 1;
        int i11 = userInfoBean.f68540c;
        if (i11 == 1) {
            c33944tg.f72114r = (byte) 1;
        } else if (i11 == 2) {
            c33944tg.f72114r = (byte) 4;
        } else if (i11 == 3) {
            c33944tg.f72114r = (byte) 2;
        } else if (i11 == 4) {
            c33944tg.f72114r = (byte) 3;
        } else if (i11 == 8) {
            c33944tg.f72114r = (byte) 8;
        } else if (i11 == 9) {
            c33944tg.f72114r = (byte) 9;
        } else {
            if (i11 < 10 || i11 >= 20) {
                C34012x4.m75437b("unknown uinfo type %d ", Integer.valueOf(i11));
                return null;
            }
            c33944tg.f72114r = (byte) i11;
        }
        HashMap map = new HashMap();
        c33944tg.f72118v = map;
        if (userInfoBean.f68554q >= 0) {
            map.put(C33556b3.f69012X1, "" + userInfoBean.f68554q);
        }
        if (userInfoBean.f68555r >= 0) {
            c33944tg.f72118v.put(C33556b3.f69015Y1, "" + userInfoBean.f68555r);
        }
        Map<String, String> map2 = userInfoBean.f68556s;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f68556s.entrySet()) {
                c33944tg.f72118v.put(C33556b3.f69018Z1 + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = userInfoBean.f68557t;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f68557t.entrySet()) {
                c33944tg.f72118v.put(C33556b3.f69022a2 + entry2.getKey(), entry2.getValue());
            }
        }
        c33944tg.f72118v.put(C33556b3.f69033d1, "" + (true ^ userInfoBean.f68550m));
        c33944tg.f72118v.put(C33556b3.f68950F2, "" + userInfoBean.f68545h);
        c33944tg.f72118v.put(C33556b3.f68954G2, "" + userInfoBean.f68546i);
        c33944tg.f72118v.put(C33556b3.f68958H2, "" + userInfoBean.f68548k);
        c33944tg.f72118v.put(C33556b3.f68962I2, "" + userInfoBean.f68547j);
        c33944tg.f72118v.put(C33556b3.f68966J2, "" + userInfoBean.f68551n);
        c33944tg.f72118v.put(C33556b3.f68982N2, "" + userInfoBean.f68549l);
        String strM72174a = userInfoBean.m72174a("user_custom");
        if (!TextUtils.isEmpty(strM72174a)) {
            c33944tg.f72118v.put("C04_user_custom", strM72174a);
        }
        C34012x4.m75434a("summary type %d vm:%d", Byte.valueOf(c33944tg.f72114r), Integer.valueOf(c33944tg.f72118v.size()));
        return c33944tg;
    }

    /* JADX INFO: renamed from: a */
    public static C34005wh m75184a(List<UserInfoBean> list, int i11) {
        C33765l2 c33765l2M73827s;
        if (list == null || list.size() == 0 || (c33765l2M73827s = C33765l2.m73827s()) == null) {
            return null;
        }
        c33765l2M73827s.m73844Q();
        C34005wh c34005wh = new C34005wh();
        c34005wh.f72464r = c33765l2M73827s.f70745f;
        c34005wh.f72465s = c33765l2M73827s.m73890n();
        ArrayList<C33944tg> arrayList = new ArrayList<>();
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            C33944tg c33944tgM75182a = m75182a(it.next(), c33765l2M73827s);
            if (c33944tgM75182a != null) {
                arrayList.add(c33944tgM75182a);
            }
        }
        c34005wh.f72466t = arrayList;
        HashMap map = new HashMap();
        c34005wh.f72467u = map;
        map.put(C33556b3.f68936C0, "");
        c34005wh.f72467u.put(C33556b3.f68932B0, "" + c33765l2M73827s.m73884k());
        c34005wh.f72467u.put(C33556b3.f68928A0, "" + c33765l2M73827s.m73888m());
        c34005wh.f72467u.put(C33556b3.f69120z0, "" + c33765l2M73827s.m73830C());
        c34005wh.f72467u.put(C33556b3.f69116y0, "" + c33765l2M73827s.m73830C());
        c34005wh.f72467u.put(C33556b3.f68993R0, "" + c33765l2M73827s.f70763o);
        c34005wh.f72467u.put(C33556b3.f68964J0, "" + c33765l2M73827s.m73832E());
        c34005wh.f72467u.put(C33556b3.f68984O0, "" + c33765l2M73827s.m73882j());
        c34005wh.f72467u.put(C33556b3.f68960I0, "" + c33765l2M73827s.m73896t());
        c34005wh.f72467u.put(C33556b3.f68974L2, "" + c33765l2M73827s.f70744e0);
        c34005wh.f72467u.put(C33556b3.f68978M2, "" + c33765l2M73827s.f70746f0);
        Map<String, String> mapM73878h = c33765l2M73827s.m73878h();
        if (mapM73878h != null && mapM73878h.size() > 0) {
            for (Map.Entry<String, String> entry : mapM73878h.entrySet()) {
                c34005wh.f72467u.put(C33556b3.f69022a2 + entry.getKey(), entry.getValue());
            }
        }
        if (i11 == 1) {
            c34005wh.f72463q = (byte) 1;
            return c34005wh;
        }
        if (i11 != 2) {
            C34012x4.m75437b("unknown up type %d ", Integer.valueOf(i11));
            return null;
        }
        c34005wh.f72463q = (byte) 2;
        return c34005wh;
    }

    /* JADX INFO: renamed from: a */
    public static <T extends JceStruct> T m75180a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C33752ka c33752ka = new C33752ka(bArr);
                c33752ka.f70614b = "utf-8";
                tNewInstance.mo72268a(c33752ka);
                return tNewInstance;
            } catch (Throwable th2) {
                if (!C34012x4.m75435a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C33943tf m75181a(Context context, int i11, boolean z11, byte[] bArr) {
        String str;
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        StrategyBean strategyBeanM74582c = C33863pg.m74576b().m74582c();
        if (c33765l2M73827s != null && strategyBeanM74582c != null) {
            try {
                C33943tf c33943tf = new C33943tf();
                synchronized (c33765l2M73827s) {
                    try {
                        c33943tf.f72102q = c33765l2M73827s.f70741d;
                        c33943tf.f72103r = c33765l2M73827s.m73872e();
                        c33943tf.f72104s = c33765l2M73827s.f70743e;
                        c33943tf.f72105t = c33765l2M73827s.f70714F;
                        c33943tf.f72106u = c33765l2M73827s.m73868d();
                        c33943tf.f72107v = c33765l2M73827s.f70755k;
                        c33943tf.f72108w = i11;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        c33943tf.f72109x = bArr;
                        c33943tf.f72110y = c33765l2M73827s.m73892o();
                        c33943tf.f72111z = c33765l2M73827s.f70763o;
                        c33943tf.f72088A = new HashMap();
                        c33943tf.f72089B = c33765l2M73827s.m73829B();
                        c33943tf.f72090C = strategyBeanM74582c.f68577m;
                        c33943tf.f72092E = c33765l2M73827s.m73890n();
                        c33943tf.f72093F = C33830o4.m74391a(context);
                        c33943tf.f72094G = System.currentTimeMillis();
                        c33943tf.f72096I = c33765l2M73827s.m73899w();
                        c33943tf.f72100M = c33943tf.f72093F;
                        c33943tf.f72091D = "com.tencent.bugly";
                        c33943tf.f72088A.put(C33556b3.f68999T0, "" + c33765l2M73827s.m73900x());
                        c33943tf.f72088A.put(C33577c3.f69363t, "");
                        c33943tf.f72088A.put(C33577c3.f69364u, "" + c33765l2M73827s.m73836I());
                        c33943tf.f72088A.put(C33577c3.f69352i, "" + c33765l2M73827s.f70752i0);
                        c33943tf.f72088A.put(C33577c3.f69353j, "" + c33765l2M73827s.f70750h0);
                        c33943tf.f72088A.put(C33577c3.f69346c, "" + c33765l2M73827s.f70716H);
                        List<AbstractC33575c1> list = C33900rc.f71635d;
                        if (list != null) {
                            for (AbstractC33575c1 abstractC33575c1 : list) {
                                String str2 = abstractC33575c1.f69319c;
                                if (str2 != null && (str = abstractC33575c1.f69320d) != null) {
                                    c33943tf.f72088A.put(str2, str);
                                }
                            }
                        }
                        c33943tf.f72088A.put(C33577c3.f69348e, C33955u7.m75163c().m75164a());
                        c33943tf.f72088A.put(C33577c3.f69347d, C33955u7.m75163c().m75167b());
                        c33943tf.f72088A.put("G10", C33571bi.m72604b("G10", ""));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Map<String, String> mapM73876g = c33765l2M73827s.m73876g();
                if (mapM73876g != null) {
                    for (Map.Entry<String, String> entry : mapM73876g.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            c33943tf.f72088A.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return c33943tf;
            } catch (Throwable th3) {
                if (!C34012x4.m75435a(th3)) {
                    th3.printStackTrace();
                }
                return null;
            }
        }
        C34012x4.m75437b("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m75186a(Object obj) {
        try {
            C33822nh c33822nh = new C33822nh();
            c33822nh.mo74163g();
            c33822nh.f71936d = "utf-8";
            C33923sf c33923sf = c33822nh.f71179i;
            c33923sf.f71980t = 1;
            c33923sf.f71981u = C33556b3.f68971L;
            c33923sf.f71982v = "sync";
            c33822nh.mo74149b(C33556b3.f68963J, obj);
            return c33822nh.mo74151b();
        } catch (Throwable th2) {
            if (C34012x4.m75435a(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33983vf m75183a(byte[] bArr, StrategyBean strategyBean, boolean z11) {
        if (bArr != null) {
            try {
                C33822nh c33822nh = new C33822nh();
                c33822nh.mo74163g();
                c33822nh.f71936d = "utf-8";
                c33822nh.mo74145a(bArr);
                Object objM74155d = c33822nh.m74155d(C33556b3.f68963J, new C33983vf());
                if (C33983vf.class.isInstance(objM74155d)) {
                    return (C33983vf) C33983vf.class.cast(objM74155d);
                }
                return null;
            } catch (Throwable th2) {
                if (!C34012x4.m75435a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m75185a(JceStruct jceStruct) {
        try {
            C33773la c33773la = new C33773la(128);
            c33773la.f70834b = "utf-8";
            jceStruct.mo72269a(c33773la);
            return c33773la.m73973b();
        } catch (Throwable th2) {
            if (C34012x4.m75435a(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
