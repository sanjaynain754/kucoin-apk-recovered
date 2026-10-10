package io.trtc.tuikit.atomicxcore.impl.view.call.grid;

import android.content.Context;
import android.transition.TransitionManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39399b;
import io.trtc.tuikit.atomicxcore.api.view.VolumeLevel;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import io.trtc.tuikit.atomicxcore.impl.view.call.C40040x;
import io.trtc.tuikit.atomicxcore.impl.view.call.grid.C40011h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.grid.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C40011h extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public final C39510r f88993a;

    /* JADX INFO: renamed from: b */
    public final Context f88994b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41775x1 f88995c;

    /* JADX INFO: renamed from: d */
    public final C40006c f88996d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArraySet f88997e;

    /* JADX INFO: renamed from: f */
    public String f88998f;

    /* JADX INFO: renamed from: g */
    public Map f88999g;

    /* JADX INFO: renamed from: h */
    public Map f89000h;

    /* JADX INFO: renamed from: i */
    public String f89001i;

    /* JADX INFO: renamed from: j */
    public Map f89002j;

    /* JADX INFO: renamed from: a */
    public final void m88405a(final C40007d c40007d) {
        C40040x c40040x = c40007d.f88988b;
        if (c40040x != null) {
            c40040x.setOnClickListener(new View.OnClickListener() { // from class: hg0.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C40011h.m88402a(this.f85896b, c40007d, view);
                }
            });
        }
        final GestureDetector gestureDetector = new GestureDetector(this.f88994b, new C40008e(c40007d));
        C40040x c40040x2 = c40007d.f88988b;
        if (c40040x2 != null) {
            c40040x2.setOnTouchListener(new View.OnTouchListener() { // from class: hg0.c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C40011h.m88404a(gestureDetector, view, motionEvent);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40011h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88993a = AbstractC39398a.m88229a("CallGridView", "file", "AtomicXCore-Call", "CallGridView");
        Context context2 = context.getApplicationContext();
        this.f88994b = context2;
        this.f88997e = new CopyOnWriteArraySet();
        this.f88998f = "";
        this.f88999g = MapsKt.emptyMap();
        this.f89000h = MapsKt.emptyMap();
        this.f89001i = "";
        this.f89002j = MapsKt.emptyMap();
        setBackgroundColor(0);
        ImageView imageView = new ImageView(context2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(0);
        addView(imageView, new ConstraintLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context2);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, 0);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((context2.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.verticalWeight = 1.0f;
        addView(frameLayout, layoutParams);
        ScrollView scrollView = new ScrollView(context2);
        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40006c c40006c = new C40006c(context2);
        this.f88996d = c40006c;
        scrollView.addView(c40006c, new ViewGroup.LayoutParams(-1, -2));
    }

    private final void setLargeViewIndex(int i11) {
        C40006c c40006c = this.f88996d;
        if (c40006c != null) {
            if (i11 == c40006c.getShowLargeViewIndex()) {
                i11 = -99;
            }
            c40006c.setShowLargeViewIndex(i11);
        }
        for (C40007d c40007d : this.f88997e) {
            boolean zAreEqual = Intrinsics.areEqual(c40007d.f88987a, this.f88998f);
            C40040x c40040x = c40007d.f88988b;
            if (c40040x != null) {
                TextView textView = c40040x.f89073f;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textUserName");
                    textView = null;
                }
                textView.setVisibility(zAreEqual ? 0 : 8);
            }
        }
        C40006c c40006c2 = this.f88996d;
        if (c40006c2 != null) {
            c40006c2.requestLayout();
        }
    }

    public final void setNetworkQualityIcons(@NotNull Map<NetworkQuality, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f89000h = icons;
        Iterator it = this.f88997e.iterator();
        while (it.hasNext()) {
            C40040x c40040x = ((C40007d) it.next()).f88988b;
            if (c40040x != null) {
                c40040x.setNetworkQualityIcons(icons);
            }
        }
    }

    public final void setParticipantsAvatar(@NotNull Map<String, String> avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f88999g = avatars;
        Iterator it = this.f88997e.iterator();
        while (it.hasNext()) {
            C40040x c40040x = ((C40007d) it.next()).f88988b;
            if (c40040x != null) {
                c40040x.setParticipantsAvatar(avatars);
            }
        }
    }

    public final void setVolumeLevelIcons(@NotNull Map<VolumeLevel, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f89002j = icons;
        Iterator it = this.f88997e.iterator();
        while (it.hasNext()) {
            C40040x c40040x = ((C40007d) it.next()).f88988b;
            if (c40040x != null) {
                c40040x.setVolumeLevelIcons(icons);
            }
        }
    }

    public final void setWaitingAnimation(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f89001i = path;
        Iterator it = this.f88997e.iterator();
        while (it.hasNext()) {
            C40040x c40040x = ((C40007d) it.next()).f88988b;
            if (c40040x != null) {
                c40040x.setWaitingAnimation(path);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CallStore.Companion companion = CallStore.INSTANCE;
        String inviterId = ((CallInfo) AbstractC39399b.m88230a(companion)).getInviterId();
        LinkedHashSet<String> inviteeIds = ((CallInfo) AbstractC39399b.m88230a(companion)).getInviteeIds();
        m88406a(inviterId);
        for (String str : inviteeIds) {
            Intrinsics.checkNotNull(str);
            m88406a(str);
        }
        this.f88995c = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40010g(this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f88995c;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        C40006c c40006c = this.f88996d;
        if (c40006c != null) {
            c40006c.removeAllViews();
        }
        for (C40007d c40007d : this.f88997e) {
            C40040x c40040x = c40007d.f88988b;
            if (c40040x != null) {
                c40040x.setOnClickListener(null);
            }
            C40040x c40040x2 = c40007d.f88988b;
            if (c40040x2 != null) {
                c40040x2.removeAllViews();
            }
        }
        this.f88997e.clear();
    }

    /* JADX INFO: renamed from: a */
    public static final void m88403a(C40011h c40011h, Set set) {
        Object next;
        CopyOnWriteArraySet copyOnWriteArraySet = c40011h.f88997e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(copyOnWriteArraySet, 10));
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((C40007d) it.next()).f88987a);
        }
        Set set2 = CollectionsKt.toSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!set2.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj2 : set2) {
            if (!set.contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c40011h.m88406a((String) it2.next());
        }
        for (String str : arrayList3) {
            Iterator it3 = c40011h.f88997e.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!Intrinsics.areEqual(((C40007d) next).f88987a, str));
            C40007d c40007d = (C40007d) next;
            if (c40007d != null) {
                C40040x c40040x = c40007d.f88988b;
                if (c40040x != null) {
                    c40040x.setOnClickListener(null);
                }
                C40040x c40040x2 = c40007d.f88988b;
                if (c40040x2 != null) {
                    c40040x2.removeAllViews();
                }
                C40040x c40040x3 = c40007d.f88988b;
                if ((c40040x3 != null ? c40040x3.getParent() : null) != null) {
                    ViewParent parent = c40040x3.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(c40040x3);
                }
                C40006c c40006c = c40011h.f88996d;
                if (c40006c != null) {
                    c40006c.removeView(c40007d.f88988b);
                }
                c40011h.f88997e.remove(c40007d);
                if (Intrinsics.areEqual(c40011h.f88998f, c40007d.f88987a)) {
                    TransitionManager.beginDelayedTransition(c40011h);
                    c40011h.f88998f = "";
                    c40011h.setLargeViewIndex(-99);
                }
                AbstractC39662a.m88299a("remove participant=", str, c40011h.f88993a, "message", 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88406a(String str) {
        C40007d c40007d = new C40007d();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c40007d.f88987a = str;
        if (this.f88997e.contains(c40007d)) {
            return;
        }
        if (c40007d.f88988b == null) {
            Context context = this.f88994b;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            c40007d.f88988b = new C40040x(context, str);
        }
        C40040x c40040x = c40007d.f88988b;
        if (c40040x != null) {
            c40040x.m88423a(true, -1, -1, 0.0f);
        }
        C40040x c40040x2 = c40007d.f88988b;
        if (c40040x2 != null) {
            c40040x2.setParticipantsAvatar(this.f88999g);
        }
        C40040x c40040x3 = c40007d.f88988b;
        if (c40040x3 != null) {
            c40040x3.setVolumeLevelIcons(this.f89002j);
        }
        C40040x c40040x4 = c40007d.f88988b;
        if (c40040x4 != null) {
            c40040x4.setNetworkQualityIcons(this.f89000h);
        }
        C40040x c40040x5 = c40007d.f88988b;
        if (c40040x5 != null) {
            c40040x5.setWaitingAnimation(this.f89001i);
        }
        C40040x c40040x6 = c40007d.f88988b;
        if ((c40040x6 != null ? c40040x6.getParent() : null) != null) {
            ViewParent parent = c40040x6.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(c40040x6);
        }
        this.f88997e.add(c40007d);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        C40006c c40006c = this.f88996d;
        if (c40006c != null) {
            c40006c.addView(c40007d.f88988b, layoutParams);
        }
        m88405a(c40007d);
        C39510r c39510r = this.f88993a;
        String message = "add new participant=".concat(str);
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }

    /* JADX INFO: renamed from: a */
    public static final void m88402a(final C40011h this$0, final C40007d participant, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(participant, "$participant");
        this$0.post(new Runnable() { // from class: hg0.a
            @Override // java.lang.Runnable
            public final void run() {
                C40011h.m88401a(this.f85894b, participant);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m88401a(C40011h this$0, C40007d participant) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(participant, "$participant");
        int iIndexOf = CollectionsKt.indexOf(this$0.f88997e, participant);
        C40006c c40006c = this$0.f88996d;
        this$0.f88998f = (c40006c == null || iIndexOf != c40006c.getShowLargeViewIndex()) ? participant.f88987a : "";
        Iterator it = this$0.f88997e.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (Intrinsics.areEqual(this$0.f88998f, ((C40007d) it.next()).f88987a)) {
                TransitionManager.beginDelayedTransition(this$0.f88996d);
                this$0.setLargeViewIndex(i11);
            }
            i11 = i12;
        }
        i11 = -99;
        TransitionManager.beginDelayedTransition(this$0.f88996d);
        this$0.setLargeViewIndex(i11);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m88404a(GestureDetector detector, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(detector, "$detector");
        return detector.onTouchEvent(motionEvent);
    }
}
