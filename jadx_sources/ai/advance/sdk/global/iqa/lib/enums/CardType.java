package ai.advance.sdk.global.iqa.lib.enums;

/* JADX INFO: loaded from: classes23.dex */
public enum CardType {
    ID_CARD(true),
    DRIVING_LICENSE(true),
    UMID(true),
    SSS(true),
    TIN(true),
    PASSPORT(true),
    VOTERID(true),
    NATIONALID(true),
    PRC(true),
    PAGIBIG(true),
    POSTALID(true);

    public boolean cardCheck;

    CardType(boolean z11) {
        this.cardCheck = z11;
    }
}
