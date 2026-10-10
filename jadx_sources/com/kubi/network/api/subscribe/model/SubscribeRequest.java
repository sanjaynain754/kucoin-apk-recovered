package com.kubi.network.api.subscribe.model;

import androidx.annotation.Keep;
import com.kubi.network.api.model.NetworkRequest;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SubscribeRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B;\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "Lcom/kubi/network/api/model/NetworkRequest;", "type", "", "topic", ReportDataTable.COLUMN_PARAMS, "", "", "period", "Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V", "getParams", "()Ljava/util/Map;", "getPeriod", "()Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "getTopic", "()Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "clone", "Companion", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SubscribeRequest extends NetworkRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Map<String, Object> params;

    @Nullable
    private final PeriodRequest period;

    @NotNull
    private final String topic;

    @NotNull
    private String type;

    /* JADX INFO: compiled from: SubscribeRequest.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/model/SubscribeRequest$Companion;", "", "()V", "subscribe", "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "topic", "", "request", "Lokhttp3/Request;", "unsubscribe", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSubscribeRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscribeRequest.kt\ncom/kubi/network/api/subscribe/model/SubscribeRequest$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ SubscribeRequest subscribe$default(Companion companion, String str, Request request, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                request = null;
            }
            return companion.subscribe(str, request);
        }

        public static /* synthetic */ SubscribeRequest unsubscribe$default(Companion companion, String str, Request request, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                request = null;
            }
            return companion.unsubscribe(str, request);
        }

        @NotNull
        public final SubscribeRequest subscribe(@NotNull String topic, @Nullable Request request) {
            Intrinsics.checkNotNullParameter(topic, "topic");
            return new SubscribeRequest("subscribe", topic, null, request != null ? PeriodRequest.INSTANCE.subscribe(request) : null, 4, null);
        }

        @NotNull
        public final SubscribeRequest unsubscribe(@NotNull String topic, @Nullable Request request) {
            Intrinsics.checkNotNullParameter(topic, "topic");
            return new SubscribeRequest("unsubscribe", topic, null, request != null ? PeriodRequest.INSTANCE.unsubscribe(request) : null, 4, null);
        }
    }

    public /* synthetic */ SubscribeRequest(String str, String str2, Map map, PeriodRequest periodRequest, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "subscribe" : str, str2, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : periodRequest);
    }

    @NotNull
    public final SubscribeRequest clone(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String str = this.topic;
        Map<String, Object> params = getParams();
        PeriodRequest periodRequest = this.period;
        return new SubscribeRequest(type, str, params, periodRequest != null ? periodRequest.clone(type) : null);
    }

    @Override // com.kubi.network.api.model.NetworkRequest
    @Nullable
    public Map<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public final PeriodRequest getPeriod() {
        return this.period;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeRequest(@NotNull String type, @NotNull String topic, @Nullable Map<String, ? extends Object> map, @Nullable PeriodRequest periodRequest) {
        super(0, topic, map, 1, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.type = type;
        this.topic = topic;
        this.params = map;
        this.period = periodRequest;
    }
}
