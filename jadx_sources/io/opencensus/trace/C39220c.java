package io.opencensus.trace;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import tf0.C44941b;
import uf0.AbstractC45212a;
import uf0.AbstractC45222k;
import uf0.C45224m;

/* JADX INFO: renamed from: io.opencensus.trace.c */
/* JADX INFO: compiled from: BlankSpan.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C39220c extends Span {

    /* JADX INFO: renamed from: e */
    public static final C39220c f87110e = new C39220c();

    public C39220c() {
        super(C45224m.f101747f, null);
    }

    @Override // io.opencensus.trace.Span
    /* JADX INFO: renamed from: b */
    public void mo87943b(String str, Map<String, AbstractC45212a> map) {
        C44941b.m99389b(str, TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION);
        C44941b.m99389b(map, JAnalysisConstants.EVENT_ATTRIBUTES);
    }

    @Override // io.opencensus.trace.Span
    /* JADX INFO: renamed from: d */
    public void mo87945d(MessageEvent messageEvent) {
        C44941b.m99389b(messageEvent, "messageEvent");
    }

    @Override // io.opencensus.trace.Span
    /* JADX INFO: renamed from: g */
    public void mo87948g(AbstractC45222k abstractC45222k) {
        C44941b.m99389b(abstractC45222k, "options");
    }

    @Override // io.opencensus.trace.Span
    /* JADX INFO: renamed from: i */
    public void mo87950i(String str, AbstractC45212a abstractC45212a) {
        C44941b.m99389b(str, "key");
        C44941b.m99389b(abstractC45212a, "value");
    }

    @Override // io.opencensus.trace.Span
    /* JADX INFO: renamed from: j */
    public void mo87951j(Map<String, AbstractC45212a> map) {
        C44941b.m99389b(map, JAnalysisConstants.EVENT_ATTRIBUTES);
    }

    public String toString() {
        return "BlankSpan";
    }

    @Override // io.opencensus.trace.Span
    @Deprecated
    /* JADX INFO: renamed from: e */
    public void mo87946e(NetworkEvent networkEvent) {
    }
}
