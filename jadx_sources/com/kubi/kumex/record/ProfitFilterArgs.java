package com.kubi.kumex.record;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.dialog.BaseTime;
import com.kubi.kumex.dialog.CustomTime;
import com.kubi.kumex.dialog.RangeTime;
import com.kubi.kumex.utils.RotateDrawable;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.record.r0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ProfitRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\f\u0010\u001b\u001a\u00020\u001c*\u00020\u0016H\u0002J\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0016H\u0002J\f\u0010\u001e\u001a\u00020\u001c*\u00020\u0016H\u0002R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitFilterArgs;", "", "symbol", "", FirebaseAnalytics.Param.CURRENCY, "time", "Lcom/kubi/kumex/dialog/BaseTime;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/kumex/dialog/BaseTime;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getTime", "()Lcom/kubi/kumex/dialog/BaseTime;", "setTime", "(Lcom/kubi/kumex/dialog/BaseTime;)V", "getContractShow", "", "select", "", "getTimeShow", "buildText", "Lcom/kubi/utils/StyledText;", "text", "toAngle", "", "toTriangleColor", "toColor", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProfitFilterArgs {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f30327a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f30328b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public BaseTime f30329c;

    public ProfitFilterArgs() {
        this(null, null, null, 7, null);
    }

    public ProfitFilterArgs(@Nullable String str, @Nullable String str2, @NotNull BaseTime time) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.f30327a = str;
        this.f30328b = str2;
        this.f30329c = time;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27096v0 m35811b(ProfitFilterArgs profitFilterArgs, CharSequence charSequence, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return profitFilterArgs.m35814a(charSequence, z11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ CharSequence m35812d(ProfitFilterArgs profitFilterArgs, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return profitFilterArgs.m35815c(z11);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m35813i(ProfitFilterArgs profitFilterArgs, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return profitFilterArgs.m35819h(z11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27096v0 m35814a(@NotNull CharSequence text, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        c27096v0.m66905e(text, c27017c.m66512a(m35823m(z11)));
        c27096v0.append("  ");
        RotateDrawable rotateDrawable = new RotateDrawable(ViewExKt.m36481g(C27017c.m66510d(c27017c, R$mipmap.ic_drop_triangle, null, 2, null), m35824n(z11)), m35822l(z11));
        rotateDrawable.setBounds(0, 0, rotateDrawable.getMinimumWidth(), rotateDrawable.getMinimumHeight());
        c27096v0.m66906f(rotateDrawable);
        return c27096v0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final CharSequence m35815c(boolean z11) {
        CharSequence charSequenceM66667g;
        if (TextUtils.isEmpty(this.f30327a)) {
            charSequenceM66667g = C27017c.f54310a.m66516f(R$string.futures, new Object[0]);
        } else {
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(this.f30327a), false, 2, null);
            charSequenceM66667g = C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null, C27041f.m66668h(this.f30327a));
        }
        return m35814a(charSequenceM66667g, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF30328b() {
        return this.f30328b;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF30327a() {
        return this.f30327a;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BaseTime getF30329c() {
        return this.f30329c;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final CharSequence m35819h(boolean z11) {
        String strM66516f;
        BaseTime baseTime = this.f30329c;
        if (baseTime == null) {
            return m35814a(C27017c.f54310a.m66516f(R$string.time, new Object[0]), z11);
        }
        if (baseTime instanceof RangeTime) {
            Intrinsics.checkNotNull(baseTime, "null cannot be cast to non-null type com.kubi.kumex.dialog.RangeTime");
            int f28887a = ((RangeTime) baseTime).getF28887a();
            if (f28887a == R$id.sevenDay) {
                strM66516f = C27017c.f54310a.m66516f(R$string.seven_day, new Object[0]);
            } else {
                strM66516f = f28887a == R$id.oneMonth ? C27017c.f54310a.m66516f(R$string.one_month, new Object[0]) : C27017c.f54310a.m66516f(R$string.three_month, new Object[0]);
            }
            return m35814a(strM66516f, z11);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd");
        BaseTime baseTime2 = this.f30329c;
        Intrinsics.checkNotNull(baseTime2, "null cannot be cast to non-null type com.kubi.kumex.dialog.CustomTime");
        Date date = new Date(((CustomTime) baseTime2).m33594d());
        BaseTime baseTime3 = this.f30329c;
        Intrinsics.checkNotNull(baseTime3, "null cannot be cast to non-null type com.kubi.kumex.dialog.CustomTime");
        return m35814a(simpleDateFormat.format(date) + '-' + simpleDateFormat.format(new Date(((CustomTime) baseTime3).m33593c())), z11);
    }

    /* JADX INFO: renamed from: j */
    public final void m35820j(@Nullable String str) {
        this.f30327a = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m35821k(@NotNull BaseTime baseTime) {
        Intrinsics.checkNotNullParameter(baseTime, "<set-?>");
        this.f30329c = baseTime;
    }

    /* JADX INFO: renamed from: l */
    public final int m35822l(boolean z11) {
        return z11 ? 180 : 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m35823m(boolean z11) {
        return z11 ? R$color.primary : R$color.c_text40;
    }

    /* JADX INFO: renamed from: n */
    public final int m35824n(boolean z11) {
        return z11 ? R$color.primary : R$color.c_icon60;
    }

    public /* synthetic */ ProfitFilterArgs(String str, String str2, BaseTime baseTime, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? new RangeTime(R$id.sevenDay) : baseTime);
    }
}
