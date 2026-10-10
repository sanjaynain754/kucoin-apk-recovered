package com.kubi.p110rn.modules.command.impl;

import com.facebook.react.bridge.ReadableMap;
import com.kubi.p110rn.modules.RNH5InterActionHelper;
import com.kubi.p110rn.modules.command.ReactBridgeActionCommand;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NotifyH5Command.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/NotifyH5Command;", "Lcom/kubi/rn/modules/command/ReactBridgeActionCommand;", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "onExecute", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NotifyH5Command extends ReactBridgeActionCommand {

    @NotNull
    private final ReadableMap params;

    public NotifyH5Command(@NotNull ReadableMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    @Override // com.kubi.p110rn.modules.command.ReactBridgeActionCommand
    public void onExecute() {
        RNH5InterActionHelper.onInterCommunicateFromRN(this.params.toHashMap());
    }
}
