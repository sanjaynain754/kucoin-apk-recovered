package com.forter.mobile.fortersdk;

import android.app.Application;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.forter.mobile.fortersdk.C6514b.g;
import com.forter.mobile.fortersdk.C6514b.h;
import com.forter.mobile.fortersdk.C6514b.i;
import com.forter.mobile.fortersdk.models.NavigationType;
import com.forter.mobile.fortersdk.models.TrackType;
import p587r7.C43935a;
import p619s7.InterfaceC44358a;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.a */
/* JADX INFO: loaded from: classes.dex */
public class C6502a implements InterfaceC44358a {

    /* JADX INFO: renamed from: a */
    public static final C6502a f10797a = new C6502a();

    /* JADX INFO: renamed from: b */
    public static final C6514b f10798b = C6514b.m12151b();

    /* JADX INFO: renamed from: c */
    public static final C43935a f10799c = new C43935a();

    /* JADX INFO: renamed from: g */
    public static InterfaceC44358a m12060g() {
        return f10797a;
    }

    @Override // p619s7.InterfaceC44358a
    /* JADX INFO: renamed from: a */
    public C43935a mo12061a() {
        return f10799c;
    }

    @Override // p619s7.InterfaceC44358a
    /* JADX INFO: renamed from: b */
    public boolean mo12062b(@NonNull TrackType trackType) {
        return f10798b.m12160i(new C6599r3(trackType));
    }

    @Override // p619s7.InterfaceC44358a
    /* JADX INFO: renamed from: c */
    public boolean mo12063c(boolean z11) {
        C6514b c6514b = f10798b;
        if (c6514b.m12163l()) {
            return false;
        }
        c6514b.f10871a.execute(c6514b.new i(z11));
        return true;
    }

    @Override // p619s7.InterfaceC44358a
    /* JADX INFO: renamed from: d */
    public boolean mo12064d(@NonNull NavigationType navigationType, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return f10798b.m12160i(AbstractC6609t3.m12474a(navigationType, str, str2, str3, str4));
    }

    @Override // p619s7.InterfaceC44358a
    /* JADX INFO: renamed from: e */
    public void mo12065e(@NonNull Application application, @NonNull String str, @NonNull String str2) {
        m12067h(application, str, str2, "");
    }

    @Override // p619s7.InterfaceC44358a
    /* JADX INFO: renamed from: f */
    public boolean mo12066f(@NonNull TrackType trackType, @NonNull String str) {
        return f10798b.m12160i(new C6599r3(trackType, str));
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0002, B:6:0x001b, B:5:0x000a), top: B:10:0x0002 }] */
    /* JADX INFO: renamed from: h */
    public void m12067h(@NonNull Application application, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (str != null) {
            try {
                if (str.equals("")) {
                    C6514b.m12151b().m12158f(String.format("Tried to generate SDKConf without site ID. mobileUid: %s | accountId: %s", str2, str3));
                }
            } catch (Exception unused) {
                AbstractC6524c3.m12212d();
                return;
            }
        } else {
            C6514b.m12151b().m12158f(String.format("Tried to generate SDKConf without site ID. mobileUid: %s | accountId: %s", str2, str3));
        }
        C44699a c44699a = new C44699a(str, str2);
        c44699a.m98899y(str3);
        c44699a.m98900z(AbstractC6506a3.m12127u());
        c44699a.m98865B(0);
        m12068i(application, c44699a);
    }

    /* JADX INFO: renamed from: i */
    public void m12068i(@NonNull Application application, @NonNull C44699a c44699a) {
        try {
            C6514b c6514b = f10798b;
            c6514b.m12156c(C6514b.a.STARTING);
            if (application == null || application.getApplicationContext() == null || c44699a == null) {
                AbstractC6524c3.m12213e();
                c6514b.m12156c(C6514b.a.INVALID_CONF);
                c6514b.mo12155a(C6508aa.f10805b, null);
            } else {
                c6514b.f10871a.execute(c6514b.new g(c44699a, application));
            }
            AbstractC6524c3.m12211c("ForterSDK", String.format("[ForterSDK] Version %s (%s)", "2.4.12", 75));
        } catch (Exception unused) {
            AbstractC6524c3.m12212d();
        }
    }

    @Override // p619s7.InterfaceC44358a
    public void onLocationChanged(@NonNull Location location) {
        C6514b c6514b = f10798b;
        if (c6514b.m12163l()) {
            return;
        }
        c6514b.f10871a.execute(c6514b.new h(location));
    }
}
