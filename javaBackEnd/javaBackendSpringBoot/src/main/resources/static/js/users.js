// Call the dataTables jQuery plugin
$(document).ready(function() {
   loadUsers();
  $('#users').DataTable();
});



async function  loadUsers(){

const request = await fetch('users',{
method:'GET',
headers: {
'Accept': 'application/json',
'Content-Type' : 'application/json'
},

});
const users = await request.json();
console.log(users);

let listusers = '';
for (let user of users){

let listhtml ='<tr><td>T12345</td><td>'+user.nombre+'  '+user.apellido+'</td><td>'+user.email+'</td><td>'+user.telefono+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
listusers+=listhtml

}

document.querySelector('#users thead').outerHTML = listusers


}




