
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entity.DaftarPengguna"%>
<%@page import="entity.Pengguna"%>
<% Pengguna pengguna = (Pengguna) request.getAttribute("pengguna");%>
<!DOCTYPE html>
<%@include file='aplikasitemplate.html' %>
<html>

</table>
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="mcbg">         
    <tr> 
        <%-- JUDUL DI SINI--%> 
        <td width="700" height="32" class="contentheader"><div align="center"><b>TAMBAH KELUARGA</b></div></td>
    </tr>
    <tr> 
        <td><img src="images/main_content_header_under.gif" width="700" height="26"></td>
    </tr>
    <tr> 
        <td class="mctop"><table width="94%" border="0" cellpadding="0" cellspacing="0">
                <%-- ISI MULAI SINI---%>
                <form action="ProsesTambahKeluarga" method="post" >
                    <tr>
                        <td width="10%"><input type="hidden" name="idPengguna" value="<%=pengguna.getId()%>" style="width: 160px"></td>
                        <td>Kode Keluarga</td><td><input type="text" name="kode" style="width: 160px"></td>
                    </tr>
                    <tr>
                        <td width="10%">&nbsp;</td>
                        <td>Kepala Keluarga</td><td><input type="text" name="kepala" style="width: 120px"></td>
                    </tr>
                    <tr>
                        <td width="10%">&nbsp;</td>
                        <td>Anggota Keluarga</td><td><input type="text" name="anggota" style="width: 120px"></td>
                    </tr>
                    
                    <tr>
                        <td >&nbsp;</td>
                    </tr>
                    <tr>
                        <td width="10%">&nbsp;</td>
                        <td></td><td><input type="submit" value="Simpan" ></td>
                    </tr>
                    <tr>
                        <td >&nbsp;</td>
                    </tr>
                    <tr><td colspan="3" align="center"><label align="center"><font color="red"><b>${errorkeluarga}</b></font></label></td></tr>
                </form>
                <%--ISI SAMPAI SINI--%>
            </table></td>
    </tr>
    <tr> 
        <td class="mctop"><img src="images/mc_box_bottom.gif" alt="-" width="700" height="23"></td>
    </tr>
</table>
<!-- COPYRIGHT - WWW.ZYMIC.COM - IF YOU REMOVE COPYRIGHT LEGAL ACTION WILL BE TAKEN -->
<!-- WE TRACK COPYRIGHT ON A DAILY BASIS, WE KNOW WHO YOU ARE!                      -->
<div align="center"><a href="http://www.zymic.com" target="_blank"><img src="images/copyright_DO_NOT_STEAL_ELSE_LEGAL_ACTION.gif" alt="Free Templates" width="422" height="15" border="0"></a></div></td>
</tr>
</table>
</body>
</html>

