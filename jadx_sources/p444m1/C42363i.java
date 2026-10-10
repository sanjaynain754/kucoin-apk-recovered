package p444m1;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: m1.i */
/* JADX INFO: compiled from: DocumentDataParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42363i implements InterfaceC42374n0<DocumentData> {

    /* JADX INFO: renamed from: a */
    public static final C42363i f93875a = new C42363i();

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93876b = JsonReader.C5103a.m5845a("t", "f", CmcdData.Factory.STREAMING_FORMAT_SS, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentData mo92921a(JsonReader jsonReader, float f11) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.mo5830g();
        DocumentData.Justification justification2 = justification;
        String strMo5838o = null;
        String strMo5838o2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fMo5835l = 0.0f;
        float fMo5835l2 = 0.0f;
        float fMo5835l3 = 0.0f;
        float fMo5835l4 = 0.0f;
        int iMo5836m = 0;
        int iM92982d = 0;
        int iM92982d2 = 0;
        boolean zMo5834k = true;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93876b)) {
                case 0:
                    strMo5838o = jsonReader.mo5838o();
                    break;
                case 1:
                    strMo5838o2 = jsonReader.mo5838o();
                    break;
                case 2:
                    fMo5835l = (float) jsonReader.mo5835l();
                    break;
                case 3:
                    int iMo5836m2 = jsonReader.mo5836m();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iMo5836m2 <= justification2.ordinal() && iMo5836m2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iMo5836m2];
                    }
                    break;
                case 4:
                    iMo5836m = jsonReader.mo5836m();
                    break;
                case 5:
                    fMo5835l2 = (float) jsonReader.mo5835l();
                    break;
                case 6:
                    fMo5835l3 = (float) jsonReader.mo5835l();
                    break;
                case 7:
                    iM92982d = C42379s.m92982d(jsonReader);
                    break;
                case 8:
                    iM92982d2 = C42379s.m92982d(jsonReader);
                    break;
                case 9:
                    fMo5835l4 = (float) jsonReader.mo5835l();
                    break;
                case 10:
                    zMo5834k = jsonReader.mo5834k();
                    break;
                case 11:
                    jsonReader.mo5829b();
                    PointF pointF3 = new PointF(((float) jsonReader.mo5835l()) * f11, ((float) jsonReader.mo5835l()) * f11);
                    jsonReader.mo5831h();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.mo5829b();
                    PointF pointF4 = new PointF(((float) jsonReader.mo5835l()) * f11, ((float) jsonReader.mo5835l()) * f11);
                    jsonReader.mo5831h();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                    break;
            }
        }
        jsonReader.mo5832i();
        return new DocumentData(strMo5838o, strMo5838o2, fMo5835l, justification2, iMo5836m, fMo5835l2, fMo5835l3, iM92982d, iM92982d2, fMo5835l4, zMo5834k, pointF, pointF2);
    }
}
