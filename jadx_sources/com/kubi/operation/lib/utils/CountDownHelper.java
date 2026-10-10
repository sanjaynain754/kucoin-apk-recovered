package com.kubi.operation.lib.utils;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.kubi.event.api.C12572a;
import com.kubi.operation.lib.exception.OperationException;
import com.kubi.utils.C27100x0;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33844oi;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: CountDownHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u000bJ\u0016\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/operation/lib/utils/CountDownHelper;", "", "type", "Lcom/kubi/operation/lib/utils/CountdownType;", "<init>", "(Lcom/kubi/operation/lib/utils/CountdownType;)V", "countdownJob", "Lkotlinx/coroutines/Job;", "pageHide", "", "launchCountDown", "", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "time", "", "(Landroidx/lifecycle/LifecycleCoroutineScope;Ljava/lang/Long;)V", "isCountdownFinish", "onPageHide", C33675gh.f70005k, "list", "", "", "formatCountdown", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountDownHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountDownHelper.kt\ncom/kubi/operation/lib/utils/CountDownHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,144:1\n1#2:145\n47#3,4:146\n*S KotlinDebug\n*F\n+ 1 CountDownHelper.kt\ncom/kubi/operation/lib/utils/CountDownHelper\n*L\n50#1:146,4\n*E\n"})
public final class CountDownHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CountdownType f36841a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC41775x1 f36842b;

    /* JADX INFO: renamed from: c */
    public boolean f36843c;

    /* JADX INFO: renamed from: com.kubi.operation.lib.utils.CountDownHelper$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CountDownHelper.kt\ncom/kubi/operation/lib/utils/CountDownHelper\n+ 3 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n*L\n1#1,49:1\n51#2:50\n52#2:53\n45#3,2:51\n*S KotlinDebug\n*F\n+ 1 CountDownHelper.kt\ncom/kubi/operation/lib/utils/CountDownHelper\n*L\n51#1:51,2\n*E\n"})
    public static final class C19549b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new OperationException(exception, "CountDownHelper", false, null, 8, null), null, 2, null);
        }

        public C19549b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m43608l() {
        this.f36843c = true;
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.utils.CountDownHelper$a */
    /* JADX INFO: compiled from: CountDownHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C19548a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CountdownType.values().length];
            try {
                iArr[CountdownType.Bonus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountdownType.Welfare.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CountDownHelper(@NotNull CountdownType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f36841a = type;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m43603j(CountDownHelper countDownHelper, LifecycleCoroutineScope lifecycleCoroutineScope, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        countDownHelper.m43607i(lifecycleCoroutineScope, l11);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m43604k(CountDownHelper countDownHelper, Long l11, LifecycleCoroutineScope lifecycleCoroutineScope) {
        long jM43655c;
        Ref.LongRef longRef = new Ref.LongRef();
        int i11 = C19548a.$EnumSwitchMapping$0[countDownHelper.f36841a.ordinal()];
        if (i11 == 1) {
            if (l11 != null) {
                long jLongValue = l11.longValue();
                if (C19553c.m43655c() < 0) {
                    C19553c.m43659g(jLongValue / ((long) 1000));
                }
            }
            jM43655c = C19553c.m43655c();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (l11 != null) {
                long jLongValue2 = l11.longValue();
                if (C19553c.m43656d() < 0) {
                    C19553c.m43660h(jLongValue2 / ((long) 1000));
                }
            }
            jM43655c = C19553c.m43656d();
        }
        longRef.element = jM43655c;
        countDownHelper.f36843c = false;
        if (jM43655c <= 0) {
            InterfaceC41775x1 interfaceC41775x1 = countDownHelper.f36842b;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            countDownHelper.f36842b = null;
            countDownHelper.m43609m(countDownHelper.m43605g(0L));
            return Unit.INSTANCE;
        }
        InterfaceC41775x1 interfaceC41775x2 = countDownHelper.f36842b;
        if (interfaceC41775x2 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
        }
        countDownHelper.f36842b = null;
        countDownHelper.f36842b = C41696j.m91104d(lifecycleCoroutineScope, C42911a.m94120b().plus(new C19549b(CoroutineExceptionHandler.INSTANCE)), null, new CountDownHelper$launchCountDown$1$2(countDownHelper, longRef, null), 2, null);
        C19553c.f36857a.add(countDownHelper.f36842b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m43606h() {
        int i11 = C19548a.$EnumSwitchMapping$0[this.f36841a.ordinal()];
        if (i11 == 1) {
            return C19553c.m43655c() <= 0;
        }
        if (i11 == 2) {
            return C19553c.m43656d() <= 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public final void m43607i(@NotNull final LifecycleCoroutineScope lifecycleScope, @Nullable final Long l11) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.utils.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CountDownHelper.m43604k(this.f36854b, l11, lifecycleScope);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m43609m(List<String> list) {
        if (this.f36843c) {
            C44128b.m97259c("CountDownHelper", "pageHide(" + this.f36841a + ')');
            return;
        }
        CountdownType countdownType = this.f36841a;
        if (countdownType == CountdownType.Bonus) {
            C12572a.m23695d("OperationEvent:COUNT_DOWN_BONUS", list, 0L, 4, null);
        } else if (countdownType == CountdownType.Welfare) {
            C12572a.m23695d("OperationEvent:COUNT_DOWN_WELFARE", list, 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m43605g(long j11) {
        long j12 = 86400;
        long j13 = j11 / j12;
        long j14 = j11 - (j12 * j13);
        long j15 = 3600;
        long j16 = j14 / j15;
        long j17 = j14 - (j15 * j16);
        long j18 = 60;
        long j19 = j17 / j18;
        long j21 = j17 - (j18 * j19);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%1$02d:%2$02d:%3$02d:%4$02d", Arrays.copyOf(new Object[]{Long.valueOf(RangesKt.coerceAtMost(j13, 99L)), Long.valueOf(RangesKt.coerceAtMost(j16, 99L)), Long.valueOf(RangesKt.coerceAtMost(j19, 99L)), Long.valueOf(RangesKt.coerceAtMost(j21, 99L))}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return StringsKt.split$default((CharSequence) str, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null);
    }
}
