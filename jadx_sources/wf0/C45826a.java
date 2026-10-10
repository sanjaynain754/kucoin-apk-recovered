package wf0;

import io.opencensus.trace.MessageEvent;
import io.opencensus.trace.NetworkEvent;
import tf0.C44941b;
import uf0.AbstractC45217f;

/* JADX INFO: renamed from: wf0.a */
/* JADX INFO: compiled from: BaseMessageEventUtils.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45826a {
    /* JADX INFO: renamed from: a */
    public static MessageEvent m101241a(AbstractC45217f abstractC45217f) {
        C44941b.m99389b(abstractC45217f, "event");
        if (abstractC45217f instanceof MessageEvent) {
            return (MessageEvent) abstractC45217f;
        }
        NetworkEvent networkEvent = (NetworkEvent) abstractC45217f;
        return MessageEvent.m87923a(networkEvent.mo87936e() == NetworkEvent.Type.RECV ? MessageEvent.Type.RECEIVED : MessageEvent.Type.SENT, networkEvent.mo87935d()).mo87931d(networkEvent.mo87937f()).mo87929b(networkEvent.mo87933b()).mo87928a();
    }

    /* JADX INFO: renamed from: b */
    public static NetworkEvent m101242b(AbstractC45217f abstractC45217f) {
        C44941b.m99389b(abstractC45217f, "event");
        if (abstractC45217f instanceof NetworkEvent) {
            return (NetworkEvent) abstractC45217f;
        }
        MessageEvent messageEvent = (MessageEvent) abstractC45217f;
        return NetworkEvent.m87932a(messageEvent.mo87926d() == MessageEvent.Type.RECEIVED ? NetworkEvent.Type.RECV : NetworkEvent.Type.SENT, messageEvent.mo87925c()).mo87941d(messageEvent.mo87927e()).mo87939b(messageEvent.mo87924b()).mo87938a();
    }
}
