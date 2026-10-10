package com.kubi.helpcenter.p085ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.helpcenter.CustomerServiceHelper;
import com.kubi.helpcenter.R$string;
import com.kubi.helpcenter.UserLabelManager;
import com.kubi.helpcenter.entity.ParcelableMapEntity;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.utils.extensions.C27041f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import support.ada.embed.widget.AdaEmbedView;

/* JADX INFO: compiled from: AdaBotChatFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J4\u0010\u001f\u001a\u00020 2*\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0015j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0016H\u0002J\"\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R2\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0015j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/helpcenter/ui/AdaBotChatFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "adaHandle", "", "filePickerCallback", "Lsupport/ada/embed/widget/AdaEmbedView$FilePickerCallback;", "pickPhotoCode", "", "hasErrorIn", "", "from", "getFrom", "()Ljava/lang/String;", "from$delegate", "Lkotlin/Lazy;", "isReset", "()Z", "isReset$delegate", "configMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "buildMetaFields", "Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdaBotChatFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdaBotChatFragment.kt\ncom/kubi/helpcenter/ui/AdaBotChatFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,133:1\n216#2,2:134\n19#3,2:136\n*S KotlinDebug\n*F\n+ 1 AdaBotChatFragment.kt\ncom/kubi/helpcenter/ui/AdaBotChatFragment\n*L\n110#1:134,2\n94#1:136,2\n*E\n"})
public final class AdaBotChatFragment extends BaseFragment {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ int f25330b0 = 0;

    /* JADX INFO: renamed from: V */
    @Nullable
    public AdaEmbedView.C44554c f25332V;

    /* JADX INFO: renamed from: X */
    public boolean f25334X;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public HashMap<String, String> f25337a0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final String f25331U = "kucoin";

    /* JADX INFO: renamed from: W */
    public final int f25333W = 111;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f25335Y = LazyKt.lazy(new Function0() { // from class: com.kubi.helpcenter.ui.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdaBotChatFragment.m28920r3(this.f25349b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f25336Z = LazyKt.lazy(new Function0() { // from class: com.kubi.helpcenter.ui.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AdaBotChatFragment.m28922u3(this.f25350b));
        }
    });

    /* JADX INFO: renamed from: z3 */
    public static final void m28927z3(AdaBotChatFragment adaBotChatFragment) {
        adaBotChatFragment.f25334X = true;
    }

    /* JADX INFO: renamed from: t3 */
    private final boolean m28921t3() {
        return ((Boolean) this.f25336Z.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: w3 */
    public static final boolean m28924w3(AdaBotChatFragment adaBotChatFragment, AdaEmbedView.C44554c filePickerCallback) {
        Intrinsics.checkNotNullParameter(filePickerCallback, "filePickerCallback");
        adaBotChatFragment.f25332V = filePickerCallback;
        ImagePickerHelper.m58395d(adaBotChatFragment, 1, adaBotChatFragment.f25333W, ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE);
        return true;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m28925x3(final AdaEmbedView adaEmbedView, final AdaBotChatFragment adaBotChatFragment) {
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.helpcenter.ui.g
            @Override // java.lang.Runnable
            public final void run() {
                AdaBotChatFragment.m28926y3(adaEmbedView, adaBotChatFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m28926y3(AdaEmbedView adaEmbedView, AdaBotChatFragment adaBotChatFragment) {
        adaEmbedView.setMetaFields(CustomerServiceHelper.f25162a.generateMetas(adaBotChatFragment.m28929s3(), adaBotChatFragment.f25337a0));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull final LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        String str;
        String str2;
        ParcelableMapEntity parcelableMapEntity;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        this.f25337a0 = (arguments == null || (parcelableMapEntity = (ParcelableMapEntity) RouteExKt.m56274t(arguments, "ada_config")) == null) ? null : parcelableMapEntity.getMap();
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final AdaEmbedView adaEmbedView = new AdaEmbedView(context, null, 2, null);
        adaEmbedView.setWebViewLoadingErrorCallback(new Function0() { // from class: com.kubi.helpcenter.ui.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdaBotChatFragment.m28923v3(this.f25343b, inflater);
            }
        });
        adaEmbedView.setFilePickerCallback(new Function1() { // from class: com.kubi.helpcenter.ui.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AdaBotChatFragment.m28924w3(this.f25345b, (AdaEmbedView.C44554c) obj));
            }
        });
        AdaEmbedView.Settings.C44550a c44550aM98631b = new AdaEmbedView.Settings.C44550a(this.f25331U).m98631b("eu");
        HashMap<String, String> map = this.f25337a0;
        if (map == null || (str = map.get("greetings")) == null) {
            str = "";
        }
        adaEmbedView.m98623h(c44550aM98631b.m98632c(str).m98633d(MultiLanguageManager.f46811g.getLocalString()).m98634e(m28928q3(this.f25337a0)).m98630a());
        if (m28921t3()) {
            AdaEmbedView.MetaFields.C44548a c44548aM28928q3 = m28928q3(this.f25337a0);
            HashMap<String, String> map2 = this.f25337a0;
            AdaEmbedView.m98618k(adaEmbedView, null, (map2 == null || (str2 = map2.get("greetings")) == null) ? "" : str2, c44548aM28928q3, null, null, 25, null);
        }
        UserLabelManager.f25240a.m28895d(new Function0() { // from class: com.kubi.helpcenter.ui.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdaBotChatFragment.m28925x3(adaEmbedView, this);
            }
        });
        adaEmbedView.postDelayed(new Runnable() { // from class: com.kubi.helpcenter.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                AdaBotChatFragment.m28927z3(this.f25348b);
            }
        }, 5000L);
        return adaEmbedView;
    }

    /* JADX INFO: renamed from: q3 */
    public final AdaEmbedView.MetaFields.C44548a m28928q3(HashMap<String, String> map) {
        AdaEmbedView.MetaFields.C44548a c44548a = new AdaEmbedView.MetaFields.C44548a();
        for (Map.Entry<String, String> entry : CustomerServiceHelper.f25162a.generateMetas(m28929s3(), map).entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "greetings")) {
                c44548a.m98629b(entry.getKey(), entry.getValue());
            }
        }
        return c44548a;
    }

    /* JADX INFO: renamed from: s3 */
    public final String m28929s3() {
        return (String) this.f25335Y.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public static final String m28920r3(AdaBotChatFragment adaBotChatFragment) {
        String string;
        Bundle arguments = adaBotChatFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: u3 */
    public static final boolean m28922u3(AdaBotChatFragment adaBotChatFragment) {
        Bundle arguments = adaBotChatFragment.getArguments();
        if (arguments == null) {
            return false;
        }
        return arguments.getBoolean("isReset", false);
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m28923v3(AdaBotChatFragment adaBotChatFragment, LayoutInflater layoutInflater) {
        Context context = adaBotChatFragment.getContext();
        if (context != null && !adaBotChatFragment.f25334X) {
            BaseFragmentActivity.m56573m0(layoutInflater.getContext(), context.getString(R$string.online_support), ChatToOderFragment.class.getName());
            adaBotChatFragment.f25334X = true;
            FragmentActivity activity = adaBotChatFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        List<Uri> listM58393b;
        AdaEmbedView.C44554c c44554c;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null && requestCode == this.f25333W && (listM58393b = ImagePickerHelper.m58393b(data)) != null && !listM58393b.isEmpty() && (c44554c = this.f25332V) != null) {
            c44554c.m98635a((Uri) CollectionsKt.firstOrNull((List) listM58393b));
        }
    }
}
