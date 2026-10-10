package com.kubi.network.api.subscribe.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.d */
/* JADX INFO: compiled from: TopicMatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/utils/d;", "", "", "topic", "<init>", "(Ljava/lang/String;)V", "realTopic", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Z", "Ljava/lang/String;", "b", "topicPrefix", "c", "topicSuffix", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19318d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String topic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String topicPrefix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String topicSuffix;

    public C19318d(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.topic = topic;
        C19316b c19316b = C19316b.f35839a;
        this.topicPrefix = c19316b.m42757j(topic);
        this.topicSuffix = c19316b.m42758k(topic);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m42761a(@NotNull String realTopic) {
        C19316b c19316b;
        String strM42757j;
        String strM42758k;
        Intrinsics.checkNotNullParameter(realTopic, "realTopic");
        if (Intrinsics.areEqual(realTopic, this.topic)) {
            return true;
        }
        return (this.topicPrefix == null || this.topicSuffix == null || (strM42757j = (c19316b = C19316b.f35839a).m42757j(realTopic)) == null || !Intrinsics.areEqual(strM42757j, this.topicPrefix) || (strM42758k = c19316b.m42758k(realTopic)) == null || !StringsKt.contains$default((CharSequence) this.topicSuffix, (CharSequence) strM42758k, false, 2, (Object) null)) ? false : true;
    }
}
