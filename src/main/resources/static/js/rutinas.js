/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
/* 
 * FUNCION CARGA UN ARCHIVO DE IMAGEN
 */

function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        reader.onload = function(e) {
            $('#blah')
                    .attr('src',e.target.result)
                    .height(200);
        };
        reader.readAsDataURL(input.files[0]);
    }
}