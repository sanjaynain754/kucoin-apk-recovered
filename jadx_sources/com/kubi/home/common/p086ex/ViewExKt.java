package com.kubi.home.common.p086ex;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.C5303w0;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.kubi.home.exception.HomeException;
import com.kubi.mvi.common.C19241c;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.sdk.BaseApplication;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p419l2.InterfaceC42031e;
import p445m2.AbstractC42400k;
import p445m2.InterfaceC42399j;
import p569qq.C43846g;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ViewEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0004\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a,\u0010\r\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0013\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0013¨\u0006\u0015"}, m90084d2 = {"itemTopMargin", "", "Landroidx/recyclerview/widget/RecyclerView;", "space", "", "loadIcon", "Landroid/widget/ImageView;", "url", "", "defaultIcon", "isLayoutRtl", "", "Landroid/view/View;", "loadImage", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "styleSize", "Lcom/kubi/home/shortcut/IndicatorView;", "gravityStart", "Landroid/widget/LinearLayout;", "gravityCenter", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewEx.kt\ncom/kubi/home/common/ex/ViewExKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,135:1\n50#2,17:136\n1#3:153\n47#4,2:154\n*S KotlinDebug\n*F\n+ 1 ViewEx.kt\ncom/kubi/home/common/ex/ViewExKt\n*L\n47#1:136,17\n58#1:154,2\n*E\n"})
public final class ViewExKt {

    /* JADX INFO: renamed from: com.kubi.home.common.ex.ViewExKt$a */
    /* JADX INFO: compiled from: ViewEx.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, m90084d2 = {"com/kubi/home/common/ex/ViewExKt$loadImage$1$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", InterfaceC33617e1.f69660i, KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/bumptech/glide/load/DataSource;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14531a implements InterfaceC42031e<Drawable> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<Boolean, Unit> f25613b;

        /* JADX WARN: Multi-variable type inference failed */
        public C14531a(Function1<? super Boolean, Unit> function1) {
            this.f25613b = function1;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo20017b(Drawable drawable, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, DataSource dataSource, boolean z11) {
            this.f25613b.invoke(Boolean.TRUE);
            C4988a.m5286a("glide read resource success", "glide");
            return false;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: d */
        public boolean mo20018d(GlideException glideException, Object obj, InterfaceC42399j<Drawable> interfaceC42399j, boolean z11) {
            C4988a.m5286a("glide read resource fail", "glide");
            if (glideException != null) {
                C4988a.m5289d(glideException, "glide");
            }
            this.f25613b.invoke(Boolean.FALSE);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m29090a(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        linearLayout.setGravity(17);
    }

    /* JADX INFO: renamed from: b */
    public static final void m29091b(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        linearLayout.setGravity(GravityCompat.START);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m29092c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C5303w0.m6511a() || 1 == view.getLayoutDirection();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x000d, B:5:0x0012, B:13:0x0037, B:15:0x006a, B:14:0x004a, B:11:0x001e), top: B:30:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:14:0x004a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x000d, B:5:0x0012, B:13:0x0037, B:15:0x006a, B:14:0x004a, B:11:0x001e), top: B:30:0x000d }] */
    /* JADX INFO: renamed from: d */
    public static final void m29093d(@NotNull ImageView imageView, @Nullable String str, int i11) throws Throwable {
        Object objM103844constructorimpl;
        AbstractC42400k<ImageView, Drawable> abstractC42400kM6594E0;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str == null || str.length() == 0) {
                if (i11 != -1) {
                    abstractC42400kM6594E0 = ComponentCallbacks2C5309c.m6556t(BaseApplication.INSTANCE.get()).mo6632t(Integer.valueOf(i11)).m6594E0(imageView);
                } else if (i11 == -1) {
                    abstractC42400kM6594E0 = ComponentCallbacks2C5309c.m6556t(BaseApplication.INSTANCE.get()).mo6634v(str).m6594E0(imageView);
                } else {
                    BaseApplication.Companion companion2 = BaseApplication.INSTANCE;
                    abstractC42400kM6594E0 = ComponentCallbacks2C5309c.m6556t(companion2.get()).mo6634v(str).mo92190c0(companion2.get().getDrawable(i11)).m6594E0(imageView);
                }
            } else if (i11 == -1) {
                abstractC42400kM6594E0 = ComponentCallbacks2C5309c.m6556t(BaseApplication.INSTANCE.get()).mo6634v(str).m6594E0(imageView);
            } else {
                BaseApplication.Companion companion3 = BaseApplication.INSTANCE;
                abstractC42400kM6594E0 = ComponentCallbacks2C5309c.m6556t(companion3.get()).mo6634v(str).mo92190c0(companion3.get().getDrawable(i11)).m6594E0(imageView);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(abstractC42400kM6594E0);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【loadIcon 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl2, "ViewEx", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m29094e(ImageView imageView, String str, int i11, int i12, Object obj) throws Throwable {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        m29093d(imageView, str, i11);
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
            objM103844constructorimpl = Result.m103844constructorimpl(C46338a.m102152b(imageView).mo6634v(str).mo6596G0(new C14531a(callback)).m6594E0(imageView));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(Boolean.FALSE);
        }
    }
}
