package com.kubi.home.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.ComponentCallbacks2C5314h;
import com.google.gson.reflect.TypeToken;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p048c2.C4781a0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FreeStyleDialog.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/home/main/FreeStyleDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "freeStyleEntity", "Lcom/kubi/home/main/FreeStyleEntity;", "getFreeStyleEntity", "()Lcom/kubi/home/main/FreeStyleEntity;", "setFreeStyleEntity", "(Lcom/kubi/home/main/FreeStyleEntity;)V", "onCreate", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "homeExpose", "homeClick", "clickPosition", "", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFreeStyleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeStyleDialog.kt\ncom/kubi/home/main/FreeStyleDialog\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,127:1\n57#2,2:128\n25#2:130\n59#2,3:132\n149#3:131\n*S KotlinDebug\n*F\n+ 1 FreeStyleDialog.kt\ncom/kubi/home/main/FreeStyleDialog\n*L\n68#1:128,2\n68#1:130\n68#1:132,3\n68#1:131\n*E\n"})
public final class FreeStyleDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f25706r0 = new Companion(null);

    /* JADX INFO: renamed from: s0 */
    public static final int f25707s0 = C27040e.m66658b(300);

    /* JADX INFO: renamed from: t0 */
    public static final int f25708t0 = C27040e.m66658b(373);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public FreeStyleEntity f25709q0;

    /* JADX INFO: compiled from: FreeStyleDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/home/main/FreeStyleDialog$Companion;", "", "<init>", "()V", "width", "", "getWidth", "()I", "height", "getHeight", "newInstance", "Lcom/kubi/home/main/FreeStyleDialog;", "freeStyleEntity", "Lcom/kubi/home/main/FreeStyleEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFreeStyleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeStyleDialog.kt\ncom/kubi/home/main/FreeStyleDialog$Companion\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,127:1\n35#2,3:128\n*S KotlinDebug\n*F\n+ 1 FreeStyleDialog.kt\ncom/kubi/home/main/FreeStyleDialog$Companion\n*L\n56#1:128,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FreeStyleDialog newInstance(@NotNull FreeStyleEntity freeStyleEntity) {
            Intrinsics.checkNotNullParameter(freeStyleEntity, "freeStyleEntity");
            FreeStyleDialog freeStyleDialog = new FreeStyleDialog();
            Bundle bundle = new Bundle();
            String strM66919i = C27099x.m66919i(freeStyleEntity, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            bundle.putString("data", strM66919i);
            bundle.putInt("type", 6);
            bundle.putBoolean("isAnimationEnabled", true);
            bundle.putBoolean("isEnableDimAmount", false);
            freeStyleDialog.setArguments(bundle);
            return freeStyleDialog;
        }

        public final int getHeight() {
            return FreeStyleDialog.f25708t0;
        }

        public final int getWidth() {
            return FreeStyleDialog.f25707s0;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.FreeStyleDialog$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/utils/extensions/JsonExKt$parseJson$$inlined$fromJson$1", "com/kubi/utils/extensions/JsonExKt$toEntity$lambda$1$$inlined$parseJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C14589a extends TypeToken<FreeStyleEntity> {
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m29272q4(FreeStyleDialog freeStyleDialog, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        FreeStyleEntity freeStyleEntity = freeStyleDialog.f25709q0;
        RouteExKt.m56217H(freeStyleEntity != null ? freeStyleEntity.getLinkUrl() : null);
        freeStyleDialog.dismiss();
        freeStyleDialog.m29275o4("enter");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m29273r4(FreeStyleDialog freeStyleDialog, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        freeStyleDialog.dismiss();
        freeStyleDialog.m29275o4("close");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m29274s4(FreeStyleDialog freeStyleDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        freeStyleDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m29275o4(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        FreeStyleEntity freeStyleEntity = this.f25709q0;
        jSONObject.put("postTitle", freeStyleEntity != null ? freeStyleEntity.getPostTitle() : null);
        jSONObject.put("clickPosition", str);
        FreeStyleEntity freeStyleEntity2 = this.f25709q0;
        jSONObject.put("intervals", freeStyleEntity2 != null ? freeStyleEntity2.getIntervals() : null);
        FreeStyleEntity freeStyleEntity3 = this.f25709q0;
        jSONObject.put("url", freeStyleEntity3 != null ? freeStyleEntity3.getLinkUrl() : null);
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C36716a.m82243f(HomeCardViewHolderProxy.PAGE_ID, "personalizedPopup", null, jSONObject, 4, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_free_style, (ViewGroup) null);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RoundImageView roundImageView = (RoundImageView) view.findViewById(R$id.iv_bg);
        if (roundImageView != null) {
            ComponentCallbacks2C5314h componentCallbacks2C5314hM6557u = ComponentCallbacks2C5309c.m6557u(roundImageView);
            FreeStyleEntity freeStyleEntity = this.f25709q0;
            C5313g c5313gMo92213o0 = componentCallbacks2C5314hM6557u.mo6634v(freeStyleEntity != null ? freeStyleEntity.getResourceUrl() : null).mo92213o0(new C4781a0(C27040e.m66658b(16)));
            int i11 = R$mipmap.bg_error_free_style;
            c5313gMo92213o0.mo92188b0(i11).mo92208m(i11).mo92186a0(f25707s0, f25708t0).m6594E0(roundImageView);
            ViewExtKt.m66575f(roundImageView, new Function1() { // from class: com.kubi.home.main.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FreeStyleDialog.m29272q4(this.f25750b, (View) obj);
                }
            });
        }
        ImageView imageView = (ImageView) view.findViewById(R$id.iv_close);
        if (imageView != null) {
            ViewExtKt.m66575f(imageView, new Function1() { // from class: com.kubi.home.main.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FreeStyleDialog.m29273r4(this.f25753b, (View) obj);
                }
            });
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R$id.container);
        if (constraintLayout != null) {
            ViewExtKt.m66575f(constraintLayout, new Function1() { // from class: com.kubi.home.main.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FreeStyleDialog.m29274s4(this.f25756b, (View) obj);
                }
            });
        }
        m29276p4();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m29276p4() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        FreeStyleEntity freeStyleEntity = this.f25709q0;
        jSONObject.put("postTitle", freeStyleEntity != null ? freeStyleEntity.getPostTitle() : null);
        FreeStyleEntity freeStyleEntity2 = this.f25709q0;
        jSONObject.put("intervals", freeStyleEntity2 != null ? freeStyleEntity2.getIntervals() : null);
        FreeStyleEntity freeStyleEntity3 = this.f25709q0;
        jSONObject.put("url", freeStyleEntity3 != null ? freeStyleEntity3.getLinkUrl() : null);
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C36716a.m82245h(HomeCardViewHolderProxy.PAGE_ID, "personalizedPopup", null, jSONObject, 4, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        Object objM103844constructorimpl;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        FreeStyleEntity freeStyleEntity = null;
        Object obj = null;
        freeStyleEntity = null;
        if (arguments != null && (string = arguments.getString("data")) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C27099x c27099x = C27099x.f54458a;
                objM103844constructorimpl = Result.m103844constructorimpl(C27099x.m66914d(string, new C14589a().getType()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97262f(JPushConstants.Analysis.KEY_JSON, "数据转换失败", thM103847exceptionOrNullimpl);
            }
            if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
                obj = objM103844constructorimpl;
            }
            freeStyleEntity = (FreeStyleEntity) obj;
        }
        this.f25709q0 = freeStyleEntity;
    }
}
