package dj;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.kubi.home.exception.HomeException;
import com.kubi.home.exception.HomeGlideException;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.sdk.BaseApplication;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p058cj.C4988a;
import p419l2.InterfaceC42031e;
import p445m2.InterfaceC42399j;
import p481ny.C42899b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: dj.a */
/* JADX INFO: compiled from: CommonEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0086\b¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f*\u0002H\u000f¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f*\u0002H\u000f¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0086\b¢\u0006\u0002\u0010\f\u001a5\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u001c\u0010\u001a\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001b¢\u0006\u0002\u0010\u001d\u001a\u0018\u0010\u001e\u001a\u00020\u0001*\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f\u001a\u0010\u0010 \u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\"\u001a\u00020\u0001*\u0004\u0018\u00010#\"\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m90084d2 = {"homeExpose", "", "pageId", "", "blockId", "locationId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "homeClick", "min", "", "", "([I)Ljava/lang/Integer;", "isNull", "", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Z", "isNotNull", "max", "logTag", "", "getLogTag", "(Ljava/lang/Object;)Ljava/lang/String;", "repeat", "Lkotlinx/coroutines/CoroutineScope;", "times", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineScope;ILkotlin/jvm/functions/Function1;)V", "check", "Lkotlin/Function0;", "downloadBitmap", "url", "ensureSafeCreateFragment", "Landroidx/fragment/app/FragmentManager;", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonEx.kt\ncom/kubi/home/common/ex/CommonExKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n50#2,17:195\n63#3,5:212\n68#3:219\n71#3,4:221\n1761#4,2:217\n1763#4:220\n*S KotlinDebug\n*F\n+ 1 CommonEx.kt\ncom/kubi/home/common/ex/CommonExKt\n*L\n134#1:195,17\n162#1:212,5\n162#1:219\n162#1:221,4\n162#1:217,2\n162#1:220\n*E\n"})
public final class C36716a {

    /* JADX INFO: renamed from: dj.a$a */
    /* JADX INFO: compiled from: CommonEx.kt */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, m90084d2 = {"com/kubi/home/common/ex/CommonExKt$downloadBitmap$1$1", "Lcom/bumptech/glide/request/RequestListener;", "Ljava/io/File;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", InterfaceC33617e1.f69660i, KlineFlutterMiniConstants.PROP_DATA_SOURCE, "Lcom/bumptech/glide/load/DataSource;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC42031e<File> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f79630b;

        public a(String str) {
            this.f79630b = str;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo20017b(File file, Object obj, InterfaceC42399j<File> interfaceC42399j, DataSource dataSource, boolean z11) {
            C4988a.m5286a("glide load success:" + this.f79630b, "glide");
            return false;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: d */
        public boolean mo20018d(GlideException glideException, Object obj, InterfaceC42399j<File> interfaceC42399j, boolean z11) {
            C4988a.m5286a("glide load fail:" + this.f79630b + " \n" + Log.getStackTraceString(glideException), "glide");
            return false;
        }
    }

    /* JADX INFO: renamed from: dj.a$b */
    /* JADX INFO: compiled from: CommonEx.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/home/common/ex/CommonExKt$ensureSafeCreateFragment$1", "Landroidx/fragment/app/FragmentFactory;", "instantiate", "Landroidx/fragment/app/Fragment;", "classLoader", "Ljava/lang/ClassLoader;", "className", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCommonEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonEx.kt\ncom/kubi/home/common/ex/CommonExKt$ensureSafeCreateFragment$1\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,194:1\n47#2,2:195\n47#2,2:197\n*S KotlinDebug\n*F\n+ 1 CommonEx.kt\ncom/kubi/home/common/ex/CommonExKt$ensureSafeCreateFragment$1\n*L\n177#1:195,2\n185#1:197,2\n*E\n"})
    public static final class b extends FragmentFactory {
        @Override // androidx.fragment.app.FragmentFactory
        public Fragment instantiate(ClassLoader classLoader, String className) {
            Intrinsics.checkNotNullParameter(classLoader, "classLoader");
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                Fragment fragmentInstantiate = super.instantiate(classLoader, className);
                Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "instantiate(...)");
                return fragmentInstantiate;
            } catch (Throwable th2) {
                C44128b.m97263g("home_card", th2);
                C43846g.m96568c(new HomeException(th2, "HomeFragment", false, null, 8, null), null, 2, null);
                try {
                    Object objNewInstance = Class.forName(className, false, classLoader).newInstance();
                    if (objNewInstance instanceof Fragment) {
                        return (Fragment) objNewInstance;
                    }
                } catch (Throwable th3) {
                    C44128b.m97263g("home_card", th3);
                    C43846g.m96568c(new HomeException(th3, "HomeFragment", false, null, 8, null), null, 2, null);
                }
                return new Fragment();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m82238a(boolean z11, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z11) {
            block.invoke();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m82239b(@Nullable String str) throws Throwable {
        Object objM103844constructorimpl;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ComponentCallbacks2C5309c.m6556t(BaseApplication.INSTANCE.get()).mo6627o().mo6601L0(str).mo6596G0(new a(str)).m6604O0().get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【CommonEx 发生错误:needCatch->true】", thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            if (thM103847exceptionOrNullimpl2.getCause() instanceof GlideException) {
                Throwable cause = thM103847exceptionOrNullimpl2.getCause();
                Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type com.bumptech.glide.load.engine.GlideException");
                List<Throwable> rootCauses = ((GlideException) cause).getRootCauses();
                Intrinsics.checkNotNullExpressionValue(rootCauses, "getRootCauses(...)");
                if (rootCauses == null || !rootCauses.isEmpty()) {
                    for (Throwable th3 : rootCauses) {
                        Intrinsics.checkNotNull(th3);
                        if (C42899b.m94075e(th3)) {
                            return;
                        }
                    }
                }
            }
            C43846g.m96568c(new HomeGlideException(thM103847exceptionOrNullimpl2, "CommonEx", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m82240c(@Nullable FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            fragmentManager.setFragmentFactory(new b());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m82241d(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String simpleName = JvmClassMappingKt.getKotlinClass(obj.getClass()).getSimpleName();
        return simpleName == null ? "home" : simpleName;
    }

    /* JADX INFO: renamed from: e */
    public static final void m82242e(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【homeClick】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "home_track");
        C43852m.m96589a(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m82243f(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m82242e(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public static final void m82244g(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【homeExpose】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "home_track");
        C43852m.m96593e(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m82245h(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m82244g(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public static final <T> boolean m82246i(T t11) {
        return t11 != null;
    }
}
