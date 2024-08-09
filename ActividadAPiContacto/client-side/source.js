


document.querySelector("#btnget").addEventListener("click",(e)=>{
    const frm1 = document.getElementById("formGetData");
    const frmdta = new FormData(frm1);
    let data = new Array();
    for(let e of frmdta){
        data.push(e);
    }
    let idcontacto = data[0][1];

    getcontact(idcontacto).then((dt)=>{
        imprimirValorcontacto(dt);
    })

    e.stopPropagation();
    e.preventDefault();
});

function imprimirValorcontacto(dt){
    if(!dt){
        alert("contacto no existe");
        return
    }
    let divUser = document.querySelector(".infouser");
    divUser.classList.remove("disable");
    divUser.classList.add("enable");
    
    let nombrecontacto = document.querySelector(".v1");
    let apellidocontacto = document.querySelector(".v2");

    nombrecontacto.textContent = dt.nombre;
    apellidocontacto.textContent = dt.apellido;

}


document.querySelector("#button2").addEventListener("click",(e)=>{
    const frm2 = document.getElementById("formPutInfo");
    const frmdta = new FormData(frm2);
    let data = new Array();
    
    for(let e of frmdta){
        data.push(e[1]);
    }

    let obj = {
        id: data[0],
        nombre:data[1],
        apellido:data[2]
    }
    
    postcontact(obj).then((da)=>{
        if(!da[0]){
            alert("error no se pudo agregar el contacto")
            console.log(da)
            return
        }

        alert("contacto agregado satisfactoriamente")
        console.log(da)
        
    }).catch((error)=>{
        console.log(error);
    })

    e.stopPropagation();
    e.preventDefault();
});


function getcontact(id){
    let url = `http://localhost:8080/api/contacto/${id}`
    let option = {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    };

    return fetch(url,option).then((data)=> data.headers.get('Content-Length') != '0' ? data.json() : data=null)
    .then(res => { 
        if(res==null){
            return {};
        }else{
            return res;
        }; 
    })
    .catch(error => console.log(error))
}


function postcontact(data){
    let url = `http://localhost:8080/api/contacto/add`
    let option = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    };

    return fetch(url,option).then((data)=> data.headers.get('Content-Length') != '0' ? data.json() : data=null)
    .then(res => { 
        if(res==null){
            return {};
        }else{
            return res;
        }; 
    })
    .catch(error => console.log(error))
}