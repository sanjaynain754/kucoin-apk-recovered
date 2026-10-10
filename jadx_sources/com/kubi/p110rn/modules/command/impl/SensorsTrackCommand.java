package com.kubi.p110rn.modules.command.impl;

import com.facebook.react.bridge.ReadableMap;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.api.IReactNativeServiceKt;
import com.kubi.p110rn.modules.command.ReactBridgeActionCommand;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SensorsTrackCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/SensorsTrackCommand;", "Lcom/kubi/rn/modules/command/ReactBridgeActionCommand;", "eventId", "", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "onExecute", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSensorsTrackCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorsTrackCommand.kt\ncom/kubi/rn/modules/command/impl/SensorsTrackCommand\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,26:1\n32#2,2:27\n*S KotlinDebug\n*F\n+ 1 SensorsTrackCommand.kt\ncom/kubi/rn/modules/command/impl/SensorsTrackCommand\n*L\n21#1:27,2\n*E\n"})
public final class SensorsTrackCommand extends ReactBridgeActionCommand {

    @NotNull
    private final String eventId;

    @NotNull
    private final ReadableMap params;

    public SensorsTrackCommand(@NotNull String eventId, @NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(params, "params");
        this.eventId = eventId;
        this.params = params;
    }

    @Override // com.kubi.p110rn.modules.command.ReactBridgeActionCommand
    public void onExecute() throws JSONException {
        C12572a.m23695d(IReactNativeServiceKt.SENSORS_RN_TRACK_EVENT, new Pair(this.eventId, this.params.toHashMap()), 0L, 4, null);
        String str = this.eventId;
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<String, Object>> entryIterator = this.params.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            jSONObject.put(next.getKey(), next.getValue());
        }
        C43852m.m96605q(str, jSONObject);
    }
}
