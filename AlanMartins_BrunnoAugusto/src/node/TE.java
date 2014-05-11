/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TE extends Token
{
    public TE()
    {
        super.setText("&");
    }

    public TE(int line, int pos)
    {
        super.setText("&");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TE(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTE(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TE text.");
    }
}