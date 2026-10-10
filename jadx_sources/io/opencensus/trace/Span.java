package io.opencensus.trace;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import tf0.C44941b;
import uf0.AbstractC45212a;
import uf0.AbstractC45222k;
import uf0.C45224m;
import wf0.C45826a;

/* JADX INFO: loaded from: classes60.dex */
public abstract class Span {

    /* JADX INFO: renamed from: c */
    public static final Map<String, AbstractC45212a> f87067c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d */
    public static final Set<Options> f87068d = Collections.unmodifiableSet(EnumSet.noneOf(Options.class));

    /* JADX INFO: renamed from: a */
    public final C45224m f87069a;

    /* JADX INFO: renamed from: b */
    public final Set<Options> f87070b;

    public enum Options {
        RECORD_EVENTS
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo87943b(String str, Map<String, AbstractC45212a> map);

    /* JADX INFO: renamed from: g */
    public abstract void mo87948g(AbstractC45222k abstractC45222k);

    /* JADX INFO: renamed from: a */
    public final void m87942a(String str) {
        C44941b.m99389b(str, TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION);
        mo87943b(str, f87067c);
    }

    /* JADX INFO: renamed from: d */
    public void mo87945d(MessageEvent messageEvent) {
        C44941b.m99389b(messageEvent, "messageEvent");
        mo87946e(C45826a.m101242b(messageEvent));
    }

    /* JADX INFO: renamed from: f */
    public final void m87947f() {
        mo87948g(AbstractC45222k.f101745a);
    }

    /* JADX INFO: renamed from: h */
    public final C45224m m87949h() {
        return this.f87069a;
    }

    /* JADX INFO: renamed from: i */
    public void mo87950i(String str, AbstractC45212a abstractC45212a) {
        C44941b.m99389b(str, "key");
        C44941b.m99389b(abstractC45212a, "value");
        mo87951j(Collections.singletonMap(str, abstractC45212a));
    }

    /* JADX INFO: renamed from: j */
    public void mo87951j(Map<String, AbstractC45212a> map) {
        C44941b.m99389b(map, JAnalysisConstants.EVENT_ATTRIBUTES);
        m87944c(map);
    }

    public Span(C45224m c45224m, EnumSet<Options> enumSet) {
        Set<Options> setUnmodifiableSet;
        boolean z11;
        this.f87069a = (C45224m) C44941b.m99389b(c45224m, "context");
        if (enumSet == null) {
            setUnmodifiableSet = f87068d;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.copyOf((EnumSet) enumSet));
        }
        this.f87070b = setUnmodifiableSet;
        if (c45224m.m99917c().m99931d() && !setUnmodifiableSet.contains(Options.RECORD_EVENTS)) {
            z11 = false;
        } else {
            z11 = true;
        }
        C44941b.m99388a(z11, "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m87944c(Map<String, AbstractC45212a> map) {
        mo87951j(map);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void mo87946e(NetworkEvent networkEvent) {
        mo87945d(C45826a.m101241a(networkEvent));
    }
}
