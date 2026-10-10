package com.jumio.core.interfaces;

import jumio.core.InterfaceC40671h3;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/interfaces/ConfirmationInterface;", "Lcom/jumio/core/interfaces/RejectInterface;", "shouldConfirm", "", "getShouldConfirm", "()Z", "confirm", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ConfirmationInterface extends InterfaceC40671h3 {
    void confirm();

    default boolean getShouldConfirm() {
        return true;
    }

    @Override // jumio.core.InterfaceC40671h3
    /* synthetic */ void reject();

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getShouldConfirm(@NotNull ConfirmationInterface confirmationInterface) {
            return ConfirmationInterface.super.getShouldConfirm();
        }
    }
}
