package com.kubi.permissions.compliance;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5270g;
import com.kubi.permissions.R$id;
import com.kubi.permissions.R$layout;
import com.kubi.permissions.exception.PermissionException;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p539pu.C43540d;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PermissionComplianceFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002J5\u0010\u0018\u001a*\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a\u0018\u0001 \u001b*\u0014\u0012\u000e\b\u0001\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\u00190\u0019H\u0002¢\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010$\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010%\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006'"}, m90084d2 = {"Lcom/kubi/permissions/compliance/PermissionComplianceFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "isShowing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "handler", "com/kubi/permissions/compliance/PermissionComplianceFragment$handler$1", "Lcom/kubi/permissions/compliance/PermissionComplianceFragment$handler$1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "onResume", "updateDisplay", "getRequestPermissions", "", "", "kotlin.jvm.PlatformType", "()[Ljava/lang/String;", "setRequestPermissions", "permissions", "([Ljava/lang/String;)V", "smartShow", "activity", "Landroidx/fragment/app/FragmentActivity;", "smartHide", "realShow", "realHide", "Companion", "LPermissions_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPermissionComplianceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionComplianceFragment.kt\ncom/kubi/permissions/compliance/PermissionComplianceFragment\n+ 2 PermissionIssue.kt\ncom/kubi/permissions/exception/PermissionIssueKt\n*L\n1#1,207:1\n32#2,2:208\n32#2,2:210\n32#2,2:212\n*S KotlinDebug\n*F\n+ 1 PermissionComplianceFragment.kt\ncom/kubi/permissions/compliance/PermissionComplianceFragment\n*L\n66#1:208,2\n129#1:210,2\n141#1:212,2\n*E\n"})
public final class PermissionComplianceFragment extends DialogFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f40522W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final AtomicBoolean f40523U = new AtomicBoolean(false);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final HandlerC21481a f40524V = new HandlerC21481a(Looper.getMainLooper());

    /* JADX INFO: compiled from: PermissionComplianceFragment.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u0014\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/permissions/compliance/PermissionComplianceFragment$Companion;", "", "<init>", "()V", "KET_PERMISSIONS_DIALOG", "", "KEY_PERMISSIONS_LIST", "MSG_SHOW", "", "MSG_HIDE", TIMPushProvider.f75062n, "", "activity", "Landroidx/fragment/app/FragmentActivity;", "permissions", "", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;)V", TIMPushProvider.f75063o, "findPermissionComplianceFragment", "Lcom/kubi/permissions/compliance/PermissionComplianceFragment;", "setDecorTag", "Landroid/app/Activity;", "key", "value", "getDecorTag", "LPermissions_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final PermissionComplianceFragment m49928a(FragmentActivity fragmentActivity) {
            Object objM49929b = m49929b(fragmentActivity, "REQUEST_PERMISSIONS_DIALOG_KEY");
            if ((objM49929b instanceof PermissionComplianceFragment ? (PermissionComplianceFragment) objM49929b : null) == null) {
                m49930c(fragmentActivity, "REQUEST_PERMISSIONS_DIALOG_KEY", new PermissionComplianceFragment());
            }
            Object objM49929b2 = m49929b(fragmentActivity, "REQUEST_PERMISSIONS_DIALOG_KEY");
            Intrinsics.checkNotNull(objM49929b2, "null cannot be cast to non-null type com.kubi.permissions.compliance.PermissionComplianceFragment");
            return (PermissionComplianceFragment) objM49929b2;
        }

        public final void hide(@NotNull FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            m49928a(activity).m49925m3(activity);
        }

        public final void show(@NotNull FragmentActivity activity, @NotNull String[] permissions) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (C43540d.m95810d(permissions)) {
                PermissionComplianceFragment permissionComplianceFragmentM49928a = m49928a(activity);
                permissionComplianceFragmentM49928a.m49924l3(permissions);
                permissionComplianceFragmentM49928a.m49926n3(activity);
            }
        }

        /* JADX INFO: renamed from: b */
        public final Object m49929b(Activity activity, String str) {
            Map map;
            Object tag = activity.getWindow().getDecorView().getTag(R$id.activity_tag);
            if (tag instanceof Map) {
                map = (Map) tag;
            } else {
                map = null;
            }
            if (map == null) {
                return null;
            }
            return map.get(str);
        }

        /* JADX INFO: renamed from: c */
        public final void m49930c(Activity activity, String str, Object obj) {
            View decorView = activity.getWindow().getDecorView();
            int i11 = R$id.activity_tag;
            Object tag = decorView.getTag(i11);
            if (tag == null) {
                tag = new HashMap();
                decorView.setTag(i11, tag);
            }
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
            ((HashMap) tag).put(str, obj);
        }
    }

    /* JADX INFO: renamed from: com.kubi.permissions.compliance.PermissionComplianceFragment$a */
    /* JADX INFO: compiled from: PermissionComplianceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/permissions/compliance/PermissionComplianceFragment$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "LPermissions_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class HandlerC21481a extends Handler {
        public HandlerC21481a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i11 = msg.what;
            if (i11 == 0) {
                PermissionComplianceFragment permissionComplianceFragment = PermissionComplianceFragment.this;
                Object obj = msg.obj;
                WeakReference weakReference = obj instanceof WeakReference ? (WeakReference) obj : null;
                Object obj2 = weakReference != null ? weakReference.get() : null;
                permissionComplianceFragment.m49923k3(obj2 instanceof FragmentActivity ? (FragmentActivity) obj2 : null);
                return;
            }
            if (i11 != 1) {
                return;
            }
            PermissionComplianceFragment permissionComplianceFragment2 = PermissionComplianceFragment.this;
            Object obj3 = msg.obj;
            WeakReference weakReference2 = obj3 instanceof WeakReference ? (WeakReference) obj3 : null;
            Object obj4 = weakReference2 != null ? weakReference2.get() : null;
            permissionComplianceFragment2.m49922j3(obj4 instanceof FragmentActivity ? (FragmentActivity) obj4 : null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        try {
            super.onStart();
            if (getDialog() != null) {
                Dialog dialog = getDialog();
                if ((dialog != null ? dialog.getWindow() : null) == null) {
                    return;
                }
                Dialog dialog2 = getDialog();
                Intrinsics.checkNotNull(dialog2);
                Window window4 = dialog2.getWindow();
                Intrinsics.checkNotNull(window4);
                WindowManager.LayoutParams attributes = window4.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                Dialog dialog3 = getDialog();
                if (dialog3 != null && (window3 = dialog3.getWindow()) != null) {
                    window3.setAttributes(attributes);
                }
                Dialog dialog4 = getDialog();
                if (dialog4 != null && (window2 = dialog4.getWindow()) != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
                Dialog dialog5 = getDialog();
                if (dialog5 == null || (window = dialog5.getWindow()) == null) {
                    return;
                }
                C5270g.m6200n(window, false);
            }
        } catch (Exception e11) {
            C43846g.m96568c(new PermissionException(e11, "PermissionComplianceFragment", false, null, 8, null), null, 2, null);
            this.f40523U.set(false);
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final void m49922j3(FragmentActivity fragmentActivity) {
        if (this.f40523U.compareAndSet(true, false) && fragmentActivity != null && isAdded()) {
            try {
                fragmentActivity.getSupportFragmentManager().beginTransaction().remove(this).commitNowAllowingStateLoss();
            } catch (Exception e11) {
                C43846g.m96568c(new PermissionException(e11, "PermissionComplianceFragment", false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final void m49923k3(FragmentActivity fragmentActivity) {
        if (!this.f40523U.compareAndSet(false, true) || fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || isAdded()) {
            return;
        }
        Dialog dialog = getDialog();
        if (dialog == null || !dialog.isShowing()) {
            try {
                fragmentActivity.getSupportFragmentManager().beginTransaction().add(this, (String) null).commitNowAllowingStateLoss();
            } catch (Exception e11) {
                this.f40523U.set(false);
                C43846g.m96568c(new PermissionException(e11, "PermissionComplianceFragment", false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final void m49925m3(FragmentActivity fragmentActivity) {
        this.f40524V.removeMessages(0);
        this.f40524V.removeMessages(1);
        HandlerC21481a handlerC21481a = this.f40524V;
        handlerC21481a.sendMessage(Message.obtain(handlerC21481a, 1, new WeakReference(fragmentActivity)));
    }

    /* JADX INFO: renamed from: n3 */
    public final void m49926n3(FragmentActivity fragmentActivity) {
        this.f40524V.removeMessages(0);
        this.f40524V.removeMessages(1);
        HandlerC21481a handlerC21481a = this.f40524V;
        handlerC21481a.sendMessageDelayed(Message.obtain(handlerC21481a, 0, new WeakReference(fragmentActivity)), 500L);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.permission_compliance_fragment, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m49927o3();
    }

    /* JADX INFO: renamed from: i3 */
    public final String[] m49921i3() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getStringArray("REQUEST_PERMISSIONS_LIST_KEY");
        }
        return null;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m49924l3(String[] strArr) {
        if (getArguments() == null) {
            setArguments(BundleKt.bundleOf(TuplesKt.m90091to("REQUEST_PERMISSIONS_LIST_KEY", strArr)));
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putStringArray("REQUEST_PERMISSIONS_LIST_KEY", strArr);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final void m49927o3() {
        TextView textView;
        Context context;
        TextView textView2;
        TextView textView3;
        String[] strArrM49921i3 = m49921i3();
        View view = getView();
        if (view != null && (textView3 = (TextView) view.findViewById(R$id.title)) != null) {
            textView3.setPadding(0, EdgeToEdgeCompat.f48106a.m58272j(), 0, 0);
        }
        View view2 = getView();
        if (view2 != null && (textView2 = (TextView) view2.findViewById(R$id.title)) != null) {
            Context context2 = getContext();
            if (context2 != null) {
                textView2.setText(C43540d.m95815i(context2, strArrM49921i3, C43540d.m95814h(getContext())));
            } else {
                return;
            }
        }
        View view3 = getView();
        if (view3 != null && (textView = (TextView) view3.findViewById(R$id.content)) != null && (context = getContext()) != null) {
            textView.setText(C43540d.m95811e(context, strArrM49921i3, C43540d.m95814h(getContext())));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.Theme.NoTitleBar.Fullscreen);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m49927o3();
    }
}
