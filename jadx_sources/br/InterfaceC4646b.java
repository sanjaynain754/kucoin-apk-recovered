package br;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.monitor.metrics.bean.CollectorData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: br.b */
/* JADX INFO: compiled from: IProcessor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lbr/b;", "", "Lcom/kubi/monitor/metrics/bean/CollectorData;", "data", "", "c", "(Lcom/kubi/monitor/metrics/bean/CollectorData;)V", "", "pageId", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "b", "release", "()V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface InterfaceC4646b {
    /* JADX INFO: renamed from: a */
    void mo4594a(@Nullable String pageId, @Nullable String extra);

    /* JADX INFO: renamed from: b */
    void mo4595b(@Nullable String pageId, @Nullable String extra);

    /* JADX INFO: renamed from: c */
    void mo4596c(@NotNull CollectorData data);

    void release();
}
