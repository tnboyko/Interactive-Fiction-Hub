let button = document.getElementById('addAction');
let transitions = document.getElementById('transitions');
let delButton = document.getElementById('delAction');
let paragraphs = document.getElementById('paragraphs');
let destinationInput = document.getElementById('destination');
let submit = document.getElementById('submitBtn');


// delete transition paragraph
delButton.addEventListener('click', delAction);

// add new transition paragraph
button.addEventListener('click', addAction);

// add destination to the paragraph list
destinationInput.addEventListener('change', addItem);

// react to submit
submit.addEventListener('click', save);

function addAction(){
    let action = document.createElement('div');
    action.className = 'row';
    transitions.append(action);

    let div1 = document.createElement('div');
    div1.className = 'col-md-6 mb-3';

    let input1 = document.createElement('input');
    input1.type = 'text';
    input1.className = 'form-control';
    input1.placeholder = 'Transition description';

    let div2 = document.createElement('div');
    div2.className = 'col-md-6 mb-3 input-group';

    let input2 = document.createElement('input');
    input2.type = 'text';
    input2.className = 'form-control';
    input2.placeholder = 'Destination paragraph';
    input2.addEventListener('change', addItem);

    let div3 = document.createElement('div');
    div3.className = 'input-group-append';

    let button = document.createElement('button');
    button.className = 'btn btn-danger';
    button.type = 'button';
    button.addEventListener('click', delAction);

    let i = document.createElement('i');
    i.className = 'fa fa-trash';
    i.style.areaHidden = 'true';

    transitions.append(action);
    action.append(div1);
    action.append(div2);
    div1.append(input1);
    div2.append(input2);
    div2.append(div3);
    div3.append(button);
    button.append(i);
}

function delAction(){
    if (transitions.childElementCount === 1){
        return;
    }
    transitions.removeChild(this.parentElement.parentElement.parentElement);
}

function addItem(){
    if (this.value === ''){
        return;
    }
    for (let i = 0; i < paragraphs.childElementCount; i++){
        if (paragraphs.children[i].innerText === this.value){
            return;
        }
    }
    let li = document.createElement('li');
    li.className = 'list-group-item d-flex justify-content-between lh-condensed';
    li.innerText = this.value;
    paragraphs.append(li);
}


function save(){
    let submitBtn = document.getElementById('submitBtn');
    if (submitBtn.classList.contains('btn-primary')){
        submitBtn.innerHTML = '<i class="fas fa-edit"></i> Edit';
        submitBtn.className = 'btn btn-warning';
        document.getElementById('transContainer').removeChild(button);
        let dangerBtns = document.getElementsByClassName('btn-danger');
        for (let i = 0; i < dangerBtns.length; i++){
            dangerBtns[i].innerHTML = '<i class="fas fa-angle-right"></i>';
            dangerBtns[i].className = 'btn btn-info';
        }
    }
    else {
        submitBtn.innerHTML = 'Save';
        submitBtn.className = 'btn btn-primary';
        let infoBtns = document.getElementsByClassName('btn btn-info');
        transitions.append(button);
        for (let i = 0; i < infoBtns.length; i++){
            infoBtns[i].innerHTML = '<i class="fa fa-trash"></i>';
            infoBtns[i].className = 'btn btn-danger';
        }
    }
}