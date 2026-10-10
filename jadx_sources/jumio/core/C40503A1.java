package jumio.core;

/* JADX INFO: renamed from: jumio.core.A1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40503A1 extends AbstractC40513C1 {
    public C40503A1() {
        super("\n\t\tuniform mat4 uTransMatrix;\n\t\tattribute vec4 aPosition;\n\t\tvoid main() {\n\t\t    gl_Position = uTransMatrix * aPosition;\n\t\t}\n\t", "\n\t\tprecision mediump float;\n\t\tuniform float uAlphaScale;\n\t\tvoid main() {\n\t\t    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n\t\t}\n\t");
    }
}
