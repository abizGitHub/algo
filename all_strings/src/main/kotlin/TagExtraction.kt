import java.util.*

/**
 * <h1>Nayeem loves counseling</h1>
 * <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
 * <Amee>safat codes like a ninja</amee>
 * <SA premium>Imtiaz has a secret crush</SA premium>
 * =============================
 * Nayeem loves counseling
 * Sanjay has no watch
 * So wait for a while
 * None
 * Imtiaz has a secret crush
 *
 * */
fun main() {
    printContents(
        """
            XtzVtmqM6U13O#~@Wo"tkbX5vDt39KG0zwsM^n{EDksH+Q+w*ePvh6gW~+cH={N@szK<ZcHXJzS{LXuyaEtyrRZO*%#okG2JtcCv`f`#9vE`U>uCUuhco)hbLw#&p(8UpbIVIq1wR`JS(s5QRYj#YL</ZcHXJzS{LXuyaEtyrRZO*%#okG2JtcCv`f`#9vE`U><LeeI_rsd0xA+etgAyUjck)9u-Kx-^qCp UgLL6N(A6xytLO%w2H=rL&UzX"><faRdCYlMX=KlJ10O6EJ6~6a~l-sxd&*Qf#jV+QbEiu6Fc><teQFUWtlo7D0g7%jdXkPjFaz"P7z=YlGP*>DPhgZzlldnv}z2FBpq`Y{3gq"p*SYe</teQFUWtlo7D0g7%jdXkPjFaz"P7z=YlGP*></faRdCYlMX=KlJ10O6EJ6~6a~l-sxd&*Qf#jV+QbEiu6Fc><utNTpYAQJF66i{"asj(91Y+_bS6"><DQaUIMMC2xqW#XYmk"L&r0Va(=BTTL><DRO3(Iu-Olk(UKay"vNtWKKylM%R@M3sa^E2{sB></DQaUIMMC2xqW#XYmk"L&r0Va(=BTTL>SrzFqfdLq</utNTpYAQJF66i{"asj(91Y+_bS6"><TyGNwBGq*yhR*FWliow=u2f}{_HOZfTRV{nILBzK{K7OZ_yYHL }PXoaf><msolwvlRE2VjeJsy8BIA7r4dkF9PUMT5Xe9unttRTkCOc(><IuPEPBIbpoH-T^VZti%vm4l}}^-ty>nelNZnnfF&YBT-u u #fm(nf8z^X4cZITzAvKYmtEsIPSwNvAg</msolwvlRE2VjeJsy8BIA7r4dkF9PUMT5Xe9unttRTkCOc(>FFUEZSJgxn"YpzblNk^j`WzWrRI^ 9q0uks{1fO*4 fFEJ{C MiYWKcDiU}=jO=O8@7lNWaiBFI{OV_CHF^gShrPJe(&nO(=lR_4`EIqOb7B<VdLsmCpPos zGnsz KLgV%#ThI(0dOYatk}tONR3AQD)xp3#Z87=i{J007kocbIJgO><AO50(1BAvq%^Fnjnm1><jjYfpxwSk(M3B=sM(&oj{2i=HXf^+H 3Y4%6D-ucqe6*_@0^Bn t9p{UNQka_>sjArx</jjYfpxwSk(M3B=sM(&oj{2i=HXf^+H 3Y4%6D-ucqe6*_@0^Bn t9p{UNQka_>BSYxqiuLhemhdQadiHO</VdLsmCpPos zGnsz KLgV%#ThI(0dOYatk}tONR3AQD)xp3#Z87=i{J007kocbIJgO><YlzlFXv^^4NNr_=@JBT{h*5N2sVFwZU></YlzlFXv^^4NNr_=@JBT{h*5N2sVFwZU><EXsjJN YlAYE+}BD+dSx"J`4a0@sXa4G(&Vo>pvQyajOwJjD<NoKiq1J_t5HXClpot7`#)4_t*aH4@-DceQE~ok&eQCsI(yZR42@kvR&Xg^ nkQC(C><fzAqyNElvd2UYq+oIY>PbBWWHLFd^Z}ToYilWr=RPfoe)eE@~P26bniztE4UP8~BndX sahZaq@ -rJV^H3<jEItXHZoDhRX0MzL1mw)92I7H10pQ*F%q^IEDJuNM-U#dXT_DlfFcM"r5>zeRJywQaAczBMFo6c#XV}wQs4UA}5sMfIjqrIOxiddTSEQf<HpgKfu^LAMo"TX0hAXrb@o{ +ge494v5_0Sr7okOh%YRL@O6PiJI025><JVKcr66(i(9JAVmV9Wykf6=aZL*eqYDUxB+sPmv*YkF=haRHjy} #qY)f_cs#><rgmgjETYjkw2^i+E%`){%1YCYxO^jfASL+qugI#)@CTEi6&{eX6XV_rq88OiV*5XC>dkRmOIy2AZY8r}fIWa^S"HRTUeC5_+ySjN*d@CU(scsyErl`PGs_t^LX(KKY2@cHBrIEolqEYSJP</rgmgjETYjkw2^i+E%`){%1YCYxO^jfASL+qugI#)@CTEi6&{eX6XV_rq88OiV*5XC></JVKcr66(i(9JAVmV9Wykf6=aZL*eqYDUxB+sPmv*YkF=haRHjy} #qY)f_cs#>WwQchYCUuey+k KTOejDi7j(b@a0<zAkcce`pmU)V`hRkdMPjUX3)XEBD@t }1gY~8-~{z(&xAGFl@^~N`H-7sovX4)>dhozCo^0ocYt&dnCa0OK+l%^iM O*RUms*_b=AO9GL%gZJxNGauVhYkxn</zAkcce`pmU)V`hRkdMPjUX3)XEBD@t }1gY~8-~{z(&xAGFl@^~N`H-7sovX4)>bEgQrrku-sX3(dExPH(L~^ym4ByZSi3vE5adpZ +B2q(*JLvGjuyFRmtv{pCY5<LLKzwklfK"s&BwC~6jH6lx{T++^%=}zMW_{g6ck23cxsY(stARyXSg+5v_T_><DhoRRgpTV@v`NpGSyHH2K{UgSj={yQ7dppFL}PchWGXH0(C7-EK>vNXBuPTUMT`1}m9F8PnY6cVqkez8=^j+xu9+B_ca"</DhoRRgpTV@v`NpGSyHH2K{UgSj={yQ7dppFL}PchWGXH0(C7-EK></LLKzwklfK"s&BwC~6jH6lx{T++^%=}zMW_{g6ck23cxsY(stARyXSg+5v_T_><hLvVLRvSQmvUtMKk7RU8J8`F0N}+mXD1KgdKFU}5EZ{AiQ0Oq%Ir}+>qcjCxmEXV hpBnQql5I0mgg=TerssnjJtfmP<mKaRHlhmX}UU7(aGBCATDrG%D8s6X><rEjkE^ZXD%LQ@qMLYo><HyvYC8pG#Dva3"aUR#}^FjD*8%snppI3)b Qy`M_qVQPcALKRfeC+~xsECl#)>APziYnPNlTrnrgwVHrMO</rEjkE^ZXD%LQ@qMLYo></mKaRHlhmX}UU7(aGBCATDrG%D8s6X><cheZqeuG8`8D&`(G{4Vu pMs__%"XDetBys{{dAF7="B0Cqs~%UI><vyNGmos%WLc{8t6cEgIeprtXL2wrwzn-tkiehTKD&PgQWe39(*#x#><yPHxIPB#0)=ceW4x^of{H{}2^D1><NflTHUy-L)KI^MR8bffKLypIu5u><MSHmCxtY0LRwp#gbX7SrA9f9sH5@}+1P*gn(`"y0ReU&=wBokyakt8KK -k0mTI{></MSHmCxtY0LRwp#gbX7SrA9f9sH5@}+1P*gn(`"y0ReU&=wBokyakt8KK -k0mTI{>NB"""
            .trimIndent()
    )
}

fun printContents(line: String) {

    var recordStartTag = false
    var recordEndTag = false
    val lastStartTag = LinkedList<Char>()
    val lastEndTag = LinkedList<Char>()
    val tagStack = Stack<Pair<Int, LinkedList<Char>>>()
    val normalTags = mutableListOf<Pair<Int, Int>>()
    line.asSequence().forEachIndexed { index, it ->

        if (it == '<' && index < line.length - 3 && line[index + 1] != '/' && line[index + 1] != '>') {
            if (recordStartTag) {
                lastStartTag.clear()
            }
            recordStartTag = true
            recordEndTag = false
        }

        if (it == '<' && index < line.length - 3 && line[index + 1] == '/') {
            if (recordEndTag) {
                lastEndTag.clear()
            }
            recordEndTag = true
            recordStartTag = false
        }

        if (it == '>') {
            if (recordStartTag) {
                lastStartTag.add('>')
                lastStartTag.pop()
                lastStartTag.push('/')
                lastStartTag.push('<')
                tagStack.push(Pair(index, lastStartTag.clone() as LinkedList<Char>))
                lastStartTag.clear()
                recordStartTag = false
            }
            if (recordEndTag) {
                lastEndTag.add('>')
                val tag = if (tagStack.isEmpty()) Pair(0, LinkedList<Char>()) else tagStack.pop()
                if (tagsAreEqual(lastEndTag, tag.second)) {
                    normalTags.add(
                        Pair(tag.first + 1, index - lastEndTag.size)
                    )
                }
                tagStack.clear()
                lastEndTag.clear()
                recordEndTag = false
            }
        }

        if (recordStartTag)
            lastStartTag.add(it)
        if (recordEndTag)
            lastEndTag.add(it)
    }
    //println(normalTags)
    normalTags.forEach {
        if (it.second >= it.first)
            line.substring(it.first..it.second).also {
                if (it.length == 0)
                    println("None")
                else
                    println(it)
            }

    }
    if (normalTags.isEmpty())
        println("None")
}

fun tagsAreEqual(tag: LinkedList<Char>, lastEndTag: LinkedList<Char>): Boolean {
    if (tag.size != lastEndTag.size)
        return false
    var out = true
    for (i in tag.indices) {
        if (tag[i] != lastEndTag[i]) {
            out = false
            break
        }
    }
    return out
}
