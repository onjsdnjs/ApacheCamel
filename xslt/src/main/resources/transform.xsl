<?xml version="1.0" encoding="UTF-8"?><xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:template match="/person">
      <name1>
<xsl:value-of select="firstName"/>
</name1>
      <name2>
<xsl:value-of select="lastName"/>
</name2>

 <edam>
<xsl:value-of select="city"/>
</edam>
</xsl:template>

</xsl:stylesheet>
