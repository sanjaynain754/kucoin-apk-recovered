package com.kubi.p110rn.modules.command;

import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.exception.RNException;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IReactBridgeCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0005H$¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/rn/modules/command/ReactBridgeActionCommand;", "Lcom/kubi/rn/modules/command/IReactBridgeCommand;", "<init>", "()V", "execute", "", "onExecute", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIReactBridgeCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IReactBridgeCommand.kt\ncom/kubi/rn/modules/command/ReactBridgeActionCommand\n+ 2 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,59:1\n45#2,2:60\n*S KotlinDebug\n*F\n+ 1 IReactBridgeCommand.kt\ncom/kubi/rn/modules/command/ReactBridgeActionCommand\n*L\n28#1:60,2\n*E\n"})
public abstract class ReactBridgeActionCommand implements IReactBridgeCommand {
    public abstract void onExecute();

    @Override // com.kubi.p110rn.modules.command.IReactBridgeCommand
    public final void execute() {
        try {
            onExecute();
        } catch (Exception e11) {
            C43846g.m96568c(new RNException(e11, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
    }
}
