package com.tencent.bugly.proguard;

import android.os.Handler;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.thread.trace.QuickJavaThreadTrace;
import com.tencent.rmonitor.looper.MonitorInfo;
import com.tencent.rmonitor.looper.listener.IMonitorCallback;
import com.tencent.rmonitor.looper.provider.BaseStackProvider;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ve */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33982ve extends BaseStackProvider {

    /* JADX INFO: renamed from: e */
    public static final int f72362e = 100;

    /* JADX INFO: renamed from: b */
    public QuickJavaThreadTrace f72363b = null;

    /* JADX INFO: renamed from: c */
    public IMonitorCallback f72364c = null;

    /* JADX INFO: renamed from: d */
    public Handler f72365d = null;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ve$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MonitorInfo f72366b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ArrayList f72367c;

        public a(MonitorInfo monitorInfo, ArrayList arrayList) {
            this.f72366b = monitorInfo;
            this.f72367c = arrayList;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            this.f72366b.setCollectStackMsgCount(this.f72367c.size());
            this.f72366b.setQuickTraceFlag(true);
            long j11 = 0;
            this.f72366b.setCollectStackMsgDelayInMs(0L);
            if (this.f72367c.size() > 0) {
                Iterator it = this.f72367c.iterator();
                while (it.hasNext()) {
                    j11 += ((C34024xg) it.next()).f72531e;
                }
            }
            this.f72366b.setCollectStackMsgCostInUs(j11);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                ArrayList<b> arrayListM75306a = C33982ve.this.m75306a((ArrayList<C34024xg>) this.f72367c);
                if (arrayListM75306a != null && arrayListM75306a.size() > 0) {
                    for (b bVar : arrayListM75306a) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", C33789m5.f70921k);
                        jSONObject2.put("thread_name", this.f72366b.getThreadName());
                        jSONObject2.put("thread_id", this.f72366b.getThreadId());
                        jSONObject2.put("index", bVar.f72372d);
                        jSONObject2.put("repeat_count", bVar.f72371c);
                        jSONObject2.put("timestamp", bVar.f72369a);
                        jSONObject2.put(C33675gh.f70010p, bVar.f72370b);
                        jSONObject2.put("call_stack", bVar.f72373e);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("stacks", jSONArray);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            this.f72366b.setFullStack(jSONObject);
            C33982ve.this.f72364c.onAfterStack(this.f72366b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ve$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b {

        /* JADX INFO: renamed from: a */
        public long f72369a;

        /* JADX INFO: renamed from: b */
        public long f72370b;

        /* JADX INFO: renamed from: c */
        public int f72371c;

        /* JADX INFO: renamed from: d */
        public int f72372d;

        /* JADX INFO: renamed from: e */
        public String f72373e;

        public b() {
        }
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void dispatchEnd(@NotNull MonitorInfo monitorInfo, long j11, long j12) {
        QuickJavaThreadTrace quickJavaThreadTrace = this.f72363b;
        if (quickJavaThreadTrace != null) {
            quickJavaThreadTrace.m77126e();
        }
        if (j12 > getLagParam().f71551b) {
            appendData(monitorInfo);
            m75308a(monitorInfo.copy(), this.f72363b.m77121a(monitorInfo.getLastStackRequestTime(), j11));
        }
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void dispatchStart(@NotNull MonitorInfo monitorInfo, long j11) {
        QuickJavaThreadTrace quickJavaThreadTrace = this.f72363b;
        if (quickJavaThreadTrace != null) {
            quickJavaThreadTrace.m77125d();
        }
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public boolean init(@NotNull IMonitorCallback iMonitorCallback) {
        boolean zM73793d;
        boolean zM73792c;
        if (this.f72363b == null) {
            C33694hf c33694hf = ConfigProxy.INSTANCE.getConfig().m77072c("looper_stack").config;
            if (c33694hf instanceof C33753kb) {
                C33753kb c33753kb = (C33753kb) c33694hf;
                zM73793d = c33753kb.m73793d();
                zM73792c = c33753kb.m73792c();
            } else {
                zM73793d = true;
                zM73792c = false;
            }
            QuickJavaThreadTrace quickJavaThreadTrace = new QuickJavaThreadTrace(getLooperThread(), zM73793d, zM73792c);
            this.f72363b = quickJavaThreadTrace;
            if (!quickJavaThreadTrace.m77124b()) {
                return false;
            }
        }
        this.f72364c = iMonitorCallback;
        this.f72363b.m77123a(((int) getLagParam().f71553d) * 1000, 100);
        this.f72363b.m77125d();
        this.f72365d = new Handler(ThreadManager.getMonitorThreadLooper());
        return true;
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void release() {
        QuickJavaThreadTrace quickJavaThreadTrace = this.f72363b;
        if (quickJavaThreadTrace != null) {
            quickJavaThreadTrace.m77126e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<b> m75306a(ArrayList<C34024xg> arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        b bVar = new b();
        int i11 = 0;
        bVar.f72369a = arrayList.get(0).f72529c;
        bVar.f72370b = (arrayList.get(0).f72531e / 1000) + arrayList.get(0).f72529c;
        bVar.f72371c = 1;
        bVar.f72373e = arrayList.get(0).f72528b;
        bVar.f72372d = 0;
        ArrayList<b> arrayList2 = new ArrayList<>();
        arrayList2.add(bVar);
        for (int i12 = 1; i12 < arrayList.size(); i12++) {
            if (arrayList.get(i12).f72528b.equals(bVar.f72373e)) {
                bVar.f72371c++;
                bVar.f72370b = (arrayList.get(i12).f72531e / 1000) + arrayList.get(i12).f72529c;
            } else {
                i11++;
                bVar = new b();
                bVar.f72369a = arrayList.get(i12).f72529c;
                bVar.f72370b = (arrayList.get(i12).f72531e / 1000) + arrayList.get(i12).f72529c;
                bVar.f72371c = 1;
                bVar.f72373e = arrayList.get(i12).f72528b;
                bVar.f72372d = i11;
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public boolean m75309b() {
        return QuickJavaThreadTrace.m77120c();
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void checkStackTraceNormal() {
    }

    /* JADX INFO: renamed from: a */
    public final void m75308a(MonitorInfo monitorInfo, ArrayList<C34024xg> arrayList) {
        this.f72365d.post(new a(monitorInfo, arrayList));
    }

    /* JADX INFO: renamed from: a */
    public void m75307a() {
        QuickJavaThreadTrace quickJavaThreadTrace = this.f72363b;
        if (quickJavaThreadTrace != null) {
            quickJavaThreadTrace.m77122a();
        }
    }
}
