package com.kubi.redpackage.utils;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.redpackage.exception.RedPkgMessage;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.InterfaceC42031e;
import p445m2.InterfaceC42399j;
import p569qq.C43840a;
import p569qq.C43846g;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: StringsExt.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u0016\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\f\u001a\u0018\u0010\r\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¨\u0006\u0010"}, m90084d2 = {"loadImage", "", "Landroid/widget/ImageView;", "url", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "safeDouble", "", "default", "safeBigDecimal", "Ljava/math/BigDecimal;", "maxLengthWithEllipsis", "maxLength", "", "RedpackageLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStringsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsExt.kt\ncom/kubi/redpackage/utils/StringsExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RedPackageIssue.kt\ncom/kubi/redpackage/exception/RedPackageIssueKt\n*L\n1#1,100:1\n1#2:101\n48#3,2:102\n*S KotlinDebug\n*F\n+ 1 StringsExt.kt\ncom/kubi/redpackage/utils/StringsExtKt\n*L\n97#1:102,2\n*E\n"})
public final class StringsExtKt {

    /* JADX INFO: renamed from: com.kubi.redpackage.utils.StringsExtKt$a */
    /* JADX INFO: compiled from: StringsExt.kt */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, m90084d2 = {"com/kubi/redpackage/utils/StringsExtKt$loadImage$1$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", InterfaceC33617e1.f69660i, KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/bumptech/glide/load/DataSource;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22872a implements InterfaceC42031e<Drawable> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<Boolean, Unit> f43383b;

        /* JADX WARN: Multi-variable type inference failed */
        public C22872a(Function1<? super Boolean, Unit> function1) {
            this.f43383b = function1;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo20017b(Drawable drawable, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, DataSource dataSource, boolean z11) {
            this.f43383b.invoke(Boolean.TRUE);
            return false;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: d */
        public boolean mo20018d(GlideException glideException, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, boolean z11) {
            this.f43383b.invoke(Boolean.FALSE);
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m54089a(@Nullable String str, int i11) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            if (str.length() <= i11) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = str.substring(0, i11 - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append(Typography.ellipsis);
            return sb2.toString();
        } catch (Throwable th2) {
            String message = th2.getMessage();
            C43846g.m96568c(new RedPkgMessage(message == null ? "" : message, "Redpack", false, 4, null), null, 2, null);
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m54090b(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 50;
        }
        return m54089a(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final BigDecimal m54091c(@Nullable String str, @NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "default");
        if (str != null && str.length() != 0) {
            try {
                Double.parseDouble(str);
                return DowngradeExKt.m66534d(str, bigDecimal);
            } catch (Throwable th2) {
                C43840a.m96550d("redpackage-safeBigDecimal: " + th2.getMessage(), "Redpack");
            }
        }
        return bigDecimal;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BigDecimal m54092d(String str, BigDecimal ZERO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        return m54091c(str, ZERO);
    }

    /* JADX INFO: renamed from: e */
    public static final double m54093e(@Nullable String str, double d11) {
        if (str != null && str.length() != 0) {
            try {
                return Double.parseDouble(str);
            } catch (Throwable th2) {
                C43840a.m96550d("redpackage-safeDouble: " + th2.getMessage(), "Redpack");
            }
        }
        return d11;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ double m54094f(String str, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = 0.0d;
        }
        return m54093e(str, d11);
    }

    @Keep
    public static final void loadImage(@Nullable ImageView imageView, @Nullable String str, @NotNull Function1<? super Boolean, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (str == null || str.length() == 0 || imageView == null) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C46338a.m102152b(imageView).mo6634v(str).mo6596G0(new C22872a(callback)).m6594E0(imageView));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE);
        }
    }
}
