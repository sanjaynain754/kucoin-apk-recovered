package com.kubi.sdk.lib.kunlun.sdk.collector;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import xg0.C46163a0;
import xg0.C46164b;
import xg0.C46173h;

/* JADX INFO: compiled from: DetailCollector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector;", "Lcom/kubi/sdk/lib/kunlun/sdk/collector/a;", "", "eventName", "", "timeStamp", "<init>", "(Ljava/lang/String;J)V", "Lkotlinx/serialization/json/JsonArray;", "d", "()Lkotlinx/serialization/json/JsonArray;", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDetailCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailCollector.kt\ncom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,48:1\n49#2,4:49\n*S KotlinDebug\n*F\n+ 1 DetailCollector.kt\ncom/kubi/sdk/lib/kunlun/sdk/collector/DetailCollector\n*L\n26#1:49,4\n*E\n"})
public final class DetailCollector extends AbstractC23866a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailCollector(@NotNull String eventName, long j11) {
        super(eventName, j11);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.kubi.sdk.lib.kunlun.sdk.collector.AbstractC23866a
    @Nullable
    /* JADX INFO: renamed from: d */
    public JsonArray mo57132d() {
        if (m57137f().isEmpty()) {
            return null;
        }
        C46164b c46164b = new C46164b();
        for (final Sample sample : m57137f().values()) {
            C46173h.m101806d(c46164b, new Function1<C46163a0, Unit>() { // from class: com.kubi.sdk.lib.kunlun.sdk.collector.DetailCollector$collect$result$1$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46163a0 c46163a0) {
                    invoke2(c46163a0);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46163a0 addJsonObject) {
                    Intrinsics.checkNotNullParameter(addJsonObject, "$this$addJsonObject");
                    C46173h.m101809g(addJsonObject, "event", this.this$0.getEventName());
                    final Sample sample2 = sample;
                    C46173h.m101810h(addJsonObject, "value", new Function1<C46164b, Unit>() { // from class: com.kubi.sdk.lib.kunlun.sdk.collector.DetailCollector$collect$result$1$1.1
                        @Override // p852kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C46164b c46164b2) {
                            invoke2(c46164b2);
                            return Unit.INSTANCE;
                        }

                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull C46164b putJsonArray) {
                            Intrinsics.checkNotNullParameter(putJsonArray, "$this$putJsonArray");
                            Iterator<Number> it = sample2.m57142c().iterator();
                            while (it.hasNext()) {
                                C46173h.m101804b(putJsonArray, it.next());
                            }
                        }
                    });
                    C46173h.m101808f(addJsonObject, "timestamp", Long.valueOf(this.this$0.getTimeStamp()));
                    final Sample sample3 = sample;
                    final DetailCollector detailCollector = this.this$0;
                    C46173h.m101811i(addJsonObject, "labels", new Function1<C46163a0, Unit>() { // from class: com.kubi.sdk.lib.kunlun.sdk.collector.DetailCollector$collect$result$1$1.2
                        @Override // p852kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C46163a0 c46163a0) {
                            invoke2(c46163a0);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull C46163a0 putJsonObject) {
                            Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
                            for (Map.Entry<String, Object> entry : sample3.m57141b().entrySet()) {
                                C46173h.m101809g(putJsonObject, entry.getKey(), entry.getValue().toString());
                            }
                            detailCollector.m57133a(putJsonObject);
                        }
                    });
                }
            });
        }
        JsonArray jsonArrayM101771b = c46164b.m101771b();
        m57139h();
        return jsonArrayM101771b;
    }
}
