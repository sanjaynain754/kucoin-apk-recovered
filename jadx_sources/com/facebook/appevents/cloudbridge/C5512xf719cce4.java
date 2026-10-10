package com.facebook.appevents.cloudbridge;

import com.facebook.internal.C5760c;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 */
/* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "responseCode", "", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;)V"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5512xf719cce4 extends Lambda implements Function2<String, Integer, Unit> {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
        invoke2(str, num);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5512xf719cce4(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    /* JADX INFO: renamed from: b */
    public static final void m7994b(Integer num, List processedEvents) {
        Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
        if (CollectionsKt.contains(AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE, num)) {
            return;
        }
        AppEventsConversionsAPITransformerWebRequests.f7723a.m7985g(num, processedEvents, 5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable String str, @Nullable final Integer num) {
        final List<Map<String, Object>> list = this.$processedEvents;
        C5760c.m10079p0(new Runnable() { // from class: com.facebook.appevents.cloudbridge.d
            @Override // java.lang.Runnable
            public final void run() {
                C5512xf719cce4.m7994b(num, list);
            }
        });
    }
}
