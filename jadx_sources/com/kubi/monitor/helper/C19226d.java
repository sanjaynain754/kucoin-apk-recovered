package com.kubi.monitor.helper;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43848i;
import p569qq.InterfaceC43845f;
import p569qq.InterfaceC43849j;
import p642tq.InterfaceC45060c;
import p642tq.InterfaceC45061d;
import p806yq.C46557a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.monitor.helper.d */
/* JADX INFO: compiled from: FrameMetricsTrackManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/monitor/helper/d;", "Lqq/j;", "<init>", "()V", "Ltq/c;", "track", "", "c", "(Ltq/c;)V", "Lqq/f;", "page", "", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "b", "(Lqq/f;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/WeakHashMap;", "Lcom/kubi/monitor/helper/d$a;", "Ljava/util/WeakHashMap;", "trackerMap", "", "Ljava/util/Set;", "trackFactoryList", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19226d implements InterfaceC43849j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19226d f35569a = new C19226d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final WeakHashMap<InterfaceC43845f, a> trackerMap = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Set<InterfaceC45060c> trackFactoryList = new LinkedHashSet();

    /* JADX INFO: renamed from: com.kubi.monitor.helper.d$a */
    /* JADX INFO: compiled from: FrameMetricsTrackManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/monitor/helper/d$a;", "", "Lcom/kubi/monitor/helper/FrameMetricsHelper;", "framesHelper", "", "Ltq/d;", "trackers", "<init>", "(Lcom/kubi/monitor/helper/FrameMetricsHelper;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/monitor/helper/FrameMetricsHelper;", "()Lcom/kubi/monitor/helper/FrameMetricsHelper;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final FrameMetricsHelper framesHelper;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<InterfaceC45061d> trackers;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable FrameMetricsHelper frameMetricsHelper, @NotNull List<? extends InterfaceC45061d> trackers) {
            Intrinsics.checkNotNullParameter(trackers, "trackers");
            this.framesHelper = frameMetricsHelper;
            this.trackers = trackers;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final FrameMetricsHelper getFramesHelper() {
            return this.framesHelper;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<InterfaceC45061d> m42477b() {
            return this.trackers;
        }
    }

    @Override // p569qq.InterfaceC43849j
    /* JADX INFO: renamed from: a */
    public void mo42473a(@NotNull InterfaceC43845f page, @Nullable String extra) {
        Intrinsics.checkNotNullParameter(page, "page");
        a aVarRemove = trackerMap.remove(page);
        if (aVarRemove == null) {
            return;
        }
        FrameMetricsHelper framesHelper = aVarRemove.getFramesHelper();
        C46557a c46557aM42462c = framesHelper == null ? null : framesHelper.m42462c();
        Iterator<T> it = aVarRemove.m42477b().iterator();
        while (it.hasNext()) {
            ((InterfaceC45061d) it.next()).mo42448a(page, c46557aM42462c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p569qq.InterfaceC43849j
    /* JADX INFO: renamed from: b */
    public void mo42474b(@NotNull InterfaceC43845f page, @Nullable String extra) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(page, "page");
        Set<InterfaceC45060c> set = trackFactoryList;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            InterfaceC45061d interfaceC45061dMo42447a = ((InterfaceC45060c) it.next()).mo42447a(page);
            if (interfaceC45061dMo42447a != null) {
                arrayList.add(interfaceC45061dMo42447a);
            }
        }
        List list = CollectionsKt.toList(arrayList);
        if (list.isEmpty()) {
            return;
        }
        FrameMetricsHelper frameMetricsHelper = null;
        if (page instanceof Activity) {
            if (C43848i.m96579f()) {
                frameMetricsHelper = new FrameMetricsHelper((Activity) page);
                frameMetricsHelper.m42464e();
            }
            trackerMap.put(page, new a(frameMetricsHelper, list));
            return;
        }
        if (!(page instanceof Fragment) || (activity = ((Fragment) page).getActivity()) == null) {
            return;
        }
        if (C43848i.m96579f()) {
            frameMetricsHelper = new FrameMetricsHelper(activity);
            frameMetricsHelper.m42464e();
        }
        trackerMap.put(page, new a(frameMetricsHelper, list));
    }

    /* JADX INFO: renamed from: c */
    public final void m42475c(@NotNull InterfaceC45060c track) {
        Intrinsics.checkNotNullParameter(track, "track");
        trackFactoryList.add(track);
    }
}
