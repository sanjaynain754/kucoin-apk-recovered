package io.noties.markwon.html.jsoup.parser;

import okio.Utf8;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes60.dex */
enum TokeniserState {
    Data { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.1
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87892q = c39213a.m87892q();
            if (cM87892q != 0) {
                if (cM87892q != '&') {
                    if (cM87892q != '<') {
                        if (cM87892q != 65535) {
                            c39215c.m87912k(c39213a.m87880e());
                            return;
                        } else {
                            c39215c.m87911j(new Token.C39142e());
                            return;
                        }
                    }
                    c39215c.m87902a(TokeniserState.TagOpen);
                    return;
                }
                c39215c.m87902a(TokeniserState.CharacterReferenceInData);
                return;
            }
            c39215c.m87918q(this);
            c39215c.m87910i(c39213a.m87879d());
        }
    },
    CharacterReferenceInData { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.2
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87863c(c39215c, TokeniserState.Data);
        }
    },
    Rcdata { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.3
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87892q = c39213a.m87892q();
            if (cM87892q != 0) {
                if (cM87892q != '&') {
                    if (cM87892q != '<') {
                        if (cM87892q != 65535) {
                            c39215c.m87912k(c39213a.m87888m(Typography.amp, Typography.less, 0));
                            return;
                        } else {
                            c39215c.m87911j(new Token.C39142e());
                            return;
                        }
                    }
                    c39215c.m87902a(TokeniserState.RcdataLessthanSign);
                    return;
                }
                c39215c.m87902a(TokeniserState.CharacterReferenceInRcdata);
                return;
            }
            c39215c.m87918q(this);
            c39213a.m87877a();
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    CharacterReferenceInRcdata { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.4
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87863c(c39215c, TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.5
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87864d(c39215c, c39213a, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.6
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87864d(c39215c, c39213a, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.7
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87892q = c39213a.m87892q();
            if (cM87892q != 0) {
                if (cM87892q != 65535) {
                    c39215c.m87912k(c39213a.m87886k((char) 0));
                    return;
                } else {
                    c39215c.m87911j(new Token.C39142e());
                    return;
                }
            }
            c39215c.m87918q(this);
            c39213a.m87877a();
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    TagOpen { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.8
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87892q = c39213a.m87892q();
            if (cM87892q != '!') {
                if (cM87892q != '/') {
                    if (cM87892q != '?') {
                        if (c39213a.m87871C()) {
                            c39215c.m87908g(true);
                            c39215c.m87922u(TokeniserState.TagName);
                            return;
                        } else {
                            c39215c.m87918q(this);
                            c39215c.m87910i(Typography.less);
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    }
                    c39215c.m87902a(TokeniserState.BogusComment);
                    return;
                }
                c39215c.m87902a(TokeniserState.EndTagOpen);
                return;
            }
            c39215c.m87902a(TokeniserState.MarkupDeclarationOpen);
        }
    },
    EndTagOpen { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.9
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87893r()) {
                c39215c.m87917p(this);
                c39215c.m87912k("</");
                c39215c.m87922u(TokeniserState.Data);
            } else if (c39213a.m87871C()) {
                c39215c.m87908g(false);
                c39215c.m87922u(TokeniserState.TagName);
            } else if (c39213a.m87898w(Typography.greater)) {
                c39215c.m87918q(this);
                c39215c.m87902a(TokeniserState.Data);
            } else {
                c39215c.m87918q(this);
                c39215c.m87902a(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.10
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            c39215c.f87052i.m87854i(c39213a.m87885j());
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != ' ') {
                    if (cM87879d != '/') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                                    c39215c.f87052i.m87853h(cM87879d);
                                    return;
                                }
                            } else {
                                c39215c.m87917p(this);
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        } else {
                            c39215c.m87916o();
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    } else {
                        c39215c.m87922u(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                }
                c39215c.m87922u(TokeniserState.BeforeAttributeName);
                return;
            }
            c39215c.f87052i.m87854i(TokeniserState.f87030b);
        }
    },
    RcdataLessthanSign { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.11
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87898w('/')) {
                c39215c.m87909h();
                c39215c.m87902a(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (c39213a.m87871C() && c39215c.m87903b() != null) {
                if (!c39213a.m87891p("</" + c39215c.m87903b())) {
                    c39215c.f87052i = c39215c.m87908g(false).m87857l(c39215c.m87903b());
                    c39215c.m87916o();
                    c39213a.m87876I();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
            }
            c39215c.m87912k("<");
            c39215c.m87922u(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagOpen { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.12
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87871C()) {
                c39215c.m87908g(false);
                c39215c.f87052i.m87853h(c39213a.m87892q());
                c39215c.f87051h.append(c39213a.m87892q());
                c39215c.m87902a(TokeniserState.RCDATAEndTagName);
                return;
            }
            c39215c.m87912k("</");
            c39215c.m87922u(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.13
        /* JADX INFO: renamed from: f */
        public final void m87866f(C39215c c39215c, C39213a c39213a) {
            c39215c.m87912k("</" + c39215c.f87051h.toString());
            c39213a.m87876I();
            c39215c.m87922u(TokeniserState.Rcdata);
        }

        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87871C()) {
                String strM87883h = c39213a.m87883h();
                c39215c.f87052i.m87854i(strM87883h);
                c39215c.f87051h.append(strM87883h);
                return;
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '/') {
                    if (cM87879d != '>') {
                        m87866f(c39215c, c39213a);
                        return;
                    } else if (c39215c.m87920s()) {
                        c39215c.m87916o();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    } else {
                        m87866f(c39215c, c39213a);
                        return;
                    }
                }
                if (c39215c.m87920s()) {
                    c39215c.m87922u(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    m87866f(c39215c, c39213a);
                    return;
                }
            }
            if (c39215c.m87920s()) {
                c39215c.m87922u(TokeniserState.BeforeAttributeName);
            } else {
                m87866f(c39215c, c39213a);
            }
        }
    },
    RawtextLessthanSign { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.14
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87898w('/')) {
                c39215c.m87909h();
                c39215c.m87902a(TokeniserState.RawtextEndTagOpen);
            } else {
                c39215c.m87910i(Typography.less);
                c39215c.m87922u(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.15
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87865e(c39215c, c39213a, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.16
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87862b(c39215c, c39213a, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.17
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '!') {
                if (cM87879d != '/') {
                    c39215c.m87912k("<");
                    c39213a.m87876I();
                    c39215c.m87922u(TokeniserState.ScriptData);
                    return;
                } else {
                    c39215c.m87909h();
                    c39215c.m87922u(TokeniserState.ScriptDataEndTagOpen);
                    return;
                }
            }
            c39215c.m87912k("<!");
            c39215c.m87922u(TokeniserState.ScriptDataEscapeStart);
        }
    },
    ScriptDataEndTagOpen { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.18
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87865e(c39215c, c39213a, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.19
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87862b(c39215c, c39213a, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.20
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (!c39213a.m87898w('-')) {
                c39215c.m87922u(TokeniserState.ScriptData);
            } else {
                c39215c.m87910i('-');
                c39215c.m87902a(TokeniserState.ScriptDataEscapeStartDash);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.21
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (!c39213a.m87898w('-')) {
                c39215c.m87922u(TokeniserState.ScriptData);
            } else {
                c39215c.m87910i('-');
                c39215c.m87902a(TokeniserState.ScriptDataEscapedDashDash);
            }
        }
    },
    ScriptDataEscaped { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.22
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87893r()) {
                c39215c.m87917p(this);
                c39215c.m87922u(TokeniserState.Data);
                return;
            }
            char cM87892q = c39213a.m87892q();
            if (cM87892q != 0) {
                if (cM87892q != '-') {
                    if (cM87892q != '<') {
                        c39215c.m87912k(c39213a.m87888m('-', Typography.less, 0));
                        return;
                    } else {
                        c39215c.m87902a(TokeniserState.ScriptDataEscapedLessthanSign);
                        return;
                    }
                }
                c39215c.m87910i('-');
                c39215c.m87902a(TokeniserState.ScriptDataEscapedDash);
                return;
            }
            c39215c.m87918q(this);
            c39213a.m87877a();
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    ScriptDataEscapedDash { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.23
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87893r()) {
                c39215c.m87917p(this);
                c39215c.m87922u(TokeniserState.Data);
                return;
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != '<') {
                        c39215c.m87910i(cM87879d);
                        c39215c.m87922u(TokeniserState.ScriptDataEscaped);
                        return;
                    } else {
                        c39215c.m87922u(TokeniserState.ScriptDataEscapedLessthanSign);
                        return;
                    }
                }
                c39215c.m87910i(cM87879d);
                c39215c.m87922u(TokeniserState.ScriptDataEscapedDashDash);
                return;
            }
            c39215c.m87918q(this);
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedDashDash { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.24
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87893r()) {
                c39215c.m87917p(this);
                c39215c.m87922u(TokeniserState.Data);
                return;
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != '<') {
                        if (cM87879d != '>') {
                            c39215c.m87910i(cM87879d);
                            c39215c.m87922u(TokeniserState.ScriptDataEscaped);
                            return;
                        } else {
                            c39215c.m87910i(cM87879d);
                            c39215c.m87922u(TokeniserState.ScriptData);
                            return;
                        }
                    }
                    c39215c.m87922u(TokeniserState.ScriptDataEscapedLessthanSign);
                    return;
                }
                c39215c.m87910i(cM87879d);
                return;
            }
            c39215c.m87918q(this);
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedLessthanSign { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.25
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87871C()) {
                c39215c.m87909h();
                c39215c.f87051h.append(c39213a.m87892q());
                c39215c.m87912k("<" + c39213a.m87892q());
                c39215c.m87902a(TokeniserState.ScriptDataDoubleEscapeStart);
                return;
            }
            if (c39213a.m87898w('/')) {
                c39215c.m87909h();
                c39215c.m87902a(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                c39215c.m87910i(Typography.less);
                c39215c.m87922u(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.26
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87871C()) {
                c39215c.m87908g(false);
                c39215c.f87052i.m87853h(c39213a.m87892q());
                c39215c.f87051h.append(c39213a.m87892q());
                c39215c.m87902a(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            c39215c.m87912k("</");
            c39215c.m87922u(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.27
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87862b(c39215c, c39213a, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.28
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87861a(c39215c, c39213a, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.29
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87892q = c39213a.m87892q();
            if (cM87892q != 0) {
                if (cM87892q != '-') {
                    if (cM87892q != '<') {
                        if (cM87892q != 65535) {
                            c39215c.m87912k(c39213a.m87888m('-', Typography.less, 0));
                            return;
                        } else {
                            c39215c.m87917p(this);
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    }
                    c39215c.m87910i(cM87892q);
                    c39215c.m87902a(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                c39215c.m87910i(cM87892q);
                c39215c.m87902a(TokeniserState.ScriptDataDoubleEscapedDash);
                return;
            }
            c39215c.m87918q(this);
            c39213a.m87877a();
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    ScriptDataDoubleEscapedDash { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.30
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != '<') {
                        if (cM87879d != 65535) {
                            c39215c.m87910i(cM87879d);
                            c39215c.m87922u(TokeniserState.ScriptDataDoubleEscaped);
                            return;
                        } else {
                            c39215c.m87917p(this);
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    }
                    c39215c.m87910i(cM87879d);
                    c39215c.m87922u(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                c39215c.m87910i(cM87879d);
                c39215c.m87922u(TokeniserState.ScriptDataDoubleEscapedDashDash);
                return;
            }
            c39215c.m87918q(this);
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.31
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != '<') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87910i(cM87879d);
                                c39215c.m87922u(TokeniserState.ScriptDataDoubleEscaped);
                                return;
                            } else {
                                c39215c.m87917p(this);
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        }
                        c39215c.m87910i(cM87879d);
                        c39215c.m87922u(TokeniserState.ScriptData);
                        return;
                    }
                    c39215c.m87910i(cM87879d);
                    c39215c.m87922u(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                c39215c.m87910i(cM87879d);
                return;
            }
            c39215c.m87918q(this);
            c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.32
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (!c39213a.m87898w('/')) {
                c39215c.m87922u(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            c39215c.m87910i('/');
            c39215c.m87909h();
            c39215c.m87902a(TokeniserState.ScriptDataDoubleEscapeEnd);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.33
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            TokeniserState.m87861a(c39215c, c39213a, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.34
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != ' ') {
                    if (cM87879d != '\"' && cM87879d != '\'') {
                        if (cM87879d != '/') {
                            if (cM87879d != 65535) {
                                if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                                    switch (cM87879d) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            c39215c.m87916o();
                                            c39215c.m87922u(TokeniserState.Data);
                                            break;
                                        default:
                                            c39215c.f87052i.m87859n();
                                            c39213a.m87876I();
                                            c39215c.m87922u(TokeniserState.AttributeName);
                                            break;
                                    }
                                    return;
                                }
                                return;
                            }
                            c39215c.m87917p(this);
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                        c39215c.m87922u(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.f87052i.m87859n();
                    c39215c.f87052i.m87848c(cM87879d);
                    c39215c.m87922u(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87052i.m87859n();
            c39213a.m87876I();
            c39215c.m87922u(TokeniserState.AttributeName);
        }
    },
    AttributeName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.35
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            c39215c.f87052i.m87849d(c39213a.m87889n(TokeniserState.attributeNameCharsSorted));
            char cM87879d = c39213a.m87879d();
            if (cM87879d == 0) {
                c39215c.m87918q(this);
                c39215c.f87052i.m87848c(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM87879d != ' ') {
                if (cM87879d != '\"' && cM87879d != '\'') {
                    if (cM87879d == '/') {
                        c39215c.m87922u(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (cM87879d == 65535) {
                        c39215c.m87917p(this);
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                        switch (cM87879d) {
                            case '<':
                                break;
                            case '=':
                                c39215c.m87922u(TokeniserState.BeforeAttributeValue);
                                break;
                            case '>':
                                c39215c.m87916o();
                                c39215c.m87922u(TokeniserState.Data);
                                break;
                            default:
                                c39215c.f87052i.m87848c(cM87879d);
                                break;
                        }
                        return;
                    }
                }
                c39215c.m87918q(this);
                c39215c.f87052i.m87848c(cM87879d);
                return;
            }
            c39215c.m87922u(TokeniserState.AfterAttributeName);
        }
    },
    AfterAttributeName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.36
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != ' ') {
                    if (cM87879d != '\"' && cM87879d != '\'') {
                        if (cM87879d != '/') {
                            if (cM87879d != 65535) {
                                if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                                    switch (cM87879d) {
                                        case '<':
                                            break;
                                        case '=':
                                            c39215c.m87922u(TokeniserState.BeforeAttributeValue);
                                            break;
                                        case '>':
                                            c39215c.m87916o();
                                            c39215c.m87922u(TokeniserState.Data);
                                            break;
                                        default:
                                            c39215c.f87052i.m87859n();
                                            c39213a.m87876I();
                                            c39215c.m87922u(TokeniserState.AttributeName);
                                            break;
                                    }
                                    return;
                                }
                                return;
                            }
                            c39215c.m87917p(this);
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                        c39215c.m87922u(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.f87052i.m87859n();
                    c39215c.f87052i.m87848c(cM87879d);
                    c39215c.m87922u(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87052i.m87848c(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.AttributeName);
        }
    },
    BeforeAttributeValue { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.37
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != ' ') {
                    if (cM87879d != '\"') {
                        if (cM87879d != '`') {
                            if (cM87879d != 65535) {
                                if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                                    if (cM87879d != '&') {
                                        if (cM87879d != '\'') {
                                            switch (cM87879d) {
                                                case '<':
                                                case '=':
                                                    break;
                                                case '>':
                                                    c39215c.m87918q(this);
                                                    c39215c.m87916o();
                                                    c39215c.m87922u(TokeniserState.Data);
                                                    break;
                                                default:
                                                    c39213a.m87876I();
                                                    c39215c.m87922u(TokeniserState.AttributeValue_unquoted);
                                                    break;
                                            }
                                            return;
                                        }
                                        c39215c.m87922u(TokeniserState.AttributeValue_singleQuoted);
                                        return;
                                    }
                                    c39213a.m87876I();
                                    c39215c.m87922u(TokeniserState.AttributeValue_unquoted);
                                    return;
                                }
                                return;
                            }
                            c39215c.m87917p(this);
                            c39215c.m87916o();
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                        c39215c.m87918q(this);
                        c39215c.f87052i.m87850e(cM87879d);
                        c39215c.m87922u(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    c39215c.m87922u(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87052i.m87850e(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.AttributeValue_unquoted);
        }
    },
    AttributeValue_doubleQuoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.38
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            String strM87888m = c39213a.m87888m(TokeniserState.attributeDoubleValueCharsSorted);
            if (strM87888m.length() > 0) {
                c39215c.f87052i.m87851f(strM87888m);
            } else {
                c39215c.f87052i.m87860p();
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d == 0) {
                c39215c.m87918q(this);
                c39215c.f87052i.m87850e(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM87879d == '\"') {
                c39215c.m87922u(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            if (cM87879d != '&') {
                if (cM87879d != 65535) {
                    c39215c.f87052i.m87850e(cM87879d);
                    return;
                } else {
                    c39215c.m87917p(this);
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
            }
            int[] iArrM87905d = c39215c.m87905d('\"', true);
            if (iArrM87905d != null) {
                c39215c.f87052i.m87852g(iArrM87905d);
            } else {
                c39215c.f87052i.m87850e(Typography.amp);
            }
        }
    },
    AttributeValue_singleQuoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.39
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            String strM87888m = c39213a.m87888m(TokeniserState.attributeSingleValueCharsSorted);
            if (strM87888m.length() > 0) {
                c39215c.f87052i.m87851f(strM87888m);
            } else {
                c39215c.f87052i.m87860p();
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d == 0) {
                c39215c.m87918q(this);
                c39215c.f87052i.m87850e(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM87879d == 65535) {
                c39215c.m87917p(this);
                c39215c.m87922u(TokeniserState.Data);
                return;
            }
            if (cM87879d != '&') {
                if (cM87879d != '\'') {
                    c39215c.f87052i.m87850e(cM87879d);
                    return;
                } else {
                    c39215c.m87922u(TokeniserState.AfterAttributeValue_quoted);
                    return;
                }
            }
            int[] iArrM87905d = c39215c.m87905d('\'', true);
            if (iArrM87905d != null) {
                c39215c.f87052i.m87852g(iArrM87905d);
            } else {
                c39215c.f87052i.m87850e(Typography.amp);
            }
        }
    },
    AttributeValue_unquoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.40
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            String strM87889n = c39213a.m87889n(TokeniserState.attributeValueUnquoted);
            if (strM87889n.length() > 0) {
                c39215c.f87052i.m87851f(strM87889n);
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d == 0) {
                c39215c.m87918q(this);
                c39215c.f87052i.m87850e(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            if (cM87879d != ' ') {
                if (cM87879d != '\"' && cM87879d != '`') {
                    if (cM87879d == 65535) {
                        c39215c.m87917p(this);
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                        if (cM87879d == '&') {
                            int[] iArrM87905d = c39215c.m87905d(Character.valueOf(Typography.greater), true);
                            if (iArrM87905d != null) {
                                c39215c.f87052i.m87852g(iArrM87905d);
                                return;
                            } else {
                                c39215c.f87052i.m87850e(Typography.amp);
                                return;
                            }
                        }
                        if (cM87879d != '\'') {
                            switch (cM87879d) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c39215c.m87916o();
                                    c39215c.m87922u(TokeniserState.Data);
                                    break;
                                default:
                                    c39215c.f87052i.m87850e(cM87879d);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c39215c.m87918q(this);
                c39215c.f87052i.m87850e(cM87879d);
                return;
            }
            c39215c.m87922u(TokeniserState.BeforeAttributeName);
        }
    },
    AfterAttributeValue_quoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.41
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '/') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            c39215c.m87918q(this);
                            c39213a.m87876I();
                            c39215c.m87922u(TokeniserState.BeforeAttributeName);
                            return;
                        } else {
                            c39215c.m87917p(this);
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    }
                    c39215c.m87916o();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.SelfClosingStartTag);
                return;
            }
            c39215c.m87922u(TokeniserState.BeforeAttributeName);
        }
    },
    SelfClosingStartTag { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.42
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '>') {
                if (cM87879d != 65535) {
                    c39215c.m87918q(this);
                    c39213a.m87876I();
                    c39215c.m87922u(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    c39215c.m87917p(this);
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
            }
            c39215c.f87052i.f87028i = true;
            c39215c.m87916o();
            c39215c.m87922u(TokeniserState.Data);
        }
    },
    BogusComment { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.43
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            c39213a.m87876I();
            Token.C39140c c39140c = new Token.C39140c();
            c39140c.f87015c = true;
            c39140c.f87014b.append(c39213a.m87886k(Typography.greater));
            c39215c.m87911j(c39140c);
            c39215c.m87902a(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.44
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87896u("--")) {
                c39215c.m87906e();
                c39215c.m87922u(TokeniserState.CommentStart);
            } else if (c39213a.m87897v("DOCTYPE")) {
                c39215c.m87922u(TokeniserState.Doctype);
            } else if (c39213a.m87896u("[CDATA[")) {
                c39215c.m87909h();
                c39215c.m87922u(TokeniserState.CdataSection);
            } else {
                c39215c.m87918q(this);
                c39215c.m87902a(TokeniserState.BogusComment);
            }
        }
    },
    CommentStart { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.45
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            c39215c.f87057n.f87014b.append(cM87879d);
                            c39215c.m87922u(TokeniserState.Comment);
                            return;
                        } else {
                            c39215c.m87917p(this);
                            c39215c.m87914m();
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    }
                    c39215c.m87918q(this);
                    c39215c.m87914m();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.CommentStartDash);
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87057n.f87014b.append(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.Comment);
        }
    },
    CommentStartDash { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.46
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            c39215c.f87057n.f87014b.append(cM87879d);
                            c39215c.m87922u(TokeniserState.Comment);
                            return;
                        } else {
                            c39215c.m87917p(this);
                            c39215c.m87914m();
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    }
                    c39215c.m87918q(this);
                    c39215c.m87914m();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.CommentStartDash);
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87057n.f87014b.append(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.Comment);
        }
    },
    Comment { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.47
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87892q = c39213a.m87892q();
            if (cM87892q != 0) {
                if (cM87892q != '-') {
                    if (cM87892q != 65535) {
                        c39215c.f87057n.f87014b.append(c39213a.m87888m('-', 0));
                        return;
                    }
                    c39215c.m87917p(this);
                    c39215c.m87914m();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87902a(TokeniserState.CommentEndDash);
                return;
            }
            c39215c.m87918q(this);
            c39213a.m87877a();
            c39215c.f87057n.f87014b.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    CommentEndDash { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.48
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != 65535) {
                        StringBuilder sb2 = c39215c.f87057n.f87014b;
                        sb2.append('-');
                        sb2.append(cM87879d);
                        c39215c.m87922u(TokeniserState.Comment);
                        return;
                    }
                    c39215c.m87917p(this);
                    c39215c.m87914m();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.CommentEnd);
                return;
            }
            c39215c.m87918q(this);
            StringBuilder sb3 = c39215c.f87057n.f87014b;
            sb3.append('-');
            sb3.append(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.Comment);
        }
    },
    CommentEnd { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.49
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '!') {
                    if (cM87879d != '-') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87918q(this);
                                StringBuilder sb2 = c39215c.f87057n.f87014b;
                                sb2.append("--");
                                sb2.append(cM87879d);
                                c39215c.m87922u(TokeniserState.Comment);
                                return;
                            }
                            c39215c.m87917p(this);
                            c39215c.m87914m();
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                        c39215c.m87914m();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.f87057n.f87014b.append('-');
                    return;
                }
                c39215c.m87918q(this);
                c39215c.m87922u(TokeniserState.CommentEndBang);
                return;
            }
            c39215c.m87918q(this);
            StringBuilder sb3 = c39215c.f87057n.f87014b;
            sb3.append("--");
            sb3.append(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.Comment);
        }
    },
    CommentEndBang { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.50
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '-') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            StringBuilder sb2 = c39215c.f87057n.f87014b;
                            sb2.append("--!");
                            sb2.append(cM87879d);
                            c39215c.m87922u(TokeniserState.Comment);
                            return;
                        }
                        c39215c.m87917p(this);
                        c39215c.m87914m();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87914m();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.f87057n.f87014b.append("--!");
                c39215c.m87922u(TokeniserState.CommentEndDash);
                return;
            }
            c39215c.m87918q(this);
            StringBuilder sb3 = c39215c.f87057n.f87014b;
            sb3.append("--!");
            sb3.append(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.Comment);
        }
    },
    Doctype { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.51
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '>') {
                    if (cM87879d != 65535) {
                        c39215c.m87918q(this);
                        c39215c.m87922u(TokeniserState.BeforeDoctypeName);
                        return;
                    }
                    c39215c.m87917p(this);
                }
                c39215c.m87918q(this);
                c39215c.m87907f();
                c39215c.f87056m.f87020f = true;
                c39215c.m87915n();
                c39215c.m87922u(TokeniserState.Data);
                return;
            }
            c39215c.m87922u(TokeniserState.BeforeDoctypeName);
        }
    },
    BeforeDoctypeName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.52
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87871C()) {
                c39215c.m87907f();
                c39215c.m87922u(TokeniserState.DoctypeName);
                return;
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != ' ') {
                    if (cM87879d != 65535) {
                        if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                            c39215c.m87907f();
                            c39215c.f87056m.f87016b.append(cM87879d);
                            c39215c.m87922u(TokeniserState.DoctypeName);
                            return;
                        }
                        return;
                    }
                    c39215c.m87917p(this);
                    c39215c.m87907f();
                    c39215c.f87056m.f87020f = true;
                    c39215c.m87915n();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                return;
            }
            c39215c.m87918q(this);
            c39215c.m87907f();
            c39215c.f87056m.f87016b.append(Utf8.REPLACEMENT_CHARACTER);
            c39215c.m87922u(TokeniserState.DoctypeName);
        }
    },
    DoctypeName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.53
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87871C()) {
                c39215c.f87056m.f87016b.append(c39213a.m87883h());
                return;
            }
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != ' ') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r') {
                                c39215c.f87056m.f87016b.append(cM87879d);
                                return;
                            }
                        } else {
                            c39215c.m87917p(this);
                            c39215c.f87056m.f87020f = true;
                            c39215c.m87915n();
                            c39215c.m87922u(TokeniserState.Data);
                            return;
                        }
                    } else {
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                }
                c39215c.m87922u(TokeniserState.AfterDoctypeName);
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87056m.f87016b.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    AfterDoctypeName { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.54
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            if (c39213a.m87893r()) {
                c39215c.m87917p(this);
                c39215c.f87056m.f87020f = true;
                c39215c.m87915n();
                c39215c.m87922u(TokeniserState.Data);
                return;
            }
            if (c39213a.m87900y('\t', '\n', '\r', '\f', ' ')) {
                c39213a.m87877a();
                return;
            }
            if (c39213a.m87898w(Typography.greater)) {
                c39215c.m87915n();
                c39215c.m87902a(TokeniserState.Data);
                return;
            }
            if (c39213a.m87897v("PUBLIC")) {
                c39215c.f87056m.f87017c = "PUBLIC";
                c39215c.m87922u(TokeniserState.AfterDoctypePublicKeyword);
            } else if (c39213a.m87897v("SYSTEM")) {
                c39215c.f87056m.f87017c = "SYSTEM";
                c39215c.m87922u(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                c39215c.m87918q(this);
                c39215c.f87056m.f87020f = true;
                c39215c.m87902a(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.55
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '\"') {
                    if (cM87879d != '\'') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87918q(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87922u(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c39215c.m87917p(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87915n();
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        }
                        c39215c.m87918q(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.m87922u(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                c39215c.m87918q(this);
                c39215c.m87922u(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            c39215c.m87922u(TokeniserState.BeforeDoctypePublicIdentifier);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.56
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '\"') {
                    if (cM87879d != '\'') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87918q(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87922u(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c39215c.m87917p(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87915n();
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        }
                        c39215c.m87918q(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87922u(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                c39215c.m87922u(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.57
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '\"') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            c39215c.f87056m.f87018d.append(cM87879d);
                            return;
                        }
                        c39215c.m87917p(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.f87056m.f87020f = true;
                    c39215c.m87915n();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87056m.f87018d.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.58
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '\'') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            c39215c.f87056m.f87018d.append(cM87879d);
                            return;
                        }
                        c39215c.m87917p(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.f87056m.f87020f = true;
                    c39215c.m87915n();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87056m.f87018d.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    AfterDoctypePublicIdentifier { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.59
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '\"') {
                    if (cM87879d != '\'') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87918q(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87922u(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c39215c.m87917p(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87915n();
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        }
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c39215c.m87918q(this);
                c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            c39215c.m87922u(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.60
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '\"') {
                    if (cM87879d != '\'') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87918q(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87922u(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c39215c.m87917p(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87915n();
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        }
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c39215c.m87918q(this);
                c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.61
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '\"') {
                    if (cM87879d != '\'') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87918q(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87915n();
                                return;
                            } else {
                                c39215c.m87917p(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87915n();
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        }
                        c39215c.m87918q(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c39215c.m87918q(this);
                c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            c39215c.m87922u(TokeniserState.BeforeDoctypeSystemIdentifier);
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.62
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '\"') {
                    if (cM87879d != '\'') {
                        if (cM87879d != '>') {
                            if (cM87879d != 65535) {
                                c39215c.m87918q(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87922u(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                c39215c.m87917p(this);
                                c39215c.f87056m.f87020f = true;
                                c39215c.m87915n();
                                c39215c.m87922u(TokeniserState.Data);
                                return;
                            }
                        }
                        c39215c.m87918q(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                c39215c.m87922u(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.63
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '\"') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            c39215c.f87056m.f87019e.append(cM87879d);
                            return;
                        }
                        c39215c.m87917p(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.f87056m.f87020f = true;
                    c39215c.m87915n();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87056m.f87019e.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.64
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != 0) {
                if (cM87879d != '\'') {
                    if (cM87879d != '>') {
                        if (cM87879d != 65535) {
                            c39215c.f87056m.f87019e.append(cM87879d);
                            return;
                        }
                        c39215c.m87917p(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                    c39215c.m87918q(this);
                    c39215c.f87056m.f87020f = true;
                    c39215c.m87915n();
                    c39215c.m87922u(TokeniserState.Data);
                    return;
                }
                c39215c.m87922u(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            c39215c.m87918q(this);
            c39215c.f87056m.f87019e.append(Utf8.REPLACEMENT_CHARACTER);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.65
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '>') {
                    if (cM87879d != 65535) {
                        c39215c.m87918q(this);
                        c39215c.m87922u(TokeniserState.BogusDoctype);
                        return;
                    } else {
                        c39215c.m87917p(this);
                        c39215c.f87056m.f87020f = true;
                        c39215c.m87915n();
                        c39215c.m87922u(TokeniserState.Data);
                        return;
                    }
                }
                c39215c.m87915n();
                c39215c.m87922u(TokeniserState.Data);
            }
        }
    },
    BogusDoctype { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.66
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '>') {
                if (cM87879d != 65535) {
                    return;
                }
                c39215c.m87915n();
                c39215c.m87922u(TokeniserState.Data);
                return;
            }
            c39215c.m87915n();
            c39215c.m87922u(TokeniserState.Data);
        }
    },
    CdataSection { // from class: io.noties.markwon.html.jsoup.parser.TokeniserState.67
        @Override // io.noties.markwon.html.jsoup.parser.TokeniserState
        public void read(C39215c c39215c, C39213a c39213a) {
            c39215c.f87051h.append(c39213a.m87887l("]]>"));
            if (c39213a.m87896u("]]>") || c39213a.m87893r()) {
                c39215c.m87911j(new Token.C39138a(c39215c.f87051h.toString()));
                c39215c.m87922u(TokeniserState.Data);
            }
        }
    };

    static final char nullChar = 0;
    static final char[] attributeSingleValueCharsSorted = {0, Typography.amp, '\''};
    static final char[] attributeDoubleValueCharsSorted = {0, '\"', Typography.amp};
    static final char[] attributeNameCharsSorted = {0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', Typography.less, '=', Typography.greater};
    static final char[] attributeValueUnquoted = {0, '\t', '\n', '\f', '\r', ' ', '\"', Typography.amp, '\'', Typography.less, '=', Typography.greater, '`'};

    /* JADX INFO: renamed from: b */
    public static final String f87030b = String.valueOf(Utf8.REPLACEMENT_CHARACTER);

    /* JADX INFO: renamed from: c */
    public static void m87863c(C39215c c39215c, TokeniserState tokeniserState) {
        int[] iArrM87905d = c39215c.m87905d(null, false);
        if (iArrM87905d == null) {
            c39215c.m87910i(Typography.amp);
        } else {
            c39215c.m87913l(iArrM87905d);
        }
        c39215c.m87922u(tokeniserState);
    }

    public abstract void read(C39215c c39215c, C39213a c39213a);

    /* JADX INFO: renamed from: a */
    public static void m87861a(C39215c c39215c, C39213a c39213a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (c39213a.m87871C()) {
            String strM87883h = c39213a.m87883h();
            c39215c.f87051h.append(strM87883h);
            c39215c.m87912k(strM87883h);
            return;
        }
        char cM87879d = c39213a.m87879d();
        if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ' && cM87879d != '/' && cM87879d != '>') {
            c39213a.m87876I();
            c39215c.m87922u(tokeniserState2);
        } else {
            if (c39215c.f87051h.toString().equals("script")) {
                c39215c.m87922u(tokeniserState);
            } else {
                c39215c.m87922u(tokeniserState2);
            }
            c39215c.m87910i(cM87879d);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m87862b(C39215c c39215c, C39213a c39213a, TokeniserState tokeniserState) {
        if (c39213a.m87871C()) {
            String strM87883h = c39213a.m87883h();
            c39215c.f87052i.m87854i(strM87883h);
            c39215c.f87051h.append(strM87883h);
            return;
        }
        if (c39215c.m87920s() && !c39213a.m87893r()) {
            char cM87879d = c39213a.m87879d();
            if (cM87879d != '\t' && cM87879d != '\n' && cM87879d != '\f' && cM87879d != '\r' && cM87879d != ' ') {
                if (cM87879d != '/') {
                    if (cM87879d != '>') {
                        c39215c.f87051h.append(cM87879d);
                    } else {
                        c39215c.m87916o();
                        c39215c.m87922u(Data);
                        return;
                    }
                } else {
                    c39215c.m87922u(SelfClosingStartTag);
                    return;
                }
            } else {
                c39215c.m87922u(BeforeAttributeName);
                return;
            }
        }
        c39215c.m87912k("</" + c39215c.f87051h.toString());
        c39215c.m87922u(tokeniserState);
    }

    /* JADX INFO: renamed from: d */
    public static void m87864d(C39215c c39215c, C39213a c39213a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char cM87892q = c39213a.m87892q();
        if (cM87892q != 0) {
            if (cM87892q != '<') {
                if (cM87892q != 65535) {
                    c39215c.m87912k(c39213a.m87888m(Typography.less, 0));
                    return;
                } else {
                    c39215c.m87911j(new Token.C39142e());
                    return;
                }
            }
            c39215c.m87902a(tokeniserState2);
            return;
        }
        c39215c.m87918q(tokeniserState);
        c39213a.m87877a();
        c39215c.m87910i(Utf8.REPLACEMENT_CHARACTER);
    }

    /* JADX INFO: renamed from: e */
    public static void m87865e(C39215c c39215c, C39213a c39213a, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (c39213a.m87871C()) {
            c39215c.m87908g(false);
            c39215c.m87922u(tokeniserState);
        } else {
            c39215c.m87912k("</");
            c39215c.m87922u(tokeniserState2);
        }
    }
}
