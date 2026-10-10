package com.sumsub.sns.core.presentation.base;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.transition.TransitionInflater;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$transition;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.AbstractC28047a;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.presentation.util.C28241a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28501v0;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.common.InterfaceC28504w0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.C31252d;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.result.C32363c;
import com.sumsub.sns.internal.features.presentation.result.C32369i;
import com.sumsub.sns.internal.features.presentation.support.C32615f;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u008e\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0002\u008f\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0007J\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\u0007J#\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\rH\u0004¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\rH\u0000¢\u0006\u0004\b'\u0010&J1\u00101\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0010¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u000202H\u0014¢\u0006\u0004\b7\u00105J\u0017\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u000202H\u0014¢\u0006\u0004\b9\u00105J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:H\u0015¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u000202H\u0004¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\bH\u0004¢\u0006\u0004\b@\u0010\nJ-\u0010F\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u00052\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010C\u001a\u000202H\u0000¢\u0006\u0004\bD\u0010EJ\u0015\u0010I\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bK\u0010JJ\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000bH\u0016¢\u0006\u0004\bO\u0010\u0007J#\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010P\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020+0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R&\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020+0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010Z\u001a\u0004\b^\u0010\\R\u001a\u0010_\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\nR$\u0010c\u001a\u00020\"2\u0006\u0010b\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR$\u0010g\u001a\u00020\"2\u0006\u0010b\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bg\u0010d\u001a\u0004\bh\u0010fR$\u0010i\u001a\u00020\"2\u0006\u0010b\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bi\u0010d\u001a\u0004\bj\u0010fR$\u0010k\u001a\u00020\"2\u0006\u0010b\u001a\u00020\"8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bk\u0010d\u001a\u0004\bl\u0010fR$\u0010m\u001a\u0002022\u0006\u0010b\u001a\u0002028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010?R\u0016\u0010p\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR\u001d\u0010v\u001a\u0004\u0018\u00010q8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u0004\u0018\u00010q8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bz\u0010uR\u0014\u0010\u007f\u001a\u00020|8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R \u0010\u0083\u0001\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0080\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0084\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u001a\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0090\u0001"}, m90084d2 = {"Lcom/sumsub/sns/core/presentation/base/l;", "Lcom/sumsub/sns/core/presentation/base/s;", ExifInterface.LATITUDE_SOUTH, "Lcom/sumsub/sns/core/presentation/base/C;", "VM", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "getUniqueId", "()Ljava/lang/String;", "", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/sumsub/sns/core/presentation/base/q;", "state", "updateCommonUiState", "(Lcom/sumsub/sns/core/presentation/base/q;)V", "initCommonUI", "onStart", "onStop", "trackOpen", "", DbParams.KEY_CHANNEL_RESULT, "data", "setResult", "(ILandroid/os/Bundle;)V", "finishWithResult$idensic_mobile_sdk_aar_defaultRelease", "finishWithResult", "Lcom/sumsub/sns/internal/core/common/w;", "reason", "", "payload", "", "delay", "finish$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;)V", "finish", "", ViewProps.HIDDEN, "onHiddenChanged", "(Z)V", "showProgress", "updateShowProgress", "hideLogo", "updatePoweredByVisibility", "Lcom/sumsub/sns/core/presentation/base/r;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/r;)V", "isForResult", "()Z", "getFragmentRequestKey", "fragment", "tag", "replace", "navigateTo$idensic_mobile_sdk_aar_defaultRelease", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Z)V", "navigateTo", "Lcom/sumsub/sns/internal/features/data/model/common/l0;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onHandleError", "(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V", "onErrorCancelled", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "onCancelResult", "()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "onCloseButtonClick", "requestKey", "forResult", "(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "", "openPayload", "Ljava/util/Map;", "getOpenPayload", "()Ljava/util/Map;", "closePayload", "getClosePayload", "logTag", "Ljava/lang/String;", "getLogTag", "value", "statusBarColor", "I", "getStatusBarColor$idensic_mobile_sdk_aar_defaultRelease", "()I", "navigationBarColor", "getNavigationBarColor$idensic_mobile_sdk_aar_defaultRelease", "windowBackgroundColor", "getWindowBackgroundColor$idensic_mobile_sdk_aar_defaultRelease", "windowFlags", "getWindowFlags", "lightSystemBars", "Z", "getLightSystemBars$idensic_mobile_sdk_aar_defaultRelease", "isResultSet", "Landroid/widget/TextView;", "progressTextView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getProgressTextView", "()Landroid/widget/TextView;", "progressTextView", "Lcom/sumsub/sns/core/presentation/util/a;", "uniqueIdHolder", "Lcom/sumsub/sns/core/presentation/util/a;", "getPoweredByText", "poweredByText", "Lcom/sumsub/sns/internal/core/analytics/f;", "getAnalyticsDelegate", "()Lcom/sumsub/sns/internal/core/analytics/f;", "analyticsDelegate", "Lcom/sumsub/sns/core/presentation/base/f;", "getBaseActivity", "()Lcom/sumsub/sns/core/presentation/base/f;", "baseActivity", "Lcom/sumsub/sns/internal/core/domain/h;", "getServiceLocator$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/internal/core/domain/h;", "serviceLocator", "getServiceLocatorSafe", "serviceLocatorSafe", "Lcom/sumsub/sns/internal/core/common/u0;", "getAppListener$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/internal/core/common/u0;", "appListener", "Companion", "com/sumsub/sns/core/presentation/base/h", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSBaseFragment.kt\ncom/sumsub/sns/core/presentation/base/SNSBaseFragment\n+ 2 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,470:1\n22#2:471\n1#3:472\n1#3:481\n157#4,8:473\n*S KotlinDebug\n*F\n+ 1 SNSBaseFragment.kt\ncom/sumsub/sns/core/presentation/base/SNSBaseFragment\n*L\n162#1:471\n162#1:472\n172#1:473,8\n*E\n"})
public abstract class AbstractC28133l<S extends InterfaceC28147s, VM extends AbstractC28052C> extends Fragment {

    @NotNull
    private static final String ARG_LIGHT_SYSTEM_BARS = "light_status_bar";

    @NotNull
    private static final String ARG_NAV_BAR_COLOR = "nav_bar_color";

    @NotNull
    private static final String ARG_STATUS_BAR_COLOR = "status_bar_color";

    @NotNull
    private static final String ARG_WINDOW_BACKGROUND_COLOR = "window_background_color";

    @NotNull
    private static final String ARG_WINDOW_FLAGS = "window_flags";

    @NotNull
    public static final String FRAGMENT_REQUEST_KEY = "fragment_request_key";

    @NotNull
    public static final String FRAGMENT_RESULT_KEY = "fragment_result_key";

    @NotNull
    public static final String UNIQUE_KEY_PREFIX = "key_";
    private boolean isResultSet;
    private int navigationBarColor;
    private int statusBarColor;
    private int windowBackgroundColor;
    private int windowFlags;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {AbstractC28118g.m69077a(AbstractC28133l.class, "progressTextView", "getProgressTextView()Landroid/widget/TextView;", 0)};

    @NotNull
    public static final C28121h Companion = new C28121h();

    @NotNull
    private final Screen screen = AbstractC28047a.m69058a(this);

    @NotNull
    private final Map<String, Object> openPayload = MapsKt.emptyMap();

    @NotNull
    private final Map<String, Object> closePayload = MapsKt.emptyMap();

    @NotNull
    private final String logTag = AbstractC33294e.m71624a(this);
    private boolean lightSystemBars = true;

    /* JADX INFO: renamed from: progressTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadOnlyProperty progressTextView = new C28404L(R$id.sns_progress_text);

    @NotNull
    private final C28241a uniqueIdHolder = new C28241a();

    /* JADX INFO: renamed from: a */
    public static final void m69081a(AbstractC28133l abstractC28133l, String str, Bundle bundle) {
        C28137n pendingFinishEvent$idensic_mobile_sdk_aar_defaultRelease;
        Companion.getClass();
        if (!C28121h.m69079a(bundle) || (pendingFinishEvent$idensic_mobile_sdk_aar_defaultRelease = abstractC28133l.getViewModel$idensic_mobile_sdk_aar_defaultRelease().getPendingFinishEvent$idensic_mobile_sdk_aar_defaultRelease()) == null) {
            return;
        }
        abstractC28133l.handleEvent(pendingFinishEvent$idensic_mobile_sdk_aar_defaultRelease);
    }

    /* JADX INFO: renamed from: getIdDocSetType */
    public abstract String getF66531c();

    public abstract Integer getLayoutId();

    public abstract AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease();

    public static /* synthetic */ void finish$idensic_mobile_sdk_aar_defaultRelease$default(AbstractC28133l abstractC28133l, AbstractC28503w abstractC28503w, Object obj, Long l11, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finish");
        }
        if ((i11 & 1) != 0) {
            abstractC28503w = C28497u.f58029b;
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        abstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease(abstractC28503w, obj, l11);
    }

    public static /* synthetic */ void finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(AbstractC28133l abstractC28133l, int i11, Bundle bundle, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishWithResult");
        }
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        if ((i12 & 2) != 0) {
            bundle = new Bundle();
        }
        abstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease(i11, bundle);
    }

    public static /* synthetic */ void navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(AbstractC28133l abstractC28133l, Fragment fragment, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateTo");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        abstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease(fragment, str, z11);
    }

    public static /* synthetic */ void setResult$default(AbstractC28133l abstractC28133l, int i11, Bundle bundle, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResult");
        }
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        if ((i12 & 2) != 0) {
            bundle = new Bundle();
        }
        abstractC28133l.setResult(i11, bundle);
    }

    /* JADX INFO: renamed from: c */
    public final String m69082c() {
        return UNIQUE_KEY_PREFIX + this;
    }

    /* JADX INFO: renamed from: e */
    public final void m69084e() {
        if (this.isResultSet || !isForResult()) {
            return;
        }
        String fragmentRequestKey = getFragmentRequestKey();
        Bundle bundle = new Bundle();
        bundle.putInt(FRAGMENT_RESULT_KEY, 0);
        Unit unit = Unit.INSTANCE;
        FragmentKt.setFragmentResult(this, fragmentRequestKey, bundle);
    }

    @NotNull
    public final AbstractC28133l<S, VM> forResult(@Nullable String requestKey) {
        if (requestKey != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString(FRAGMENT_REQUEST_KEY, requestKey);
            setArguments(arguments);
        }
        return this;
    }

    @NotNull
    public C28367f getAnalyticsDelegate() {
        return new C28367f(getF66530b(), getF66531c(), getOpenPayload());
    }

    @NotNull
    public Map<String, Object> getClosePayload() {
        return this.closePayload;
    }

    /* JADX INFO: renamed from: getLightSystemBars$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final boolean getLightSystemBars() {
        return this.lightSystemBars;
    }

    @NotNull
    /* JADX INFO: renamed from: getLogTag, reason: from getter */
    public String getF62857a() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: getNavigationBarColor$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final int getNavigationBarColor() {
        return this.navigationBarColor;
    }

    @NotNull
    public Map<String, Object> getOpenPayload() {
        return this.openPayload;
    }

    @Nullable
    public final TextView getProgressTextView() {
        return (TextView) this.progressTextView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public Screen getF66530b() {
        return this.screen;
    }

    /* JADX INFO: renamed from: getStatusBarColor$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final int getStatusBarColor() {
        return this.statusBarColor;
    }

    @NotNull
    public final String getUniqueId() {
        String str = this.uniqueIdHolder.f57537a;
        if (str == null) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: getWindowBackgroundColor$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final int getWindowBackgroundColor() {
        return this.windowBackgroundColor;
    }

    public final int getWindowFlags() {
        return this.windowFlags;
    }

    @CallSuper
    public void handleEvent(@NotNull InterfaceC28145r event) {
        InterfaceC28504w0 interfaceC28504w0;
        C31252d c31252dMo70633f;
        if (event instanceof C28149t) {
            KeyEventDispatcher.Component activity = getActivity();
            interfaceC28504w0 = activity instanceof InterfaceC28504w0 ? (InterfaceC28504w0) activity : null;
            if (interfaceC28504w0 != null) {
                C32363c c32363c = ((C28149t) event).f57388a;
                String idDocSetType = getF66531c();
                String strM69082c = m69082c();
                Bundle bundleBundleOf = BundleKt.bundleOf(TuplesKt.m90091to("analyticsScreen", c32363c.f65939b.getText()), TuplesKt.m90091to("arg_doc_set_type", idDocSetType), TuplesKt.m90091to("arg_result", c32363c));
                C32369i c32369i = new C32369i();
                c32369i.setArguments(bundleBundleOf);
                ((SNSAppActivity) interfaceC28504w0).m70603a(c32369i.forResult(strM69082c), "SNSFinishResultFragment");
            }
        } else {
            if (!(event instanceof C28135m)) {
                if (event instanceof C28141p) {
                    InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
                    if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
                        C28141p c28141p = (C28141p) event;
                        ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).m70610a(c28141p.f57377a, c28141p.f57378b);
                        return;
                    }
                    return;
                }
                if (event instanceof C28154v) {
                    KeyEventDispatcher.Component activity2 = getActivity();
                    interfaceC28504w0 = activity2 instanceof InterfaceC28504w0 ? (InterfaceC28504w0) activity2 : null;
                    if (interfaceC28504w0 != null) {
                        AbstractC28501v0.m69388a(interfaceC28504w0, new C32615f(), "SNSSupportFragment", false, 12);
                        return;
                    }
                    return;
                }
                if (event instanceof C28137n) {
                    C28137n c28137n = (C28137n) event;
                    finish$idensic_mobile_sdk_aar_defaultRelease(c28137n.f57368a, c28137n.f57369b, c28137n.f57370c);
                    return;
                } else {
                    if (event instanceof C28152u) {
                        updateShowProgress(((C28152u) event).f57394a);
                        return;
                    }
                    if (event instanceof C28156w) {
                        Toast.makeText(getActivity(), ((C28156w) event).f57400a, 0).show();
                        return;
                    } else {
                        if (event instanceof C28139o) {
                            C28139o c28139o = (C28139o) event;
                            finishWithResult$idensic_mobile_sdk_aar_defaultRelease(c28139o.f57373a, c28139o.f57374b);
                            return;
                        }
                        return;
                    }
                }
            }
            C28135m c28135m = (C28135m) event;
            if (getParentFragment() == null) {
                AbstractActivityC28115f baseActivity = getBaseActivity();
                AbstractC29149l0 abstractC29149l0 = c28135m.f57362a;
                String str = c28135m.f57363b;
                CharSequence charSequence = c28135m.f57364c;
                int i11 = AbstractActivityC28115f.f57327i;
                baseActivity.mo69076a(abstractC29149l0, str, charSequence, null);
                return;
            }
            AbstractC29149l0 abstractC29149l1 = c28135m.f57362a;
            if (abstractC29149l1 != null) {
                InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease2 = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
                if (appListener$idensic_mobile_sdk_aar_defaultRelease2 != null && (c31252dMo70633f = ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease2).f63147e.getValue()).mo70633f()) != null) {
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C28124i(c31252dMo70633f, abstractC29149l1, c28135m, this, null), 3, null);
                    return;
                }
                AbstractActivityC28115f baseActivity2 = getBaseActivity();
                AbstractC29149l0 abstractC29149l2 = c28135m.f57362a;
                String str2 = c28135m.f57363b;
                CharSequence charSequence2 = c28135m.f57364c;
                int i12 = AbstractActivityC28115f.f57327i;
                baseActivity2.mo69076a(abstractC29149l2, str2, charSequence2, null);
            }
        }
    }

    @NotNull
    public SNSCompletionResult onCancelResult() {
        return SNSCompletionResult.SuccessTermination.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        int color;
        this.uniqueIdHolder.m69188a(savedInstanceState);
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, getF62857a(), "Lifecycle " + this + ".onCreate", null, 4, null);
        }
        if (savedInstanceState != null) {
            this.statusBarColor = savedInstanceState.getInt(ARG_STATUS_BAR_COLOR);
            this.navigationBarColor = savedInstanceState.getInt(ARG_NAV_BAR_COLOR);
            this.windowBackgroundColor = savedInstanceState.getInt(ARG_WINDOW_BACKGROUND_COLOR);
            this.windowFlags = savedInstanceState.getInt(ARG_WINDOW_FLAGS);
            this.lightSystemBars = savedInstanceState.getBoolean(ARG_LIGHT_SYSTEM_BARS);
        } else {
            Window window = requireActivity().getWindow();
            this.statusBarColor = window.getStatusBarColor();
            this.navigationBarColor = window.getNavigationBarColor();
            Drawable background = window.getDecorView().getBackground();
            if (background == null) {
                color = 0;
            } else {
                ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                if (colorDrawable != null) {
                    color = colorDrawable.getColor();
                } else {
                    color = 0;
                }
            }
            this.windowBackgroundColor = color;
            this.windowFlags = window.getAttributes().flags;
            this.lightSystemBars = !AbstractC28458h.m69346a(requireContext().getResources().getConfiguration());
        }
        super.onCreate(savedInstanceState);
        if (C33048a.f67463Z.m71434a()) {
            C33272c.f67816e.f67810a.mo68955d(getF62857a(), "Disable fragment transition animations.", null);
            return;
        }
        C33272c.f67816e.f67810a.mo68955d(getF62857a(), "Enable fragment transition animations.", null);
        TransitionInflater transitionInflaterFrom = TransitionInflater.from(requireContext());
        setEnterTransition(transitionInflaterFrom.inflateTransition(R$transition.sns_fade));
        setExitTransition(transitionInflaterFrom.inflateTransition(R$transition.sns_fade_delayed));
    }

    /* JADX INFO: renamed from: a */
    public static final void m69080a(AbstractC28133l abstractC28133l, View view) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(abstractC28133l), "close click", null, 4, null);
        abstractC28133l.onCloseButtonClick();
        FragmentActivity activity = abstractC28133l.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        C28367f.m69257a(abstractC28133l.getAnalyticsDelegate(), abstractC28133l.getF66530b(), abstractC28133l.getF66531c(), Control.CloseButton, abstractC28133l.getOpenPayload(), 16);
    }

    public static final InterfaceC28504w0 access$getNavigation(AbstractC28133l abstractC28133l) {
        KeyEventDispatcher.Component activity = abstractC28133l.getActivity();
        if (activity instanceof InterfaceC28504w0) {
            return (InterfaceC28504w0) activity;
        }
        return null;
    }

    public static final /* synthetic */ Object access$onViewCreated$handleEvent(AbstractC28133l abstractC28133l, InterfaceC28145r interfaceC28145r, Continuation continuation) {
        abstractC28133l.handleEvent(interfaceC28145r);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m69083d() {
        SNSToolbarView sNSToolbarView;
        View view = getView();
        if (view != null) {
            sNSToolbarView = (SNSToolbarView) view.findViewById(R$id.sns_toolbar);
        } else {
            sNSToolbarView = null;
        }
        if (sNSToolbarView != null) {
            sNSToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.presentation.base.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC28133l.m69080a(this.f57354b, view2);
                }
            });
        }
        if (sNSToolbarView != null) {
            sNSToolbarView.setCloseButtonDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.CLOSE.getImageName()));
        }
    }

    public void finish$idensic_mobile_sdk_aar_defaultRelease(@NotNull AbstractC28503w reason, @Nullable Object payload, @Nullable Long delay) {
        InterfaceC28504w0 interfaceC28504w0;
        if (onFinishCalled(reason)) {
            m69084e();
            KeyEventDispatcher.Component activity = getActivity();
            if (activity instanceof InterfaceC28504w0) {
                interfaceC28504w0 = (InterfaceC28504w0) activity;
            } else {
                interfaceC28504w0 = null;
            }
            if (interfaceC28504w0 != null) {
                ((SNSAppActivity) interfaceC28504w0).m70605a(reason, delay);
            }
        }
    }

    public final void finishWithResult$idensic_mobile_sdk_aar_defaultRelease(int result, @NotNull Bundle data) {
        setResult(result, data);
        finish$idensic_mobile_sdk_aar_defaultRelease$default(this, null, null, null, 7, null);
    }

    @Nullable
    public final InterfaceC28498u0 getAppListener$idensic_mobile_sdk_aar_defaultRelease() {
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof InterfaceC28498u0) {
            return (InterfaceC28498u0) activity;
        }
        return null;
    }

    @NotNull
    public final AbstractActivityC28115f getBaseActivity() {
        return (AbstractActivityC28115f) getActivity();
    }

    @NotNull
    public final String getFragmentRequestKey() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(FRAGMENT_REQUEST_KEY)) == null) {
            return FRAGMENT_REQUEST_KEY;
        }
        return string;
    }

    @Nullable
    public TextView getPoweredByText() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R$id.sns_powered);
        }
        return null;
    }

    @NotNull
    public final C28578h getServiceLocator$idensic_mobile_sdk_aar_defaultRelease() {
        return (C28578h) getBaseActivity().f57328a.getValue();
    }

    @Nullable
    public final C28578h getServiceLocatorSafe() {
        AbstractActivityC28115f abstractActivityC28115f;
        FragmentActivity activity = getActivity();
        if (activity instanceof AbstractActivityC28115f) {
            abstractActivityC28115f = (AbstractActivityC28115f) activity;
        } else {
            abstractActivityC28115f = null;
        }
        if (abstractActivityC28115f == null) {
            return null;
        }
        return (C28578h) abstractActivityC28115f.f57328a.getValue();
    }

    public final void initCommonUI() {
        boolean zM69346a;
        TextView textView;
        TextView textView2;
        View view = getView();
        if (view != null) {
            m69083d();
            C28966p c28966pM69169a = AbstractC28233a.m69169a();
            if (c28966pM69169a != null) {
                String strM69173b = AbstractC28233a.m69173b(c28966pM69169a, SNSMetricElement.SCREEN_HEADER_ALIGNMENT);
                if (strM69173b != null && (textView2 = (TextView) view.findViewById(R$id.sns_title)) != null) {
                    AbstractC28234b.m69177a(textView2, strM69173b);
                }
                String strM69173b2 = AbstractC28233a.m69173b(c28966pM69169a, SNSMetricElement.SECTION_HEADER_ALIGNMENT);
                if (strM69173b2 != null && (textView = (TextView) view.findViewById(R$id.sns_subtitle)) != null) {
                    AbstractC28234b.m69177a(textView, strM69173b2);
                }
                Float fM69171a = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.SCREEN_HORIZONTAL_MARGIN);
                if (fM69171a != null) {
                    float fFloatValue = fM69171a.floatValue();
                    ViewGroup viewGroup = (ViewGroup) view.findViewById(R$id.sns_fragment_content);
                    if (viewGroup != null) {
                        int i11 = (int) fFloatValue;
                        viewGroup.setPadding(i11, viewGroup.getPaddingTop(), i11, viewGroup.getPaddingBottom());
                    }
                    Guideline guideline = (Guideline) view.findViewById(R$id.sns_guideline_start);
                    if (guideline != null) {
                        guideline.setGuidelineBegin((int) fFloatValue);
                    }
                    Guideline guideline2 = (Guideline) view.findViewById(R$id.sns_guideline_end);
                    if (guideline2 != null) {
                        guideline2.setGuidelineEnd((int) fFloatValue);
                    }
                }
                SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
                TextView poweredByText = getPoweredByText();
                if (poweredByText != null) {
                    zM69346a = AbstractC28458h.m69346a(poweredByText.getResources().getConfiguration());
                } else {
                    zM69346a = false;
                }
                Integer numM69172a = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, zM69346a);
                if (numM69172a != null) {
                    int iIntValue = numM69172a.intValue();
                    TextView poweredByText2 = getPoweredByText();
                    if (poweredByText2 != null) {
                        poweredByText2.setTextColor(iIntValue);
                    }
                }
            }
        }
    }

    public final boolean isForResult() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString(FRAGMENT_REQUEST_KEY);
        } else {
            string = null;
        }
        if (string != null) {
            return true;
        }
        return false;
    }

    public final void navigateTo$idensic_mobile_sdk_aar_defaultRelease(@NotNull Fragment fragment, @Nullable String tag, boolean replace) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C28127j(this, fragment, tag, replace, null));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Integer layoutId = getLayoutId();
        if (layoutId != null) {
            return inflater.inflate(layoutId.intValue(), container, false);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C33272c.f67816e.f67810a.mo68955d(getF62857a(), "closing " + getF66530b().getText(), null);
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Lifecycle " + this + ".onDestroyView", null, 4, null);
        }
        super.onDestroyView();
    }

    public final void onErrorCancelled(@NotNull AbstractC29149l0 error) {
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().onErrorCancelled(error);
    }

    public boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        m69084e();
        return true;
    }

    public final void onHandleError(@NotNull AbstractC29149l0 error) {
        getViewModel$idensic_mobile_sdk_aar_defaultRelease().onHandleError(error);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Lifecycle " + this + ".onHiddenChanged, hidden=" + hidden, null, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, getF62857a(), "Lifecycle " + this + ".onResume", null, 4, null);
        }
        C33272c.f67816e.f67810a.mo68955d(getF62857a(), "resumed " + getF66530b().getText(), null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.uniqueIdHolder.f57537a;
        if (str == null) {
            str = null;
        }
        outState.putString("fragment_unique_id", str);
        outState.putInt(ARG_STATUS_BAR_COLOR, this.statusBarColor);
        outState.putInt(ARG_NAV_BAR_COLOR, this.navigationBarColor);
        outState.putInt(ARG_WINDOW_BACKGROUND_COLOR, this.windowBackgroundColor);
        outState.putInt(ARG_WINDOW_FLAGS, this.windowFlags);
        outState.putBoolean(ARG_LIGHT_SYSTEM_BARS, this.lightSystemBars);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, getF62857a(), "Lifecycle " + this + ".onStart", null, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, getF62857a(), "Lifecycle " + this + ".onStop", null, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Lifecycle " + this + ".onViewCreated", null, 4, null);
        }
        trackOpen();
        C33272c.f67816e.f67810a.mo68955d(getF62857a(), "opening " + getF66530b().getText(), null);
        AbstractC28421U.m69304a(getViewModel$idensic_mobile_sdk_aar_defaultRelease().getEvents(), getViewLifecycleOwner(), new C28130k(this));
        initCommonUI();
        requireActivity().getSupportFragmentManager().setFragmentResultListener(m69082c(), this, new FragmentResultListener() { // from class: com.sumsub.sns.core.presentation.base.k1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                AbstractC28133l.m69081a(this.f57356a, str, bundle2);
            }
        });
    }

    public final void setResult(int result, @NotNull Bundle data) {
        if (!isForResult()) {
            return;
        }
        this.isResultSet = true;
        String fragmentRequestKey = getFragmentRequestKey();
        data.putInt(FRAGMENT_RESULT_KEY, result);
        Unit unit = Unit.INSTANCE;
        FragmentKt.setFragmentResult(this, fragmentRequestKey, data);
    }

    public void trackOpen() {
        C28367f analyticsDelegate = getAnalyticsDelegate();
        C28367f.m69261b(analyticsDelegate.f57840a, analyticsDelegate.f57841b, analyticsDelegate.f57842c, null);
    }

    public final void updateCommonUiState(@NotNull C28143q state) {
        updatePoweredByVisibility(state.mo69085a());
        TextView poweredByText = getPoweredByText();
        if (poweredByText != null) {
            poweredByText.setText(state.mo69086b());
        }
        TextView progressTextView = getProgressTextView();
        if (progressTextView != null) {
            AbstractC28458h.m69341a(progressTextView, state.mo69087c());
        }
    }

    public void updatePoweredByVisibility(boolean hideLogo) {
        int i11;
        TextView poweredByText = getPoweredByText();
        if (poweredByText != null) {
            if (hideLogo) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            poweredByText.setVisibility(i11);
        }
    }

    public void updateShowProgress(boolean showProgress) {
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70632e(showProgress);
        }
    }

    public void onCloseButtonClick() {
    }

    public void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
    }
}
